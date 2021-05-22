package b.d.a.a;

import c.a.a.a.b.c.l;
import c.a.a.a.b.k;
import c.a.a.a.i.b.a;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f569a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.a.n.e f570b;

    /* renamed from: c  reason: collision with root package name */
    private final l f571c;
    private final s d;
    private final AtomicBoolean e = new AtomicBoolean();
    private int f;
    private boolean g;
    private volatile boolean h;
    private boolean i;

    public e(a aVar, c.a.a.a.n.e eVar, l lVar, s sVar) {
        u.a(aVar, "client");
        this.f569a = aVar;
        u.a(eVar, "context");
        this.f570b = eVar;
        u.a(lVar, "request");
        this.f571c = lVar;
        u.a(sVar, "responseHandler");
        this.d = sVar;
    }

    private void c() {
        if (!a()) {
            if (this.f571c.getURI().getScheme() != null) {
                s sVar = this.d;
                if (sVar instanceof o) {
                    ((o) sVar).a(this.f571c);
                }
                c.a.a.a.b.c.e a2 = this.f569a.a(this.f571c, this.f570b);
                if (!a()) {
                    s sVar2 = this.d;
                    sVar2.b(sVar2, a2);
                    if (!a()) {
                        this.d.a(a2);
                        if (!a()) {
                            s sVar3 = this.d;
                            sVar3.a(sVar3, a2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new MalformedURLException("No valid URI scheme was provided");
        }
    }

    private void d() {
        k A = this.f569a.A();
        IOException iOException = null;
        boolean z = true;
        while (z) {
            try {
                c();
                return;
            } catch (UnknownHostException e2) {
                iOException = new IOException("UnknownHostException exception: " + e2.getMessage());
                if (this.f > 0) {
                    int i2 = this.f + 1;
                    this.f = i2;
                    if (A.a(e2, i2, this.f570b)) {
                        z = true;
                    }
                }
                z = false;
            } catch (NullPointerException e3) {
                iOException = new IOException("NPE in HttpClient: " + e3.getMessage());
                int i3 = this.f + 1;
                this.f = i3;
                z = A.a(iOException, i3, this.f570b);
            } catch (IOException e4) {
                try {
                    if (!a()) {
                        int i4 = this.f + 1;
                        this.f = i4;
                        boolean a2 = A.a(e4, i4, this.f570b);
                        iOException = e4;
                        z = a2;
                    } else {
                        return;
                    }
                } catch (Exception e5) {
                    d.f564a.b("AsyncHttpRequest", "Unhandled exception origin cause", e5);
                    throw new IOException("Unhandled exception: " + e5.getMessage());
                }
            }
        }
        throw iOException;
        if (z) {
            this.d.a(this.f);
        }
    }

    private synchronized void e() {
        if (!this.h && this.e.get() && !this.g) {
            this.g = true;
            this.d.e();
        }
    }

    public void a(e eVar) {
    }

    public boolean a() {
        boolean z = this.e.get();
        if (z) {
            e();
        }
        return z;
    }

    public boolean a(boolean z) {
        this.e.set(true);
        this.f571c.abort();
        return a();
    }

    public void b(e eVar) {
    }

    public boolean b() {
        return a() || this.h;
    }

    public void run() {
        if (!a()) {
            if (!this.i) {
                this.i = true;
                b(this);
            }
            if (!a()) {
                this.d.c();
                if (!a()) {
                    try {
                        d();
                    } catch (IOException e2) {
                        if (!a()) {
                            this.d.a(0, null, null, e2);
                        } else {
                            d.f564a.b("AsyncHttpRequest", "makeRequestWithRetries returned error", e2);
                        }
                    }
                    if (!a()) {
                        this.d.d();
                        if (!a()) {
                            a(this);
                            this.h = true;
                        }
                    }
                }
            }
        }
    }
}
