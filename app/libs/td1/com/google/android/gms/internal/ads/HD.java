package com.google.android.gms.internal.ads;

public final class HD implements AbstractC0650Ru, AbstractC1229ev, AbstractC0261Cv, AbstractC1093cw, AbstractC0860Zw, Ona {

    /* renamed from: a  reason: collision with root package name */
    private final Dma f2101a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2102b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2103c = false;

    public HD(Dma dma, C2353vQ vQVar) {
        this.f2101a = dma;
        dma.a(Fma.AD_REQUEST);
        if (vQVar != null) {
            dma.a(Fma.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0860Zw
    public final void L() {
        this.f2101a.a(Fma.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        this.f2101a.a(Fma.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(BR br) {
        this.f2101a.a(new KD(br));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(C0715Uh uh) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0860Zw
    public final void a(Uma uma) {
        this.f2101a.a(new LD(uma));
        this.f2101a.a(Fma.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final synchronized void b() {
        this.f2101a.a(Fma.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0860Zw
    public final void b(Uma uma) {
        this.f2101a.a(new MD(uma));
        this.f2101a.a(Fma.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final void c(int i) {
        Dma dma;
        Fma fma;
        switch (i) {
            case 1:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD_INVALID_REQUEST;
                break;
            case 2:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD_NETWORK_ERROR;
                break;
            case 3:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD_NO_FILL;
                break;
            case 4:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD_TIMEOUT;
                break;
            case 5:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD_CANCELLED;
                break;
            case 6:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD_NO_ERROR;
                break;
            case 7:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD_NOT_FOUND;
                break;
            default:
                dma = this.f2101a;
                fma = Fma.AD_FAILED_TO_LOAD;
                break;
        }
        dma.a(fma);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0860Zw
    public final void c(Uma uma) {
        this.f2101a.a(new JD(uma));
        this.f2101a.a(Fma.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.Ona
    public final synchronized void e() {
        if (!this.f2103c) {
            this.f2101a.a(Fma.AD_FIRST_CLICK);
            this.f2103c = true;
            return;
        }
        this.f2101a.a(Fma.AD_SUBSEQUENT_CLICK);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0860Zw
    public final void f(boolean z) {
        this.f2101a.a(z ? Fma.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : Fma.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0860Zw
    public final void g(boolean z) {
        this.f2101a.a(z ? Fma.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : Fma.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }
}
