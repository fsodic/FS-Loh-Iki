package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, J> f2555a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final L f2556b;

    public M(L l) {
        this.f2556b = l;
    }

    public final L a() {
        return this.f2556b;
    }

    public final void a(String str, J j) {
        this.f2555a.put(str, j);
    }

    public final void a(String str, String str2, long j) {
        L l = this.f2556b;
        J j2 = this.f2555a.get(str2);
        String[] strArr = {str};
        if (!(l == null || j2 == null)) {
            l.a(j2, j, strArr);
        }
        Map<String, J> map = this.f2555a;
        L l2 = this.f2556b;
        map.put(str, l2 == null ? null : l2.a(j));
    }
}
