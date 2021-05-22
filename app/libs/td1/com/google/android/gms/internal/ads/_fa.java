package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class _fa extends AbstractCallableC1137dga {
    public _fa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        super(nfa, str, str2, aVar, i, 48);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        C1511jB.a aVar;
        EnumC2135sF sFVar;
        this.e.a(EnumC2135sF.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f.invoke(null, this.f4125b.a())).booleanValue();
        synchronized (this.e) {
            if (booleanValue) {
                aVar = this.e;
                sFVar = EnumC2135sF.ENUM_TRUE;
            } else {
                aVar = this.e;
                sFVar = EnumC2135sF.ENUM_FALSE;
            }
            aVar.a(sFVar);
        }
    }
}
