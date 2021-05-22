package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ao  reason: case insensitive filesystem */
public final class C0945ao extends AbstractC0565On implements AbstractC2177ska<AbstractC1213eka> {
    private String d;
    private final C0824Ym e;
    private boolean f;
    private final C0825Yn g = new C0825Yn();
    private final C0357Gn h = new C0357Gn();
    private ByteBuffer i;
    private boolean j;
    private final Object k = new Object();
    private boolean l;

    public C0945ao(AbstractC0798Xm xm, C0824Ym ym) {
        super(xm);
        this.e = ym;
    }

    private final void f() {
        int a2 = (int) this.g.a();
        int a3 = (int) this.h.a(this.i);
        int position = this.i.position();
        int round = Math.round(((float) a3) * (((float) position) / ((float) a2)));
        boolean z = round > 0;
        int e2 = C2251tn.e();
        int f2 = C2251tn.f();
        String str = this.d;
        a(str, b(str), position, a2, (long) round, (long) a3, z, e2, f2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2177ska
    public final /* bridge */ /* synthetic */ void a(AbstractC1213eka eka) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.google.android.gms.internal.ads.AbstractC2177ska
    public final /* bridge */ /* synthetic */ void a(AbstractC1213eka eka, int i2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.ads.jka] */
    @Override // com.google.android.gms.internal.ads.AbstractC2177ska
    public final /* synthetic */ void a(AbstractC1213eka eka, C1557jka jka) {
        AbstractC1213eka eka2 = eka;
        if (eka2 instanceof C1695lka) {
            this.g.a((C1695lka) eka2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r21.i.remaining() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cb, code lost:
        if (r21.f != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        r12 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        if ((r12 - r16) < r4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        f();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ed, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        r1 = r21.i.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0136, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0137, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return true;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0945ao.a(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final String b(String str) {
        String valueOf = String.valueOf(super.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void b() {
        this.f = true;
    }

    public final ByteBuffer c() {
        synchronized (this.k) {
            if (this.i != null && !this.j) {
                this.i.flip();
                this.j = true;
            }
            this.f = true;
        }
        return this.i;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.l;
    }
}
