package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fB  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC1236fB implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1099dB f4270a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f4271b;

    /* renamed from: c  reason: collision with root package name */
    private final SW f4272c;
    private final SW d;
    private final SW e;
    private final SW f;
    private final JSONObject g;
    private final SW h;
    private final SW i;
    private final SW j;

    CallableC1236fB(C1099dB dBVar, SW sw, SW sw2, SW sw3, SW sw4, SW sw5, JSONObject jSONObject, SW sw6, SW sw7, SW sw8) {
        this.f4270a = dBVar;
        this.f4271b = sw;
        this.f4272c = sw2;
        this.d = sw3;
        this.e = sw4;
        this.f = sw5;
        this.g = jSONObject;
        this.h = sw6;
        this.i = sw7;
        this.j = sw8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1099dB dBVar = this.f4270a;
        SW sw = this.f4271b;
        SW sw2 = this.f4272c;
        SW sw3 = this.d;
        SW sw4 = this.e;
        SW sw5 = this.f;
        JSONObject jSONObject = this.g;
        SW sw6 = this.h;
        SW sw7 = this.i;
        SW sw8 = this.j;
        C0707Tz tz = (C0707Tz) sw.get();
        tz.a((List) sw2.get());
        tz.a((AbstractC0812Ya) sw3.get());
        tz.b((AbstractC0812Ya) sw4.get());
        tz.a((AbstractC0630Ra) sw5.get());
        tz.b(C1374hB.a(jSONObject));
        tz.a(C1374hB.b(jSONObject));
        AbstractC1564jo joVar = (AbstractC1564jo) sw6.get();
        if (joVar != null) {
            tz.a(joVar);
            tz.a(joVar.getView());
            tz.a(joVar.E());
        }
        AbstractC1564jo joVar2 = (AbstractC1564jo) sw7.get();
        if (joVar2 != null) {
            tz.b(joVar2);
        }
        for (CB cb : (List) sw8.get()) {
            int i2 = cb.f1670a;
            if (i2 == 1) {
                tz.a(cb.f1671b, cb.f1672c);
            } else if (i2 == 2) {
                tz.a(cb.f1671b, cb.d);
            }
        }
        return tz;
    }
}
