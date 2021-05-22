package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.AbstractC0140c;
import com.google.android.gms.common.api.internal.AbstractC0162n;
import com.google.android.gms.common.api.internal.BinderC0159la;
import com.google.android.gms.common.api.internal.C0136a;
import com.google.android.gms.common.api.internal.C0141ca;
import com.google.android.gms.common.api.internal.C0146f;
import com.google.android.gms.common.api.internal.za;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.r;
import java.util.Collections;

public class e<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1183a;

    /* renamed from: b  reason: collision with root package name */
    private final a<O> f1184b;

    /* renamed from: c  reason: collision with root package name */
    private final O f1185c = null;
    private final za<O> d;
    private final Looper e;
    private final int f;
    private final f g;
    private final AbstractC0162n h;
    protected final C0146f i;

    protected e(Context context, a<O> aVar, Looper looper) {
        r.a(context, "Null context is not permitted.");
        r.a(aVar, "Api must not be null.");
        r.a(looper, "Looper must not be null.");
        this.f1183a = context.getApplicationContext();
        this.f1184b = aVar;
        this.e = looper;
        this.d = za.a(aVar);
        this.g = new C0141ca(this);
        this.i = C0146f.a(this.f1183a);
        this.f = this.i.b();
        this.h = new C0136a();
    }

    private final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(int i2, T t) {
        t.f();
        this.i.a(this, i2, t);
        return t;
    }

    public a.f a(Looper looper, C0146f.a<O> aVar) {
        return this.f1184b.d().a(this.f1183a, looper, a().a(), this.f1185c, aVar, aVar);
    }

    public <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        a(1, t);
        return t;
    }

    public BinderC0159la a(Context context, Handler handler) {
        return new BinderC0159la(context, handler, a().a());
    }

    /* access modifiers changed from: protected */
    public C0177c.a a() {
        Account account;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        C0177c.a aVar = new C0177c.a();
        O o = this.f1185c;
        if (!(o instanceof a.d.b) || (a3 = ((a.d.b) o).a()) == null) {
            O o2 = this.f1185c;
            account = o2 instanceof a.d.AbstractC0026a ? ((a.d.AbstractC0026a) o2).r() : null;
        } else {
            account = a3.L();
        }
        aVar.a(account);
        O o3 = this.f1185c;
        aVar.a((!(o3 instanceof a.d.b) || (a2 = ((a.d.b) o3).a()) == null) ? Collections.emptySet() : a2.S());
        aVar.a(this.f1183a.getClass().getName());
        aVar.b(this.f1183a.getPackageName());
        return aVar;
    }

    public final a<O> b() {
        return this.f1184b;
    }

    public final int c() {
        return this.f;
    }

    public Looper d() {
        return this.e;
    }

    public final za<O> e() {
        return this.d;
    }
}
