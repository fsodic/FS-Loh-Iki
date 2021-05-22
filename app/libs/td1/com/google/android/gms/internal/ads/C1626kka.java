package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.kka  reason: case insensitive filesystem */
public class C1626kka extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private final int f4797a;

    /* renamed from: b  reason: collision with root package name */
    private final C1557jka f4798b;

    public C1626kka(IOException iOException, C1557jka jka, int i) {
        super(iOException);
        this.f4798b = jka;
        this.f4797a = i;
    }

    public C1626kka(String str, C1557jka jka, int i) {
        super(str);
        this.f4798b = jka;
        this.f4797a = 1;
    }

    public C1626kka(String str, IOException iOException, C1557jka jka, int i) {
        super(str, iOException);
        this.f4798b = jka;
        this.f4797a = 1;
    }
}
