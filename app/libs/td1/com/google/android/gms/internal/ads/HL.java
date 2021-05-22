package com.google.android.gms.internal.ads;

import android.os.Bundle;

final /* synthetic */ class HL implements AbstractC0905aO {

    /* renamed from: a  reason: collision with root package name */
    private final String f2122a;

    HL(String str) {
        this.f2122a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final void a(Object obj) {
        ((Bundle) obj).putString("ms", this.f2122a);
    }
}
