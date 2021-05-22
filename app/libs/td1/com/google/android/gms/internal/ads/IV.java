package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class IV implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1670lW f2231a;

    IV(C1670lW lWVar) {
        this.f2231a = lWVar;
    }

    public final void run() {
        boolean z;
        if (this.f2231a.e == null) {
            synchronized (C1670lW.f4858a) {
                if (this.f2231a.e == null) {
                    boolean z2 = false;
                    try {
                        z = C2474x.vb.a().booleanValue();
                    } catch (IllegalStateException unused) {
                        z = false;
                    }
                    if (z) {
                        try {
                            C1670lW.f4859b = new Hma(this.f2231a.d.f5064b, "ADSHIELD", null);
                        } catch (Throwable unused2) {
                        }
                    }
                    z2 = z;
                    this.f2231a.e = Boolean.valueOf(z2);
                    C1670lW.f4858a.open();
                }
            }
        }
    }
}
