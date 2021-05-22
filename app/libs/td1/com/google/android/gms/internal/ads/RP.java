package com.google.android.gms.internal.ads;

import java.util.Iterator;

final /* synthetic */ class RP implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final SP f3008a;

    /* renamed from: b  reason: collision with root package name */
    private final CS f3009b;

    /* renamed from: c  reason: collision with root package name */
    private final C2605yt f3010c;

    RP(SP sp, CS cs, C2605yt ytVar) {
        this.f3008a = sp;
        this.f3009b = cs;
        this.f3010c = ytVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        SP sp = this.f3008a;
        CS cs = this.f3009b;
        C2605yt ytVar = this.f3010c;
        BR br = (BR) obj;
        cs.f1695b = br;
        Iterator<C1941pR> it = br.f1611b.f6180a.iterator();
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            Iterator<String> it2 = it.next().f5229a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!it2.next().contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z2 = true;
                }
            }
        }
        return !z ? JW.a((Object) null) : ytVar.a(JW.a(br));
    }
}
