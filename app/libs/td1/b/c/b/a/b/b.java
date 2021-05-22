package b.c.b.a.b;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public static final b f260a = new b(0);

    /* renamed from: b  reason: collision with root package name */
    private final int f261b;

    /* renamed from: c  reason: collision with root package name */
    private final int f262c;
    private final PendingIntent d;
    private final String e;

    public b(int i) {
        this(i, null, null);
    }

    b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f261b = i;
        this.f262c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final int L() {
        return this.f262c;
    }

    public final String M() {
        return this.e;
    }

    public final PendingIntent N() {
        return this.d;
    }

    public final boolean O() {
        return (this.f262c == 0 || this.d == null) ? false : true;
    }

    public final boolean P() {
        return this.f262c == 0;
    }

    public final void a(Activity activity, int i) {
        if (O()) {
            activity.startIntentSenderForResult(this.d.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f262c == bVar.f262c && q.a(this.d, bVar.d) && q.a(this.e, bVar.e);
    }

    public final int hashCode() {
        return q.a(Integer.valueOf(this.f262c), this.d, this.e);
    }

    public final String toString() {
        q.a a2 = q.a(this);
        a2.a("statusCode", a(this.f262c));
        a2.a("resolution", this.d);
        a2.a("message", this.e);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f261b);
        c.a(parcel, 2, L());
        c.a(parcel, 3, (Parcelable) N(), i, false);
        c.a(parcel, 4, M(), false);
        c.a(parcel, a2);
    }
}
