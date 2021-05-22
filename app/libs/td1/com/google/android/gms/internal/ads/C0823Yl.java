package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Yl  reason: case insensitive filesystem */
public final class C0823Yl extends a {
    public static final Parcelable.Creator<C0823Yl> CREATOR = new C0941am();

    /* renamed from: a  reason: collision with root package name */
    public String f3587a;

    /* renamed from: b  reason: collision with root package name */
    public int f3588b;

    /* renamed from: c  reason: collision with root package name */
    public int f3589c;
    public boolean d;
    private boolean e;

    public C0823Yl(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public C0823Yl(int i, int i2, boolean z, boolean z2) {
        this(i, i2, true, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0823Yl(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0823Yl.<init>(int, int, boolean, boolean, boolean):void");
    }

    C0823Yl(String str, int i, int i2, boolean z, boolean z2) {
        this.f3587a = str;
        this.f3588b = i;
        this.f3589c = i2;
        this.d = z;
        this.e = z2;
    }

    public static C0823Yl L() {
        return new C0823Yl(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f3587a, false);
        c.a(parcel, 3, this.f3588b);
        c.a(parcel, 4, this.f3589c);
        c.a(parcel, 5, this.d);
        c.a(parcel, 6, this.e);
        c.a(parcel, a2);
    }
}
