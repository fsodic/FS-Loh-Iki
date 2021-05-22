package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;
import java.lang.reflect.InvocationTargetException;

public final class Qfa extends AbstractCallableC1137dga {
    public Qfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        super(nfa, str, str2, aVar, i, 73);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        try {
            this.e.d(((Boolean) this.f.invoke(null, new Object[]{this.f4125b.a()})).booleanValue() ? EnumC2135sF.ENUM_TRUE : EnumC2135sF.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.e.d(EnumC2135sF.ENUM_FAILURE);
        }
    }
}
