package com.google.android.gms.internal.ads;

final class _T extends VT {

    /* renamed from: a  reason: collision with root package name */
    private final String f3723a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3724b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3725c;

    private _T(String str, boolean z, boolean z2) {
        this.f3723a = str;
        this.f3724b = z;
        this.f3725c = z2;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final String a() {
        return this.f3723a;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean b() {
        return this.f3724b;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean d() {
        return this.f3725c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VT) {
            VT vt = (VT) obj;
            return this.f3723a.equals(vt.a()) && this.f3724b == vt.b() && this.f3725c == vt.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.f3723a.hashCode() ^ 1000003) * 1000003) ^ (this.f3724b ? 1231 : 1237)) * 1000003;
        if (!this.f3725c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f3723a;
        boolean z = this.f3724b;
        boolean z2 = this.f3725c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
