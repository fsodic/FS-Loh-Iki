package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yX  reason: case insensitive filesystem */
public abstract class AbstractC2567yX<PrimitiveT, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<PrimitiveT> f6097a;

    public AbstractC2567yX(Class<PrimitiveT> cls) {
        this.f6097a = cls;
    }

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> a() {
        return this.f6097a;
    }

    public abstract PrimitiveT a(KeyT keyt);
}
