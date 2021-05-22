package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class OI {

    /* renamed from: a  reason: collision with root package name */
    private final d f2733a;

    /* renamed from: b  reason: collision with root package name */
    private final QI f2734b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f2735c = Collections.synchronizedList(new ArrayList());
    private final boolean d;

    public OI(d dVar, QI qi) {
        this.f2733a = dVar;
        this.f2734b = qi;
        this.d = ((Boolean) C2392voa.e().a(C2474x.Ie)).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void a(String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        this.f2735c.add(sb2);
    }

    /* access modifiers changed from: package-private */
    public final <T> SW<T> a(C2078rR rRVar, C1941pR pRVar, SW<T> sw) {
        long b2 = this.f2733a.b();
        String str = pRVar.t;
        if (str != null) {
            JW.a(sw, new RI(this, str, b2, pRVar, rRVar), C0875_l.f);
        }
        return sw;
    }

    public final String a() {
        return TextUtils.join("_", this.f2735c);
    }
}
