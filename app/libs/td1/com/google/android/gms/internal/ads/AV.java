package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class AV<E> extends AbstractC2634zV<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final VV<Object> f1518b = new CV(LV.f2496c, 0);

    AV() {
    }

    public static <E> AV<E> a(Iterable<? extends E> iterable) {
        Object[] objArr;
        int i;
        C1945pV.a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection instanceof AbstractC2634zV) {
                AV<E> m = ((AbstractC2634zV) collection).m();
                if (!m.n()) {
                    return m;
                }
                objArr = m.toArray();
                i = objArr.length;
            } else {
                objArr = collection.toArray();
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    MV.a(objArr[i2], i2);
                }
                i = objArr.length;
            }
        } else {
            Iterator<? extends E> it = iterable.iterator();
            if (!it.hasNext()) {
                return (AV<E>) LV.f2496c;
            }
            Object next = it.next();
            if (!it.hasNext()) {
                return a(next);
            }
            DV dv = new DV();
            dv.a(next);
            DV dv2 = dv;
            dv2.a((Iterator) it);
            DV dv3 = dv2;
            dv3.f6094c = true;
            objArr = dv3.f6092a;
            i = dv3.f6093b;
        }
        return b(objArr, i);
    }

    public static <E> AV<E> a(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            MV.a(objArr[0], 0);
        }
        return b(objArr, 1);
    }

    public static <E> AV<E> a(E[] eArr) {
        if (eArr.length == 0) {
            return (AV<E>) LV.f2496c;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            MV.a(objArr[i], i);
        }
        return b(objArr, objArr.length);
    }

    static <E> AV<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static <E> AV<E> b(Object[] objArr, int i) {
        return i == 0 ? (AV<E>) LV.f2496c : new LV(objArr, i);
    }

    public static <E> AV<E> o() {
        return (AV<E>) LV.f2496c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public AV<E> subList(int i, int i2) {
        C1945pV.a(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? (AV<E>) LV.f2496c : new FV(this, i, i3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    /* renamed from: a */
    public final WV<E> iterator() {
        return (VV) listIterator();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        C1945pV.a(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C1738mV.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!C1738mV.a(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (VV) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        C1945pV.b(i, size());
        return isEmpty() ? f1518b : new CV(this, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final AV<E> m() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
