package com.google.android.gms.internal.ads;

import android.net.Uri;

final /* synthetic */ class QH implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final NH f2913a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f2914b;

    /* renamed from: c  reason: collision with root package name */
    private final BR f2915c;
    private final C1941pR d;

    QH(NH nh, Uri uri, BR br, C1941pR pRVar) {
        this.f2913a = nh;
        this.f2914b = uri;
        this.f2915c = br;
        this.d = pRVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return this.f2913a.a(this.f2914b, this.f2915c, this.d, obj);
    }
}
