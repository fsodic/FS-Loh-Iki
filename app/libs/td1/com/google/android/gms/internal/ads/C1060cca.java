package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cca  reason: case insensitive filesystem */
public final class C1060cca extends Cba<Double> implements Cca<Double>, AbstractC1681lda, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C1060cca f4002b;

    /* renamed from: c  reason: collision with root package name */
    private double[] f4003c;
    private int d;

    static {
        C1060cca cca = new C1060cca(new double[0], 0);
        f4002b = cca;
        cca.c();
    }

    C1060cca() {
        this(new double[10], 0);
    }

    private C1060cca(double[] dArr, int i) {
        this.f4003c = dArr;
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

    public final void a(double d2) {
        a();
        int i = this.d;
        double[] dArr = this.f4003c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f4003c = dArr2;
        }
        double[] dArr3 = this.f4003c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        double[] dArr = this.f4003c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f4003c, i, dArr2, i + 1, this.d - i);
            this.f4003c = dArr2;
        }
        this.f4003c[i] = doubleValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final /* synthetic */ boolean add(Double d2) {
        a(d2.doubleValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        C2230tca.a(collection);
        if (!(collection instanceof C1060cca)) {
            return super.addAll(collection);
        }
        C1060cca cca = (C1060cca) collection;
        int i = cca.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f4003c;
            if (i3 > dArr.length) {
                this.f4003c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(cca.f4003c, 0, this.f4003c, this.d, cca.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.Cca' to match base method */
    @Override // com.google.android.gms.internal.ads.Cca
    public final /* synthetic */ Cca<Double> b(int i) {
        if (i >= this.d) {
            return new C1060cca(Arrays.copyOf(this.f4003c, i), this.d);
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
        if (!(obj instanceof C1060cca)) {
            return super.equals(obj);
        }
        C1060cca cca = (C1060cca) obj;
        if (this.d != cca.d) {
            return false;
        }
        double[] dArr = cca.f4003c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.f4003c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Double.valueOf(this.f4003c[i]);
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + C2230tca.a(Double.doubleToLongBits(this.f4003c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4003c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        h(i);
        double[] dArr = this.f4003c;
        double d2 = dArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.Cba
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Double.valueOf(this.f4003c[i]))) {
                double[] dArr = this.f4003c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.d - i) - 1);
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
            double[] dArr = this.f4003c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        h(i);
        double[] dArr = this.f4003c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.d;
    }
}
