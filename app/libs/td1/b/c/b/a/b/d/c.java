package b.c.b.a.b.d;

import android.content.Context;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f297a = new c();

    /* renamed from: b  reason: collision with root package name */
    private b f298b = null;

    public static b a(Context context) {
        return f297a.b(context);
    }

    private final synchronized b b(Context context) {
        if (this.f298b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f298b = new b(context);
        }
        return this.f298b;
    }
}
