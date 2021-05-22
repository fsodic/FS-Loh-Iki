package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.iL  reason: case insensitive filesystem */
final class C1453iL implements GW<Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1688lh f4556a;

    C1453iL(XK xk, AbstractC1688lh lhVar) {
        this.f4556a = lhVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(Uri uri) {
        try {
            this.f4556a.a(Collections.singletonList(uri));
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        try {
            AbstractC1688lh lhVar = this.f4556a;
            String valueOf = String.valueOf(th.getMessage());
            lhVar.d(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }
}
