package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class Zia extends AbstractC1211eja {
    public static final Parcelable.Creator<Zia> CREATOR = new C0936aja();

    /* renamed from: a  reason: collision with root package name */
    private final String f3663a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3664b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3665c;
    private final byte[] d;

    Zia(Parcel parcel) {
        super("APIC");
        this.f3663a = parcel.readString();
        this.f3664b = parcel.readString();
        this.f3665c = parcel.readInt();
        this.d = parcel.createByteArray();
    }

    public Zia(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f3663a = str;
        this.f3664b = null;
        this.f3665c = 3;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Zia.class == obj.getClass()) {
            Zia zia = (Zia) obj;
            return this.f3665c == zia.f3665c && Jka.a(this.f3663a, zia.f3663a) && Jka.a(this.f3664b, zia.f3664b) && Arrays.equals(this.d, zia.d);
        }
    }

    public final int hashCode() {
        int i = (this.f3665c + 527) * 31;
        String str = this.f3663a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3664b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3663a);
        parcel.writeString(this.f3664b);
        parcel.writeInt(this.f3665c);
        parcel.writeByteArray(this.d);
    }
}
