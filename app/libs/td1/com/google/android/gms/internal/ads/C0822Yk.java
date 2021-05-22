package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Yk  reason: case insensitive filesystem */
public final class C0822Yk extends C0404Ii {
    private final Context e;

    private C0822Yk(Context context, AbstractC1757mh mhVar) {
        super(mhVar);
        this.e = context;
    }

    public static C1126db a(Context context) {
        C1126db dbVar = new C1126db(new C0872_i(new File(context.getCacheDir(), "admob_volley"), 20971520), new C0822Yk(context, new C0746Vm()));
        dbVar.a();
        return dbVar;
    }

    @Override // com.google.android.gms.internal.ads.C0404Ii, com.google.android.gms.internal.ads.Poa
    public final C1912opa a(AbstractC0959b<?> bVar) {
        if (bVar.i() && bVar.b() == 0) {
            if (Pattern.matches((String) C2392voa.e().a(C2474x.Hc), bVar.c())) {
                C2392voa.a();
                if (C0459Kl.c(this.e, 13400000)) {
                    C1912opa a2 = new C0788Xc(this.e).a(bVar);
                    if (a2 != null) {
                        String valueOf = String.valueOf(bVar.c());
                        C1763mk.f(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a2;
                    }
                    String valueOf2 = String.valueOf(bVar.c());
                    C1763mk.f(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(bVar);
    }
}
