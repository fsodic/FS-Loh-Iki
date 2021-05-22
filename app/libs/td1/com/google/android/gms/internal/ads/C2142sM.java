package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.internal.ads.sM  reason: case insensitive filesystem */
public final class C2142sM implements AbstractC1180eO<C1936pM> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f5505a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5506b;

    public C2142sM(VW vw, Context context) {
        this.f5505a = vw;
        this.f5506b = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C1936pM> a() {
        return this.f5505a.a(new CallableC2073rM(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1936pM b() {
        double d;
        Intent registerReceiver = this.f5506b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = (double) registerReceiver.getIntExtra("level", -1);
            double intExtra3 = (double) registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new C1936pM(d, z);
    }
}
