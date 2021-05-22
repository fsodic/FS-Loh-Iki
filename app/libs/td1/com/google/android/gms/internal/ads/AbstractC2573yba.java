package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2573yba;
import com.google.android.gms.internal.ads.AbstractC2642zba;

/* renamed from: com.google.android.gms.internal.ads.yba  reason: case insensitive filesystem */
public abstract class AbstractC2573yba<MessageType extends AbstractC2642zba<MessageType, BuilderType>, BuilderType extends AbstractC2573yba<MessageType, BuilderType>> implements AbstractC1199eda {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.yba<MessageType extends com.google.android.gms.internal.ads.zba<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.yba<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC1199eda
    public final /* synthetic */ AbstractC1199eda a(AbstractC0993bda bda) {
        if (a().getClass().isInstance(bda)) {
            a((AbstractC2642zba) bda);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);
}
