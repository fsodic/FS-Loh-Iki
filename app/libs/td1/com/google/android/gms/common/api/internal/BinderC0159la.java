package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b.c.b.a.g.a.d;
import b.c.b.a.g.a.k;
import b.c.b.a.g.b;
import b.c.b.a.g.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.la  reason: case insensitive filesystem */
public final class BinderC0159la extends d implements f.b, f.c {

    /* renamed from: a  reason: collision with root package name */
    private static a.AbstractC0025a<? extends e, b.c.b.a.g.a> f1278a = b.f536c;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1279b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f1280c;
    private final a.AbstractC0025a<? extends e, b.c.b.a.g.a> d;
    private Set<Scope> e;
    private C0177c f;
    private e g;
    private oa h;

    public BinderC0159la(Context context, Handler handler, C0177c cVar) {
        this(context, handler, cVar, f1278a);
    }

    public BinderC0159la(Context context, Handler handler, C0177c cVar, a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar) {
        this.f1279b = context;
        this.f1280c = handler;
        r.a(cVar, "ClientSettings must not be null");
        this.f = cVar;
        this.e = cVar.i();
        this.d = aVar;
    }

    /* access modifiers changed from: private */
    public final void b(k kVar) {
        b.c.b.a.b.b L = kVar.L();
        if (L.P()) {
            t M = kVar.M();
            L = M.M();
            if (!L.P()) {
                String valueOf = String.valueOf(L);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.h.a(M.L(), this.e);
                this.g.a();
            }
        }
        this.h.b(L);
        this.g.a();
    }

    public final e Jb() {
        return this.g;
    }

    public final void Kb() {
        e eVar = this.g;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // b.c.b.a.g.a.e
    public final void a(k kVar) {
        this.f1280c.post(new RunnableC0163na(this, kVar));
    }

    public final void a(oa oaVar) {
        e eVar = this.g;
        if (eVar != null) {
            eVar.a();
        }
        this.f.a(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar = this.d;
        Context context = this.f1279b;
        Looper looper = this.f1280c.getLooper();
        C0177c cVar = this.f;
        this.g = (e) aVar.a(context, looper, cVar, cVar.j(), this, this);
        this.h = oaVar;
        Set<Scope> set = this.e;
        if (set == null || set.isEmpty()) {
            this.f1280c.post(new RunnableC0161ma(this));
        } else {
            this.g.connect();
        }
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnected(Bundle bundle) {
        this.g.a(this);
    }

    @Override // com.google.android.gms.common.api.f.c
    public final void onConnectionFailed(b.c.b.a.b.b bVar) {
        this.h.b(bVar);
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnectionSuspended(int i) {
        this.g.a();
    }
}
