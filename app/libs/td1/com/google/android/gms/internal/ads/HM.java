package com.google.android.gms.internal.ads;

import android.location.Location;

final /* synthetic */ class HM implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final FM f2123a;

    HM(FM fm) {
        this.f2123a = fm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        Location location = (Location) obj;
        return location != null ? location : this.f2123a.e.d.k;
    }
}
