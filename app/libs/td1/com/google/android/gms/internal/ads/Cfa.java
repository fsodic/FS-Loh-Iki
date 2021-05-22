package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1511jB;
import java.util.concurrent.atomic.AtomicReference;

public final class Cfa extends AbstractCallableC1137dga {
    private static C1068cga<String> i = new C1068cga<>();
    private final Context j;

    public Cfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3, Context context) {
        super(nfa, str, str2, aVar, i2, 29);
        this.j = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        this.e.f("E");
        AtomicReference<String> a2 = i.a(this.j.getPackageName());
        if (a2.get() == null) {
            synchronized (a2) {
                if (a2.get() == null) {
                    a2.set((String) this.f.invoke(null, this.j));
                }
            }
        }
        String str = a2.get();
        synchronized (this.e) {
            this.e.f(C2415wJ.a(str.getBytes(), true));
        }
    }
}
