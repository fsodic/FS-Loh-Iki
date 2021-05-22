package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.e;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.If  reason: case insensitive filesystem */
public final class C0401If implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Date f2247a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2248b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f2249c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final boolean g;
    private final int h;
    private final String i;

    public C0401If(Date date, int i2, Set<String> set, Location location, boolean z, int i3, boolean z2, int i4, String str) {
        this.f2247a = date;
        this.f2248b = i2;
        this.f2249c = set;
        this.e = location;
        this.d = z;
        this.f = i3;
        this.g = z2;
        this.h = i4;
        this.i = str;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final int c() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final boolean e() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final Date g() {
        return this.f2247a;
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
        return this.f2249c;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final int l() {
        return this.f2248b;
    }
}
