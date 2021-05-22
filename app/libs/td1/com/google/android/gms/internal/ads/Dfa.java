package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.internal.ads.C1511jB;
import java.lang.reflect.InvocationTargetException;

public final class Dfa extends AbstractCallableC1137dga {
    public Dfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        super(nfa, str, str2, aVar, i, 49);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        this.e.b(EnumC2135sF.ENUM_FAILURE);
        try {
            this.e.b(((Boolean) this.f.invoke(null, new Object[]{this.f4125b.a()})).booleanValue() ? EnumC2135sF.ENUM_TRUE : EnumC2135sF.ENUM_FALSE);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
