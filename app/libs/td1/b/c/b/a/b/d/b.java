package b.c.b.a.b.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.o;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f296a;

    public b(Context context) {
        this.f296a = context;
    }

    public int a(String str) {
        return this.f296a.checkCallingOrSelfPermission(str);
    }

    public int a(String str, String str2) {
        return this.f296a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo a(String str, int i) {
        return this.f296a.getPackageManager().getApplicationInfo(str, i);
    }

    public boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f296a);
        }
        if (!o.k() || (nameForUid = this.f296a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f296a.getPackageManager().isInstantApp(nameForUid);
    }

    public PackageInfo b(String str, int i) {
        return this.f296a.getPackageManager().getPackageInfo(str, i);
    }

    public CharSequence b(String str) {
        return this.f296a.getPackageManager().getApplicationLabel(this.f296a.getPackageManager().getApplicationInfo(str, 0));
    }
}
