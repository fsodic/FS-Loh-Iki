package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import b.c.b.a.b.j;
import b.c.b.a.d.g.h;
import b.c.b.a.f.a.a.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0181g;
import com.google.android.gms.common.internal.C0177c;
import java.util.Set;

public final class c extends AbstractC0181g<a> {
    private a G;
    private final e H;

    public c(Context context, Looper looper, C0177c cVar, e eVar, f.b bVar, f.c cVar2) {
        super(context, looper, 2, cVar, bVar, cVar2);
        this.H = eVar;
    }

    public final void A() {
        m();
        try {
            this.G = null;
            ((a) u()).ub();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new b(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.G = h.a(bundle.getByteArray("loaded_person"));
        }
        super.a(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0181g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public final int g() {
        return j.f305a;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public final boolean j() {
        Set<Scope> a2 = z().a(b.c.b.a.f.c.f520c);
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        return a2.size() != 1 || !a2.contains(new Scope("plus_one_placeholder_scope"));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final Bundle r() {
        Bundle B = this.H.B();
        B.putStringArray("request_visible_actions", this.H.c());
        B.putString("auth_package", this.H.y());
        return B;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String v() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final String w() {
        return "com.google.android.gms.plus.service.START";
    }
}
