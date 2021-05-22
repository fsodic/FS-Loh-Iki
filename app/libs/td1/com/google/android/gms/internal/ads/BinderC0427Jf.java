package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Jf  reason: case insensitive filesystem */
public final class BinderC0427Jf extends AbstractBinderC2463wpa {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2336a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile AbstractC2601ypa f2337b;

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final int P() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float W() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void a(AbstractC2601ypa ypa) {
        synchronized (this.f2336a) {
            this.f2337b = ypa;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float ba() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void f(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float getDuration() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final boolean isMuted() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final boolean la() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void pause() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void pb() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final boolean qb() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void stop() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final AbstractC2601ypa vb() {
        AbstractC2601ypa ypa;
        synchronized (this.f2336a) {
            ypa = this.f2337b;
        }
        return ypa;
    }
}
