package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Wfa extends AbstractCallableC1137dga {
    private final StackTraceElement[] i;

    public Wfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(nfa, str, str2, aVar, i2, 45);
        this.i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.i;
        if (stackTraceElementArr != null) {
            C1547jfa jfa = new C1547jfa((String) this.f.invoke(null, stackTraceElementArr));
            synchronized (this.e) {
                this.e.b(jfa.f4700b.longValue());
                if (jfa.f4701c.booleanValue()) {
                    this.e.c(jfa.d.booleanValue() ? EnumC2135sF.ENUM_FALSE : EnumC2135sF.ENUM_TRUE);
                } else {
                    this.e.c(EnumC2135sF.ENUM_FAILURE);
                }
            }
        }
    }
}
