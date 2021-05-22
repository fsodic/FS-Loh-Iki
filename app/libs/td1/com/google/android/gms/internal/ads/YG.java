package com.google.android.gms.internal.ads;

public final class YG implements AbstractC0650Ru, AbstractC0261Cv {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3542a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f3543b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final C1036cH f3544c;

    public YG(C1036cH cHVar) {
        this.f3544c = cHVar;
    }

    private static void b() {
        synchronized (f3542a) {
            f3543b++;
        }
    }

    private static boolean c() {
        boolean z;
        synchronized (f3542a) {
            z = f3543b < ((Integer) C2392voa.e().a(C2474x.ge)).intValue();
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue() && c()) {
            this.f3544c.a(true);
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final void c(int i) {
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue() && c()) {
            this.f3544c.a(false);
            b();
        }
    }
}
