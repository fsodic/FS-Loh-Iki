package b.c.b.a.d.d;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class La extends Ra {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Ia f368b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private La(Ia ia) {
        super(ia, null);
        this.f368b = ia;
    }

    /* synthetic */ La(Ia ia, Ja ja) {
        this(ia);
    }

    @Override // b.c.b.a.d.d.Ra, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new Ka(this.f368b, null);
    }
}
