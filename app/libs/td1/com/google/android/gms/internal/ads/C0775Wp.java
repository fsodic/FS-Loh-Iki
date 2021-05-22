package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Wp  reason: case insensitive filesystem */
public final class C0775Wp implements AbstractC0666Sk {

    /* renamed from: a  reason: collision with root package name */
    private File f3459a = null;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3460b;

    C0775Wp(Context context) {
        this.f3460b = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0666Sk
    public final File e() {
        if (this.f3459a == null) {
            this.f3459a = new File(this.f3460b.getCacheDir(), "volley");
        }
        return this.f3459a;
    }
}
