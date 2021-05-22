package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C1357gna;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fH  reason: case insensitive filesystem */
public final class C1242fH implements GW<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f4278a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C1036cH f4279b;

    C1242fH(C1036cH cHVar, boolean z) {
        this.f4279b = cHVar;
        this.f4278a = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        C1036cH cHVar = this.f4279b;
        ArrayList arrayList = C1036cH.c(bundle2);
        C1036cH cHVar2 = this.f4279b;
        C1357gna.c cVar = C1036cH.b(bundle2);
        this.f4279b.f.a(new C1173eH(this, this.f4278a, arrayList, this.f4279b.a(bundle2), cVar));
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        C0745Vl.b("Failed to get signals bundle");
    }
}
