package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.do  reason: invalid class name */
final class Cdo implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsResult f4145a;

    Cdo(JsResult jsResult) {
        this.f4145a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4145a.cancel();
    }
}
