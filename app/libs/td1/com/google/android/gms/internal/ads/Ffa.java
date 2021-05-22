package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1511jB;
import java.util.concurrent.ExecutionException;

public final class Ffa extends AbstractCallableC1137dga {
    private static final C1068cga<YK> i = new C1068cga<>();
    private final Context j;
    private C0289Dx k = null;

    public Ffa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3, Context context, C0289Dx dx) {
        super(nfa, str, str2, aVar, i2, 27);
        this.j = context;
        this.k = dx;
    }

    private static String a(C0289Dx dx) {
        if (dx == null || !dx.n() || C2512xfa.b(dx.o().n())) {
            return null;
        }
        return dx.o().n();
    }

    private final String c() {
        try {
            if (this.f4125b.n() != null) {
                this.f4125b.n().get();
            }
            C1511jB m = this.f4125b.m();
            if (m == null || !m.o()) {
                return null;
            }
            return m.n();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (com.google.android.gms.internal.ads.C2512xfa.b(r1) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ffa.a():void");
    }
}
