package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC0183i;
import com.google.android.gms.common.internal.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.b  reason: case insensitive filesystem */
public abstract class AbstractC0176b<T extends IInterface> {

    /* renamed from: a  reason: collision with root package name */
    private static final b.c.b.a.b.d[] f1344a = new b.c.b.a.b.d[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f1345b = {"service_esmobile", "service_googleme"};
    private boolean A;
    private volatile C B;
    protected AtomicInteger C;

    /* renamed from: c  reason: collision with root package name */
    private int f1346c;
    private long d;
    private long e;
    private int f;
    private long g;
    private I h;
    private final Context i;
    private final Looper j;
    private final AbstractC0183i k;
    private final b.c.b.a.b.f l;
    final Handler m;
    private final Object n;
    private final Object o;
    private p p;
    protected c q;
    private T r;
    private final ArrayList<h<?>> s;
    private j t;
    private int u;
    private final a v;
    private final AbstractC0028b w;
    private final int x;
    private final String y;
    private b z;

    /* renamed from: com.google.android.gms.common.internal.b$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b  reason: collision with other inner class name */
    public interface AbstractC0028b {
        void onConnectionFailed(b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.b$c */
    public interface c {
        void a(b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.b$d */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC0176b.c
        public void a(b bVar) {
            if (bVar.P()) {
                AbstractC0176b bVar2 = AbstractC0176b.this;
                bVar2.a((AbstractC0186l) null, bVar2.t());
            } else if (AbstractC0176b.this.w != null) {
                AbstractC0176b.this.w.onConnectionFailed(bVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$e */
    public interface e {
        void V();
    }

    /* renamed from: com.google.android.gms.common.internal.b$f */
    private abstract class f extends h<Boolean> {
        private final int d;
        private final Bundle e;

        protected f(int i, Bundle bundle) {
            super(true);
            this.d = i;
            this.e = bundle;
        }

        /* access modifiers changed from: protected */
        public abstract void a(b bVar);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC0176b.h
        public final /* synthetic */ void a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                AbstractC0176b.this.b(1, null);
                return;
            }
            int i = this.d;
            if (i != 0) {
                if (i != 10) {
                    AbstractC0176b.this.b(1, null);
                    Bundle bundle = this.e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    a(new b(this.d, pendingIntent));
                    return;
                }
                AbstractC0176b.this.b(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), AbstractC0176b.this.w(), AbstractC0176b.this.v()));
            } else if (!e()) {
                AbstractC0176b.this.b(1, null);
                a(new b(8, null));
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC0176b.h
        public final void c() {
        }

        /* access modifiers changed from: protected */
        public abstract boolean e();
    }

    /* renamed from: com.google.android.gms.common.internal.b$g */
    final class g extends b.c.b.a.d.c.d {
        public g(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.c();
            hVar.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            if (AbstractC0176b.this.C.get() == message.arg1) {
                int i = message.what;
                if ((i == 1 || i == 7 || ((i == 4 && !AbstractC0176b.this.n()) || message.what == 5)) && !AbstractC0176b.this.c()) {
                    a(message);
                    return;
                }
                int i2 = message.what;
                PendingIntent pendingIntent = null;
                if (i2 == 4) {
                    AbstractC0176b.this.z = new b(message.arg2);
                    if (!AbstractC0176b.this.B() || AbstractC0176b.this.A) {
                        b bVar = AbstractC0176b.this.z != null ? AbstractC0176b.this.z : new b(8);
                        AbstractC0176b.this.q.a(bVar);
                        AbstractC0176b.this.a(bVar);
                        return;
                    }
                    AbstractC0176b.this.b(3, null);
                } else if (i2 == 5) {
                    b bVar2 = AbstractC0176b.this.z != null ? AbstractC0176b.this.z : new b(8);
                    AbstractC0176b.this.q.a(bVar2);
                    AbstractC0176b.this.a(bVar2);
                } else if (i2 == 3) {
                    Object obj = message.obj;
                    if (obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) obj;
                    }
                    b bVar3 = new b(message.arg2, pendingIntent);
                    AbstractC0176b.this.q.a(bVar3);
                    AbstractC0176b.this.a(bVar3);
                } else if (i2 == 6) {
                    AbstractC0176b.this.b(5, null);
                    if (AbstractC0176b.this.v != null) {
                        AbstractC0176b.this.v.onConnectionSuspended(message.arg2);
                    }
                    AbstractC0176b.this.a(message.arg2);
                    AbstractC0176b.this.a((AbstractC0176b) 5, 1, (int) null);
                } else if (i2 == 2 && !AbstractC0176b.this.isConnected()) {
                    a(message);
                } else if (b(message)) {
                    ((h) message.obj).d();
                } else {
                    int i3 = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i3);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            } else if (b(message)) {
                a(message);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.b$h */
    public abstract class h<TListener> {

        /* renamed from: a  reason: collision with root package name */
        private TListener f1349a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1350b = false;

        public h(TListener tlistener) {
            this.f1349a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.f1349a = null;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        public final void b() {
            a();
            synchronized (AbstractC0176b.this.s) {
                AbstractC0176b.this.s.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void c();

        public final void d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f1349a;
                if (this.f1350b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e) {
                    c();
                    throw e;
                }
            } else {
                c();
            }
            synchronized (this) {
                this.f1350b = true;
            }
            b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$i */
    public static final class i extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private AbstractC0176b f1352a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1353b;

        public i(AbstractC0176b bVar, int i) {
            this.f1352a = bVar;
            this.f1353b = i;
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i, IBinder iBinder, Bundle bundle) {
            r.a(this.f1352a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1352a.a(i, iBinder, bundle, this.f1353b);
            this.f1352a = null;
        }

        @Override // com.google.android.gms.common.internal.n
        public final void a(int i, IBinder iBinder, C c2) {
            r.a(this.f1352a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.a(c2);
            this.f1352a.a((AbstractC0176b) c2);
            a(i, iBinder, c2.f1327a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$j */
    public final class j implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final int f1354a;

        public j(int i) {
            this.f1354a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p pVar;
            if (iBinder == null) {
                AbstractC0176b.this.c((AbstractC0176b) 16);
                return;
            }
            synchronized (AbstractC0176b.this.o) {
                AbstractC0176b bVar = AbstractC0176b.this;
                if (iBinder == null) {
                    pVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    pVar = (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new o(iBinder) : (p) queryLocalInterface;
                }
                bVar.p = pVar;
            }
            AbstractC0176b.this.a(0, (Bundle) null, this.f1354a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (AbstractC0176b.this.o) {
                AbstractC0176b.this.p = null;
            }
            Handler handler = AbstractC0176b.this.m;
            handler.sendMessage(handler.obtainMessage(6, this.f1354a, 1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.b$k */
    public final class k extends f {
        private final IBinder g;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC0176b.f
        public final void a(b bVar) {
            if (AbstractC0176b.this.w != null) {
                AbstractC0176b.this.w.onConnectionFailed(bVar);
            }
            AbstractC0176b.this.a(bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC0176b.f
        public final boolean e() {
            try {
                String interfaceDescriptor = this.g.getInterfaceDescriptor();
                if (!AbstractC0176b.this.v().equals(interfaceDescriptor)) {
                    String v = AbstractC0176b.this.v();
                    StringBuilder sb = new StringBuilder(String.valueOf(v).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(v);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a2 = AbstractC0176b.this.a(this.g);
                if (a2 == null || (!AbstractC0176b.this.a((AbstractC0176b) 2, 4, (int) a2) && !AbstractC0176b.this.a((AbstractC0176b) 3, 4, (int) a2))) {
                    return false;
                }
                AbstractC0176b.this.z = null;
                Bundle F = AbstractC0176b.this.F();
                if (AbstractC0176b.this.v == null) {
                    return true;
                }
                AbstractC0176b.this.v.onConnected(F);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.b$l */
    public final class l extends f {
        public l(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC0176b.f
        public final void a(b bVar) {
            if (!AbstractC0176b.this.n() || !AbstractC0176b.this.B()) {
                AbstractC0176b.this.q.a(bVar);
                AbstractC0176b.this.a(bVar);
                return;
            }
            AbstractC0176b.this.c((AbstractC0176b) 16);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC0176b.f
        public final boolean e() {
            AbstractC0176b.this.q.a(b.f260a);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected AbstractC0176b(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.AbstractC0176b.a r13, com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.AbstractC0183i.a(r10)
            b.c.b.a.b.f r4 = b.c.b.a.b.f.a()
            com.google.android.gms.common.internal.r.a(r13)
            r6 = r13
            com.google.android.gms.common.internal.b$a r6 = (com.google.android.gms.common.internal.AbstractC0176b.a) r6
            com.google.android.gms.common.internal.r.a(r14)
            r7 = r14
            com.google.android.gms.common.internal.b$b r7 = (com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC0176b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    protected AbstractC0176b(Context context, Looper looper, AbstractC0183i iVar, b.c.b.a.b.f fVar, int i2, a aVar, AbstractC0028b bVar, String str) {
        this.n = new Object();
        this.o = new Object();
        this.s = new ArrayList<>();
        this.u = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        r.a(context, "Context must not be null");
        this.i = context;
        r.a(looper, "Looper must not be null");
        this.j = looper;
        r.a(iVar, "Supervisor must not be null");
        this.k = iVar;
        r.a(fVar, "API availability must not be null");
        this.l = fVar;
        this.m = new g(looper);
        this.x = i2;
        this.v = aVar;
        this.w = bVar;
        this.y = str;
    }

    private final boolean A() {
        boolean z2;
        synchronized (this.n) {
            z2 = this.u == 3;
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean B() {
        if (this.A || TextUtils.isEmpty(v()) || TextUtils.isEmpty(s())) {
            return false;
        }
        try {
            Class.forName(v());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(C c2) {
        this.B = c2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean a(int i2, int i3, T t2) {
        synchronized (this.n) {
            if (this.u != i2) {
                return false;
            }
            b(i3, t2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2, T t2) {
        r.a((i2 == 4) == (t2 != null));
        synchronized (this.n) {
            this.u = i2;
            this.r = t2;
            a(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.t == null || this.h == null)) {
                        String c2 = this.h.c();
                        String a2 = this.h.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c2);
                        sb.append(" on ");
                        sb.append(a2);
                        Log.e("GmsClient", sb.toString());
                        this.k.a(this.h.c(), this.h.a(), this.h.b(), this.t, z());
                        this.C.incrementAndGet();
                    }
                    this.t = new j(this.C.get());
                    this.h = (this.u != 3 || s() == null) ? new I(x(), w(), false, 129) : new I(q().getPackageName(), s(), true, 129);
                    if (!this.k.a(new AbstractC0183i.a(this.h.c(), this.h.a(), this.h.b()), this.t, z())) {
                        String c3 = this.h.c();
                        String a3 = this.h.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c3).length() + 34 + String.valueOf(a3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c3);
                        sb2.append(" on ");
                        sb2.append(a3);
                        Log.e("GmsClient", sb2.toString());
                        a(16, (Bundle) null, this.C.get());
                    }
                } else if (i2 == 4) {
                    a(t2);
                }
            } else if (this.t != null) {
                this.k.a(this.h.c(), this.h.a(), this.h.b(), this.t, z());
                this.t = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i2) {
        int i3;
        if (A()) {
            i3 = 5;
            this.A = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(i3, this.C.get(), 16));
    }

    private final String z() {
        String str = this.y;
        return str == null ? this.i.getClass().getName() : str;
    }

    public Bundle F() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    public void a() {
        this.C.incrementAndGet();
        synchronized (this.s) {
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.s.get(i2).a();
            }
            this.s.clear();
        }
        synchronized (this.o) {
            this.p = null;
        }
        b(1, null);
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        this.f1346c = i2;
        this.d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Bundle bundle, int i3) {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2, null)));
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, T t2) {
    }

    /* access modifiers changed from: protected */
    public void a(T t2) {
        this.e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        this.f = bVar.L();
        this.g = System.currentTimeMillis();
    }

    public void a(c cVar) {
        r.a(cVar, "Connection progress callbacks cannot be null.");
        this.q = cVar;
        b(2, null);
    }

    /* access modifiers changed from: protected */
    public void a(c cVar, int i2, PendingIntent pendingIntent) {
        r.a(cVar, "Connection progress callbacks cannot be null.");
        this.q = cVar;
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), i2, pendingIntent));
    }

    public void a(e eVar) {
        eVar.V();
    }

    public void a(AbstractC0186l lVar, Set<Scope> set) {
        Bundle r2 = r();
        C0180f fVar = new C0180f(this.x);
        fVar.d = this.i.getPackageName();
        fVar.g = r2;
        if (set != null) {
            fVar.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (j()) {
            fVar.h = o() != null ? o() : new Account("<<default account>>", "com.google");
            if (lVar != null) {
                fVar.e = lVar.asBinder();
            }
        } else if (y()) {
            fVar.h = o();
        }
        fVar.i = f1344a;
        fVar.j = p();
        try {
            synchronized (this.o) {
                if (this.p != null) {
                    this.p.a(new i(this, this.C.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            b(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, (IBinder) null, (Bundle) null, this.C.get());
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t2;
        p pVar;
        synchronized (this.n) {
            i2 = this.u;
            t2 = this.r;
        }
        synchronized (this.o) {
            pVar = this.p;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t2 == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t2.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.e > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.e;
            String format = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.d > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.f1346c;
            printWriter.append((CharSequence) (i3 != 1 ? i3 != 2 ? String.valueOf(i3) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.d;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.g > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.f));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.g;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public void b(int i2) {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i2));
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        boolean z2;
        synchronized (this.n) {
            if (this.u != 2) {
                if (this.u != 3) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public String d() {
        I i2;
        if (isConnected() && (i2 = this.h) != null) {
            return i2.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public boolean f() {
        return true;
    }

    public int g() {
        return b.c.b.a.b.f.f302a;
    }

    public final b.c.b.a.b.d[] h() {
        C c2 = this.B;
        if (c2 == null) {
            return null;
        }
        return c2.f1328b;
    }

    public Intent i() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.n) {
            z2 = this.u == 4;
        }
        return z2;
    }

    public boolean j() {
        return false;
    }

    public IBinder k() {
        synchronized (this.o) {
            if (this.p == null) {
                return null;
            }
            return this.p.asBinder();
        }
    }

    public void l() {
        int a2 = this.l.a(this.i, g());
        if (a2 != 0) {
            b(1, null);
            a(new d(), a2, (PendingIntent) null);
            return;
        }
        a(new d());
    }

    /* access modifiers changed from: protected */
    public final void m() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return false;
    }

    public Account o() {
        return null;
    }

    public b.c.b.a.b.d[] p() {
        return f1344a;
    }

    public final Context q() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public Bundle r() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public String s() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> t() {
        return Collections.EMPTY_SET;
    }

    public final T u() {
        T t2;
        synchronized (this.n) {
            if (this.u != 5) {
                m();
                r.b(this.r != null, "Client is connected but service is null");
                t2 = this.r;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public abstract String v();

    /* access modifiers changed from: protected */
    public abstract String w();

    /* access modifiers changed from: protected */
    public String x() {
        return "com.google.android.gms";
    }

    public boolean y() {
        return false;
    }
}
