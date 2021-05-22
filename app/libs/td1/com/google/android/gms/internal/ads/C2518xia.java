package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.xia  reason: case insensitive filesystem */
public final class C2518xia implements Pha {

    /* renamed from: a  reason: collision with root package name */
    private static final Qha f6007a = new Aia();

    /* renamed from: b  reason: collision with root package name */
    private static final int f6008b = Jka.d("seig");

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f6009c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private int A;
    private int B;
    private boolean C;
    private Rha D;
    private Xha E;
    private Xha[] F;
    private boolean G;
    private final int d;
    private final Iia e;
    private final SparseArray<Cia> f;
    private final Dka g;
    private final Dka h;
    private final Dka i;
    private final Dka j;
    private final Hka k;
    private final Dka l;
    private final byte[] m;
    private final Stack<C1622kia> n;
    private final LinkedList<C2656zia> o;
    private int p;
    private int q;
    private long r;
    private int s;
    private Dka t;
    private long u;
    private int v;
    private long w;
    private long x;
    private Cia y;
    private int z;

    public C2518xia() {
        this(0);
    }

    private C2518xia(int i2) {
        this(0, null);
    }

    private C2518xia(int i2, Hka hka) {
        this(0, null, null);
    }

    private C2518xia(int i2, Hka hka, Iia iia) {
        this.d = i2;
        this.k = null;
        this.e = null;
        this.l = new Dka(16);
        this.g = new Dka(Cka.f1722a);
        this.h = new Dka(5);
        this.i = new Dka();
        this.j = new Dka(1);
        this.m = new byte[16];
        this.n = new Stack<>();
        this.o = new LinkedList<>();
        this.f = new SparseArray<>();
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.Dha a(java.util.List<com.google.android.gms.internal.ads.C1829nia> r14) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2518xia.a(java.util.List):com.google.android.gms.internal.ads.Dha");
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0650  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(long r55) {
        /*
        // Method dump skipped, instructions count: 1782
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2518xia.a(long):void");
    }

    private static void a(Dka dka, int i2, Kia kia) {
        dka.c(i2 + 8);
        int b2 = C1691lia.b(dka.d());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int o2 = dka.o();
            int i3 = kia.f;
            if (o2 == i3) {
                Arrays.fill(kia.n, 0, o2, z2);
                kia.a(dka.j());
                dka.a(kia.q.f1807a, 0, kia.p);
                kia.q.c(0);
                kia.r = false;
                return;
            }
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(o2);
            sb.append(", ");
            sb.append(i3);
            throw new Kga(sb.toString());
        }
        throw new Kga("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void b() {
        this.p = 0;
        this.s = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:257:0x026e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0004 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Pha
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.Oha r26, com.google.android.gms.internal.ads.Wha r27) {
        /*
        // Method dump skipped, instructions count: 1487
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2518xia.a(com.google.android.gms.internal.ads.Oha, com.google.android.gms.internal.ads.Wha):int");
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a(long j2, long j3) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.valueAt(i2).a();
        }
        this.o.clear();
        this.v = 0;
        this.n.clear();
        b();
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a(Rha rha) {
        this.D = rha;
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final boolean a(Oha oha) {
        return Fia.a(oha);
    }
}
