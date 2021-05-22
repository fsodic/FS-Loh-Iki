package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Uz  reason: case insensitive filesystem */
public final class BinderC0733Uz extends AbstractBinderC2463wpa {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3308a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private AbstractC2532xpa f3309b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0297Ef f3310c;

    public BinderC0733Uz(AbstractC2532xpa xpa, AbstractC0297Ef ef) {
        this.f3309b = xpa;
        this.f3310c = ef;
    }

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
        synchronized (this.f3308a) {
            if (this.f3309b != null) {
                this.f3309b.a(ypa);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float ba() {
        AbstractC0297Ef ef = this.f3310c;
        if (ef != null) {
            return ef.Ba();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void f(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float getDuration() {
        AbstractC0297Ef ef = this.f3310c;
        if (ef != null) {
            return ef.Ea();
        }
        return 0.0f;
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
        synchronized (this.f3308a) {
            if (this.f3309b == null) {
                return null;
            }
            return this.f3309b.vb();
        }
    }
}
