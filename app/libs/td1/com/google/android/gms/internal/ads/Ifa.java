package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.c.a;
import com.google.android.gms.internal.ads.C1511jB;
import java.io.IOException;

public final class Ifa extends AbstractCallableC1137dga {
    public Ifa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        super(nfa, str, str2, aVar, i, 24);
    }

    private final void c() {
        a o = this.f4125b.o();
        if (o != null) {
            try {
                a.C0023a b2 = o.b();
                String a2 = C2512xfa.a(b2.a());
                if (a2 != null) {
                    synchronized (this.e) {
                        this.e.b(a2);
                        this.e.a(b2.b());
                        this.e.a(C1511jB.c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        if (this.f4125b.i()) {
            c();
            return;
        }
        synchronized (this.e) {
            this.e.b((String) this.f.invoke(null, this.f4125b.a()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    /* renamed from: b */
    public final Void call() {
        if (this.f4125b.b()) {
            return super.call();
        }
        if (!this.f4125b.i()) {
            return null;
        }
        c();
        return null;
    }
}
