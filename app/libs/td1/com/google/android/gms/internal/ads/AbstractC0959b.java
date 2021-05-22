package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0558Og;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.b  reason: case insensitive filesystem */
public abstract class AbstractC0959b<T> implements Comparable<AbstractC0959b<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0558Og.a f3859a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3860b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3861c;
    private final int d;
    private final Object e;
    private AbstractC0923ad f;
    private Integer g;
    private C1126db h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private AbstractC2511xf m;
    private C2244tja n;
    private AbstractC1192ea o;

    public AbstractC0959b(int i2, String str, AbstractC0923ad adVar) {
        Uri parse;
        String host;
        this.f3859a = C0558Og.a.f2769a ? new C0558Og.a() : null;
        this.e = new Object();
        this.i = true;
        int i3 = 0;
        this.j = false;
        this.k = false;
        this.l = false;
        this.n = null;
        this.f3860b = i2;
        this.f3861c = str;
        this.f = adVar;
        this.m = new Vka();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i3 = host.hashCode();
        }
        this.d = i3;
    }

    /* access modifiers changed from: protected */
    public abstract C0191Ad<T> a(C1912opa opa);

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0959b<?> a(C1126db dbVar) {
        this.h = dbVar;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0959b<?> a(C2244tja tja) {
        this.n = tja;
        return this;
    }

    public Map<String, String> a() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        C1126db dbVar = this.h;
        if (dbVar != null) {
            dbVar.a(this, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C0191Ad<?> ad) {
        AbstractC1192ea eaVar;
        synchronized (this.e) {
            eaVar = this.o;
        }
        if (eaVar != null) {
            eaVar.a(this, ad);
        }
    }

    public final void a(C0713Uf uf) {
        AbstractC0923ad adVar;
        synchronized (this.e) {
            adVar = this.f;
        }
        if (adVar != null) {
            adVar.a(uf);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AbstractC1192ea eaVar) {
        synchronized (this.e) {
            this.o = eaVar;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public final void a(String str) {
        if (C0558Og.a.f2769a) {
            this.f3859a.a(str, Thread.currentThread().getId());
        }
    }

    public final int b() {
        return this.f3860b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0959b<?> b(int i2) {
        this.g = Integer.valueOf(i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        C1126db dbVar = this.h;
        if (dbVar != null) {
            dbVar.b(this);
        }
        if (C0558Og.a.f2769a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0318Fa(this, str, id));
                return;
            }
            this.f3859a.a(str, id);
            this.f3859a.a(toString());
        }
    }

    public final String c() {
        return this.f3861c;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        AbstractC0959b bVar = (AbstractC0959b) obj;
        EnumC0267Db db = EnumC0267Db.NORMAL;
        return db == db ? this.g.intValue() - bVar.g.intValue() : db.ordinal() - db.ordinal();
    }

    public final boolean d() {
        synchronized (this.e) {
        }
        return false;
    }

    public final int e() {
        return this.d;
    }

    public final String f() {
        String str = this.f3861c;
        int i2 = this.f3860b;
        if (i2 == 0 || i2 == -1) {
            return str;
        }
        String num = Integer.toString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final C2244tja g() {
        return this.n;
    }

    public byte[] h() {
        return null;
    }

    public final boolean i() {
        return this.i;
    }

    public final int j() {
        return this.m.d();
    }

    public final AbstractC2511xf k() {
        return this.m;
    }

    public final void l() {
        synchronized (this.e) {
            this.k = true;
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.e) {
            z = this.k;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        AbstractC1192ea eaVar;
        synchronized (this.e) {
            eaVar = this.o;
        }
        if (eaVar != null) {
            eaVar.a(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.d));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        d();
        String str = this.f3861c;
        String valueOf2 = String.valueOf(EnumC0267Db.NORMAL);
        String valueOf3 = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }
}
