package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* renamed from: com.google.android.gms.internal.ads.Yr  reason: case insensitive filesystem */
public class C0829Yr extends Bea implements Closeable {
    private static Jea j = Jea.a(C0829Yr.class);

    public C0829Yr(Dea dea, AbstractC2604ys ysVar) {
        a(dea, dea.size(), ysVar);
    }

    @Override // com.google.android.gms.internal.ads.Bea, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    @Override // com.google.android.gms.internal.ads.Bea
    public String toString() {
        String obj = this.d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
