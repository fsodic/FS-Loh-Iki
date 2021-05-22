package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jg  reason: case insensitive filesystem */
public final class C0428Jg {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f2338a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2339b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2340c;

    public C0428Jg(AbstractC1564jo joVar, Map<String, String> map) {
        this.f2338a = joVar;
        this.f2340c = map.get("forceOrientation");
        this.f2339b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    public final void a() {
        int i;
        if (this.f2338a == null) {
            C0745Vl.d("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f2340c)) {
            q.e();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.f2340c)) {
            q.e();
            i = 6;
        } else {
            i = this.f2339b ? -1 : q.e().a();
        }
        this.f2338a.setRequestedOrientation(i);
    }
}
