package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.go  reason: case insensitive filesystem */
final class DialogInterface$OnClickListenerC1358go implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsResult f4429a;

    DialogInterface$OnClickListenerC1358go(JsResult jsResult) {
        this.f4429a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4429a.confirm();
    }
}
