package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vba  reason: case insensitive filesystem */
final class C2366vba extends AbstractC2022qba {

    /* renamed from: b  reason: collision with root package name */
    private final C2297uba f5816b = new C2297uba();

    C2366vba() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2022qba
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a2 = this.f5816b.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable th2 : a2) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2022qba
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f5816b.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
