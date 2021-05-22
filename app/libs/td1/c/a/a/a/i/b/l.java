package c.a.a.a.i.b;

import c.a.a.a.b.k;
import c.a.a.a.m;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.r;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;

public class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final l f769a = new l();

    /* renamed from: b  reason: collision with root package name */
    private final int f770b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f771c;
    private final Set<Class<? extends IOException>> d;

    public l() {
        this(3, false);
    }

    public l(int i, boolean z) {
        this(i, z, Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class));
    }

    protected l(int i, boolean z, Collection<Class<? extends IOException>> collection) {
        this.f770b = i;
        this.f771c = z;
        this.d = new HashSet();
        for (Class<? extends IOException> cls : collection) {
            this.d.add(cls);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(r rVar) {
        return !(rVar instanceof m);
    }

    @Override // c.a.a.a.b.k
    public boolean a(IOException iOException, int i, e eVar) {
        a.a(iOException, "Exception parameter");
        a.a(eVar, "HTTP context");
        if (i > this.f770b || this.d.contains(iOException.getClass())) {
            return false;
        }
        for (Class<? extends IOException> cls : this.d) {
            if (cls.isInstance(iOException)) {
                return false;
            }
        }
        c.a.a.a.b.e.a a2 = c.a.a.a.b.e.a.a(eVar);
        r b2 = a2.b();
        if (b(b2)) {
            return false;
        }
        return a(b2) || !a2.d() || this.f771c;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean b(r rVar) {
        if (rVar instanceof v) {
            rVar = ((v) rVar).e();
        }
        return (rVar instanceof c.a.a.a.b.c.l) && ((c.a.a.a.b.c.l) rVar).isAborted();
    }
}
