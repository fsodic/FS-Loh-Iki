package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import b.c.b.a.b.e;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.Aa;
import com.google.android.gms.common.api.internal.AbstractC0140c;
import com.google.android.gms.common.api.internal.C0150h;
import com.google.android.gms.common.api.internal.Ea;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.internal.pa;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<f> f1186a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f1187a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Scope> f1188b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<Scope> f1189c;
        private int d;
        private View e;
        private String f;
        private String g;
        private final Map<a<?>, C0177c.b> h;
        private boolean i;
        private final Context j;
        private final Map<a<?>, a.d> k;
        private C0150h l;
        private int m;
        private Looper n;
        private e o;
        private a.AbstractC0025a<? extends b.c.b.a.g.e, b.c.b.a.g.a> p;
        private final ArrayList<b> q;
        private final ArrayList<c> r;
        private boolean s;

        public a(Context context) {
            this.f1188b = new HashSet();
            this.f1189c = new HashSet();
            this.h = new a.c.b();
            this.i = false;
            this.k = new a.c.b();
            this.m = -1;
            this.o = e.a();
            this.p = b.c.b.a.g.b.f536c;
            this.q = new ArrayList<>();
            this.r = new ArrayList<>();
            this.s = false;
            this.j = context;
            this.n = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        public a(Context context, b bVar, c cVar) {
            this(context);
            r.a(bVar, "Must provide a connected listener");
            this.q.add(bVar);
            r.a(cVar, "Must provide a connection failed listener");
            this.r.add(cVar);
        }

        public final a a(Scope scope) {
            r.a(scope, "Scope must not be null");
            this.f1188b.add(scope);
            return this;
        }

        public final <O extends a.d.c> a a(a<O> aVar, O o2) {
            r.a(aVar, "Api must not be null");
            r.a(o2, "Null options are not permitted for this Api");
            this.k.put(aVar, o2);
            List<Scope> a2 = aVar.c().a(o2);
            this.f1189c.addAll(a2);
            this.f1188b.addAll(a2);
            return this;
        }

        public final f a() {
            r.a(!this.k.isEmpty(), "must call addApi() to add at least one API");
            C0177c b2 = b();
            Map<a<?>, C0177c.b> f2 = b2.f();
            a.c.b bVar = new a.c.b();
            a.c.b bVar2 = new a.c.b();
            ArrayList arrayList = new ArrayList();
            a<?> aVar = null;
            boolean z = false;
            for (a<?> aVar2 : this.k.keySet()) {
                a.d dVar = this.k.get(aVar2);
                boolean z2 = f2.get(aVar2) != null;
                bVar.put(aVar2, Boolean.valueOf(z2));
                Ea ea = new Ea(aVar2, z2);
                arrayList.add(ea);
                a.AbstractC0025a<?, ?> d2 = aVar2.d();
                a.f a2 = d2.a(this.j, this.n, b2, dVar, ea, ea);
                bVar2.put(aVar2.a(), a2);
                if (d2.a() == 1) {
                    z = dVar != null;
                }
                if (a2.b()) {
                    if (aVar == null) {
                        aVar = aVar2;
                    } else {
                        String b3 = aVar2.b();
                        String b4 = aVar.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b3).length() + 21 + String.valueOf(b4).length());
                        sb.append(b3);
                        sb.append(" cannot be used with ");
                        sb.append(b4);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar != null) {
                if (!z) {
                    r.b(this.f1187a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.b());
                    r.b(this.f1188b.equals(this.f1189c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.b());
                } else {
                    String b5 = aVar.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b5).length() + 82);
                    sb2.append("With using ");
                    sb2.append(b5);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            K k2 = new K(this.j, new ReentrantLock(), this.n, b2, this.o, this.p, bVar, this.q, this.r, bVar2, this.m, K.a((Iterable<a.f>) bVar2.values(), true), arrayList, false);
            synchronized (f.f1186a) {
                f.f1186a.add(k2);
            }
            if (this.m < 0) {
                return k2;
            }
            Aa.b(this.l);
            throw null;
        }

        public final C0177c b() {
            b.c.b.a.g.a aVar = b.c.b.a.g.a.f523a;
            if (this.k.containsKey(b.c.b.a.g.b.g)) {
                aVar = (b.c.b.a.g.a) this.k.get(b.c.b.a.g.b.g);
            }
            return new C0177c(this.f1187a, this.f1188b, this.h, this.d, this.e, this.f, this.g, aVar, false);
        }
    }

    public interface b {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface c {
        void onConnectionFailed(b.c.b.a.b.b bVar);
    }

    public <C extends a.f> C a(a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void a();

    public void a(pa paVar) {
        throw new UnsupportedOperationException();
    }

    public boolean a(a<?> aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void b();

    public abstract boolean b(a<?> aVar);

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean d();

    public abstract void e();
}
