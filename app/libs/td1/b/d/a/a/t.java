package b.d.a.a;

import android.os.SystemClock;
import c.a.a.a.A;
import c.a.a.a.b.c.l;
import c.a.a.a.b.k;
import c.a.a.a.n.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;

/* access modifiers changed from: package-private */
public class t implements k {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<Class<?>> f584a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<Class<?>> f585b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final int f586c;
    private final int d;

    static {
        f584a.add(A.class);
        f584a.add(UnknownHostException.class);
        f584a.add(SocketException.class);
        f585b.add(InterruptedIOException.class);
        f585b.add(SSLException.class);
    }

    public t(int i, int i2) {
        this.f586c = i;
        this.d = i2;
    }

    static void a(Class<?> cls) {
        f584a.add(cls);
    }

    @Override // c.a.a.a.b.k
    public boolean a(IOException iOException, int i, e eVar) {
        Boolean bool = (Boolean) eVar.getAttribute("http.request_sent");
        boolean z = true;
        if (bool == null || !bool.booleanValue()) {
        }
        if (i > this.f586c || (!a(f584a, iOException) && a(f585b, iOException))) {
            z = false;
        }
        if (z && ((l) eVar.getAttribute("http.request")) == null) {
            return false;
        }
        if (z) {
            SystemClock.sleep((long) this.d);
        } else {
            iOException.printStackTrace();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean a(HashSet<Class<?>> hashSet, Throwable th) {
        Iterator<Class<?>> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(th)) {
                return true;
            }
        }
        return false;
    }
}
