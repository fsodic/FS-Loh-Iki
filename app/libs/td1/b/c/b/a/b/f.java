package b.c.b.a.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import b.c.b.a.b.d.c;
import com.google.android.gms.common.internal.H;
import com.google.android.gms.common.util.h;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f302a = j.f305a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f303b = new f();

    f() {
    }

    public static f a() {
        return f303b;
    }

    private static String b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f302a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context, int i) {
        int a2 = j.a(context, i);
        if (j.b(context, a2)) {
            return 18;
        }
        return a2;
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent a2 = a(context, i, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a2, 134217728);
    }

    @Deprecated
    public Intent a(int i) {
        return a((Context) null, i, (String) null);
    }

    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !h.d(context)) ? H.a("com.google.android.gms", b(context, str)) : H.a();
        }
        if (i != 3) {
            return null;
        }
        return H.a("com.google.android.gms");
    }

    public void a(Context context) {
        j.a(context);
    }

    public boolean a(Context context, String str) {
        return j.a(context, str);
    }

    public int b(Context context) {
        return j.b(context);
    }

    public String b(int i) {
        return j.a(i);
    }

    public boolean b(Context context, int i) {
        return j.b(context, i);
    }

    public int c(Context context) {
        return a(context, f302a);
    }

    public boolean c(int i) {
        return j.b(i);
    }
}
