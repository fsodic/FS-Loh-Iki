package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;

final /* synthetic */ class RM implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final OM f3003a;

    RM(OM om) {
        this.f3003a = om;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        String str3;
        OM om = this.f3003a;
        q.c();
        Ela l = q.g().i().l();
        Bundle bundle = null;
        if (!(l == null || l == null || (q.g().i().j() && q.g().i().g()))) {
            if (l.d()) {
                l.a();
            }
            C2593yla c2 = l.c();
            if (c2 != null) {
                str2 = c2.c();
                str = c2.d();
                str3 = c2.e();
                if (str2 != null) {
                    q.g().i().a(str2);
                }
                if (str3 != null) {
                    q.g().i().c(str3);
                }
            } else {
                str2 = q.g().i().h();
                str3 = q.g().i().e();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!q.g().i().g()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    str3 = "no_hash";
                }
                bundle2.putString("v_fp_vertical", str3);
            }
            if (str2 != null && !q.g().i().j()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new PM(bundle);
    }
}
