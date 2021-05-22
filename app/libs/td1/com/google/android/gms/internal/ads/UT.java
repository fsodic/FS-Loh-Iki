package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.h.e;
import b.c.b.a.h.g;
import com.google.android.gms.internal.ads.C0262Cw;
import java.util.Map;
import java.util.concurrent.Executor;

public final class UT {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C0262Cw.c f3247a = C0262Cw.c.UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3248b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3249c;
    private final e<Hma> d;

    private UT(Context context, Executor executor, e<Hma> eVar) {
        this.f3248b = context;
        this.f3249c = executor;
        this.d = eVar;
    }

    private final e<Boolean> a(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        C0262Cw.a n = C0262Cw.n();
        n.a(this.f3248b.getPackageName());
        n.a(j);
        n.a(f3247a);
        if (exc != null) {
            n.b(C2151sV.a(exc));
            n.c(exc.getClass().getName());
        }
        if (str2 != null) {
            n.d(str2);
        }
        if (str != null) {
            n.e(str);
        }
        return this.d.a(this.f3249c, new WT(n, i));
    }

    static final /* synthetic */ Hma a(Context context) {
        return new Hma(context, "GLAS", null);
    }

    public static UT a(Context context, Executor executor) {
        return new UT(context, executor, g.a(executor, new TT(context)));
    }

    static final /* synthetic */ Boolean a(C0262Cw.a aVar, int i, e eVar) {
        boolean z;
        if (eVar.d()) {
            Lma a2 = ((Hma) eVar.b()).a(((C0262Cw) aVar.j()).f());
            a2.b(i);
            a2.a();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    static void a(C0262Cw.c cVar) {
        f3247a = cVar;
    }

    public final e<Boolean> a(int i, long j) {
        return a(i, j, null, null, null, null);
    }

    public final e<Boolean> a(int i, long j, Exception exc) {
        return a(i, j, exc, null, null, null);
    }

    public final e<Boolean> a(int i, long j, String str, Map<String, String> map) {
        return a(i, j, null, str, null, null);
    }

    public final e<Boolean> a(int i, String str) {
        return a(4007, 0, null, null, null, str);
    }
}
