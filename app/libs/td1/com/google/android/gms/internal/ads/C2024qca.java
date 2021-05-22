package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qca  reason: case insensitive filesystem */
public final class C2024qca extends Cba<Float> implements Cca<Float>, AbstractC1681lda, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C2024qca f5330b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f5331c;
    private int d;

    static {
        C2024qca qca = new C2024qca(new float[0], 0);
        f5330b = qca;
        qca.c();
    }

    C2024qca() {
        this(new float[10], 0);
    }

    private C2024qca(float[] fArr, int i) {
        this.f5331c = fArr;
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

    public final void a(float f) {
        a();
        int i = this.d;
        float[] fArr = this.f5331c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f5331c = fArr2;
        }
        float[] fArr3 = this.f5331c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        float[] fArr = this.f5331c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f5331c, i, fArr2, i + 1, this.d - i);
            this.f5331c = fArr2;
        }
        this.f5331c[i] = floatValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, com.google.android.gms.internal.ads.Cba
    public final /* synthetic */ boolean add(Float f) {
        a(f.floatValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.google.android.gms.internal.ads.Cba
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        C2230tca.a(collection);
        if (!(collection instanceof C2024qca)) {
            return super.addAll(collection);
        }
        C2024qca qca = (C2024qca) collection;
        int i = qca.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f5331c;
            if (i3 > fArr.length) {
                this.f5331c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(qca.f5331c, 0, this.f5331c, this.d, qca.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.Cca' to match base method */
    @Override // com.google.android.gms.internal.ads.Cca
    public final /* synthetic */ Cca<Float> b(int i) {
        if (i >= this.d) {
            return new C2024qca(Arrays.copyOf(this.f5331c, i), this.d);
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
        if (!(obj instanceof C2024qca)) {
            return super.equals(obj);
        }
        C2024qca qca = (C2024qca) obj;
        if (this.d != qca.d) {
            return false;
        }
        float[] fArr = qca.f5331c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.f5331c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Float.valueOf(this.f5331c[i]);
    }

    @Override // com.google.android.gms.internal.ads.Cba
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f5331c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f5331c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        h(i);
        float[] fArr = this.f5331c;
        float f = fArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.Cba
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Float.valueOf(this.f5331c[i]))) {
                float[] fArr = this.f5331c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.d - i) - 1);
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
            float[] fArr = this.f5331c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        h(i);
        float[] fArr = this.f5331c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.d;
    }
}
