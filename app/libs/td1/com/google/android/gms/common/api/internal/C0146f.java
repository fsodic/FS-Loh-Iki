package com.google.android.gms.common.api.internal;

import a.c.d;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import b.c.b.a.b.e;
import b.c.b.a.d.b.h;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0154j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.common.internal.AbstractC0186l;
import com.google.android.gms.common.internal.C0185k;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.f  reason: case insensitive filesystem */
public class C0146f implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static final Status f1254a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b  reason: collision with root package name */
    private static final Status f1255b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1256c = new Object();
    private static C0146f d;
    private long e = 5000;
    private long f = 120000;
    private long g = 10000;
    private final Context h;
    private final e i;
    private final C0185k j;
    private final AtomicInteger k = new AtomicInteger(1);
    private final AtomicInteger l = new AtomicInteger(0);
    private final Map<za<?>, a<?>> m = new ConcurrentHashMap(5, 0.75f, 1);
    private C0167s n = null;
    private final Set<za<?>> o = new d();
    private final Set<za<?>> p = new d();
    private final Handler q;

    /* renamed from: com.google.android.gms.common.api.internal.f$a */
    public class a<O extends a.d> implements f.b, f.c, Fa {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<M> f1257a = new LinkedList();

        /* renamed from: b  reason: collision with root package name */
        private final a.f f1258b;

        /* renamed from: c  reason: collision with root package name */
        private final a.b f1259c;
        private final za<O> d;
        private final C0166q e;
        private final Set<Ba> f = new HashSet();
        private final Map<C0154j.a<?>, C0153ia> g = new HashMap();
        private final int h;
        private final BinderC0159la i;
        private boolean j;
        private final List<b> k = new ArrayList();
        private b.c.b.a.b.b l = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            this.f1258b = eVar.a(C0146f.this.q.getLooper(), this);
            a.b bVar = this.f1258b;
            this.f1259c = bVar instanceof u ? ((u) bVar).A() : bVar;
            this.d = eVar.e();
            this.e = new C0166q();
            this.h = eVar.c();
            if (this.f1258b.j()) {
                this.i = eVar.a(C0146f.this.h, C0146f.this.q);
            } else {
                this.i = null;
            }
        }

        private final b.c.b.a.b.d a(b.c.b.a.b.d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                b.c.b.a.b.d[] h2 = this.f1258b.h();
                if (h2 == null) {
                    h2 = new b.c.b.a.b.d[0];
                }
                a.c.b bVar = new a.c.b(h2.length);
                for (b.c.b.a.b.d dVar : h2) {
                    bVar.put(dVar.getName(), Long.valueOf(dVar.L()));
                }
                for (b.c.b.a.b.d dVar2 : dVarArr) {
                    if (!bVar.containsKey(dVar2.getName()) || ((Long) bVar.get(dVar2.getName())).longValue() < dVar2.L()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(b bVar) {
            if (!this.k.contains(bVar) || this.j) {
                return;
            }
            if (!this.f1258b.isConnected()) {
                a();
            } else {
                p();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final boolean a(boolean z) {
            r.a(C0146f.this.q);
            if (!this.f1258b.isConnected() || this.g.size() != 0) {
                return false;
            }
            if (this.e.a()) {
                if (z) {
                    r();
                }
                return false;
            }
            this.f1258b.a();
            return true;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(b bVar) {
            b.c.b.a.b.d[] b2;
            if (this.k.remove(bVar)) {
                C0146f.this.q.removeMessages(15, bVar);
                C0146f.this.q.removeMessages(16, bVar);
                b.c.b.a.b.d dVar = bVar.f1261b;
                ArrayList arrayList = new ArrayList(this.f1257a.size());
                for (M m2 : this.f1257a) {
                    if ((m2 instanceof AbstractC0155ja) && (b2 = ((AbstractC0155ja) m2).b((a<?>) this)) != null && com.google.android.gms.common.util.a.a(b2, dVar)) {
                        arrayList.add(m2);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    M m3 = (M) obj;
                    this.f1257a.remove(m3);
                    m3.a(new n(dVar));
                }
            }
        }

        private final boolean b(b.c.b.a.b.b bVar) {
            synchronized (C0146f.f1256c) {
                if (C0146f.this.n == null || !C0146f.this.o.contains(this.d)) {
                    return false;
                }
                C0146f.this.n.a(bVar, this.h);
                return true;
            }
        }

        private final boolean b(M m2) {
            if (!(m2 instanceof AbstractC0155ja)) {
                c(m2);
                return true;
            }
            AbstractC0155ja jaVar = (AbstractC0155ja) m2;
            b.c.b.a.b.d a2 = a(jaVar.b((a<?>) this));
            if (a2 == null) {
                c(m2);
                return true;
            } else if (jaVar.c(this)) {
                b bVar = new b(this.d, a2, null);
                int indexOf = this.k.indexOf(bVar);
                if (indexOf >= 0) {
                    b bVar2 = this.k.get(indexOf);
                    C0146f.this.q.removeMessages(15, bVar2);
                    C0146f.this.q.sendMessageDelayed(Message.obtain(C0146f.this.q, 15, bVar2), C0146f.this.e);
                    return false;
                }
                this.k.add(bVar);
                C0146f.this.q.sendMessageDelayed(Message.obtain(C0146f.this.q, 15, bVar), C0146f.this.e);
                C0146f.this.q.sendMessageDelayed(Message.obtain(C0146f.this.q, 16, bVar), C0146f.this.f);
                b.c.b.a.b.b bVar3 = new b.c.b.a.b.b(2, null);
                if (b(bVar3)) {
                    return false;
                }
                C0146f.this.b(bVar3, this.h);
                return false;
            } else {
                jaVar.a(new n(a2));
                return false;
            }
        }

        private final void c(b.c.b.a.b.b bVar) {
            for (Ba ba : this.f) {
                String str = null;
                if (q.a(bVar, b.c.b.a.b.b.f260a)) {
                    str = this.f1258b.d();
                }
                ba.a(this.d, bVar, str);
            }
            this.f.clear();
        }

        private final void c(M m2) {
            m2.a(this.e, d());
            try {
                m2.a((a<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.f1258b.a();
            }
        }

        /* access modifiers changed from: private */
        public final void n() {
            j();
            c(b.c.b.a.b.b.f260a);
            q();
            Iterator<C0153ia> it = this.g.values().iterator();
            while (it.hasNext()) {
                C0153ia next = it.next();
                if (a(next.f1271a.b()) == null) {
                    try {
                        next.f1271a.a(this.f1259c, new b.c.b.a.h.f<>());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.f1258b.a();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            p();
            r();
        }

        /* access modifiers changed from: private */
        public final void o() {
            j();
            this.j = true;
            this.e.c();
            C0146f.this.q.sendMessageDelayed(Message.obtain(C0146f.this.q, 9, this.d), C0146f.this.e);
            C0146f.this.q.sendMessageDelayed(Message.obtain(C0146f.this.q, 11, this.d), C0146f.this.f);
            C0146f.this.j.a();
        }

        private final void p() {
            ArrayList arrayList = new ArrayList(this.f1257a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                M m2 = (M) obj;
                if (!this.f1258b.isConnected()) {
                    return;
                }
                if (b(m2)) {
                    this.f1257a.remove(m2);
                }
            }
        }

        private final void q() {
            if (this.j) {
                C0146f.this.q.removeMessages(11, this.d);
                C0146f.this.q.removeMessages(9, this.d);
                this.j = false;
            }
        }

        private final void r() {
            C0146f.this.q.removeMessages(12, this.d);
            C0146f.this.q.sendMessageDelayed(C0146f.this.q.obtainMessage(12, this.d), C0146f.this.g);
        }

        public final void a() {
            r.a(C0146f.this.q);
            if (!this.f1258b.isConnected() && !this.f1258b.c()) {
                int a2 = C0146f.this.j.a(C0146f.this.h, this.f1258b);
                if (a2 != 0) {
                    onConnectionFailed(new b.c.b.a.b.b(a2, null));
                    return;
                }
                c cVar = new c(this.f1258b, this.d);
                if (this.f1258b.j()) {
                    this.i.a(cVar);
                }
                this.f1258b.a(cVar);
            }
        }

        public final void a(b.c.b.a.b.b bVar) {
            r.a(C0146f.this.q);
            this.f1258b.a();
            onConnectionFailed(bVar);
        }

        @Override // com.google.android.gms.common.api.internal.Fa
        public final void a(b.c.b.a.b.b bVar, com.google.android.gms.common.api.a<?> aVar, boolean z) {
            if (Looper.myLooper() == C0146f.this.q.getLooper()) {
                onConnectionFailed(bVar);
            } else {
                C0146f.this.q.post(new Y(this, bVar));
            }
        }

        public final void a(Status status) {
            r.a(C0146f.this.q);
            for (M m2 : this.f1257a) {
                m2.a(status);
            }
            this.f1257a.clear();
        }

        public final void a(Ba ba) {
            r.a(C0146f.this.q);
            this.f.add(ba);
        }

        public final void a(M m2) {
            r.a(C0146f.this.q);
            if (!this.f1258b.isConnected()) {
                this.f1257a.add(m2);
                b.c.b.a.b.b bVar = this.l;
                if (bVar == null || !bVar.O()) {
                    a();
                } else {
                    onConnectionFailed(this.l);
                }
            } else if (b(m2)) {
                r();
            } else {
                this.f1257a.add(m2);
            }
        }

        public final int b() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            return this.f1258b.isConnected();
        }

        public final boolean d() {
            return this.f1258b.j();
        }

        public final void e() {
            r.a(C0146f.this.q);
            if (this.j) {
                a();
            }
        }

        public final a.f f() {
            return this.f1258b;
        }

        public final void g() {
            r.a(C0146f.this.q);
            if (this.j) {
                q();
                a(C0146f.this.i.c(C0146f.this.h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f1258b.a();
            }
        }

        public final void h() {
            r.a(C0146f.this.q);
            a(C0146f.f1254a);
            this.e.b();
            for (C0154j.a aVar : (C0154j.a[]) this.g.keySet().toArray(new C0154j.a[this.g.size()])) {
                a(new ya(aVar, new b.c.b.a.h.f()));
            }
            c(new b.c.b.a.b.b(4));
            if (this.f1258b.isConnected()) {
                this.f1258b.a(new Z(this));
            }
        }

        public final Map<C0154j.a<?>, C0153ia> i() {
            return this.g;
        }

        public final void j() {
            r.a(C0146f.this.q);
            this.l = null;
        }

        public final b.c.b.a.b.b k() {
            r.a(C0146f.this.q);
            return this.l;
        }

        public final boolean l() {
            return a(true);
        }

        /* access modifiers changed from: package-private */
        public final b.c.b.a.g.e m() {
            BinderC0159la laVar = this.i;
            if (laVar == null) {
                return null;
            }
            return laVar.Jb();
        }

        @Override // com.google.android.gms.common.api.f.b
        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == C0146f.this.q.getLooper()) {
                n();
            } else {
                C0146f.this.q.post(new W(this));
            }
        }

        @Override // com.google.android.gms.common.api.f.c
        public final void onConnectionFailed(b.c.b.a.b.b bVar) {
            r.a(C0146f.this.q);
            BinderC0159la laVar = this.i;
            if (laVar != null) {
                laVar.Kb();
            }
            j();
            C0146f.this.j.a();
            c(bVar);
            if (bVar.L() == 4) {
                a(C0146f.f1255b);
            } else if (this.f1257a.isEmpty()) {
                this.l = bVar;
            } else if (!b(bVar) && !C0146f.this.b(bVar, this.h)) {
                if (bVar.L() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    C0146f.this.q.sendMessageDelayed(Message.obtain(C0146f.this.q, 9, this.d), C0146f.this.e);
                    return;
                }
                String a2 = this.d.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 38);
                sb.append("API: ");
                sb.append(a2);
                sb.append(" is not available on this device.");
                a(new Status(17, sb.toString()));
            }
        }

        @Override // com.google.android.gms.common.api.f.b
        public final void onConnectionSuspended(int i2) {
            if (Looper.myLooper() == C0146f.this.q.getLooper()) {
                o();
            } else {
                C0146f.this.q.post(new X(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.f$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final za<?> f1260a;

        /* renamed from: b  reason: collision with root package name */
        private final b.c.b.a.b.d f1261b;

        private b(za<?> zaVar, b.c.b.a.b.d dVar) {
            this.f1260a = zaVar;
            this.f1261b = dVar;
        }

        /* synthetic */ b(za zaVar, b.c.b.a.b.d dVar, V v) {
            this(zaVar, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                return q.a(this.f1260a, bVar.f1260a) && q.a(this.f1261b, bVar.f1261b);
            }
        }

        public final int hashCode() {
            return q.a(this.f1260a, this.f1261b);
        }

        public final String toString() {
            q.a a2 = q.a(this);
            a2.a("key", this.f1260a);
            a2.a("feature", this.f1261b);
            return a2.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.f$c */
    public class c implements oa, AbstractC0176b.c {

        /* renamed from: a  reason: collision with root package name */
        private final a.f f1262a;

        /* renamed from: b  reason: collision with root package name */
        private final za<?> f1263b;

        /* renamed from: c  reason: collision with root package name */
        private AbstractC0186l f1264c = null;
        private Set<Scope> d = null;
        private boolean e = false;

        public c(a.f fVar, za<?> zaVar) {
            this.f1262a = fVar;
            this.f1263b = zaVar;
        }

        /* access modifiers changed from: private */
        public final void a() {
            AbstractC0186l lVar;
            if (this.e && (lVar = this.f1264c) != null) {
                this.f1262a.a(lVar, this.d);
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC0176b.c
        public final void a(b.c.b.a.b.b bVar) {
            C0146f.this.q.post(new RunnableC0139ba(this, bVar));
        }

        @Override // com.google.android.gms.common.api.internal.oa
        public final void a(AbstractC0186l lVar, Set<Scope> set) {
            if (lVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new b.c.b.a.b.b(4));
                return;
            }
            this.f1264c = lVar;
            this.d = set;
            a();
        }

        @Override // com.google.android.gms.common.api.internal.oa
        public final void b(b.c.b.a.b.b bVar) {
            ((a) C0146f.this.m.get(this.f1263b)).a(bVar);
        }
    }

    private C0146f(Context context, Looper looper, e eVar) {
        this.h = context;
        this.q = new h(looper, this);
        this.i = eVar;
        this.j = new C0185k(eVar);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static C0146f a() {
        C0146f fVar;
        synchronized (f1256c) {
            r.a(d, "Must guarantee manager is non-null before using getInstance");
            fVar = d;
        }
        return fVar;
    }

    public static C0146f a(Context context) {
        C0146f fVar;
        synchronized (f1256c) {
            if (d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                d = new C0146f(context.getApplicationContext(), handlerThread.getLooper(), e.a());
            }
            fVar = d;
        }
        return fVar;
    }

    private final void b(com.google.android.gms.common.api.e<?> eVar) {
        za<?> e2 = eVar.e();
        a<?> aVar = this.m.get(e2);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.m.put(e2, aVar);
        }
        if (aVar.d()) {
            this.p.add(e2);
        }
        aVar.a();
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent a(za<?> zaVar, int i2) {
        b.c.b.a.g.e m2;
        a<?> aVar = this.m.get(zaVar);
        if (aVar == null || (m2 = aVar.m()) == null) {
            return null;
        }
        Context context = this.h;
        m2.i();
        throw null;
    }

    public final b.c.b.a.h.e<Map<za<?>, String>> a(Iterable<? extends com.google.android.gms.common.api.e<?>> iterable) {
        Ba ba = new Ba(iterable);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(2, ba));
        return ba.a();
    }

    public final void a(b.c.b.a.b.b bVar, int i2) {
        if (!b(bVar, i2)) {
            Handler handler = this.q;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
        }
    }

    public final void a(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d> void a(com.google.android.gms.common.api.e<O> eVar, int i2, AbstractC0140c<? extends i, a.b> cVar) {
        xa xaVar = new xa(i2, cVar);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(4, new C0151ha(xaVar, this.l.get(), eVar)));
    }

    public final int b() {
        return this.k.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(b.c.b.a.b.b bVar, int i2) {
        return this.i.a(this.h, bVar, i2);
    }

    public final void e() {
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public boolean handleMessage(Message message) {
        a<?> aVar;
        b.c.b.a.h.f<Boolean> fVar;
        boolean z;
        int i2 = message.what;
        long j2 = 300000;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.g = j2;
                this.q.removeMessages(12);
                for (za<?> zaVar : this.m.keySet()) {
                    Handler handler = this.q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, zaVar), this.g);
                }
                break;
            case 2:
                Ba ba = (Ba) message.obj;
                Iterator<za<?>> it = ba.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        za<?> next = it.next();
                        a<?> aVar2 = this.m.get(next);
                        if (aVar2 == null) {
                            ba.a(next, new b.c.b.a.b.b(13), null);
                            break;
                        } else if (aVar2.c()) {
                            ba.a(next, b.c.b.a.b.b.f260a, aVar2.f().d());
                        } else if (aVar2.k() != null) {
                            ba.a(next, aVar2.k(), null);
                        } else {
                            aVar2.a(ba);
                            aVar2.a();
                        }
                    }
                }
            case 3:
                for (a<?> aVar3 : this.m.values()) {
                    aVar3.j();
                    aVar3.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C0151ha haVar = (C0151ha) message.obj;
                a<?> aVar4 = this.m.get(haVar.f1270c.e());
                if (aVar4 == null) {
                    b(haVar.f1270c);
                    aVar4 = this.m.get(haVar.f1270c.e());
                }
                if (!aVar4.d() || this.l.get() == haVar.f1269b) {
                    aVar4.a(haVar.f1268a);
                    break;
                } else {
                    haVar.f1268a.a(f1254a);
                    aVar4.h();
                    break;
                }
            case 5:
                int i3 = message.arg1;
                b.c.b.a.b.b bVar = (b.c.b.a.b.b) message.obj;
                Iterator<a<?>> it2 = this.m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = it2.next();
                        if (aVar.b() == i3) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    String b2 = this.i.b(bVar.L());
                    String M = bVar.M();
                    StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 69 + String.valueOf(M).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(b2);
                    sb.append(": ");
                    sb.append(M);
                    aVar.a(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i3);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (o.a() && (this.h.getApplicationContext() instanceof Application)) {
                    ComponentCallbacks2C0138b.a((Application) this.h.getApplicationContext());
                    ComponentCallbacks2C0138b.a().a(new V(this));
                    if (!ComponentCallbacks2C0138b.a().a(true)) {
                        this.g = 300000;
                        break;
                    }
                }
                break;
            case 7:
                b((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (za<?> zaVar2 : this.p) {
                    this.m.remove(zaVar2).h();
                }
                this.p.clear();
                break;
            case 11:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).g();
                    break;
                }
                break;
            case 12:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).l();
                    break;
                }
                break;
            case 14:
                C0168t tVar = (C0168t) message.obj;
                za<?> b3 = tVar.b();
                if (!this.m.containsKey(b3)) {
                    fVar = tVar.a();
                    z = false;
                } else {
                    boolean a2 = this.m.get(b3).a((a) false);
                    fVar = tVar.a();
                    z = Boolean.valueOf(a2);
                }
                fVar.a(z);
                break;
            case 15:
                b bVar2 = (b) message.obj;
                if (this.m.containsKey(bVar2.f1260a)) {
                    this.m.get(bVar2.f1260a).a((a) bVar2);
                    break;
                }
                break;
            case 16:
                b bVar3 = (b) message.obj;
                if (this.m.containsKey(bVar3.f1260a)) {
                    this.m.get(bVar3.f1260a).b((a) bVar3);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
