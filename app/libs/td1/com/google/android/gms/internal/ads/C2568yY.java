package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.yY  reason: case insensitive filesystem */
public class C2568yY implements GX<AbstractC2222tX> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f6098a = Logger.getLogger(C2568yY.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.yY$a */
    static class a implements AbstractC2222tX {

        /* renamed from: a  reason: collision with root package name */
        private final EX<AbstractC2222tX> f6099a;

        public a(EX<AbstractC2222tX> ex) {
            this.f6099a = ex;
        }
    }

    C2568yY() {
    }

    @Override // com.google.android.gms.internal.ads.GX
    public final Class<AbstractC2222tX> a() {
        return AbstractC2222tX.class;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.EX] */
    @Override // com.google.android.gms.internal.ads.GX
    public final /* synthetic */ AbstractC2222tX a(EX<AbstractC2222tX> ex) {
        return new a(ex);
    }
}
