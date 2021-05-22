package c.a.a.a.b.a;

import c.a.a.a.o;
import java.net.InetAddress;
import java.util.Collection;

public class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static final a f613a = new C0021a().a();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f614b;

    /* renamed from: c  reason: collision with root package name */
    private final o f615c;
    private final InetAddress d;
    private final boolean e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final Collection<String> l;
    private final Collection<String> m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;

    /* renamed from: c.a.a.a.b.a.a$a  reason: collision with other inner class name */
    public static class C0021a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f616a;

        /* renamed from: b  reason: collision with root package name */
        private o f617b;

        /* renamed from: c  reason: collision with root package name */
        private InetAddress f618c;
        private boolean d = false;
        private String e;
        private boolean f = true;
        private boolean g = true;
        private boolean h;
        private int i = 50;
        private boolean j = true;
        private Collection<String> k;
        private Collection<String> l;
        private int m = -1;
        private int n = -1;
        private int o = -1;
        private boolean p = true;

        C0021a() {
        }

        public C0021a a(int i2) {
            this.n = i2;
            return this;
        }

        public C0021a a(o oVar) {
            this.f617b = oVar;
            return this;
        }

        public C0021a a(String str) {
            this.e = str;
            return this;
        }

        public C0021a a(InetAddress inetAddress) {
            this.f618c = inetAddress;
            return this;
        }

        public C0021a a(Collection<String> collection) {
            this.l = collection;
            return this;
        }

        public C0021a a(boolean z) {
            this.j = z;
            return this;
        }

        public a a() {
            return new a(this.f616a, this.f617b, this.f618c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        }

        public C0021a b(int i2) {
            this.m = i2;
            return this;
        }

        public C0021a b(Collection<String> collection) {
            this.k = collection;
            return this;
        }

        public C0021a b(boolean z) {
            this.h = z;
            return this;
        }

        public C0021a c(int i2) {
            this.i = i2;
            return this;
        }

        public C0021a c(boolean z) {
            this.f616a = z;
            return this;
        }

        public C0021a d(int i2) {
            this.o = i2;
            return this;
        }

        public C0021a d(boolean z) {
            this.f = z;
            return this;
        }

        public C0021a e(boolean z) {
            this.g = z;
            return this;
        }

        @Deprecated
        public C0021a f(boolean z) {
            this.d = z;
            return this;
        }
    }

    a(boolean z, o oVar, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i2, boolean z6, Collection<String> collection, Collection<String> collection2, int i3, int i4, int i5, boolean z7) {
        this.f614b = z;
        this.f615c = oVar;
        this.d = inetAddress;
        this.e = z2;
        this.f = str;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i2;
        this.k = z6;
        this.l = collection;
        this.m = collection2;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = z7;
    }

    public static C0021a c() {
        return new C0021a();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public a clone() {
        return (a) super.clone();
    }

    public String d() {
        return this.f;
    }

    public Collection<String> e() {
        return this.m;
    }

    public Collection<String> f() {
        return this.l;
    }

    public boolean g() {
        return this.i;
    }

    public boolean h() {
        return this.h;
    }

    public String toString() {
        return "[" + "expectContinueEnabled=" + this.f614b + ", proxy=" + this.f615c + ", localAddress=" + this.d + ", cookieSpec=" + this.f + ", redirectsEnabled=" + this.g + ", relativeRedirectsAllowed=" + this.h + ", maxRedirects=" + this.j + ", circularRedirectsAllowed=" + this.i + ", authenticationEnabled=" + this.k + ", targetPreferredAuthSchemes=" + this.l + ", proxyPreferredAuthSchemes=" + this.m + ", connectionRequestTimeout=" + this.n + ", connectTimeout=" + this.o + ", socketTimeout=" + this.p + ", decompressionEnabled=" + this.q + "]";
    }
}
