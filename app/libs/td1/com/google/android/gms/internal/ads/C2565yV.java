package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.yV  reason: case insensitive filesystem */
public class C2565yV<E> extends BV<E> {

    /* renamed from: a  reason: collision with root package name */
    Object[] f6092a;

    /* renamed from: b  reason: collision with root package name */
    int f6093b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f6094c;

    C2565yV(int i) {
        C2289uV.a(i, "initialCapacity");
        this.f6092a = new Object[i];
    }

    private final void a(int i) {
        Object[] objArr = this.f6092a;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.f6092a = Arrays.copyOf(objArr, i2);
                this.f6094c = false;
                return;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        } else if (this.f6094c) {
            this.f6092a = (Object[]) objArr.clone();
            this.f6094c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.BV
    public BV<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(this.f6093b + collection.size());
            if (collection instanceof AbstractC2634zV) {
                this.f6093b = ((AbstractC2634zV) collection).a(this.f6092a, this.f6093b);
                return this;
            }
        }
        super.a((Iterable) iterable);
        return this;
    }

    public C2565yV<E> b(E e) {
        C1945pV.a(e);
        a(this.f6093b + 1);
        Object[] objArr = this.f6092a;
        int i = this.f6093b;
        this.f6093b = i + 1;
        objArr[i] = e;
        return this;
    }
}
