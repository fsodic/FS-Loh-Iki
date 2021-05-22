package com.google.android.gms.internal.ads;

import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Io  reason: case insensitive filesystem */
public final /* synthetic */ class C0410Io implements AbstractC0462Ko {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f2274a;

    C0410Io(AbstractC1564jo joVar) {
        this.f2274a = joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0462Ko
    public final void a(Uri uri) {
        AbstractC0774Wo d = this.f2274a.d();
        if (d == null) {
            C0745Vl.b("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            d.a(uri);
        }
    }
}
