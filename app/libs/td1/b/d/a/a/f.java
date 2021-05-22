package b.d.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.G;
import c.a.a.a.b.l;
import c.a.a.a.p.c;
import c.a.a.a.t;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;

public abstract class f implements s {

    /* renamed from: a  reason: collision with root package name */
    private String f572a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f573b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f574c;
    private boolean d;
    private URI e;
    private AbstractC0121e[] f;
    private Looper g;
    private WeakReference<Object> h;

    /* access modifiers changed from: private */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final f f575a;

        a(f fVar, Looper looper) {
            super(looper);
            this.f575a = fVar;
        }

        public void handleMessage(Message message) {
            this.f575a.a(message);
        }
    }

    public f() {
        this((Looper) null);
    }

    public f(Looper looper) {
        this.f572a = "UTF-8";
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = new WeakReference<>(null);
        this.g = looper == null ? Looper.myLooper() : looper;
        b(false);
        a(false);
    }

    public f(boolean z) {
        this.f572a = "UTF-8";
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = new WeakReference<>(null);
        a(z);
        if (!a()) {
            this.g = Looper.myLooper();
            b(false);
        }
    }

    /* access modifiers changed from: protected */
    public Message a(int i, Object obj) {
        return Message.obtain(this.f573b, i, obj);
    }

    @Override // b.d.a.a.s
    public final void a(int i) {
        b(a(5, new Object[]{Integer.valueOf(i)}));
    }

    public abstract void a(int i, AbstractC0121e[] eVarArr, byte[] bArr);

    @Override // b.d.a.a.s
    public final void a(int i, AbstractC0121e[] eVarArr, byte[] bArr, Throwable th) {
        b(a(1, new Object[]{Integer.valueOf(i), eVarArr, bArr, th}));
    }

    public void a(long j, long j2) {
        double d2;
        k kVar = d.f564a;
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Long.valueOf(j2);
        if (j2 > 0) {
            double d3 = (double) j;
            Double.isNaN(d3);
            double d4 = (double) j2;
            Double.isNaN(d4);
            d2 = ((d3 * 1.0d) / d4) * 100.0d;
        } else {
            d2 = -1.0d;
        }
        objArr[2] = Double.valueOf(d2);
        kVar.c("AsyncHttpRH", String.format("Progress %d from %d (%2.0f%%)", objArr));
    }

    /* access modifiers changed from: protected */
    public void a(Message message) {
        k kVar;
        String str;
        try {
            switch (message.what) {
                case 0:
                    Object[] objArr = (Object[]) message.obj;
                    if (objArr == null || objArr.length < 3) {
                        kVar = d.f564a;
                        str = "SUCCESS_MESSAGE didn't got enough params";
                        break;
                    } else {
                        a(((Integer) objArr[0]).intValue(), (AbstractC0121e[]) objArr[1], (byte[]) objArr[2]);
                        return;
                    }
                case 1:
                    Object[] objArr2 = (Object[]) message.obj;
                    if (objArr2 == null || objArr2.length < 4) {
                        kVar = d.f564a;
                        str = "FAILURE_MESSAGE didn't got enough params";
                        break;
                    } else {
                        b(((Integer) objArr2[0]).intValue(), (AbstractC0121e[]) objArr2[1], (byte[]) objArr2[2], (Throwable) objArr2[3]);
                        return;
                    }
                case 2:
                    i();
                    return;
                case 3:
                    h();
                    return;
                case 4:
                    Object[] objArr3 = (Object[]) message.obj;
                    if (objArr3 == null || objArr3.length < 2) {
                        kVar = d.f564a;
                        str = "PROGRESS_MESSAGE didn't got enough params";
                        break;
                    } else {
                        try {
                            a(((Long) objArr3[0]).longValue(), ((Long) objArr3[1]).longValue());
                            return;
                        } catch (Throwable th) {
                            d.f564a.b("AsyncHttpRH", "custom onProgress contains an error", th);
                            return;
                        }
                    }
                    break;
                case 5:
                    Object[] objArr4 = (Object[]) message.obj;
                    if (objArr4 == null || objArr4.length != 1) {
                        kVar = d.f564a;
                        str = "RETRY_MESSAGE didn't get enough params";
                        break;
                    } else {
                        b(((Integer) objArr4[0]).intValue());
                        return;
                    }
                    break;
                case 6:
                    g();
                    return;
                default:
                    return;
            }
            kVar.b("AsyncHttpRH", str);
        } catch (Throwable th2) {
            a(th2);
            throw null;
        }
    }

    @Override // b.d.a.a.s
    public void a(s sVar, t tVar) {
    }

    @Override // b.d.a.a.s
    public void a(t tVar) {
        if (!Thread.currentThread().isInterrupted()) {
            G statusLine = tVar.getStatusLine();
            byte[] a2 = a(tVar.getEntity());
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            if (statusLine.getStatusCode() >= 300) {
                a(statusLine.getStatusCode(), tVar.getAllHeaders(), a2, new l(statusLine.getStatusCode(), statusLine.getReasonPhrase()));
            } else {
                b(statusLine.getStatusCode(), tVar.getAllHeaders(), a2);
            }
        }
    }

    public void a(Throwable th) {
        d.f564a.b("AsyncHttpRH", "User-space exception detected!", th);
        throw new RuntimeException(th);
    }

    @Override // b.d.a.a.s
    public void a(URI uri) {
        this.e = uri;
    }

    public void a(boolean z) {
        if (z) {
            this.g = null;
            this.f573b = null;
        }
        this.d = z;
    }

    @Override // b.d.a.a.s
    public void a(AbstractC0121e[] eVarArr) {
        this.f = eVarArr;
    }

    @Override // b.d.a.a.s
    public boolean a() {
        return this.d;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public byte[] a(c.a.a.a.l lVar) {
        InputStream content;
        if (lVar == null || (content = lVar.getContent()) == null) {
            return null;
        }
        long contentLength = lVar.getContentLength();
        if (contentLength <= 2147483647L) {
            try {
                c cVar = new c(contentLength <= 0 ? 4096 : (int) contentLength);
                try {
                    byte[] bArr = new byte[4096];
                    long j = 0;
                    while (true) {
                        int read = content.read(bArr);
                        if (read == -1 || Thread.currentThread().isInterrupted()) {
                            d.a(content);
                            d.a(lVar);
                        } else {
                            j += (long) read;
                            cVar.a(bArr, 0, read);
                            b(j, contentLength <= 0 ? 1 : contentLength);
                        }
                    }
                    d.a(content);
                    d.a(lVar);
                    return cVar.g();
                } catch (Throwable th) {
                    d.a(content);
                    d.a(lVar);
                    throw th;
                }
            } catch (OutOfMemoryError unused) {
                System.gc();
                throw new IOException("File too large to fit into available memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
    }

    public void b(int i) {
        d.f564a.d("AsyncHttpRH", String.format("Request retry no. %d", Integer.valueOf(i)));
    }

    public final void b(int i, AbstractC0121e[] eVarArr, byte[] bArr) {
        b(a(0, new Object[]{Integer.valueOf(i), eVarArr, bArr}));
    }

    public abstract void b(int i, AbstractC0121e[] eVarArr, byte[] bArr, Throwable th);

    public final void b(long j, long j2) {
        b(a(4, new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
    }

    /* access modifiers changed from: protected */
    public void b(Message message) {
        if (b() || this.f573b == null) {
            a(message);
        } else if (!Thread.currentThread().isInterrupted()) {
            u.a(this.f573b != null, "handler should not be null!");
            this.f573b.sendMessage(message);
        }
    }

    @Override // b.d.a.a.s
    public void b(s sVar, t tVar) {
    }

    public void b(boolean z) {
        a aVar;
        if (!z && this.g == null) {
            z = true;
            d.f564a.a("AsyncHttpRH", "Current thread has not called Looper.prepare(). Forcing synchronous mode.");
        }
        if (z || this.f573b != null) {
            if (z && this.f573b != null) {
                aVar = null;
            }
            this.f574c = z;
        }
        aVar = new a(this, this.g);
        this.f573b = aVar;
        this.f574c = z;
    }

    @Override // b.d.a.a.s
    public boolean b() {
        return this.f574c;
    }

    @Override // b.d.a.a.s
    public final void c() {
        b(a(2, (Object) null));
    }

    @Override // b.d.a.a.s
    public final void d() {
        b(a(3, (Object) null));
    }

    @Override // b.d.a.a.s
    public final void e() {
        b(a(6, (Object) null));
    }

    public URI f() {
        return this.e;
    }

    public void g() {
        d.f564a.d("AsyncHttpRH", "Request got cancelled");
    }

    public void h() {
    }

    public void i() {
    }
}
