package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.u  reason: case insensitive filesystem */
public final class C2267u implements AbstractC0292Ea {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SharedPreferences$OnSharedPreferenceChangeListenerC2198t f5685a;

    C2267u(SharedPreferences$OnSharedPreferenceChangeListenerC2198t tVar) {
        this.f5685a = tVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0292Ea
    public final Boolean a(String str, boolean z) {
        return Boolean.valueOf(this.f5685a.e.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0292Ea
    public final Double a(String str, double d) {
        return Double.valueOf((double) this.f5685a.e.getFloat(str, (float) d));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0292Ea
    public final String a(String str, String str2) {
        return this.f5685a.e.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0292Ea
    public final Long getLong(String str, long j) {
        try {
            return Long.valueOf(this.f5685a.e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f5685a.e.getInt(str, (int) j));
        }
    }
}
