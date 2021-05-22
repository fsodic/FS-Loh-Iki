package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

public final class LU {

    /* renamed from: a  reason: collision with root package name */
    private final C1480iga f2493a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2494b;

    /* renamed from: c  reason: collision with root package name */
    private final File f2495c;
    private final File d;
    private byte[] e;

    public LU(C1480iga iga, File file, File file2, File file3) {
        this.f2493a = iga;
        this.f2494b = file;
        this.f2495c = file3;
        this.d = file2;
    }

    public final boolean a() {
        return System.currentTimeMillis() / 1000 > this.f2493a.p();
    }

    public final boolean a(long j) {
        return this.f2493a.p() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final C1480iga b() {
        return this.f2493a;
    }

    public final File c() {
        return this.f2494b;
    }

    public final File d() {
        return this.f2495c;
    }

    public final byte[] e() {
        if (this.e == null) {
            this.e = NU.b(this.d);
        }
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
