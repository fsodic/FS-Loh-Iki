package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.s  reason: case insensitive filesystem */
public final /* synthetic */ class C2129s implements AbstractC2220tV {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences$OnSharedPreferenceChangeListenerC2198t f5476a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1441i f5477b;

    C2129s(SharedPreferences$OnSharedPreferenceChangeListenerC2198t tVar, AbstractC1441i iVar) {
        this.f5476a = tVar;
        this.f5477b = iVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2220tV
    public final Object get() {
        return this.f5476a.b(this.f5477b);
    }
}
