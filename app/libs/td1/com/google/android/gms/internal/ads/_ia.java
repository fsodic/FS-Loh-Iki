package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class _ia extends AbstractC1211eja {
    public static final Parcelable.Creator<_ia> CREATOR = new C1074cja();

    /* renamed from: a  reason: collision with root package name */
    private final String f3743a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3744b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3745c;

    _ia(Parcel parcel) {
        super("COMM");
        this.f3743a = parcel.readString();
        this.f3744b = parcel.readString();
        this.f3745c = parcel.readString();
    }

    public _ia(String str, String str2, String str3) {
        super("COMM");
        this.f3743a = str;
        this.f3744b = str2;
        this.f3745c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && _ia.class == obj.getClass()) {
            _ia _ia = (_ia) obj;
            return Jka.a(this.f3744b, _ia.f3744b) && Jka.a(this.f3743a, _ia.f3743a) && Jka.a(this.f3745c, _ia.f3745c);
        }
    }

    public final int hashCode() {
        String str = this.f3743a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f3744b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3745c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.f4230a);
        parcel.writeString(this.f3743a);
        parcel.writeString(this.f3745c);
    }
}
