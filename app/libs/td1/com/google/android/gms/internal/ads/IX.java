package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC0993bda;

public abstract class IX<KeyProtoT extends AbstractC0993bda, PublicKeyProtoT extends AbstractC0993bda> extends AbstractC2429wX<KeyProtoT> {
    private final Class<PublicKeyProtoT> d;

    @SafeVarargs
    protected IX(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, AbstractC2567yX<?, KeyProtoT>... yXVarArr) {
        super(cls, yXVarArr);
        this.d = cls2;
    }
}
