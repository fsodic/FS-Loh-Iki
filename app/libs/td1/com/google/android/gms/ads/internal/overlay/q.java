package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C0459Kl;
import com.google.android.gms.internal.ads.C2392voa;

public final class q extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageButton f1117a;

    /* renamed from: b  reason: collision with root package name */
    private final y f1118b;

    public q(Context context, p pVar, y yVar) {
        super(context);
        this.f1118b = yVar;
        setOnClickListener(this);
        this.f1117a = new ImageButton(context);
        this.f1117a.setImageResource(17301527);
        this.f1117a.setBackgroundColor(0);
        this.f1117a.setOnClickListener(this);
        ImageButton imageButton = this.f1117a;
        C2392voa.a();
        int b2 = C0459Kl.b(context, pVar.f1114a);
        C2392voa.a();
        int b3 = C0459Kl.b(context, 0);
        C2392voa.a();
        int b4 = C0459Kl.b(context, pVar.f1115b);
        C2392voa.a();
        imageButton.setPadding(b2, b3, b4, C0459Kl.b(context, pVar.d));
        this.f1117a.setContentDescription("Interstitial close button");
        ImageButton imageButton2 = this.f1117a;
        C2392voa.a();
        int b5 = C0459Kl.b(context, pVar.e + pVar.f1114a + pVar.f1115b);
        C2392voa.a();
        addView(imageButton2, new FrameLayout.LayoutParams(b5, C0459Kl.b(context, pVar.e + pVar.d), 17));
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f1117a;
            i = 8;
        } else {
            imageButton = this.f1117a;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    public final void onClick(View view) {
        y yVar = this.f1118b;
        if (yVar != null) {
            yVar.Tb();
        }
    }
}
