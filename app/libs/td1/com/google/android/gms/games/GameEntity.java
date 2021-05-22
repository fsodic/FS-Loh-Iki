package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameEntity extends GamesDowngradeableSafeParcel implements a {
    public static final Parcelable.Creator<GameEntity> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f1427a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1428b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1429c;
    private final String d;
    private final String e;
    private final String f;
    private final Uri g;
    private final Uri h;
    private final Uri i;
    private final boolean j;
    private final boolean k;
    private final String l;
    private final int m;
    private final int n;
    private final int o;
    private final boolean p;
    private final boolean q;
    private final String r;
    private final String s;
    private final String t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final String x;
    private final boolean y;

    static final class a extends n {
        a() {
        }

        @Override // com.google.android.gms.games.n
        /* renamed from: a */
        public final GameEntity createFromParcel(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.a(DowngradeableSafeParcel.L()) || DowngradeableSafeParcel.a(GameEntity.class.getCanonicalName())) {
                return super.a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            String readString8 = parcel.readString();
            Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
            String readString9 = parcel.readString();
            return new GameEntity(readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString9 == null ? null : Uri.parse(readString9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }
    }

    GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.f1427a = str;
        this.f1428b = str2;
        this.f1429c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = uri;
        this.r = str8;
        this.h = uri2;
        this.s = str9;
        this.i = uri3;
        this.t = str10;
        this.j = z;
        this.k = z2;
        this.l = str7;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = z3;
        this.q = z4;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = str11;
        this.y = z8;
    }

    static int a(a aVar) {
        return q.a(aVar.k(), aVar.getDisplayName(), aVar.l(), aVar.x(), aVar.getDescription(), aVar.p(), aVar.h(), aVar.g(), aVar.I(), Boolean.valueOf(aVar.d()), Boolean.valueOf(aVar.y()), aVar.B(), Integer.valueOf(aVar.w()), Integer.valueOf(aVar.q()), Boolean.valueOf(aVar.D()), Boolean.valueOf(aVar.A()), Boolean.valueOf(aVar.isMuted()), Boolean.valueOf(aVar.c()), Boolean.valueOf(aVar.u()), aVar.s(), Boolean.valueOf(aVar.F()));
    }

    static boolean a(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return q.a(aVar2.k(), aVar.k()) && q.a(aVar2.getDisplayName(), aVar.getDisplayName()) && q.a(aVar2.l(), aVar.l()) && q.a(aVar2.x(), aVar.x()) && q.a(aVar2.getDescription(), aVar.getDescription()) && q.a(aVar2.p(), aVar.p()) && q.a(aVar2.h(), aVar.h()) && q.a(aVar2.g(), aVar.g()) && q.a(aVar2.I(), aVar.I()) && q.a(Boolean.valueOf(aVar2.d()), Boolean.valueOf(aVar.d())) && q.a(Boolean.valueOf(aVar2.y()), Boolean.valueOf(aVar.y())) && q.a(aVar2.B(), aVar.B()) && q.a(Integer.valueOf(aVar2.w()), Integer.valueOf(aVar.w())) && q.a(Integer.valueOf(aVar2.q()), Integer.valueOf(aVar.q())) && q.a(Boolean.valueOf(aVar2.D()), Boolean.valueOf(aVar.D())) && q.a(Boolean.valueOf(aVar2.A()), Boolean.valueOf(aVar.A())) && q.a(Boolean.valueOf(aVar2.isMuted()), Boolean.valueOf(aVar.isMuted())) && q.a(Boolean.valueOf(aVar2.c()), Boolean.valueOf(aVar.c())) && q.a(Boolean.valueOf(aVar2.u()), Boolean.valueOf(aVar.u())) && q.a(aVar2.s(), aVar.s()) && q.a(Boolean.valueOf(aVar2.F()), Boolean.valueOf(aVar.F()));
    }

    static String b(a aVar) {
        q.a a2 = q.a(aVar);
        a2.a("ApplicationId", aVar.k());
        a2.a("DisplayName", aVar.getDisplayName());
        a2.a("PrimaryCategory", aVar.l());
        a2.a("SecondaryCategory", aVar.x());
        a2.a("Description", aVar.getDescription());
        a2.a("DeveloperName", aVar.p());
        a2.a("IconImageUri", aVar.h());
        a2.a("IconImageUrl", aVar.getIconImageUrl());
        a2.a("HiResImageUri", aVar.g());
        a2.a("HiResImageUrl", aVar.getHiResImageUrl());
        a2.a("FeaturedImageUri", aVar.I());
        a2.a("FeaturedImageUrl", aVar.getFeaturedImageUrl());
        a2.a("PlayEnabledGame", Boolean.valueOf(aVar.d()));
        a2.a("InstanceInstalled", Boolean.valueOf(aVar.y()));
        a2.a("InstancePackageName", aVar.B());
        a2.a("AchievementTotalCount", Integer.valueOf(aVar.w()));
        a2.a("LeaderboardCount", Integer.valueOf(aVar.q()));
        a2.a("RealTimeMultiplayerEnabled", Boolean.valueOf(aVar.D()));
        a2.a("TurnBasedMultiplayerEnabled", Boolean.valueOf(aVar.A()));
        a2.a("AreSnapshotsEnabled", Boolean.valueOf(aVar.u()));
        a2.a("ThemeColor", aVar.s());
        a2.a("HasGamepadSupport", Boolean.valueOf(aVar.F()));
        return a2.toString();
    }

    @Override // com.google.android.gms.games.a
    public final boolean A() {
        return this.q;
    }

    @Override // com.google.android.gms.games.a
    public final String B() {
        return this.l;
    }

    @Override // com.google.android.gms.games.a
    public final boolean D() {
        return this.p;
    }

    @Override // com.google.android.gms.games.a
    public final boolean F() {
        return this.y;
    }

    @Override // com.google.android.gms.games.a
    public final Uri I() {
        return this.i;
    }

    @Override // com.google.android.gms.games.a
    public final boolean c() {
        return this.v;
    }

    @Override // com.google.android.gms.games.a
    public final boolean d() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.a
    public final Uri g() {
        return this.h;
    }

    @Override // com.google.android.gms.games.a
    public final String getDescription() {
        return this.e;
    }

    @Override // com.google.android.gms.games.a
    public final String getDisplayName() {
        return this.f1428b;
    }

    @Override // com.google.android.gms.games.a
    public final String getFeaturedImageUrl() {
        return this.t;
    }

    @Override // com.google.android.gms.games.a
    public final String getHiResImageUrl() {
        return this.s;
    }

    @Override // com.google.android.gms.games.a
    public final String getIconImageUrl() {
        return this.r;
    }

    @Override // com.google.android.gms.games.a
    public final Uri h() {
        return this.g;
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.a
    public final boolean isMuted() {
        return this.u;
    }

    @Override // com.google.android.gms.games.a
    public final String k() {
        return this.f1427a;
    }

    @Override // com.google.android.gms.games.a
    public final String l() {
        return this.f1429c;
    }

    @Override // com.google.android.gms.games.a
    public final String p() {
        return this.f;
    }

    @Override // com.google.android.gms.games.a
    public final int q() {
        return this.o;
    }

    @Override // com.google.android.gms.games.a
    public final String s() {
        return this.x;
    }

    public final String toString() {
        return b(this);
    }

    @Override // com.google.android.gms.games.a
    public final boolean u() {
        return this.w;
    }

    @Override // com.google.android.gms.games.a
    public final int w() {
        return this.n;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (!M()) {
            int a2 = c.a(parcel);
            c.a(parcel, 1, k(), false);
            c.a(parcel, 2, getDisplayName(), false);
            c.a(parcel, 3, l(), false);
            c.a(parcel, 4, x(), false);
            c.a(parcel, 5, getDescription(), false);
            c.a(parcel, 6, p(), false);
            c.a(parcel, 7, (Parcelable) h(), i2, false);
            c.a(parcel, 8, (Parcelable) g(), i2, false);
            c.a(parcel, 9, (Parcelable) I(), i2, false);
            c.a(parcel, 10, this.j);
            c.a(parcel, 11, this.k);
            c.a(parcel, 12, this.l, false);
            c.a(parcel, 13, this.m);
            c.a(parcel, 14, w());
            c.a(parcel, 15, q());
            c.a(parcel, 16, D());
            c.a(parcel, 17, A());
            c.a(parcel, 18, getIconImageUrl(), false);
            c.a(parcel, 19, getHiResImageUrl(), false);
            c.a(parcel, 20, getFeaturedImageUrl(), false);
            c.a(parcel, 21, this.u);
            c.a(parcel, 22, this.v);
            c.a(parcel, 23, u());
            c.a(parcel, 24, s(), false);
            c.a(parcel, 25, F());
            c.a(parcel, a2);
            return;
        }
        parcel.writeString(this.f1427a);
        parcel.writeString(this.f1428b);
        parcel.writeString(this.f1429c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        Uri uri = this.g;
        String str = null;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.h;
        parcel.writeString(uri2 == null ? null : uri2.toString());
        Uri uri3 = this.i;
        if (uri3 != null) {
            str = uri3.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
    }

    @Override // com.google.android.gms.games.a
    public final String x() {
        return this.d;
    }

    @Override // com.google.android.gms.games.a
    public final boolean y() {
        return this.k;
    }
}
