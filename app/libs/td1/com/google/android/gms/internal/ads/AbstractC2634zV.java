package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.zV  reason: case insensitive filesystem */
public abstract class AbstractC2634zV<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f6183a = new Object[0];

    AbstractC2634zV() {
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        WV wv = (WV) iterator();
        while (wv.hasNext()) {
            objArr[i] = wv.next();
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public abstract WV<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object[] b() {
        return null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int l() {
        throw new UnsupportedOperationException();
    }

    public AV<E> m() {
        return isEmpty() ? AV.o() : AV.b(toArray());
    }

    /* access modifiers changed from: package-private */
    public abstract boolean n();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f6183a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C1945pV.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] b2 = b();
            if (b2 != null) {
                return (T[]) Arrays.copyOfRange(b2, k(), l(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
