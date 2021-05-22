package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class HV<E> extends AbstractC2634zV<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient AV<E> f2139b;

    HV() {
    }

    public static <E> HV<E> a(E e) {
        return new TV(e);
    }

    @SafeVarargs
    public static <E> HV<E> a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        C1945pV.a(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return b(objArr.length, objArr);
    }

    /* access modifiers changed from: private */
    public static <E> HV<E> b(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return a(objArr[0]);
            }
            int h = h(i);
            Object[] objArr2 = new Object[h];
            int i2 = h - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                MV.a(obj, i5);
                int hashCode = obj.hashCode();
                int a2 = C2427wV.a(hashCode);
                while (true) {
                    int i6 = a2 & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    a2++;
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new TV(objArr[0], i3);
            }
            if (h(i4) < h / 2) {
                i = i4;
            } else {
                if (b(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new RV(objArr, i3, objArr2, i2, i4);
            }
        }
        return RV.f3015c;
    }

    /* access modifiers changed from: private */
    public static boolean b(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int h(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C1945pV.a(z, "collection too large");
            return 1073741824;
        }
    }

    public static <E> GV<E> i(int i) {
        C2289uV.a(i, "expectedSize");
        return new GV<>(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HV) || !o() || !((HV) obj).o() || hashCode() == obj.hashCode()) {
            return UV.a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return UV.a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.android.gms.internal.ads.AbstractC2634zV, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public AV<E> m() {
        AV<E> av = this.f2139b;
        if (av != null) {
            return av;
        }
        AV<E> p = p();
        this.f2139b = p;
        return p;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public AV<E> p() {
        return AV.b(toArray());
    }
}
