package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* renamed from: com.google.android.gms.internal.ads.xba  reason: case insensitive filesystem */
final class C2504xba extends AbstractC2022qba {
    C2504xba() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2022qba
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2022qba
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
