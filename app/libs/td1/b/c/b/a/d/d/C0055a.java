package b.c.b.a.d.d;

import b.c.b.a.d.d.M;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: b.c.b.a.d.d.a  reason: case insensitive filesystem */
public final class C0055a extends M<C0055a, C0015a> implements AbstractC0093ta {
    private static volatile Ba<C0055a> zzhk;
    private static final C0055a zzhp = new C0055a();
    private int zzhd;
    private int zzhe = 1;
    private long zzhg = -1;
    private byte zzhi = 2;
    private String zzhm = BuildConfig.FLAVOR;
    private long zzhn = -1;
    private int zzho = -1;

    /* renamed from: b.c.b.a.d.d.a$a  reason: collision with other inner class name */
    public static final class C0015a extends M.a<C0055a, C0015a> implements AbstractC0093ta {
        private C0015a() {
            super(C0055a.zzhp);
        }

        /* synthetic */ C0015a(C0057b bVar) {
            this();
        }

        public final C0015a a(int i) {
            g();
            ((C0055a) this.f370b).b((C0055a) 1);
            return this;
        }

        public final C0015a a(long j) {
            g();
            ((C0055a) this.f370b).b((C0055a) j);
            return this;
        }

        public final C0015a a(String str) {
            g();
            ((C0055a) this.f370b).a((C0055a) str);
            return this;
        }

        public final C0015a b(int i) {
            g();
            ((C0055a) this.f370b).c(i);
            return this;
        }

        public final C0015a b(long j) {
            g();
            ((C0055a) this.f370b).a((C0055a) j);
            return this;
        }
    }

    static {
        M.a(C0055a.class, zzhp);
    }

    private C0055a() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(long j) {
        this.zzhd |= 8;
        this.zzhg = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        if (str != null) {
            this.zzhd |= 2;
            this.zzhm = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i) {
        this.zzhd |= 1;
        this.zzhe = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(long j) {
        this.zzhd |= 4;
        this.zzhn = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i) {
        this.zzhd |= 16;
        this.zzho = i;
    }

    public static C0015a k() {
        return (C0015a) zzhp.j();
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [b.c.b.a.d.d.Ba<b.c.b.a.d.d.a>, b.c.b.a.d.d.M$b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // b.c.b.a.d.d.M
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r3, java.lang.Object r4, java.lang.Object r5) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.C0055a.a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
