package com.google.android.gms.internal.ads;

public final class DS implements BS {

    /* renamed from: a  reason: collision with root package name */
    private final String f1768a;

    public DS(String str) {
        this.f1768a = str;
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final boolean equals(Object obj) {
        if (!(obj instanceof DS)) {
            return false;
        }
        return this.f1768a.equals(((DS) obj).f1768a);
    }

    @Override // com.google.android.gms.internal.ads.BS
    public final int hashCode() {
        return this.f1768a.hashCode();
    }

    public final String toString() {
        return this.f1768a;
    }
}
