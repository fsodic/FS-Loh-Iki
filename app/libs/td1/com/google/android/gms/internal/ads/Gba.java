package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class Gba extends Cba<Boolean> implements Cca<Boolean>, AbstractC1681lda, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Gba f2049b;

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f2050c;
    private int d;

    static {
        Gba gba = new Gba(new boolean[0], 0);
        f2049b = gba;
        gba.c();
    }

    Gba() {
        this(new boolean[10], 0);
    }

    private Gba(boolean[] zArr, int i) {
        this.f2050c = zArr;
        this.d = i;
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

    public final void a(boolean z) {
        a();
        int i = this.d;
        boolean[] zArr = this.f2050c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f2050c = zArr2;
        }
        boolean[] zArr3 = this.f2050c;
        int i2 = this.d;
        this.d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        boolean[] zArr = this.f2050c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f2050c, i, zArr2, i + 1, this.d - i);
            this.f2050c = zArr2;
        }
        this.f2050c[i] = booleanValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final /* synthetic */ boolean add(Boolean bool) {
        a(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        C2230tca.a(collection);
        if (!(collection instanceof Gba)) {
            return super.addAll(collection);
        }
        Gba gba = (Gba) collection;
        int i = gba.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f2050c;
            if (i3 > zArr.length) {
                this.f2050c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gba.f2050c, 0, this.f2050c, this.d, gba.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.Cca' to match base method */
    @Override // com.google.android.gms.internal.ads.Cca
    public final /* synthetic */ Cca<Boolean> b(int i) {
        if (i >= this.d) {
            return new Gba(Arrays.copyOf(this.f2050c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gba)) {
            return super.equals(obj);
        }
        Gba gba = (Gba) obj;
        if (this.d != gba.d) {
            return false;
        }
        boolean[] zArr = gba.f2050c;
        for (int i = 0; i < this.d; i++) {
            if (this.f2050c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Boolean.valueOf(this.f2050c[i]);
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + C2230tca.a(this.f2050c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2050c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        h(i);
        boolean[] zArr = this.f2050c;
        boolean z = zArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.Cba
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Boolean.valueOf(this.f2050c[i]))) {
                boolean[] zArr = this.f2050c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.d - i) - 1);
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
            boolean[] zArr = this.f2050c;
            System.arraycopy(zArr, i2, zArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        h(i);
        boolean[] zArr = this.f2050c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.d;
    }
}
