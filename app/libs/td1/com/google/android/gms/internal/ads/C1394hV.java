package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.hV  reason: case insensitive filesystem */
public final class C1394hV implements QU {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ST f4481a;

    C1394hV(HT ht, ST st) {
        this.f4481a = st;
    }

    @Override // com.google.android.gms.internal.ads.QU
    public final boolean a(File file) {
        try {
            return this.f4481a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
