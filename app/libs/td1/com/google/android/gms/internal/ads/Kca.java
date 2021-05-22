package com.google.android.gms.internal.ads;

public class Kca {

    /* renamed from: a  reason: collision with root package name */
    private static final C1197eca f2416a = C1197eca.a();

    /* renamed from: b  reason: collision with root package name */
    private Iba f2417b;

    /* renamed from: c  reason: collision with root package name */
    private volatile AbstractC0993bda f2418c;
    private volatile Iba d;

    private final AbstractC0993bda b(AbstractC0993bda bda) {
        if (this.f2418c == null) {
            synchronized (this) {
                if (this.f2418c == null) {
                    try {
                        this.f2418c = bda;
                        this.d = Iba.f2236a;
                    } catch (Bca unused) {
                        this.f2418c = bda;
                        this.d = Iba.f2236a;
                    }
                }
            }
        }
        return this.f2418c;
    }

    public final Iba a() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                return this.d;
            }
            this.d = this.f2418c == null ? Iba.f2236a : this.f2418c.d();
            return this.d;
        }
    }

    public final AbstractC0993bda a(AbstractC0993bda bda) {
        AbstractC0993bda bda2 = this.f2418c;
        this.f2417b = null;
        this.d = null;
        this.f2418c = bda;
        return bda2;
    }

    public final int b() {
        if (this.d != null) {
            return this.d.size();
        }
        if (this.f2418c != null) {
            return this.f2418c.e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kca)) {
            return false;
        }
        Kca kca = (Kca) obj;
        AbstractC0993bda bda = this.f2418c;
        AbstractC0993bda bda2 = kca.f2418c;
        return (bda == null && bda2 == null) ? a().equals(kca.a()) : (bda == null || bda2 == null) ? bda != null ? bda.equals(kca.b(bda.a())) : b(bda2.a()).equals(bda2) : bda.equals(bda2);
    }

    public int hashCode() {
        return 1;
    }
}
