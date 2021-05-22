package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import b.c.b.a.b.j;
import b.c.b.a.d.e.t;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0142d;
import com.google.android.gms.common.api.internal.C0144e;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.common.internal.AbstractC0181g;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.a.a;
import com.google.android.gms.games.b;
import com.google.android.gms.games.d.a;
import java.util.HashSet;
import java.util.Set;

public class r extends AbstractC0181g<j> {
    private final t G = new s(this);
    private final String H;
    private PlayerEntity I;
    private GameEntity J;
    private final n K;
    private boolean L = false;
    private final Binder M;
    private final long N;
    private boolean O = false;
    private final b.a P;
    private Bundle Q;

    /* access modifiers changed from: private */
    public static abstract class a<T> extends a {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractC0142d<T> f1472a;

        a(AbstractC0142d<T> dVar) {
            com.google.android.gms.common.internal.r.a(dVar, "Holder must not be null");
            this.f1472a = dVar;
        }

        /* access modifiers changed from: package-private */
        public final void a(T t) {
            this.f1472a.a(t);
        }
    }

    private static final class b extends a<a.AbstractC0031a> {
        b(AbstractC0142d<a.AbstractC0031a> dVar) {
            super(dVar);
        }

        @Override // com.google.android.gms.games.internal.f, com.google.android.gms.games.internal.a
        public final void d(int i, String str) {
            a(new d(i, str));
        }
    }

    /* access modifiers changed from: private */
    public static final class c extends e implements a.AbstractC0034a {

        /* renamed from: c  reason: collision with root package name */
        private final com.google.android.gms.games.d.b f1473c;

