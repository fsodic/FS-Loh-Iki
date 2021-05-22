package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class EG implements GW<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC0559Oh f1847a;

    EG(BinderC2067rG rGVar, AbstractC0559Oh oh) {
        this.f1847a = oh;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f1847a.a(parcelFileDescriptor);
        } catch (RemoteException e) {
            C1763mk.e("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        try {
            this.f1847a.a(C0939al.a(th));
        } catch (RemoteException e) {
            C1763mk.e("Service can't call client", e);
        }
    }
}
