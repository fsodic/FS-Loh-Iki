package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bz  reason: case insensitive filesystem */
public final class C0239Bz implements Sea<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final C2680zz f1668a;

    public C0239Bz(C2680zz zzVar) {
        this.f1668a = zzVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        JSONObject a2 = this.f1668a.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
