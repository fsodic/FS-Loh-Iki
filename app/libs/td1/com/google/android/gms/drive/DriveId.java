package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import b.c.b.a.d.d.C0055a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.r;
import org.cocos2dx.lib.BuildConfig;

public class DriveId extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<DriveId> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final String f1412a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1413b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1414c;
    private final int d;
    private volatile String e = null;
    private volatile String f = null;

    public DriveId(String str, long j, long j2, int i) {
        this.f1412a = str;
        boolean z = true;
        r.a(!BuildConfig.FLAVOR.equals(str));
        if (str == null && j == -1) {
            z = false;
        }
        r.a(z);
        this.f1413b = j;
        this.f1414c = j2;
        this.d = i;
    }

    public final String L() {
        if (this.e == null) {
            C0055a.C0015a k = C0055a.k();
            k.a(1);
            String str = this.f1412a;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            k.a(str);
            k.a(this.f1413b);
            k.b(this.f1414c);
            k.b(this.d);
            String valueOf = String.valueOf(Base64.encodeToString(((C0055a) k.a()).g(), 10));
            this.e = valueOf.length() != 0 ? "DriveId:".concat(valueOf) : new String("DriveId:");
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.f1414c != this.f1414c) {
                return false;
            }
            if (driveId.f1413b == -1 && this.f1413b == -1) {
                return driveId.f1412a.equals(this.f1412a);
            }
            String str2 = this.f1412a;
            if (str2 != null && (str = driveId.f1412a) != null) {
                return driveId.f1413b == this.f1413b && str.equals(str2);
            }
            if (driveId.f1413b == this.f1413b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f1413b == -1) {
            return this.f1412a.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.f1414c));
        String valueOf2 = String.valueOf(String.valueOf(this.f1413b));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    public String toString() {
        return L();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1412a, false);
        c.a(parcel, 3, this.f1413b);
        c.a(parcel, 4, this.f1414c);
        c.a(parcel, 5, this.d);
        c.a(parcel, a2);
    }
}
