package b.d.a.a;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;

public class j implements k {

    /* renamed from: a  reason: collision with root package name */
    boolean f576a = true;

    /* renamed from: b  reason: collision with root package name */
    int f577b = 2;

    @TargetApi(8)
    private void c(String str, String str2, Throwable th) {
        Log.wtf(str, str2, th);
    }

    public void a(int i, String str, String str2) {
        a(i, str, str2, null);
    }

    public void a(int i, String str, String str2, Throwable th) {
        if (a() && a(i)) {
            if (i == 2) {
                Log.v(str, str2, th);
            } else if (i == 3) {
                Log.d(str, str2, th);
            } else if (i == 4) {
                Log.i(str, str2, th);
            } else if (i != 5) {
                if (i != 6) {
                    if (i == 8) {
                        if (Integer.valueOf(Build.VERSION.SDK).intValue() > 8) {
                            c(str, str2, th);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Log.e(str, str2, th);
            } else {
                Log.w(str, str2, th);
            }
        }
    }

    @Override // b.d.a.a.k
    public void a(String str, String str2) {
        a(5, str, str2);
    }

    @Override // b.d.a.a.k
    public void a(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    public boolean a() {
        return this.f576a;
    }

    public boolean a(int i) {
        return i >= this.f577b;
    }

    @Override // b.d.a.a.k
    public void b(String str, String str2) {
        a(6, str, str2);
    }

    @Override // b.d.a.a.k
    public void b(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    @Override // b.d.a.a.k
    public void c(String str, String str2) {
        a(2, str, str2);
    }

    @Override // b.d.a.a.k
    public void d(String str, String str2) {
        a(2, str, str2);
    }
}
