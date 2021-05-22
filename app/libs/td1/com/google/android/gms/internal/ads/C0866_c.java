package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads._c  reason: case insensitive filesystem */
final class C0866_c implements AbstractC2221tW<AbstractC0736Vc, ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0580Pc f3730a;

    C0866_c(C0788Xc xc, C0580Pc pc) {
        this.f3730a = pc;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.SW' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final /* synthetic */ SW<ParcelFileDescriptor> b(AbstractC0736Vc vc) {
        C1423hm hmVar = new C1423hm();
        vc.a(this.f3730a, new BinderC0840Zc(this, hmVar));
        return hmVar;
    }
}
