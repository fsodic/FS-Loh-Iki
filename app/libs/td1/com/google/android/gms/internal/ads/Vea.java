package com.google.android.gms.internal.ads;

public final class Vea<K, V> extends Nea<K, V, V> {
    private Vea(int i) {
        super(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Nea
    public final /* synthetic */ Nea a(Object obj, _ea _ea) {
        super.a(obj, _ea);
        return this;
    }

    public final Uea<K, V> a() {
        return new Uea<>(this.f2676a);
    }
}
