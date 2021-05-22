package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class Pca extends Cba<Long> implements AbstractC2644zca, AbstractC1681lda, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Pca f2850b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f2851c;
    private int d;

    static {
        Pca pca = new Pca(new long[0], 0);
        f2850b = pca;
        pca.c();
    }

    Pca() {
        this(new long[10], 0);
    }

    private Pca(long[] jArr, int i) {
        this.f2851c = jArr;
        this.d = i;
    }

    public static Pca b() {
        return f2850b;
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

    public final void a(long j) {
        a();
        int i = this.d;
        long[] jArr = this.f2851c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f2851c = jArr2;
        }
        long[] jArr3 = this.f2851c;
        int i2 = this.d;
        this.d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        long[] jArr = this.f2851c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f2851c, i, jArr2, i + 1, this.d - i);
            this.f2851c = jArr2;
        }
        this.f2851c[i] = longValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final /* synthetic */ boolean add(Long l) {
        a(l.longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        C2230tca.a(collection);
        if (!(collection instanceof Pca)) {
            return super.addAll(collection);
        }
        Pca pca = (Pca) collection;
        int i = pca.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f2851c;
            if (i3 > jArr.length) {
                this.f2851c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(pca.f2851c, 0, this.f2851c, this.d, pca.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2644zca
    /* renamed from: e */
    public final AbstractC2644zca b(int i) {
        if (i >= this.d) {
            return new Pca(Arrays.copyOf(this.f2851c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pca)) {
            return super.equals(obj);
        }
        Pca pca = (Pca) obj;
        if (this.d != pca.d) {
            return false;
        }
        long[] jArr = pca.f2851c;
        for (int i = 0; i < this.d; i++) {
            if (this.f2851c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(h(i));
    }

    public final long h(int i) {
        i(i);
        return this.f2851c[i];
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + C2230tca.a(this.f2851c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2851c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        i(i);
        long[] jArr = this.f2851c;
        long j = jArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.Cba
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.f2851c[i]))) {
                long[] jArr = this.f2851c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.d - i) - 1);
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
            long[] jArr = this.f2851c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        i(i);
        long[] jArr = this.f2851c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.d;
    }
}
