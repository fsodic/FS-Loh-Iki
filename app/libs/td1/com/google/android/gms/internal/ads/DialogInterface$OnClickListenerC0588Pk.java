package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Pk  reason: case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC0588Pk implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0536Nk f2875a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2876b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2877c;
    private final int d;

    DialogInterface$OnClickListenerC0588Pk(C0536Nk nk, int i, int i2, int i3) {
        this.f2875a = nk;
        this.f2876b = i;
        this.f2877c = i2;
        this.d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2875a.a(this.f2876b, this.f2877c, this.d, dialogInterface, i);
    }
}
