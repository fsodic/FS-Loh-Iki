package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.p;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Nf  reason: case insensitive filesystem */
public final class C0531Nf implements d<p, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC2304uf f2677a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ BinderC0479Lf f2678b;

    C0531Nf(BinderC0479Lf lf, AbstractC2304uf ufVar) {
        this.f2678b = lf;
        this.f2677a = ufVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a(String str) {
        try {
            String canonicalName = this.f2678b.f2511a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            C0745Vl.a(sb.toString());
            this.f2677a.b(0, str);
            this.f2677a.c(0);
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }
}
