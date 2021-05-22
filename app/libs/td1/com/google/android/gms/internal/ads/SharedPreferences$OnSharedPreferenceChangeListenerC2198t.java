package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import b.c.b.a.b.d.c;
import b.c.b.a.b.j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.t  reason: case insensitive filesystem */
public final class SharedPreferences$OnSharedPreferenceChangeListenerC2198t implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5574a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ConditionVariable f5575b = new ConditionVariable();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f5576c = false;
    private volatile boolean d = false;
    private SharedPreferences e = null;
    private Bundle f = new Bundle();
    private Context g;
    private JSONObject h = new JSONObject();

    private final void b() {
        if (this.e != null) {
            try {
                this.h = new JSONObject((String) C0251Cl.a(new C2336v(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final <T> T a(AbstractC1441i<T> iVar) {
        if (!this.f5575b.block(5000)) {
            synchronized (this.f5574a) {
                if (!this.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f5576c || this.e == null) {
            synchronized (this.f5574a) {
                if (this.f5576c) {
                    if (this.e == null) {
                    }
                }
                return iVar.c();
            }
        }
        if (iVar.b() != 2) {
            return (iVar.b() != 1 || !this.h.has(iVar.a())) ? (T) C0251Cl.a(new C2129s(this, iVar)) : iVar.a(this.h);
        }
        Bundle bundle = this.f;
        return bundle == null ? iVar.c() : iVar.a(bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a() {
        return this.e.getString("flag_configuration", "{}");
    }

    public final void a(Context context) {
        if (!this.f5576c) {
            synchronized (this.f5574a) {
                if (!this.f5576c) {
                    if (!this.d) {
                        this.d = true;
                    }
                    this.g = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        this.f = c.a(this.g).a(this.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context c2 = j.c(context);
                        if (c2 == null && context != null && (c2 = context.getApplicationContext()) == null) {
                            c2 = context;
                        }
                        if (c2 != null) {
                            C2392voa.c();
                            this.e = c2.getSharedPreferences("google_ads_flags", 0);
                            if (this.e != null) {
                                this.e.registerOnSharedPreferenceChangeListener(this);
                            }
                            C0266Da.a(new C2267u(this));
                            b();
                            this.f5576c = true;
                            this.d = false;
                            this.f5575b.open();
                        }
                    } finally {
                        this.d = false;
                        this.f5575b.open();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(AbstractC1441i iVar) {
        return iVar.a(this.e);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            b();
        }
    }
}
