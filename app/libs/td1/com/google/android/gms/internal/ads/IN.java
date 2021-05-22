package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class IN implements AbstractC2083rW {

    /* renamed from: a  reason: collision with root package name */
    private final GN f2220a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2221b;

    /* renamed from: c  reason: collision with root package name */
    private final List f2222c;
    private final Bundle d;

    IN(GN gn, String str, List list, Bundle bundle) {
        this.f2220a = gn;
        this.f2221b = str;
        this.f2222c = list;
        this.d = bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2083rW
    public final SW a() {
        return this.f2220a.a(this.f2221b, this.f2222c, this.d);
    }
}
