package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.b.b;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;

public final class ZF extends RF {
    private String g;
    private int h = _F.f3700a;

    public ZF(Context context) {
        this.f = new C0221Bh(context, q.q().b(), this, this);
    }

    public final SW<InputStream> a(C0715Uh uh) {
        synchronized (this.f2994b) {
            if (this.h != _F.f3700a && this.h != _F.f3701b) {
                return JW.a((Throwable) new C1448iG(YR.f3561b));
            } else if (this.f2995c) {
                return this.f2993a;
            } else {
                this.h = _F.f3701b;
                this.f2995c = true;
                this.e = uh;
                this.f.l();
                this.f2993a.a(new YF(this), C0875_l.f);
                return this.f2993a;
            }
        }
    }

    public final SW<InputStream> a(String str) {
        synchronized (this.f2994b) {
            if (this.h != _F.f3700a && this.h != _F.f3702c) {
                return JW.a((Throwable) new C1448iG(YR.f3561b));
            } else if (this.f2995c) {
                return this.f2993a;
            } else {
                this.h = _F.f3702c;
                this.f2995c = true;
                this.g = str;
                this.f.l();
                this.f2993a.a(new RunnableC0897aG(this), C0875_l.f);
                return this.f2993a;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnected(Bundle bundle) {
        C1423hm<InputStream> hmVar;
        C1448iG iGVar;
        synchronized (this.f2994b) {
            if (!this.d) {
                this.d = true;
                try {
                    if (this.h == _F.f3701b) {
                        this.f.z().b(this.e, new VF(this));
                    } else if (this.h == _F.f3702c) {
                        this.f.z().a(this.g, new VF(this));
                    } else {
                        this.f2993a.a(new C1448iG(YR.f3560a));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    hmVar = this.f2993a;
                    iGVar = new C1448iG(YR.f3560a);
                    hmVar.a(iGVar);
                } catch (Throwable th) {
                    q.g().a(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    hmVar = this.f2993a;
                    iGVar = new C1448iG(YR.f3560a);
                    hmVar.a(iGVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b, com.google.android.gms.internal.ads.RF
    public final void onConnectionFailed(b bVar) {
        C0745Vl.a("Cannot connect to remote service, fallback to local instance.");
        this.f2993a.a(new C1448iG(YR.f3560a));
    }
}
