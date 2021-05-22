package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import b.c.b.a.b.d.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Zj  reason: case insensitive filesystem */
public final class C0847Zj {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3666a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private C1628kla f3667b;

    /* renamed from: c  reason: collision with root package name */
    private final C2176sk f3668c = new C2176sk();
    private final C1556jk d = new C1556jk(C2392voa.f(), this.f3668c);
    private boolean e = false;
    private Context f;
    private C0823Yl g;
    private A h = null;
    private Boolean i = null;
    private final AtomicInteger j = new AtomicInteger(0);
    private final C1144dk k = new C1144dk(null);
    private final Object l = new Object();
    private SW<ArrayList<String>> m;

    @TargetApi(16)
    private static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b2 = c.a(context).b(context.getApplicationInfo().packageName, 4096);
            if (b2.requestedPermissions != null && b2.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = b2.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((b2.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final Context a() {
        return this.f;
    }

    @TargetApi(23)
    public final void a(Context context, C0823Yl yl) {
        synchronized (this.f3666a) {
            if (!this.e) {
                this.f = context.getApplicationContext();
                this.g = yl;
                q.f().a(this.d);
                A a2 = null;
                this.f3668c.a(this.f, (String) null, true);
                C2170sh.a(this.f, this.g);
                this.f3667b = new C1628kla(context.getApplicationContext(), this.g);
                q.l();
                if (!C1536ja.f4685c.a().booleanValue()) {
                    C1763mk.f("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    a2 = new A();
                }
                this.h = a2;
                if (this.h != null) {
                    C1148dm.a(new C0937ak(this).b(), "AppState.registerCsiReporter");
                }
                this.e = true;
                j();
            }
        }
        q.c().b(context, yl.f3587a);
    }

    public final void a(Boolean bool) {
        synchronized (this.f3666a) {
            this.i = bool;
        }
    }

    public final void a(Throwable th, String str) {
        C2170sh.a(this.f, this.g).a(th, str);
    }

    public final Resources b() {
        if (this.g.d) {
            return this.f.getResources();
        }
        try {
            C0693Tl.a(this.f).getResources();
            return null;
        } catch (C0771Wl e2) {
            C0745Vl.c("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void b(Throwable th, String str) {
        C2170sh.a(this.f, this.g).a(th, str, C2363va.g.a().floatValue());
    }

    public final A c() {
        A a2;
        synchronized (this.f3666a) {
            a2 = this.h;
        }
        return a2;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (this.f3666a) {
            bool = this.i;
        }
        return bool;
    }

    public final void e() {
        this.k.a();
    }

    public final void f() {
        this.j.incrementAndGet();
    }

    public final void g() {
        this.j.decrementAndGet();
    }

    public final int h() {
        return this.j.get();
    }

    public final AbstractC1901ok i() {
        C2176sk skVar;
        synchronized (this.f3666a) {
            skVar = this.f3668c;
        }
        return skVar;
    }

    public final SW<ArrayList<String>> j() {
        if (o.c() && this.f != null) {
            if (!((Boolean) C2392voa.e().a(C2474x.Db)).booleanValue()) {
                synchronized (this.l) {
                    if (this.m != null) {
                        return this.m;
                    }
                    SW<ArrayList<String>> a2 = C0875_l.f3755a.a(new CallableC1006bk(this));
                    this.m = a2;
                    return a2;
                }
            }
        }
        return JW.a((Object) new ArrayList());
    }

    public final C1556jk k() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList l() {
        return a(C1690li.b(this.f));
    }
}
