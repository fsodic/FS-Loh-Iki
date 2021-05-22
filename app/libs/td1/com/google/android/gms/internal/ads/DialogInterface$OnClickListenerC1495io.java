package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.io  reason: case insensitive filesystem */
final class DialogInterface$OnClickListenerC1495io implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4607a;

    DialogInterface$OnClickListenerC1495io(JsPromptResult jsPromptResult) {
        this.f4607a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4607a.cancel();
    }
}
