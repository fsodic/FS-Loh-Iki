package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC0993bda;

/* renamed from: com.google.android.gms.internal.ads.zX  reason: case insensitive filesystem */
public abstract class AbstractC2636zX<KeyFormatProtoT extends AbstractC0993bda, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyFormatProtoT> f6184a;

    public AbstractC2636zX(Class<KeyFormatProtoT> cls) {
        this.f6184a = cls;
    }

    public abstract KeyFormatProtoT a(Iba iba);

    public final Class<KeyFormatProtoT> a() {
        return this.f6184a;
    }

    public abstract void a(KeyFormatProtoT keyformatprotot);

    public abstract KeyT b(KeyFormatProtoT keyformatprotot);
}
