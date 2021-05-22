package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements g {
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f1430a;

    /* renamed from: b  reason: collision with root package name */
    private String f1431b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f1432c;
    private final Uri d;
    private final long e;
    private final int f;
    private final long g;
    private final String h;
    private final String i;
    private final String j;
    private final com.google.android.gms.games.internal.a.a k;
    private final i l;
    private final boolean m;
    private final boolean n;
    private final String o;
    private final String p;
    private final Uri q;
    private final String r;
    private final Uri s;
    private final String t;
    private final int u;
    private final long v;
    private final boolean w;
    private final long x;

    static final class a extends k {
        a() {
        }

        @Override // com.google.android.gms.games.k
        /* renamed from: a */
        public final PlayerEntity createFromParcel(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.a(DowngradeableSafeParcel.L()) || DowngradeableSafeParcel.a(PlayerEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            return new PlayerEntity(readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 == null ? null : Uri.parse(readString4), parcel.readLong(), -1, -1, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1, -1, false, -1);
        }
    }

    PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j2, int i2, long j3, String str3, String str4, String str5, com.google.android.gms.games.internal.a.a aVar, i iVar, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, int i3, long j4, boolean z3, long j5) {
        this.f1430a = str;
        this.f1431b = str2;
        this.f1432c = uri;
        this.h = str3;
        this.d = uri2;
        this.i = str4;
        this.e = j2;
        this.f = i2;
        this.g = j3;
        this.j = str5;
        this.m = z;
        this.k = aVar;
        this.l = iVar;
        this.n = z2;
        this.o = str6;
        this.p = str7;
        this.q = uri3;
        this.r = str8;
        this.s = uri4;
        this.t = str9;
        this.u = i3;
        this.v = j4;
        this.w = z3;
        this.x = j5;
    }

    static int a(g gVar) {
        return q.a(gVar.H(), gVar.getDisplayName(), Boolean.valueOf(gVar.o()), gVar.h(), gVar.g(), Long.valueOf(gVar.m()), gVar.getTitle(), gVar.r(), gVar.j(), gVar.getName(), gVar.i(), gVar.n(), Integer.valueOf(gVar.z()), Long.valueOf(gVar.f()), Boolean.valueOf(gVar.isMuted()), Long.valueOf(gVar.e()));
    }

    static boolean a(g gVar, Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (gVar == obj) {
            return true;
        }
        g gVar2 = (g) obj;
        return q.a(gVar2.H(), gVar.H()) && q.a(gVar2.getDisplayName(), gVar.getDisplayName()) && q.a(Boolean.valueOf(gVar2.o()), Boolean.valueOf(gVar.o())) && q.a(gVar2.h(), gVar.h()) && q.a(gVar2.g(), gVar.g()) && q.a(Long.valueOf(gVar2.m()), Long.valueOf(gVar.m())) && q.a(gVar2.getTitle(), gVar.getTitle()) && q.a(gVar2.r(), gVar.r()) && q.a(gVar2.j(), gVar.j()) && q.a(gVar2.getName(), gVar.getName()) && q.a(gVar2.i(), gVar.i()) && q.a(gVar2.n(), gVar.n()) && q.a(Integer.valueOf(gVar2.z()), Integer.valueOf(gVar.z())) && q.a(Long.valueOf(gVar2.f()), Long.valueOf(gVar.f())) && q.a(Boolean.valueOf(gVar2.isMuted()), Boolean.valueOf(gVar.isMuted())) && q.a(Long.valueOf(gVar2.e()), Long.valueOf(gVar.e()));
    }

    static String b(g gVar) {
        q.a a2 = q.a(gVar);
        a2.a("PlayerId", gVar.H());
        a2.a("DisplayName", gVar.getDisplayName());
        a2.a("HasDebugAccess", Boolean.valueOf(gVar.o()));
        a2.a("IconImageUri", gVar.h());
        a2.a("IconImageUrl", gVar.getIconImageUrl());
        a2.a("HiResImageUri", gVar.g());
        a2.a("HiResImageUrl", gVar.getHiResImageUrl());
        a2.a("RetrievedTimestamp", Long.valueOf(gVar.m()));
        a2.a("Title", gVar.getTitle());
        a2.a("LevelInfo", gVar.r());
        a2.a("GamerTag", gVar.j());
        a2.a("Name", gVar.getName());
        a2.a("BannerImageLandscapeUri", gVar.i());
        a2.a("BannerImageLandscapeUrl", gVar.getBannerImageLandscapeUrl());
        a2.a("BannerImagePortraitUri", gVar.n());
        a2.a("BannerImagePortraitUrl", gVar.getBannerImagePortraitUrl());
        a2.a("GamerFriendStatus", Integer.valueOf(gVar.z()));
        a2.a("GamerFriendUpdateTimestamp", Long.valueOf(gVar.f()));
        a2.a("IsMuted", Boolean.valueOf(gVar.isMuted()));
        a2.a("totalUnlockedAchievement", Long.valueOf(gVar.e()));
        return a2.toString();
    }

    @Override // com.google.android.gms.games.g
    public final String H() {
        return this.f1430a;
    }

    public final long N() {
        return this.g;
    }

    @Override // com.google.android.gms.games.g
    public final long e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.g
    public final long f() {
        return this.v;
    }

    @Override // com.google.android.gms.games.g
    public final Uri g() {
        return this.d;
    }

    @Override // com.google.android.gms.games.g
    public final String getBannerImageLandscapeUrl() {
        return this.r;
    }

    @Override // com.google.android.gms.games.g
    public final String getBannerImagePortraitUrl() {
        return this.t;
    }

    @Override // com.google.android.gms.games.g
    public final String getDisplayName() {
        return this.f1431b;
    }

    @Override // com.google.android.gms.games.g
    public final String getHiResImageUrl() {
        return this.i;
    }

    @Override // com.google.android.gms.games.g
    public final String getIconImageUrl() {
        return this.h;
    }

    @Override // com.google.android.gms.games.g
    public final String getName() {
        return this.p;
    }

    @Override // com.google.android.gms.games.g
    public final String getTitle() {
        return this.j;
    }

    @Override // com.google.android.gms.games.g
    public final Uri h() {
        return this.f1432c;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.g
    public final Uri i() {
        return this.q;
    }

    @Override // com.google.android.gms.games.g
    public final boolean isMuted() {
        return this.w;
    }

    @Override // com.google.android.gms.games.g
    public final String j() {
        return this.o;
    }

    @Override // com.google.android.gms.games.g
    public final long m() {
        return this.e;
    }

    @Override // com.google.android.gms.games.g
    public final Uri n() {
        return this.s;
    }

    @Override // com.google.android.gms.games.g
    public final boolean o() {
        return this.n;
    }

    @Override // com.google.android.gms.games.g
    public final i r() {
        return this.l;
    }

    public final String toString() {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (!M()) {
            int a2 = c.a(parcel);
            c.a(parcel, 1, H(), false);
            c.a(parcel, 2, getDisplayName(), false);
            c.a(parcel, 3, (Parcelable) h(), i2, false);
            c.a(parcel, 4, (Parcelable) g(), i2, false);
            c.a(parcel, 5, m());
            c.a(parcel, 6, this.f);
            c.a(parcel, 7, N());
            c.a(parcel, 8, getIconImageUrl(), false);
            c.a(parcel, 9, getHiResImageUrl(), false);
            c.a(parcel, 14, getTitle(), false);
            c.a(parcel, 15, (Parcelable) this.k, i2, false);
            c.a(parcel, 16, (Parcelable) r(), i2, false);
            c.a(parcel, 18, this.m);
            c.a(parcel, 19, this.n);
            c.a(parcel, 20, this.o, false);
            c.a(parcel, 21, this.p, false);
            c.a(parcel, 22, (Parcelable) i(), i2, false);
            c.a(parcel, 23, getBannerImageLandscapeUrl(), false);
            c.a(parcel, 24, (Parcelable) n(), i2, false);
            c.a(parcel, 25, getBannerImagePortraitUrl(), false);
            c.a(parcel, 26, this.u);
            c.a(parcel, 27, this.v);
            c.a(parcel, 28, this.w);
            c.a(parcel, 29, this.x);
            c.a(parcel, a2);
            return;
        }
        parcel.writeString(this.f1430a);
        parcel.writeString(this.f1431b);
        Uri uri = this.f1432c;
        String str = null;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.d;
        if (uri2 != null) {
            str = uri2.toString();
        }
        parcel.writeString(str);
        parcel.writeLong(this.e);
    }

    @Override // com.google.android.gms.games.g
    public final int z() {
        return this.u;
    }
}
