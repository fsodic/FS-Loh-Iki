package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.lja */
public final class C1693lja implements AbstractC2040qka {

    /* renamed from: a */
    private final Uri f4896a;

    /* renamed from: b */
    private final AbstractC1213eka f4897b;

    /* renamed from: c */
    private final C1900oja f4898c;
    private final C2591yka d;
    private final Wha e = new Wha();
    private volatile boolean f;
    private boolean g = true;
    private long h;
    private long i = -1;
    private final /* synthetic */ C1486ija j;

    public C1693lja(C1486ija ija, Uri uri, AbstractC1213eka eka, C1900oja oja, C2591yka yka) {
        this.j = ija;
        C2453wka.a(uri);
        this.f4896a = uri;
        C2453wka.a(eka);
        this.f4897b = eka;
        C2453wka.a(oja);
        this.f4898c = oja;
        this.d = yka;
    }

    public final void a(long j2, long j3) {
        this.e.f3447a = j2;
        this.h = j3;
        this.g = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2040qka
    public final boolean a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2040qka
    public final void b() {
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2040qka
    public final void c() {
        Mha mha;
        Throwable th;
        int i2 = 0;
        while (i2 == 0 && !this.f) {
            try {
                long j2 = this.e.f3447a;
                this.i = this.f4897b.a(new C1557jka(this.f4896a, j2, -1, this.j.h));
                if (this.i != -1) {
                    this.i += j2;
                }
                mha = new Mha(this.f4897b, j2, this.i);
                try {
                    Pha a2 = this.f4898c.a(mha, this.f4897b.getUri());
                    if (this.g) {
                        a2.a(j2, this.h);
                        this.g = false;
                    }
                    while (i2 == 0 && !this.f) {
                        this.d.a();
                        i2 = a2.a(mha, this.e);
                        if (mha.getPosition() > this.j.i + j2) {
                            j2 = mha.getPosition();
                            this.d.c();
                            this.j.o.post(this.j.n);
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else {
                        this.e.f3447a = mha.getPosition();
                    }
                    Jka.a(this.f4897b);
                } catch (Throwable th2) {
                    th = th2;
                    if (!(i2 == 1 || mha == null)) {
                        this.e.f3447a = mha.getPosition();
                    }
                    Jka.a(this.f4897b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                mha = null;
                this.e.f3447a = mha.getPosition();
                Jka.a(this.f4897b);
                throw th;
            }
        }
    }
}
