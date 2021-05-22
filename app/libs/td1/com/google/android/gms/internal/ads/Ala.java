package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public final class Ala {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1550a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Dla f1551b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1552c = false;

    public final Activity a() {
        synchronized (this.f1550a) {
            if (this.f1551b == null) {
                return null;
            }
            return this.f1551b.a();
        }
    }

    public final void a(Context context) {
        synchronized (this.f1550a) {
            if (!this.f1552c) {
                Application application = null;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                }
                if (application == null) {
                    C0745Vl.d("Can not cast Context to Application");
                    return;
                }
                if (this.f1551b == null) {
                    this.f1551b = new Dla();
                }
                this.f1551b.a(application, context);
                this.f1552c = true;
            }
        }
    }

    public final void a(Fla fla) {
        synchronized (this.f1550a) {
            if (this.f1551b == null) {
                this.f1551b = new Dla();
            }
            this.f1551b.a(fla);
        }
    }

    public final Context b() {
        synchronized (this.f1550a) {
            if (this.f1551b == null) {
                return null;
            }
            return this.f1551b.b();
        }
    }

    public final void b(Fla fla) {
        synchronized (this.f1550a) {
            if (this.f1551b != null) {
                this.f1551b.b(fla);
            }
        }
    }
}
