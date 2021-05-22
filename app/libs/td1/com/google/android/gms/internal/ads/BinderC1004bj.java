package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.bj  reason: case insensitive filesystem */
public final class BinderC1004bj extends AbstractBinderC0586Pi {

    /* renamed from: a  reason: collision with root package name */
    private final String f3929a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3930b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BinderC1004bj(C0456Ki ki) {
        this(ki != null ? ki.f2422a : BuildConfig.FLAVOR, ki != null ? ki.f2423b : 1);
    }

    public BinderC1004bj(String str, int i) {
        this.f3929a = str;
        this.f3930b = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0508Mi
    public final int A() {
        return this.f3930b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0508Mi
    public final String getType() {
        return this.f3929a;
    }
}
