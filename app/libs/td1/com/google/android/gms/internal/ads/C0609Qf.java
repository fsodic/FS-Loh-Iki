package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Qf  reason: case insensitive filesystem */
public final class C0609Qf implements u {

    /* renamed from: a  reason: collision with root package name */
    private final Date f2950a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2951b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f2952c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final C0578Pa g;
    private final List<String> h = new ArrayList();
    private final boolean i;
    private final Map<String, Boolean> j = new HashMap();
    private final int k;
    private final String l;

    public C0609Qf(Date date, int i2, Set<String> set, Location location, boolean z, int i3, C0578Pa pa, List<String> list, boolean z2, int i4, String str) {
        Map<String, Boolean> map;
        String str2;
        boolean z3;
        this.f2950a = date;
        this.f2951b = i2;
        this.f2952c = set;
        this.e = location;
        this.d = z;
        this.f = i3;
        this.g = pa;
        this.i = z2;
        this.k = i4;
        this.l = str;
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            z3 = true;
                        } else if ("false".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            z3 = false;
                        }
                        map.put(str2, z3);
                    }
                } else {
                    this.h.add(str3);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.u
    public final Map<String, Boolean> a() {
        return this.j;
    }

    @Override // com.google.android.gms.ads.mediation.u
    public final boolean b() {
        List<String> list = this.h;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final int c() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.u
    public final boolean d() {
        List<String> list = this.h;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final boolean e() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.u
    public final boolean f() {
        List<String> list = this.h;
        if (list != null) {
            return list.contains("2") || this.h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final Date g() {
        return this.f2950a;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final Location getLocation() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final boolean h() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final Set<String> i() {
        return this.f2952c;
    }

    @Override // com.google.android.gms.ads.mediation.u
    public final d j() {
        C1028c cVar;
        if (this.g == null) {
            return null;
        }
        d.a aVar = new d.a();
        aVar.b(this.g.f2842b);
        aVar.b(this.g.f2843c);
        aVar.a(this.g.d);
        C0578Pa pa = this.g;
        if (pa.f2841a >= 2) {
            aVar.a(pa.e);
        }
        C0578Pa pa2 = this.g;
        if (pa2.f2841a >= 3 && (cVar = pa2.f) != null) {
            aVar.a(new t(cVar));
        }
        return aVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.u
    public final boolean k() {
        List<String> list = this.h;
        if (list != null) {
            return list.contains("1") || this.h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final int l() {
        return this.f2951b;
    }
}
