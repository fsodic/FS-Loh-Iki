package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.nda  reason: case insensitive filesystem */
public final class C1819nda<E> extends Cba<E> implements RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C1819nda<Object> f5059b;

    /* renamed from: c  reason: collision with root package name */
    private E[] f5060c;
    private int d;

    static {
        C1819nda<Object> nda = new C1819nda<>(new Object[0], 0);
        f5059b = nda;
        nda.c();
    }

    private C1819nda(E[] eArr, int i) {
        this.f5060c = eArr;
        this.d = i;
    }

    public static <E> C1819nda<E> b() {
        return (C1819nda<E>) f5059b;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    private final String i(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i, E e) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        E[] eArr = this.f5060c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f5060c, i, eArr2, i + 1, this.d - i);
            this.f5060c = eArr2;
        }
        this.f5060c[i] = e;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final boolean add(E e) {
        a();
        int i = this.d;
        E[] eArr = this.f5060c;
        if (i == eArr.length) {
            this.f5060c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f5060c;
        int i2 = this.d;
        this.d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Cca
    public final /* synthetic */ Cca b(int i) {
        if (i >= this.d) {
            return new C1819nda(Arrays.copyOf(this.f5060c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i) {
        h(i);
        return this.f5060c[i];
    }

    @Override // java.util.List, java.util.AbstractList
    public final E remove(int i) {
        a();
        h(i);
        E[] eArr = this.f5060c;
        E e = eArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E set(int i, E e) {
        a();
        h(i);
        E[] eArr = this.f5060c;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    public final int size() {
        return this.d;
    }
}
