package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nD  reason: case insensitive filesystem */
public final class C1789nD {

    /* renamed from: a  reason: collision with root package name */
    private final C1445iD f5020a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<AbstractC1891of> f5021b = new AtomicReference<>();

    C1789nD(C1445iD iDVar) {
        this.f5020a = iDVar;
    }

    private final AbstractC1891of b() {
        AbstractC1891of ofVar = this.f5021b.get();
        if (ofVar != null) {
            return ofVar;
        }
        C0745Vl.d("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    private final AbstractC1960pf b(String str, JSONObject jSONObject) {
        AbstractC1891of b2 = b();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                return b2.q(jSONObject.getString("class_name")) ? b2.C("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : b2.C("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                C0745Vl.b("Invalid custom event.", e);
            }
        }
        return b2.C(str);
    }

    public final SR a(String str, JSONObject jSONObject) {
        try {
            SR sr = new SR("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? new BinderC0479Lf(new AdMobAdapter()) : "com.google.ads.mediation.AdUrlAdapter".equals(str) ? new BinderC0479Lf(new AdUrlAdapter()) : "com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str) ? new BinderC0479Lf(new zzapn()) : b(str, jSONObject));
            this.f5020a.a(str, sr);
            return sr;
        } catch (Throwable th) {
            throw new MR(th);
        }
    }

    public final AbstractC1755mg a(String str) {
        AbstractC1755mg k = b().k(str);
        this.f5020a.a(str, k);
        return k;
    }

    public final void a(AbstractC1891of ofVar) {
        this.f5021b.compareAndSet(null, ofVar);
    }

    public final boolean a() {
        return this.f5021b.get() != null;
    }
}
