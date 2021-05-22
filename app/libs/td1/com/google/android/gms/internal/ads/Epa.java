package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.f.a;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.v;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class Epa {

    /* renamed from: a */
    private final HashSet<String> f1910a = new HashSet<>();

    /* renamed from: b */
    private final Bundle f1911b = new Bundle();

    /* renamed from: c */
    private final HashMap<Class<? extends v>, v> f1912c = new HashMap<>();
    private final HashSet<String> d = new HashSet<>();
    private final Bundle e = new Bundle();
    private final HashSet<String> f = new HashSet<>();
    private Date g;
    private String h;
    private final List<String> i = new ArrayList();
    private int j = -1;
    private Location k;
    private boolean l = false;
    private String m;
    private String n;
    private int o = -1;
    private boolean p;
    private a q;
    private int r = -1;
    private String s;

    public final void a(int i2) {
        this.j = i2;
    }

    public final void a(Location location) {
        this.k = location;
    }

    public final void a(Class<? extends j> cls, Bundle bundle) {
        this.f1911b.putBundle(cls.getName(), bundle);
    }

    public final void a(String str) {
        this.f1910a.add(str);
    }

    public final void a(Date date) {
        this.g = date;
    }

    public final void a(boolean z) {
        this.p = z;
    }

    public final void b(String str) {
        this.d.add(str);
    }

    public final void b(boolean z) {
        this.o = z ? 1 : 0;
    }

    public final void c(String str) {
        this.d.remove(str);
    }
}
