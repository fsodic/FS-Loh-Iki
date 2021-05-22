package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.bU  reason: case insensitive filesystem */
public final class C0980bU extends YT {

    /* renamed from: a  reason: collision with root package name */
    private String f3900a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f3901b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f3902c;

    C0980bU() {
    }

    @Override // com.google.android.gms.internal.ads.YT
    public final VT a() {
        String str = this.f3900a;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str2 = str2.concat(" clientVersion");
        }
        if (this.f3901b == null) {
            str2 = String.valueOf(str2).concat(" shouldGetAdvertisingId");
        }
        if (this.f3902c == null) {
            str2 = String.valueOf(str2).concat(" isGooglePlayServicesAvailable");
        }
        if (str2.isEmpty()) {
            return new _T(this.f3900a, this.f3901b.booleanValue(), this.f3902c.booleanValue());
        }
        String valueOf = String.valueOf(str2);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    @Override // com.google.android.gms.internal.ads.YT
    public final YT a(String str) {
        if (str != null) {
            this.f3900a = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    @Override // com.google.android.gms.internal.ads.YT
    public final YT a(boolean z) {
        this.f3901b = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.YT
    public final YT b(boolean z) {
        this.f3902c = true;
        return this;
    }
}
