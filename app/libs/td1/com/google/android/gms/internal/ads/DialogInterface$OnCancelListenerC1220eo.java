package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.eo  reason: case insensitive filesystem */
final class DialogInterface$OnCancelListenerC1220eo implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsResult f4245a;

    DialogInterface$OnCancelListenerC1220eo(JsResult jsResult) {
        this.f4245a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4245a.cancel();
    }
}
