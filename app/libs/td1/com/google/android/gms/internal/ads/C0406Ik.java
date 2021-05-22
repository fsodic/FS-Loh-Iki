package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.Ik  reason: case insensitive filesystem */
public class C0406Ik extends C0328Fk {
    @Override // com.google.android.gms.internal.ads.C0328Fk, com.google.android.gms.internal.ads.C0224Bk
    public final boolean a(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
