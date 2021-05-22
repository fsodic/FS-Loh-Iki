package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Je  reason: case insensitive filesystem */
public final class C0426Je {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f2333a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final AbstractC0452Ke<JSONObject> f2334b = new C0478Le();

    /* renamed from: c  reason: collision with root package name */
    public static final AbstractC0400Ie<InputStream> f2335c = C0504Me.f2603a;

    static final /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f2333a));
    }
}
