package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class GV<E> extends C2565yV<E> {
    private Object[] d;
    private int e;

    public GV() {
        super(4);
    }

    GV(int i) {
        super(i);
        this.d = new Object[HV.h(i)];
    }

    @Override // com.google.android.gms.internal.ads.BV, com.google.android.gms.internal.ads.C2565yV
    public final /* synthetic */ BV a(Iterable iterable) {
        C1945pV.a(iterable);
        if (this.d != null) {
            for (Object obj : iterable) {
                a(obj);
            }
        } else {
            super.a(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.BV
    public final /* synthetic */ BV a(Object obj) {
        C1945pV.a(obj);
        if (this.d != null) {
            int h = HV.h(this.f6093b);
            Object[] objArr = this.d;
            if (h <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a2 = C2427wV.a(hashCode);
                while (true) {
                    int i = a2 & length;
                    Object[] objArr2 = this.d;
                    Object[] objArr3 = objArr2[i];
                    if (objArr3 != 0) {
                        if (objArr3.equals(obj)) {
                            break;
                        }
                        a2 = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.b(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        super.b(obj);
        return this;
    }

    public final HV<E> a() {
        HV<E> hv;
        int i = this.f6093b;
        if (i == 0) {
            return RV.f3015c;
        }
        if (i == 1) {
            return HV.a(this.f6092a[0]);
        }
        if (this.d == null || HV.h(i) != this.d.length) {
            hv = HV.b(this.f6093b, this.f6092a);
            this.f6093b = hv.size();
        } else {
            Object[] copyOf = HV.b(this.f6093b, this.f6092a.length) ? Arrays.copyOf(this.f6092a, this.f6093b) : this.f6092a;
            int i2 = this.e;
            Object[] objArr = this.d;
            hv = new RV<>(copyOf, i2, objArr, objArr.length - 1, this.f6093b);
        }
        this.f6094c = true;
        this.d = null;
        return hv;
    }
}
