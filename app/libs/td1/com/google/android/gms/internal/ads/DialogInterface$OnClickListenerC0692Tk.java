package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Tk  reason: case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC0692Tk implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0536Nk f3203a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3204b;

    DialogInterface$OnClickListenerC0692Tk(C0536Nk nk, String str) {
        this.f3203a = nk;
        this.f3204b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3203a.a(this.f3204b, dialogInterface, i);
    }
}
