package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

public final class VF extends AbstractBinderC0533Nh {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ RF f3319a;

    protected VF(RF rf) {
        this.f3319a = rf;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0559Oh
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f3319a.f2993a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0559Oh
    public final void a(C0939al alVar) {
        this.f3319a.f2993a.a(new C0874_k(alVar.f3837a, alVar.f3838b));
    }
}
