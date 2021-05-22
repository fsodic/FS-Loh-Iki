package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.xea  reason: case insensitive filesystem */
public abstract class AbstractC2510xea implements AbstractC0856Zs {

    /* renamed from: a  reason: collision with root package name */
    private static Jea f5998a = Jea.a(AbstractC2510xea.class);

    /* renamed from: b  reason: collision with root package name */
    private String f5999b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0208Au f6000c;
    boolean d;
    private boolean e;
    private ByteBuffer f;
    private long g;
    private long h;
    private long i = -1;
    private Dea j;
    private ByteBuffer k = null;

    protected AbstractC2510xea(String str) {
        this.f5999b = str;
        this.e = true;
        this.d = true;
    }

    private final synchronized void b() {
        if (!this.e) {
            try {
                Jea jea = f5998a;
                String valueOf = String.valueOf(this.f5999b);
                jea.a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.f = this.j.a(this.g, this.i);
                this.e = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final synchronized void a() {
        b();
        Jea jea = f5998a;
        String valueOf = String.valueOf(this.f5999b);
        jea.a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.f != null) {
            ByteBuffer byteBuffer = this.f;
            this.d = true;
            byteBuffer.rewind();
            a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.k = byteBuffer.slice();
            }
            this.f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0856Zs
    public final void a(AbstractC0208Au au) {
        this.f6000c = au;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0856Zs
    public final void a(Dea dea, ByteBuffer byteBuffer, long j2, AbstractC2604ys ysVar) {
        this.g = dea.position();
        this.h = this.g - ((long) byteBuffer.remaining());
        this.i = j2;
        this.j = dea;
        dea.a(dea.position() + j2);
        this.e = false;
        this.d = false;
        a();
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.AbstractC0856Zs
    public final String getType() {
        return this.f5999b;
    }
}
