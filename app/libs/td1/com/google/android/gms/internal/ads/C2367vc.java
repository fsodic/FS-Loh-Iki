package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.c;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vc  reason: case insensitive filesystem */
final class C2367vc implements AbstractC0268Dc<AbstractC1564jo> {
    C2367vc() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        AbstractC1564jo joVar2 = joVar;
        if (joVar2.i() != null) {
            joVar2.i().Sb();
        }
        c y = joVar2.y();
        if (y != null) {
            y.Wb();
            return;
        }
        c B = joVar2.B();
        if (B != null) {
            B.Wb();
        } else {
            C0745Vl.d("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
