package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import b.c.b.a.c.a;
import b.c.b.a.c.b;

/* renamed from: com.google.android.gms.internal.ads.Kz  reason: case insensitive filesystem */
public final class BinderC0473Kz extends AbstractBinderC0760Wa {

    /* renamed from: a  reason: collision with root package name */
    private final C0707Tz f2450a;

    /* renamed from: b  reason: collision with root package name */
    private a f2451b;

    public BinderC0473Kz(C0707Tz tz) {
        this.f2450a = tz;
    }

    private static float Q(a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) b.Q(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    private final float Wb() {
        try {
            return this.f2450a.n().W();
        } catch (RemoteException e) {
            C0745Vl.b("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final a Pa() {
        a aVar = this.f2451b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC0812Ya q = this.f2450a.q();
        if (q == null) {
            return null;
        }
        return q.Ja();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final float W() {
        if (!((Boolean) C2392voa.e().a(C2474x.ie)).booleanValue()) {
            return 0.0f;
        }
        if (this.f2450a.i() != 0.0f) {
            return this.f2450a.i();
        }
        if (this.f2450a.n() != null) {
            return Wb();
        }
        a aVar = this.f2451b;
        if (aVar != null) {
            return Q(aVar);
        }
        AbstractC0812Ya q = this.f2450a.q();
        if (q == null) {
            return 0.0f;
        }
        float width = (q == null || q.getWidth() == -1 || q.getHeight() == -1) ? 0.0f : ((float) q.getWidth()) / ((float) q.getHeight());
        return width != 0.0f ? width : Q(q.Ja());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final void a(AbstractC0423Jb jb) {
        if (((Boolean) C2392voa.e().a(C2474x.je)).booleanValue() && (this.f2450a.n() instanceof BinderC0306Eo)) {
            ((BinderC0306Eo) this.f2450a.n()).a(jb);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final float ba() {
        if (((Boolean) C2392voa.e().a(C2474x.je)).booleanValue() && this.f2450a.n() != null) {
            return this.f2450a.n().ba();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final float getDuration() {
        if (((Boolean) C2392voa.e().a(C2474x.je)).booleanValue() && this.f2450a.n() != null) {
            return this.f2450a.n().getDuration();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final AbstractC2532xpa getVideoController() {
        if (!((Boolean) C2392voa.e().a(C2474x.je)).booleanValue()) {
            return null;
        }
        return this.f2450a.n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final void i(a aVar) {
        if (((Boolean) C2392voa.e().a(C2474x.cc)).booleanValue()) {
            this.f2451b = aVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final boolean xa() {
        return ((Boolean) C2392voa.e().a(C2474x.je)).booleanValue() && this.f2450a.n() != null;
    }
}
