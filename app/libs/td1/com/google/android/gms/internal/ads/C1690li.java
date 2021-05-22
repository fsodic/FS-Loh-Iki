package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.li  reason: case insensitive filesystem */
public final class C1690li extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Context f4888a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f4889b = new WeakReference<>(null);

    private C1690li(Context context) {
        super(context);
    }

    private final synchronized Intent a(Intent intent) {
        if (!(this.f4888a == null || intent.getComponent() == null)) {
            if (intent.getComponent().getPackageName().equals(this.f4888a.getPackageName())) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setClassName(super.getPackageName(), intent.getComponent().getClassName());
                return intent2;
            }
        }
        return intent;
    }

    public static C1690li a(Context context) {
        return new C1690li(c(context));
    }

    public static Context b(Context context) {
        return context instanceof C1690li ? ((C1690li) context).getBaseContext() : c(context);
    }

    private final synchronized void b(Intent intent) {
        Activity activity = this.f4889b.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = (Intent) intent.clone();
            intent2.setFlags(intent.getFlags() & -268435457);
            activity.startActivity(intent2);
        } catch (Throwable th) {
            q.g().a(th, BuildConfig.FLAVOR);
            intent.addFlags(268435456);
            super.startActivity(intent);
        }
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final synchronized void a(String str) {
        this.f4888a = super.createPackageContext(str, 0);
    }

    public final Context getApplicationContext() {
        return this;
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        if (this.f4888a != null) {
            return this.f4888a.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    public final synchronized String getPackageName() {
        if (this.f4888a != null) {
            return this.f4888a.getPackageName();
        }
        return super.getPackageName();
    }

    public final synchronized String getPackageResourcePath() {
        if (this.f4888a != null) {
            return this.f4888a.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    public final synchronized void startActivity(Intent intent) {
        b(a(intent));
    }
}
