package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;

public final class UF extends RF {
    public UF(Context context) {
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
            this.f2993a.a(new XF(this), C0875_l.f);
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
                    this.f.z().a(this.e, new VF(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    hmVar = this.f2993a;
                    iGVar = new C1448iG(YR.f3560a);
                } catch (Throwable th) {
                    q.g().a(th, "RemoteSignalsClientTask.onConnected");
                    hmVar = this.f2993a;
                    iGVar = new C1448iG(YR.f3560a);
                }
            }
        }
        hmVar.a(iGVar);
    }
}
