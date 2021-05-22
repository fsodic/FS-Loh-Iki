package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cS  reason: case insensitive filesystem */
public final class C1047cS {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C1184eS> f3994a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f3995b;

    /* renamed from: c  reason: collision with root package name */
    private final C0847Zj f3996c;
    private final C0823Yl d;

    public C1047cS(Context context, C0823Yl yl, C0847Zj zj) {
        this.f3995b = context;
        this.d = yl;
        this.f3996c = zj;
    }

    private final C1184eS a() {
        return new C1184eS(this.f3995b, this.f3996c.i(), this.f3996c.k());
    }

    private final C1184eS b(String str) {
        C1690li a2 = C1690li.a(this.f3995b);
        try {
            a2.a(str);
            C2176sk skVar = new C2176sk();
            skVar.a(this.f3995b, str, false);
            C2245tk tkVar = new C2245tk(this.f3996c.i(), skVar);
            return new C1184eS(a2, tkVar, new C1556jk(C0459Kl.c(), tkVar));
        } catch (PackageManager.NameNotFoundException unused) {
            return a();
        }
    }

    public final C1184eS a(String str) {
        if (str == null) {
            return a();
        }
        if (this.f3994a.containsKey(str)) {
            return this.f3994a.get(str);
        }
        C1184eS b2 = b(str);
        this.f3994a.put(str, b2);
        return b2;
    }
}
