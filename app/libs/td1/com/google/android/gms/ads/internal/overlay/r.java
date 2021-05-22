package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C1763mk;

public final class r extends c {
    public r(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg, com.google.android.gms.ads.internal.overlay.c
    public final void j(Bundle bundle) {
        C1763mk.f("AdOverlayParcel is null or does not contain valid overlay type.");
        this.n = 3;
        this.f1100b.finish();
    }
}
