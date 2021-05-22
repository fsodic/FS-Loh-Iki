package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class Cda extends Ida {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bda f1702b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Cda(Bda bda) {
        super(bda, null);
        this.f1702b = bda;
    }

    /* synthetic */ Cda(Bda bda, Ada ada) {
        this(bda);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.android.gms.internal.ads.Ida, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new Dda(this.f1702b, null);
    }
}
