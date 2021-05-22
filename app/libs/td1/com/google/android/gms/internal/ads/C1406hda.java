package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hda  reason: case insensitive filesystem */
final class C1406hda<T> implements AbstractC2439wda<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0993bda f4489a;

    /* renamed from: b  reason: collision with root package name */
    private final Oda<?, ?> f4490b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4491c;
    private final AbstractC1335gca<?> d;

    private C1406hda(Oda<?, ?> oda, AbstractC1335gca<?> gca, AbstractC0993bda bda) {
        this.f4490b = oda;
        this.f4491c = gca.a(bda);
        this.d = gca;
        this.f4489a = bda;
    }

    static <T> C1406hda<T> a(Oda<?, ?> oda, AbstractC1335gca<?> gca, AbstractC0993bda bda) {
        return new C1406hda<>(oda, gca, bda);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final T a() {
        return (T) this.f4489a.c().K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void a(T t, AbstractC1752mea mea) {
        Iterator<Map.Entry<?, Object>> d2 = this.d.a((Object) t).d();
        if (!d2.hasNext()) {
            Oda<?, ?> oda = this.f4490b;
            oda.b(oda.d(t), mea);
            return;
        }
        ((AbstractC1679lca) d2.next().getKey()).M();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void a(T t, AbstractC2026qda qda, C1197eca eca) {
        boolean z;
        Oda<?, ?> oda = this.f4490b;
        AbstractC1335gca<?> gca = this.d;
        Object e = oda.e(t);
        C1541jca<?> b2 = gca.b(t);
        do {
            try {
                if (qda.k() == Integer.MAX_VALUE) {
                    oda.b(t, e);
                    return;
                }
                int tag = qda.getTag();
                if (tag == 11) {
                    Object obj = null;
                    Iba iba = null;
                    int i = 0;
                    while (qda.k() != Integer.MAX_VALUE) {
                        int tag2 = qda.getTag();
                        if (tag2 == 16) {
                            i = qda.d();
                            obj = gca.a(eca, this.f4489a, i);
                        } else if (tag2 == 26) {
                            if (obj == null) {
                                iba = qda.b();
                            } else {
                                gca.a(qda, obj, eca, b2);
                                throw null;
                            }
                        } else if (!qda.o()) {
                            break;
                        }
                    }
                    if (qda.getTag() == 12) {
                        if (iba != null) {
                            if (obj == null) {
                                oda.a(e, i, iba);
                            } else {
                                gca.a(iba, obj, eca, b2);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw Bca.e();
                    }
                } else if ((tag & 7) == 2) {
                    Object a2 = gca.a(eca, this.f4489a, tag >>> 3);
                    if (a2 == null) {
                        z = oda.a(e, qda);
                        continue;
                    } else {
                        gca.a(qda, a2, eca, b2);
                        throw null;
                    }
                } else {
                    z = qda.o();
                    continue;
                }
            } finally {
                oda.b(t, e);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void a(T t, byte[] bArr, int i, int i2, Dba dba) {
        T t2 = t;
        Sda sda = t2.zzieg;
        if (sda == Sda.c()) {
            sda = Sda.d();
            t2.zzieg = sda;
        }
        t.n();
        AbstractC2092rca.f fVar = null;
        while (i < i2) {
            int a2 = Eba.a(bArr, i, dba);
            int i3 = dba.f1783a;
            if (i3 == 11) {
                int i4 = 0;
                Iba iba = null;
                while (a2 < i2) {
                    a2 = Eba.a(bArr, a2, dba);
                    int i5 = dba.f1783a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (fVar != null) {
                                C1957pda.a();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a2 = Eba.e(bArr, a2, dba);
                                iba = (Iba) dba.f1785c;
                            }
                        }
                    } else if (i7 == 0) {
                        a2 = Eba.a(bArr, a2, dba);
                        i4 = dba.f1783a;
                        fVar = (AbstractC2092rca.f) this.d.a(dba.d, this.f4489a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a2 = Eba.a(i5, bArr, a2, i2, dba);
                }
                if (iba != null) {
                    sda.a((i4 << 3) | 2, iba);
                }
                i = a2;
            } else if ((i3 & 7) == 2) {
                fVar = (AbstractC2092rca.f) this.d.a(dba.d, this.f4489a, i3 >>> 3);
                if (fVar == null) {
                    i = Eba.a(i3, bArr, a2, i2, sda, dba);
                } else {
                    C1957pda.a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = Eba.a(i3, bArr, a2, i2, dba);
            }
        }
        if (i != i2) {
            throw Bca.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final boolean a(T t, T t2) {
        if (!this.f4490b.d(t).equals(this.f4490b.d(t2))) {
            return false;
        }
        if (this.f4491c) {
            return this.d.a((Object) t).equals(this.d.a((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final int b(T t) {
        int hashCode = this.f4490b.d(t).hashCode();
        return this.f4491c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void b(T t, T t2) {
        C2577yda.a(this.f4490b, t, t2);
        if (this.f4491c) {
            C2577yda.a(this.d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final void c(T t) {
        this.f4490b.a((Object) t);
        this.d.c(t);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final int d(T t) {
        Oda<?, ?> oda = this.f4490b;
        int f = oda.f(oda.d(t)) + 0;
        return this.f4491c ? f + this.d.a((Object) t).g() : f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2439wda
    public final boolean e(T t) {
        return this.d.a((Object) t).c();
    }
}
