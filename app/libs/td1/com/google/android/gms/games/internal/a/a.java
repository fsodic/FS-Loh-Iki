package com.google.android.gms.games.internal.a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.games.internal.q;

public final class a extends q implements b {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final String f1458a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1459b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1460c;
    private final Uri d;
    private final Uri e;
    private final Uri f;

    a(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.f1458a = str;
        this.f1459b = str2;
        this.f1460c = j;
        this.d = uri;
        this.e = uri2;
        this.f = uri3;
    }

    static int a(b bVar) {
        return com.google.android.gms.common.internal.q.a(bVar.C(), bVar.G(), Long.valueOf(bVar.v()), bVar.b(), bVar.a(), bVar.t());
    }

    static boolean a(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return com.google.android.gms.common.internal.q.a(bVar2.C(), bVar.C()) && com.google.android.gms.common.internal.q.a(bVar2.G(), bVar.G()) && com.google.android.gms.common.internal.q.a(Long.valueOf(bVar2.v()), Long.valueOf(bVar.v())) && com.google.android.gms.common.internal.q.a(bVar2.b(), bVar.b()) && com.google.android.gms.common.internal.q.a(bVar2.a(), bVar.a()) && com.google.android.gms.common.internal.q.a(bVar2.t(), bVar.t());
    }

    static String b(b bVar) {
        q.a a2 = com.google.android.gms.common.internal.q.a(bVar);
        a2.a("GameId", bVar.C());
        a2.a("GameName", bVar.G());
        a2.a("ActivityTimestampMillis", Long.valueOf(bVar.v()));
        a2.a("GameIconUri", bVar.b());
        a2.a("GameHiResUri", bVar.a());
        a2.a("GameFeaturedUri", bVar.t());
        return a2.toString();
    }

    @Override // com.google.android.gms.games.internal.a.b
    public final String C() {
        return this.f1458a;
    }

    @Override // com.google.android.gms.games.internal.a.b
    public final String G() {
        return this.f1459b;
    }

    @Override // com.google.android.gms.games.internal.a.b
    public final Uri a() {
        return this.e;
    }

    @Override // com.google.android.gms.games.internal.a.b
    public final Uri b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return a(this, obj);
    }

    public final int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.internal.a.b
    public final Uri t() {
        return this.f;
    }

    public final String toString() {
        return b(this);
    }

    @Override // com.google.android.gms.games.internal.a.b
    public final long v() {
        return this.f1460c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1458a, false);
        c.a(parcel, 2, this.f1459b, false);
        c.a(parcel, 3, this.f1460c);
        c.a(parcel, 4, (Parcelable) this.d, i, false);
        c.a(parcel, 5, (Parcelable) this.e, i, false);
        c.a(parcel, 6, (Parcelable) this.f, i, false);
        c.a(parcel, a2);
    }
}
