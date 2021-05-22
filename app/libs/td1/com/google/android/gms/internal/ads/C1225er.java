package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.er  reason: case insensitive filesystem */
public final class C1225er implements AbstractC0950ar {

    /* renamed from: a  reason: collision with root package name */
    private final C1803nR f4253a;

    public C1225er(C1803nR nRVar) {
        this.f4253a = nRVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0950ar
    public final void a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f4253a.a(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
