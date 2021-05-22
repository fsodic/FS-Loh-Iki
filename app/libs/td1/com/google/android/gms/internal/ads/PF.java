package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.b.b;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;

public final class PF extends RF {
    public PF(Context context) {
        this.f = new C0221Bh(context, q.q().b(), this, this);
    }

    public final SW<InputStream> a(C0715Uh uh) {
        synchronized (this.f2994b) {
            if (this.f2995c) {
                return this.f2993a;
            }
            this.f2995c = true;
            this.e = uh;
            this.f.l();
            this.f2993a.a(new SF(this), C0875_l.f);
            return this.f2993a;
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
                    this.f.z().c(this.e, new VF(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    hmVar = this.f2993a;
                    iGVar = new C1448iG(YR.f3560a);
                } catch (Throwable th) {
                    q.g().a(th, "RemoteAdRequestClientTask.onConnected");
                    hmVar = this.f2993a;
                    iGVar = new C1448iG(YR.f3560a);
                }
            }
        }
        hmVar.a(iGVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b, com.google.android.gms.internal.ads.RF
    public final void onConnectionFailed(b bVar) {
        C0745Vl.a("Cannot connect to remote service, fallback to local instance.");
        this.f2993a.a(new C1448iG(YR.f3560a));
    }
}
