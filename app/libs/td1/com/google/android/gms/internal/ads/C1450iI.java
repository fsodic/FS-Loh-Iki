package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.b;

/* renamed from: com.google.android.gms.internal.ads.iI  reason: case insensitive filesystem */
final class C1450iI implements AbstractC0732Uy {

    /* renamed from: a  reason: collision with root package name */
    private final C1941pR f4551a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1755mg f4552b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4553c;
    private C1160dv d = null;

    C1450iI(C1941pR pRVar, AbstractC1755mg mgVar, boolean z) {
        this.f4551a = pRVar;
        this.f4552b = mgVar;
        this.f4553c = z;
    }

    public final void a(C1160dv dvVar) {
        this.d = dvVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0732Uy
    public final void a(boolean z, Context context) {
        try {
            if (this.f4553c ? this.f4552b.L(b.a(context)) : this.f4552b.o(b.a(context))) {
                C1160dv dvVar = this.d;
                if (dvVar != null && this.f4551a.P == 2) {
                    dvVar.b();
                    return;
                }
                return;
            }
            throw new C0810Xy("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C0810Xy(th);
        }
    }
}
