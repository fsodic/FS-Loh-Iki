package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.q;

final /* synthetic */ class PH implements AbstractC0732Uy {

    /* renamed from: a  reason: collision with root package name */
    private final C1423hm f2811a;

    PH(C1423hm hmVar) {
        this.f2811a = hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0732Uy
    public final void a(boolean z, Context context) {
        C1423hm hmVar = this.f2811a;
        try {
            q.b();
            n.a(context, (AdOverlayInfoParcel) hmVar.get(), true);
        } catch (Exception unused) {
        }
    }
}
