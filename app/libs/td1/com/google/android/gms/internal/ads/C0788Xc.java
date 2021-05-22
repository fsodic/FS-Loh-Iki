package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Xc  reason: case insensitive filesystem */
public final class C0788Xc implements Poa {

    /* renamed from: a  reason: collision with root package name */
    private volatile C0606Qc f3512a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3513b;

    public C0788Xc(Context context) {
        this.f3513b = context;
    }

    /* access modifiers changed from: private */
    public final void a() {
        if (this.f3512a != null) {
            this.f3512a.a();
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.internal.ads.Poa
    public final C1912opa a(AbstractC0959b<?> bVar) {
        C0580Pc a2 = C0580Pc.a(bVar);
        long b2 = q.j().b();
        try {
            C1423hm hmVar = new C1423hm();
            this.f3512a = new C0606Qc(this.f3513b, q.q().b(), new C0992bd(this, hmVar), new C1198ed(this, hmVar));
            this.f3512a.l();
            SW a3 = JW.a(JW.a(hmVar, new C0866_c(this, a2), C0875_l.f3755a), (long) ((Integer) C2392voa.e().a(C2474x.Ic)).intValue(), TimeUnit.MILLISECONDS, C0875_l.d);
            a3.a(new RunnableC1061cd(this), C0875_l.f3755a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a3.get();
            long b3 = q.j().b() - b2;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b3);
            sb.append("ms");
            C1763mk.f(sb.toString());
            C0632Rc rc = (C0632Rc) new C0585Ph(parcelFileDescriptor).a(C0632Rc.CREATOR);
            if (rc == null) {
                return null;
            }
            if (rc.f3023a) {
                throw new C0713Uf(rc.f3024b);
            } else if (rc.e.length != rc.f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    String[] strArr = rc.e;
                    if (i >= strArr.length) {
                        return new C1912opa(rc.f3025c, rc.d, hashMap, rc.g, rc.h);
                    }
                    hashMap.put(strArr[i], rc.f[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(q.j().b() - b2);
            sb2.append("ms");
            C1763mk.f(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = q.j().b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4);
            sb3.append("ms");
            C1763mk.f(sb3.toString());
            throw th;
        }
    }
}
