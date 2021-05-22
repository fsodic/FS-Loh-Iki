package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Wea<T> implements Sea<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private static final Sea<Set<Object>> f3438a = Qea.a(Collections.emptySet());

    /* renamed from: b  reason: collision with root package name */
    private final List<_ea<T>> f3439b;

    /* renamed from: c  reason: collision with root package name */
    private final List<_ea<Collection<T>>> f3440c;

    private Wea(List<_ea<T>> list, List<_ea<Collection<T>>> list2) {
        this.f3439b = list;
        this.f3440c = list2;
    }

    public static <T> Yea<T> a(int i, int i2) {
        return new Yea<>(i, i2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        int size = this.f3439b.size();
        ArrayList arrayList = new ArrayList(this.f3440c.size());
        int size2 = this.f3440c.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection<T> collection = this.f3440c.get(i2).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet b2 = Mea.b(i);
        int size3 = this.f3439b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            T t = this.f3439b.get(i3).get();
            Xea.a(t);
            b2.add(t);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                Xea.a(obj);
                b2.add(obj);
            }
        }
        return Collections.unmodifiableSet(b2);
    }
}
