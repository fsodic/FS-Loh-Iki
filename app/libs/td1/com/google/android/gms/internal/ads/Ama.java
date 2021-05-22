package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

final /* synthetic */ class Ama implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2526xma f1556a;

    /* renamed from: b  reason: collision with root package name */
    private final C1975pma f1557b;

    /* renamed from: c  reason: collision with root package name */
    private final C1906oma f1558c;
    private final C1423hm d;

    Ama(C2526xma xma, C1975pma pma, C1906oma oma, C1423hm hmVar) {
        this.f1556a = xma;
        this.f1557b = pma;
        this.f1558c = oma;
        this.d = hmVar;
    }

    public final void run() {
        C2526xma xma = this.f1556a;
        C1975pma pma = this.f1557b;
        C1906oma oma = this.f1558c;
        C1423hm hmVar = this.d;
        try {
            C1837nma a2 = pma.z().a(oma);
            if (!a2.L()) {
                hmVar.a(new RuntimeException("No entry contents."));
                xma.f6024c.a();
                return;
            }
            Cma cma = new Cma(xma, a2.M(), 1);
            int read = cma.read();
            if (read != -1) {
                cma.unread(read);
                hmVar.b(cma);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            C0745Vl.b("Unable to obtain a cache service instance.", e);
            hmVar.a(e);
            xma.f6024c.a();
        }
    }
}
