package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;

public final class CM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Location f1685a;

    public CM(Location location) {
        this.f1685a = location;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f1685a != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", this.f1685a.getAccuracy() * 1000.0f);
            bundle3.putLong("lat", (long) (this.f1685a.getLatitude() * 1.0E7d));
            bundle3.putLong("long", (long) (this.f1685a.getLongitude() * 1.0E7d));
            bundle3.putLong("time", this.f1685a.getTime() * 1000);
            bundle2.putBundle("uule", bundle3);
        }
    }
}
