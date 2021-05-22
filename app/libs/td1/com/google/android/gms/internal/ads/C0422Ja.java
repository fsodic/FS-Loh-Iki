package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ja  reason: case insensitive filesystem */
public final class C0422Ja extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f2323a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b  reason: collision with root package name */
    private AnimationDrawable f2324b;

    public C0422Ja(Context context, BinderC0344Ga ga, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        r.a(ga);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f2323a, null, null));
        shapeDrawable.getPaint().setColor(ga.Wb());
        setLayoutParams(layoutParams);
        q.e();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(ga.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(ga.getText());
            textView.setTextColor(ga.Xb());
            textView.setTextSize((float) ga.Yb());
            C2392voa.a();
            int b2 = C0459Kl.b(context, 4);
            C2392voa.a();
            textView.setPadding(b2, 0, C0459Kl.b(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<BinderC0474La> Zb = ga.Zb();
        if (Zb != null && Zb.size() > 1) {
            this.f2324b = new AnimationDrawable();
            for (BinderC0474La la : Zb) {
                try {
                    this.f2324b.addFrame((Drawable) b.Q(la.Ja()), ga._b());
                } catch (Exception e) {
                    C0745Vl.b("Error while getting drawable.", e);
                }
            }
            q.e();
            imageView.setBackground(this.f2324b);
        } else if (Zb.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) b.Q(Zb.get(0).Ja()));
            } catch (Exception e2) {
                C0745Vl.b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f2324b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
