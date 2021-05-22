package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public class NY implements GX<CX> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f2671a = Logger.getLogger(NY.class.getName());

    static class a implements CX {

        /* renamed from: a  reason: collision with root package name */
        private final EX<CX> f2672a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f2673b;

        private a(EX<CX> ex) {
            this.f2673b = new byte[]{0};
            this.f2672a = ex;
        }

        @Override // com.google.android.gms.internal.ads.CX
        public final byte[] a(byte[] bArr) {
            byte[][] bArr2;
            if (this.f2672a.b().c().equals(EnumC1951paa.LEGACY)) {
                bArr2 = new byte[][]{this.f2672a.b().d(), this.f2672a.b().a().a(Gaa.a(bArr, this.f2673b))};
            } else {
                bArr2 = new byte[][]{this.f2672a.b().d(), this.f2672a.b().a().a(bArr)};
            }
            return Gaa.a(bArr2);
        }
    }

    NY() {
    }

    @Override // com.google.android.gms.internal.ads.GX
    public final Class<CX> a() {
        return CX.class;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.EX] */
    @Override // com.google.android.gms.internal.ads.GX
    public final /* synthetic */ CX a(EX<CX> ex) {
        return new a(ex);
    }
}