        c(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.f1473c = new com.google.android.gms.games.d.b(dataHolder);
            } finally {
                dataHolder.close();
            }
        }
    }

    private static final class d implements a.AbstractC0031a {

        /* renamed from: a  reason: collision with root package name */
        private final Status f1474a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1475b;

        d(int i, String str) {
            this.f1474a = com.google.android.gms.games.e.b(i);
            this.f1475b = str;
        }

        @Override // com.google.android.gms.common.api.i
        public final Status E() {
            return this.f1474a;
        }
    }

    private static abstract class e extends C0144e {
        e(DataHolder dataHolder) {
            super(dataHolder, com.google.android.gms.games.e.b(dataHolder.M()));
        }
    }

    public r(Context context, Looper looper, C0177c cVar, b.a aVar, f.b bVar, f.c cVar2) {
        super(context, looper, 1, cVar, bVar, cVar2);
        this.H = cVar.h();
        this.M = new Binder();
        this.K = n.a(this, cVar.e());
        this.N = (long) hashCode();
        this.P = aVar;
        if (this.P.i) {
            return;
        }
        if (cVar.k() != null || (context instanceof Activity)) {
            a(cVar.k());
        }
    }

    private static void a(RemoteException remoteException) {
        e.a("GamesClientImpl", "service died", remoteException);
    }

    private static <R> void a(AbstractC0142d<R> dVar, SecurityException securityException) {
        if (dVar != null) {
            dVar.a(com.google.android.gms.games.c.b(4));
        }
    }

    public final Intent A() {
        return ((j) u()).Ra();
    }

    public final Intent B() {
        try {
            return A();
        } catch (RemoteException e2) {
            a(e2);
            return null;
        }
    }

    public final Intent C() {
        try {
            return ((j) u()).va();
        } catch (RemoteException e2) {
            a(e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        if (isConnected()) {
            try {
                ((j) u()).eb();
            } catch (RemoteException e2) {
                a(e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.C0182h.a, com.google.android.gms.common.internal.AbstractC0176b
    public Bundle F() {
        try {
            Bundle F = ((j) u()).F();
            if (F != null) {
                F.setClassLoader(r.class.getClassLoader());
                this.Q = F;
            }
            return F;
        } catch (RemoteException e2) {
            a(e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return queryLocalInterface instanceof j ? (j) queryLocalInterface : new k(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0181g
    public Set<Scope> a(Set<Scope> set) {
        HashSet hashSet = new HashSet(set);
        boolean contains = set.contains(com.google.android.gms.games.b.d);
        boolean contains2 = set.contains(com.google.android.gms.games.b.e);
        if (set.contains(com.google.android.gms.games.b.g)) {
            com.google.android.gms.common.internal.r.b(!contains, "Cannot have both %s and %s!", "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty");
        } else {
            com.google.android.gms.common.internal.r.b(contains || contains2, "Games APIs requires %s function.", "https://www.googleapis.com/auth/games_lite");
            if (contains2 && contains) {
                hashSet.remove(com.google.android.gms.games.b.e);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public void a() {
        this.L = false;
        if (isConnected()) {
            try {
                j jVar = (j) u();
                jVar.eb();
                this.G.a();
                jVar.a(this.N);
            } catch (RemoteException unused) {
                e.b("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(r.class.getClassLoader());
            this.L = bundle.getBoolean("show_welcome_popup");
            this.O = this.L;
            this.I = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            this.J = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.a(i, iBinder, bundle, i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            try {
                ((j) u()).a(iBinder, bundle);
            } catch (RemoteException e2) {
                a(e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public /* synthetic */ void a(IInterface iInterface) {
        j jVar = (j) iInterface;
        super.a(jVar);
        if (this.L) {
            this.K.d();
            this.L = false;
        }
        b.a aVar = this.P;
        if (!aVar.f1436a && !aVar.i) {
            try {
                jVar.a(new u(new l(this.K.c())), this.N);
            } catch (RemoteException e2) {
                a(e2);
            }
        }
    }

    public final void a(View view) {
        this.K.a(view);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public void a(b.c.b.a.b.b bVar) {
        super.a(bVar);
        this.L = false;
    }

    public final void a(AbstractC0142d<Status> dVar) {
        this.G.a();
        try {
            ((j) u()).a(new t(dVar));
        } catch (SecurityException e2) {
            a(dVar, e2);
        }
    }

    public final void a(AbstractC0142d<a.AbstractC0031a> dVar, String str) {
        try {
            ((j) u()).a(dVar == null ? null : new b(dVar), str, this.K.b(), this.K.a());
        } catch (SecurityException e2) {
            a(dVar, e2);
        }
    }

    public final void a(AbstractC0142d<a.AbstractC0031a> dVar, String str, int i) {
        try {
            ((j) u()).a(dVar == null ? null : new b(dVar), str, i, this.K.b(), this.K.a());
        } catch (SecurityException e2) {
            a(dVar, e2);
        }
    }

    public final void a(AbstractC0142d<a.AbstractC0034a> dVar, String str, long j, String str2) {
        try {
            ((j) u()).a(dVar == null ? null : new b(dVar), str, j, str2);
        } catch (SecurityException e2) {
            a(dVar, e2);
        }
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public void a(AbstractC0176b.c cVar) {
        this.I = null;
        this.J = null;
        super.a(cVar);
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public void a(AbstractC0176b.e eVar) {
        try {
            a(new c(eVar));
        } catch (RemoteException unused) {
            eVar.V();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0181g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public int g() {
        return j.f305a;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public boolean j() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public Bundle r() {
        String locale = q().getResources().getConfiguration().locale.toString();
        Bundle c2 = this.P.c();
        c2.putString("com.google.android.gms.games.key.gamePackageName", this.H);
        c2.putString("com.google.android.gms.games.key.desiredLocale", locale);
        c2.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.K.b()));
        c2.putInt("com.google.android.gms.games.key.API_VERSION", 6);
        c2.putBundle("com.google.android.gms.games.key.signInOptions", b.c.b.a.g.a.a.a(z()));
        return c2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public String v() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public String w() {
        return "com.google.android.gms.games.service.START";
    }
}
