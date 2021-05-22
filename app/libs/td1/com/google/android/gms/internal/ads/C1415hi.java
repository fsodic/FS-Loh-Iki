package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hi  reason: case insensitive filesystem */
public final class C1415hi {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<byte[]> f4499a = new C2381vj();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f4500b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<byte[]> f4501c = new ArrayList(64);
    private int d = 0;
    private final int e = 4096;

    public C1415hi(int i) {
    }

    private final synchronized void a() {
        while (this.d > this.e) {
            byte[] remove = this.f4500b.remove(0);
            this.f4501c.remove(remove);
            this.d -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.e) {
                this.f4500b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f4501c, bArr, f4499a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f4501c.add(binarySearch, bArr);
                this.d += bArr.length;
                a();
            }
        }
    }

    public final synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.f4501c.size(); i2++) {
            byte[] bArr = this.f4501c.get(i2);
            if (bArr.length >= i) {
                this.d -= bArr.length;
                this.f4501c.remove(i2);
                this.f4500b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
