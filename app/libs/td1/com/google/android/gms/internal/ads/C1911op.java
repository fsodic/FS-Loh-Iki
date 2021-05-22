package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.op  reason: case insensitive filesystem */
public final class C1911op {

    /* renamed from: a  reason: collision with root package name */
    public final String f5174a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f5175b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5176c;
    public final Map<String, String> d;

    @TargetApi(21)
    public C1911op(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public C1911op(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private C1911op(String str, Uri uri, String str2, Map<String, String> map) {
        this.f5174a = str;
        this.f5175b = uri;
        this.f5176c = str2 == null ? "GET" : str2;
        this.d = map == null ? Collections.emptyMap() : map;
    }
}
