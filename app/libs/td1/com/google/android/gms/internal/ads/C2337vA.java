package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vA  reason: case insensitive filesystem */
public final /* synthetic */ class C2337vA implements AbstractC0268Dc {

    /* renamed from: a  reason: collision with root package name */
    private final View$OnClickListenerC2406wA f5779a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0657Sb f5780b;

    C2337vA(View$OnClickListenerC2406wA wAVar, AbstractC0657Sb sb) {
        this.f5779a = wAVar;
        this.f5780b = sb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map map) {
        View$OnClickListenerC2406wA wAVar = this.f5779a;
        AbstractC0657Sb sb = this.f5780b;
        try {
            wAVar.f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            C0745Vl.b("Failed to call parse unconfirmedClickTimestamp.");
        }
        wAVar.e = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (sb == null) {
            C0745Vl.a("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            sb.t(str);
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }
}
