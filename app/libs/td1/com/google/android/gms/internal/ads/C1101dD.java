package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.dD  reason: case insensitive filesystem */
public final class C1101dD extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final C0536Nk f4053a;

    public C1101dD(Context context, View view, C0536Nk nk) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f4053a = nk;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f4053a.a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof AbstractC1564jo)) {
                arrayList.add((AbstractC1564jo) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC1564jo) obj).destroy();
        }
    }
}
