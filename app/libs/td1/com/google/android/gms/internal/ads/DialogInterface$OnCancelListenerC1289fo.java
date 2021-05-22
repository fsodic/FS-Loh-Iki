package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.fo  reason: case insensitive filesystem */
final class DialogInterface$OnCancelListenerC1289fo implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4341a;

    DialogInterface$OnCancelListenerC1289fo(JsPromptResult jsPromptResult) {
        this.f4341a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4341a.cancel();
    }
}
