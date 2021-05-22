package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

public class RX implements GX<AbstractC1947pX> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f3019a = Logger.getLogger(RX.class.getName());

    static class a implements AbstractC1947pX {

        /* renamed from: a  reason: collision with root package name */
        private final EX<AbstractC1947pX> f3020a;

        private a(EX<AbstractC1947pX> ex) {
            this.f3020a = ex;
        }

        @Override // com.google.android.gms.internal.ads.AbstractC1947pX
        public final byte[] a(byte[] bArr, byte[] bArr2) {
            return Gaa.a(this.f3020a.b().d(), this.f3020a.b().a().a(bArr, bArr2));
        }
    }

    RX() {
    }

    @Override // com.google.android.gms.internal.ads.GX
    public final Class<AbstractC1947pX> a() {
        return AbstractC1947pX.class;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.EX] */
    @Override // com.google.android.gms.internal.ads.GX
    public final /* synthetic */ AbstractC1947pX a(EX<AbstractC1947pX> ex) {
        return new a(ex);
    }
}
