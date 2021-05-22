package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class Jda implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f2330a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2331b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f2332c;
    private final /* synthetic */ Bda d;

    private Jda(Bda bda) {
        this.d = bda;
        this.f2330a = -1;
    }

    /* synthetic */ Jda(Bda bda, Ada ada) {
        this(bda);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f2332c == null) {
            this.f2332c = this.d.f1627c.entrySet().iterator();
        }
        return this.f2332c;
    }

    public final boolean hasNext() {
        return this.f2330a + 1 < this.d.f1626b.size() || (!this.d.f1627c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f2331b = true;
        int i = this.f2330a + 1;
        this.f2330a = i;
        return (Map.Entry) (i < this.d.f1626b.size() ? this.d.f1626b.get(this.f2330a) : a().next());
    }

    public final void remove() {
        if (this.f2331b) {
            this.f2331b = false;
            this.d.f();
            if (this.f2330a < this.d.f1626b.size()) {
                Bda bda = this.d;
                int i = this.f2330a;
                this.f2330a = i - 1;
                Object unused = bda.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
