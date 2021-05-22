package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.yma  reason: case insensitive filesystem */
public final class C2595yma extends C1423hm<InputStream> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2388vma f6134b;

    C2595yma(C2388vma vma) {
        this.f6134b = vma;
    }

    @Override // com.google.android.gms.internal.ads.C1423hm
    public final boolean cancel(boolean z) {
        this.f6134b.a();
        return super.cancel(z);
    }
}
