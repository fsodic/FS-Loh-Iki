package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;

final class qa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f1289a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ pa f1290b;

    qa(pa paVar, i iVar) {
        this.f1290b = paVar;
        this.f1289a = iVar;
    }

    public final void run() {
        try {
            BasePendingResult.f1198a.set(true);
            this.f1290b.g.sendMessage(this.f1290b.g.obtainMessage(0, this.f1290b.f1284a.a(this.f1289a)));
            BasePendingResult.f1198a.set(false);
            pa paVar = this.f1290b;
            pa.b((pa) this.f1289a);
            f fVar = (f) this.f1290b.f.get();
            if (fVar != null) {
                fVar.a(this.f1290b);
            }
        } catch (RuntimeException e) {
            this.f1290b.g.sendMessage(this.f1290b.g.obtainMessage(1, e));
            BasePendingResult.f1198a.set(false);
            pa paVar2 = this.f1290b;
            pa.b((pa) this.f1289a);
            f fVar2 = (f) this.f1290b.f.get();
            if (fVar2 != null) {
                fVar2.a(this.f1290b);
            }
        } catch (Throwable th) {
            BasePendingResult.f1198a.set(false);
            pa paVar3 = this.f1290b;
            pa.b((pa) this.f1289a);
            f fVar3 = (f) this.f1290b.f.get();
            if (fVar3 != null) {
                fVar3.a(this.f1290b);
            }
            throw th;
        }
    }
}
