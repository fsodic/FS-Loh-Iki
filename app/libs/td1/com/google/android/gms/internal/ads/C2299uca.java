package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uca  reason: case insensitive filesystem */
public final class C2299uca extends Cba<Integer> implements AbstractC2506xca, AbstractC1681lda, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C2299uca f5735b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f5736c;
    private int d;

    static {
        C2299uca uca = new C2299uca(new int[0], 0);
        f5735b = uca;
        uca.c();
    }

    C2299uca() {
        this(new int[10], 0);
    }

    private C2299uca(int[] iArr, int i) {
        this.f5736c = iArr;
        this.d = i;
    }

    public static C2299uca b() {
        return f5735b;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        int[] iArr = this.f5736c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f5736c, i, iArr2, i + 1, this.d - i);
            this.f5736c = iArr2;
        }
        this.f5736c[i] = intValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final /* synthetic */ boolean add(Integer num) {
        d(num.intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        C2230tca.a(collection);
        if (!(collection instanceof C2299uca)) {
            return super.addAll(collection);
        }
        C2299uca uca = (C2299uca) collection;
        int i = uca.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f5736c;
            if (i3 > iArr.length) {
                this.f5736c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(uca.f5736c, 0, this.f5736c, this.d, uca.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2506xca
    /* renamed from: c */
    public final AbstractC2506xca b(int i) {
        if (i >= this.d) {
            return new C2299uca(Arrays.copyOf(this.f5736c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2506xca
    public final void d(int i) {
        a();
        int i2 = this.d;
        int[] iArr = this.f5736c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5736c = iArr2;
        }
        int[] iArr3 = this.f5736c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2299uca)) {
            return super.equals(obj);
        }
        C2299uca uca = (C2299uca) obj;
        if (this.d != uca.d) {
            return false;
        }
        int[] iArr = uca.f5736c;
        for (int i = 0; i < this.d; i++) {
            if (this.f5736c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(h(i));
    }

    public final int h(int i) {
        i(i);
        return this.f5736c[i];
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.f5736c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f5736c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        i(i);
        int[] iArr = this.f5736c;
        int i2 = iArr[i];
        int i3 = this.d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.Cba
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.f5736c[i]))) {
                int[] iArr = this.f5736c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d - i) - 1);
                this.d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            int[] iArr = this.f5736c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        i(i);
        int[] iArr = this.f5736c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.d;
    }
}
