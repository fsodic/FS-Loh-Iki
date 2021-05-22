package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class HN implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final String f2124a;

    HN(String str) {
        this.f2124a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        String valueOf = String.valueOf(this.f2124a);
        C0745Vl.b(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
        return null;
    }
}
