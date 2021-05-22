package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.h.a;
import com.google.android.gms.ads.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class _na {

    /* renamed from: a  reason: collision with root package name */
    public static final _na f3764a = new _na();

    protected _na() {
    }

    static final /* synthetic */ int a(String str, String str2) {
        return q.f1153a.indexOf(str) - q.f1153a.indexOf(str2);
    }

    public static Zna a(Context context, Fpa fpa) {
        List list;
        Context context2;
        String str;
        Date a2 = fpa.a();
        long time = a2 != null ? a2.getTime() : -1;
        String b2 = fpa.b();
        int d = fpa.d();
        Set<String> e = fpa.e();
        if (!e.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(e));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a3 = fpa.a(context2);
        Location f = fpa.f();
        Bundle a4 = fpa.a(AdMobAdapter.class);
        if (fpa.r() == null) {
            boolean g = fpa.g();
            String i = fpa.i();
            a m = fpa.m();
            if (m == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    String packageName = applicationContext.getPackageName();
                    C2392voa.a();
                    str = C0459Kl.a(Thread.currentThread().getStackTrace(), packageName);
                } else {
                    str = null;
                }
                boolean j = fpa.j();
                q a5 = Ipa.c().a();
                return new Zna(8, time, a4, d, list, a3, Math.max(fpa.p(), a5.b()), g, i, null, f, b2, fpa.o(), fpa.c(), Collections.unmodifiableList(new ArrayList(fpa.q())), fpa.l(), str, j, null, Math.max(fpa.s(), a5.c()), (String) Collections.max(Arrays.asList(fpa.h(), a5.a()), C1084coa.f4032a), fpa.k());
            }
            new eqa(m);
            throw null;
        }
        C2392voa.i();
        fpa.r().a();
        throw null;
    }
}
