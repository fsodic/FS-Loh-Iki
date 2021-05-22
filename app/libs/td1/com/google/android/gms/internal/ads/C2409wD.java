package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C0944ana;
import com.google.android.gms.internal.ads.Oma;
import com.google.android.gms.internal.ads.Zma;

/* renamed from: com.google.android.gms.internal.ads.wD  reason: case insensitive filesystem */
final /* synthetic */ class C2409wD implements Gma {

    /* renamed from: a  reason: collision with root package name */
    private final Oma.a f5867a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5868b;

    /* renamed from: c  reason: collision with root package name */
    private final C1770mna f5869c;
    private final String d;

    C2409wD(Oma.a aVar, String str, C1770mna mna, String str2) {
        this.f5867a = aVar;
        this.f5868b = str;
        this.f5869c = mna;
        this.d = str2;
    }

    @Override // com.google.android.gms.internal.ads.Gma
    public final void a(C0944ana.a aVar) {
        Oma.a aVar2 = this.f5867a;
        String str = this.f5868b;
        C1770mna mna = this.f5869c;
        String str2 = this.d;
        Oma.b bVar = (Oma.b) aVar.m().j();
        bVar.a(aVar2);
        aVar.a(bVar);
        Zma.a aVar3 = (Zma.a) aVar.l().j();
        aVar3.a(str);
        aVar3.a(mna);
        aVar.a(aVar3);
        aVar.a(str2);
    }
}
