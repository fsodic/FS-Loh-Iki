package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.xr  reason: case insensitive filesystem */
public abstract class AbstractC2534xr implements AbstractC2604ys {

    /* renamed from: a  reason: collision with root package name */
    private static Logger f6033a = Logger.getLogger(AbstractC2534xr.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private ThreadLocal<ByteBuffer> f6034b = new C0802Xq(this);

    @Override // com.google.android.gms.internal.ads.AbstractC2604ys
    public final AbstractC0856Zs a(Dea dea, AbstractC0208Au au) {
        int read;
        long j;
        long position = dea.position();
        this.f6034b.get().rewind().limit(8);
        do {
            read = dea.read(this.f6034b.get());
            if (read == 8) {
                this.f6034b.get().rewind();
                long a2 = C2674zt.a(this.f6034b.get());
                byte[] bArr = null;
                if (a2 >= 8 || a2 <= 1) {
                    String f = C2674zt.f(this.f6034b.get());
                    if (a2 == 1) {
                        this.f6034b.get().limit(16);
                        dea.read(this.f6034b.get());
                        this.f6034b.get().position(8);
                        j = C2674zt.c(this.f6034b.get()) - 16;
                    } else {
                        j = a2 == 0 ? dea.size() - dea.position() : a2 - 8;
                    }
                    if ("uuid".equals(f)) {
                        this.f6034b.get().limit(this.f6034b.get().limit() + 16);
                        dea.read(this.f6034b.get());
                        bArr = new byte[16];
                        for (int position2 = this.f6034b.get().position() - 16; position2 < this.f6034b.get().position(); position2++) {
                            bArr[position2 - (this.f6034b.get().position() - 16)] = this.f6034b.get().get(position2);
                        }
                        j -= 16;
                    }
                    AbstractC0856Zs a3 = a(f, bArr, au instanceof AbstractC0856Zs ? ((AbstractC0856Zs) au).getType() : BuildConfig.FLAVOR);
                    a3.a(au);
                    this.f6034b.get().rewind();
                    a3.a(dea, this.f6034b.get(), j, this);
                    return a3;
                }
                Logger logger = f6033a;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(a2);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (read >= 0);
        dea.a(position);
        throw new EOFException();
    }

    public abstract AbstractC0856Zs a(String str, byte[] bArr, String str2);
}
