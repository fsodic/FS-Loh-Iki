package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.ho  reason: case insensitive filesystem */
final class DialogInterface$OnClickListenerC1427ho implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4513a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ EditText f4514b;

    DialogInterface$OnClickListenerC1427ho(JsPromptResult jsPromptResult, EditText editText) {
        this.f4513a = jsPromptResult;
        this.f4514b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4513a.confirm(this.f4514b.getText().toString());
    }
}
