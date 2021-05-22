package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.mediation.AbstractC0135a;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.ads.mediation.v;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lf  reason: case insensitive filesystem */
public final class BinderC1684lf extends AbstractBinderC1822nf {

    /* renamed from: a  reason: collision with root package name */
    private static final C2237tg f4883a = new C2237tg();

    /* renamed from: b  reason: collision with root package name */
    private Map<Class<? extends v>, v> f4884b;

    private final <NetworkExtrasT extends f, ServerParametersT extends e> AbstractC1960pf F(String str) {
        try {
            Class<?> cls = Class.forName(str, false, BinderC1684lf.class.getClassLoader());
            if (b.class.isAssignableFrom(cls)) {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new BinderC0687Tf(bVar, (f) this.f4884b.get(bVar.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.f.class.isAssignableFrom(cls)) {
                return new BinderC0479Lf((com.google.android.gms.ads.mediation.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (AbstractC0135a.class.isAssignableFrom(cls)) {
                    return new BinderC0479Lf((AbstractC0135a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                C0745Vl.d(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return G(str);
        }
    }

    private final AbstractC1960pf G(String str) {
        try {
            C0745Vl.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC0479Lf(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new BinderC0479Lf(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC0479Lf(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new BinderC0687Tf(customEventAdapter, (c) this.f4884b.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            C0745Vl.c(sb.toString(), th);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1891of
    public final AbstractC1960pf C(String str) {
        return F(str);
    }

    public final void a(Map<Class<? extends v>, v> map) {
        this.f4884b = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1891of
    public final AbstractC1755mg k(String str) {
        return C2237tg.a(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1891of
    public final boolean q(String str) {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, BinderC1684lf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            C0745Vl.d(sb.toString());
            return false;
        }
    }
}
