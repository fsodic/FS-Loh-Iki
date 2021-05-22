package com.google.android.gms.internal.ads;

import java.util.Stack;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
public final class Zha implements AbstractC1141dia {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f3658a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final Stack<C0934aia> f3659b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    private final C1484iia f3660c = new C1484iia();
    private AbstractC1072cia d;
    private int e;
    private int f;
    private long g;

    Zha() {
    }

    private final long a(Oha oha, int i) {
        oha.readFully(this.f3658a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f3658a[i2] & 255));
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141dia
    public final void a(AbstractC1072cia cia) {
        this.d = cia;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141dia
    public final boolean a(Oha oha) {
        String str;
        int a2;
        int a3;
        C2453wka.b(this.d != null);
        while (true) {
            if (this.f3659b.isEmpty() || oha.getPosition() < this.f3659b.peek().f3833b) {
                if (this.e == 0) {
                    long a4 = this.f3660c.a(oha, true, false, 4);
                    if (a4 == -2) {
                        oha.a();
                        while (true) {
                            oha.a(this.f3658a, 0, 4);
                            a2 = C1484iia.a(this.f3658a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                a3 = (int) C1484iia.a(this.f3658a, a2, false);
                                if (this.d.h(a3)) {
                                    break;
                                }
                            }
                            oha.a(1);
                        }
                        oha.a(a2);
                        a4 = (long) a3;
                    }
                    if (a4 == -1) {
                        return false;
                    }
                    this.f = (int) a4;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.f3660c.a(oha, false, true, 8);
                    this.e = 2;
                }
                int g2 = this.d.g(this.f);
                if (g2 == 0) {
                    oha.a((int) this.g);
                    this.e = 0;
                } else if (g2 == 1) {
                    long position = oha.getPosition();
                    this.f3659b.add(new C0934aia(this.f, this.g + position));
                    this.d.a(this.f, position, this.g);
                    this.e = 0;
                    return true;
                } else if (g2 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.b(this.f, a(oha, (int) j));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j);
                    throw new Kga(sb.toString());
                } else if (g2 == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        AbstractC1072cia cia = this.d;
                        int i = this.f;
                        int i2 = (int) j2;
                        if (i2 == 0) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            byte[] bArr = new byte[i2];
                            oha.readFully(bArr, 0, i2);
                            str = new String(bArr);
                        }
                        cia.a(i, str);
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j2);
                    throw new Kga(sb2.toString());
                } else if (g2 == 4) {
                    this.d.a(this.f, (int) this.g, oha);
                    this.e = 0;
                    return true;
                } else if (g2 == 5) {
                    long j3 = this.g;
                    if (j3 == 4 || j3 == 8) {
                        AbstractC1072cia cia2 = this.d;
                        int i3 = this.f;
                        int i4 = (int) this.g;
                        long a5 = a(oha, i4);
                        cia2.a(i3, i4 == 4 ? (double) Float.intBitsToFloat((int) a5) : Double.longBitsToDouble(a5));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j3);
                    throw new Kga(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(g2);
                    throw new Kga(sb4.toString());
                }
            } else {
                this.d.f(this.f3659b.pop().f3832a);
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141dia
    public final void reset() {
        this.e = 0;
        this.f3659b.clear();
        this.f3660c.a();
    }
}
