package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.kba  reason: case insensitive filesystem */
final class C1608kba extends ThreadLocal<SecureRandom> {
    C1608kba() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return C1677lba.b();
    }
}
