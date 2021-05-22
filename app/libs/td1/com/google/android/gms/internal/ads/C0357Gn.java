package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Gn  reason: case insensitive filesystem */
public final class C0357Gn {

    /* renamed from: a  reason: collision with root package name */
    private long f2074a;

    public final long a(ByteBuffer byteBuffer) {
        C0235Bv bv;
        C0883_t _tVar;
        long j = this.f2074a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<AbstractC0856Zs> it = new C0829Yr(new C0279Dn(duplicate), C0409In.f2273c).a().iterator();
            while (true) {
                bv = null;
                if (!it.hasNext()) {
                    _tVar = null;
                    break;
                }
                AbstractC0856Zs next = it.next();
                if (next instanceof C0883_t) {
                    _tVar = (C0883_t) next;
                    break;
                }
            }
            Iterator<AbstractC0856Zs> it2 = _tVar.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC0856Zs next2 = it2.next();
                if (next2 instanceof C0235Bv) {
                    bv = (C0235Bv) next2;
                    break;
                }
            }
            this.f2074a = (bv.c() * 1000) / bv.d();
            return this.f2074a;
        } catch (IOException | RuntimeException unused) {
            return 0;
        }
    }
}
