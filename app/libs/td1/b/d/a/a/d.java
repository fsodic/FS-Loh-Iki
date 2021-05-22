package b.d.a.a;

import android.content.Context;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.b.c.j;
import c.a.a.a.e.a.c;
import c.a.a.a.e.c.i;
import c.a.a.a.g.f;
import c.a.a.a.i.b.k;
import c.a.a.a.l;
import c.a.a.a.l.b;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import c.a.a.a.n.p;
import c.a.a.a.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static k f564a = new j();

    /* renamed from: b  reason: collision with root package name */
    private final k f565b;

    /* renamed from: c  reason: collision with root package name */
    private final e f566c;
    private final Map<Context, List<q>> d;
    private final Map<String, String> e;
    private int f;
    private int g;
    private int h;
    private ExecutorService i;
    private boolean j;

    /* access modifiers changed from: private */
    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        InputStream f567b;

        /* renamed from: c  reason: collision with root package name */
        PushbackInputStream f568c;
        GZIPInputStream d;

        public a(l lVar) {
            super(lVar);
        }

        @Override // c.a.a.a.g.f, c.a.a.a.l
        public void consumeContent() {
            d.a(this.f567b);
            d.a((InputStream) this.f568c);
            d.a(this.d);
            super.consumeContent();
        }

        @Override // c.a.a.a.g.f, c.a.a.a.l
        public InputStream getContent() {
            this.f567b = this.f718a.getContent();
            this.f568c = new PushbackInputStream(this.f567b, 2);
            if (!d.a(this.f568c)) {
                return this.f568c;
            }
            this.d = new GZIPInputStream(this.f568c);
            return this.d;
        }

        @Override // c.a.a.a.g.f, c.a.a.a.l
        public long getContentLength() {
            l lVar = this.f718a;
            if (lVar == null) {
                return 0;
            }
            return lVar.getContentLength();
        }
    }

    public d() {
        this(false, 80, 443);
    }

    public d(i iVar) {
        this.f = 10;
        this.g = 10000;
        this.h = 10000;
        boolean z = true;
        this.j = true;
        b bVar = new b();
        c.a(bVar, (long) this.g);
        c.a(bVar, new c.a.a.a.e.a.e(this.f));
        c.a((g) bVar, 10);
        c.a.a.a.l.e.b(bVar, this.h);
        c.a.a.a.l.e.a(bVar, this.g);
        c.a.a.a.l.e.a((g) bVar, true);
        c.a.a.a.l.e.c(bVar, 8192);
        c.a.a.a.l.i.a(bVar, w.f);
        c.a.a.a.e.b a2 = a(iVar, bVar);
        u.a(a2 == null ? false : z, "Custom implementation of #createConnectionManager(SchemeRegistry, BasicHttpParams) returned null");
        this.i = a();
        this.d = Collections.synchronizedMap(new WeakHashMap());
        this.e = new HashMap();
        this.f566c = new p(new c.a.a.a.n.a());
        this.f565b = new k(a2, bVar);
        this.f565b.a(new a(this));
        this.f565b.a(new b(this));
        this.f565b.a(new c(this), 0);
        this.f565b.a(new t(5, 1500));
    }

    public d(boolean z, int i2, int i3) {
        this(a(z, i2, i3));
    }

    private static i a(boolean z, int i2, int i3) {
        if (z) {
            f564a.d("AsyncHttpClient", "Beware! Using the fix is insecure, as it doesn't verify SSL certificates.");
        }
        if (i2 < 1) {
            i2 = 80;
            f564a.d("AsyncHttpClient", "Invalid HTTP port number specified, defaulting to 80");
        }
        if (i3 < 1) {
            i3 = 443;
            f564a.d("AsyncHttpClient", "Invalid HTTPS port number specified, defaulting to 443");
        }
        c.a.a.a.e.e.i b2 = z ? n.b() : c.a.a.a.e.e.i.a();
        i iVar = new i();
        iVar.a(new c.a.a.a.e.c.e("http", c.a.a.a.e.c.d.a(), i2));
        iVar.a(new c.a.a.a.e.c.e("https", b2, i3));
        return iVar;
    }

    public static String a(boolean z, String str, r rVar) {
        if (str == null) {
            return null;
        }
        if (z) {
            try {
                URL url = new URL(URLDecoder.decode(str, "UTF-8"));
                str = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
            } catch (Exception e2) {
                f564a.b("AsyncHttpClient", "getUrlWithQueryString encoding URL", e2);
            }
        }
        if (rVar == null) {
            return str;
        }
        rVar.a();
        throw null;
    }

    public static void a(l lVar) {
        if (lVar instanceof f) {
            Field field = null;
            try {
                Field[] declaredFields = f.class.getDeclaredFields();
                int length = declaredFields.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Field field2 = declaredFields[i2];
                    if (field2.getName().equals("wrappedEntity")) {
                        field = field2;
                        break;
                    }
                    i2++;
                }
                if (field != null) {
                    field.setAccessible(true);
                    l lVar2 = (l) field.get(lVar);
                    if (lVar2 != null) {
                        lVar2.consumeContent();
                    }
                }
            } catch (Throwable th) {
                f564a.b("AsyncHttpClient", "wrappedEntity consume", th);
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                f564a.a("AsyncHttpClient", "Cannot close input stream", e2);
            }
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                f564a.a("AsyncHttpClient", "Cannot close output stream", e2);
            }
        }
    }

    public static void a(Class<?> cls) {
        if (cls != null) {
            t.a(cls);
        }
    }

    public static boolean a(PushbackInputStream pushbackInputStream) {
        if (pushbackInputStream == null) {
            return false;
        }
        byte[] bArr = new byte[2];
        int i2 = 0;
        while (i2 < 2) {
            try {
                int read = pushbackInputStream.read(bArr, i2, 2 - i2);
                if (read < 0) {
                    return false;
                }
                i2 += read;
            } finally {
                pushbackInputStream.unread(bArr, 0, i2);
            }
        }
        pushbackInputStream.unread(bArr, 0, i2);
        return 35615 == ((bArr[0] & 255) | ((bArr[1] << 8) & 65280));
    }

    /* access modifiers changed from: protected */
    public e a(k kVar, e eVar, c.a.a.a.b.c.l lVar, String str, s sVar, Context context) {
        return new e(kVar, eVar, lVar, sVar);
    }

    public q a(Context context, String str, r rVar, s sVar) {
        return b(this.f565b, this.f566c, new i(a(this.j, str, rVar)), null, sVar, context);
    }

    public q a(Context context, String str, s sVar) {
        return a(context, str, null, sVar);
    }

    public q a(Context context, String str, AbstractC0121e[] eVarArr, r rVar, s sVar) {
        i iVar = new i(a(this.j, str, rVar));
        if (eVarArr != null) {
            iVar.a(eVarArr);
        }
        return b(this.f565b, this.f566c, iVar, null, sVar, context);
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.e.b a(i iVar, b bVar) {
        return new c.a.a.a.i.c.a.i(bVar, iVar);
    }

    /* access modifiers changed from: protected */
    public ExecutorService a() {
        return Executors.newCachedThreadPool();
    }

    public void a(int i2) {
        if (i2 < 1000) {
            i2 = 10000;
        }
        this.g = i2;
        g B = this.f565b.B();
        c.a(B, (long) this.g);
        c.a.a.a.l.e.a(B, this.g);
    }

    public void a(boolean z) {
        a(z, z, z);
    }

    public void a(boolean z, boolean z2, boolean z3) {
        this.f565b.B().setBooleanParameter("http.protocol.reject-relative-redirect", !z2);
        this.f565b.B().setBooleanParameter("http.protocol.allow-circular-redirects", z3);
        this.f565b.a(new l(z));
    }

    public q b(Context context, String str, AbstractC0121e[] eVarArr, r rVar, s sVar) {
        j jVar = new j(a(this.j, str, rVar));
        if (eVarArr != null) {
            jVar.a(eVarArr);
        }
        return b(this.f565b, this.f566c, jVar, null, sVar, context);
    }

    /* access modifiers changed from: protected */
    public q b(k kVar, e eVar, c.a.a.a.b.c.l lVar, String str, s sVar, Context context) {
        List<q> list;
        if (lVar == null) {
            throw new IllegalArgumentException("HttpUriRequest must not be null");
        } else if (sVar == null) {
            throw new IllegalArgumentException("ResponseHandler must not be null");
        } else if (!sVar.b() || sVar.a()) {
            if (str != null) {
                if (!(lVar instanceof c.a.a.a.b.c.g) || ((c.a.a.a.b.c.g) lVar).getEntity() == null || !lVar.containsHeader("Content-Type")) {
                    lVar.setHeader("Content-Type", str);
                } else {
                    f564a.a("AsyncHttpClient", "Passed contentType will be ignored because HttpEntity sets content type");
                }
            }
            sVar.a(lVar.getAllHeaders());
            sVar.a(lVar.getURI());
            e a2 = a(kVar, eVar, lVar, str, sVar, context);
            this.i.submit(a2);
            q qVar = new q(a2);
            if (context != null) {
                synchronized (this.d) {
                    list = this.d.get(context);
                    if (list == null) {
                        list = Collections.synchronizedList(new LinkedList());
                        this.d.put(context, list);
                    }
                }
                list.add(qVar);
                Iterator<q> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().c()) {
                        it.remove();
                    }
                }
            }
            return qVar;
        } else {
            throw new IllegalArgumentException("Synchronous ResponseHandler used in AsyncHttpClient. You should create your response handler in a looper thread or use SyncHttpClient instead.");
        }
    }

    public void b(int i2) {
        if (i2 < 1000) {
            i2 = 10000;
        }
        this.h = i2;
        c.a.a.a.l.e.b(this.f565b.B(), this.h);
    }

    public void b(boolean z) {
        this.j = z;
    }

    public void c(int i2) {
        if (i2 < 1000) {
            i2 = 10000;
        }
        a(i2);
        b(i2);
    }
}
