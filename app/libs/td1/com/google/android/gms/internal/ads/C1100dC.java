package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dC  reason: case insensitive filesystem */
public final class C1100dC implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0241Cb f4050a;

    /* renamed from: b  reason: collision with root package name */
    private final C1306gC f4051b;

    /* renamed from: c  reason: collision with root package name */
    private final Lea<BinderC0893aC> f4052c;

    public C1100dC(C1098dA dAVar, C0707Tz tz, C1306gC gCVar, Lea<BinderC0893aC> lea) {
        this.f4050a = dAVar.b(tz.e());
        this.f4051b = gCVar;
        this.f4052c = lea;
    }

    public final void a() {
        if (this.f4050a != null) {
            this.f4051b.a("/nativeAdCustomClick", this);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f4050a.a(this.f4052c.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            C0745Vl.c(sb.toString(), e);
        }
    }
}
