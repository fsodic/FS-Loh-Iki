package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eca  reason: case insensitive filesystem */
public class C1197eca {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C1197eca f4218a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile C1197eca f4219b;

    /* renamed from: c  reason: collision with root package name */
    private static final C1197eca f4220c = new C1197eca(true);
    private final Map<a, AbstractC2092rca.f<?, ?>> d;

    /* renamed from: com.google.android.gms.internal.ads.eca$a */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4221a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4222b;

        a(Object obj, int i) {
            this.f4221a = obj;
            this.f4222b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4221a == aVar.f4221a && this.f4222b == aVar.f4222b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f4221a) * 65535) + this.f4222b;
        }
    }

    C1197eca() {
        this.d = new HashMap();
    }

    private C1197eca(boolean z) {
        this.d = Collections.emptyMap();
    }

    public static C1197eca a() {
        C1197eca eca = f4218a;
        if (eca == null) {
            synchronized (C1197eca.class) {
                eca = f4218a;
                if (eca == null) {
                    eca = f4220c;
                    f4218a = eca;
                }
            }
        }
        return eca;
    }

    public static C1197eca b() {
        C1197eca eca = f4219b;
        if (eca != null) {
            return eca;
        }
        synchronized (C1197eca.class) {
            C1197eca eca2 = f4219b;
            if (eca2 != null) {
                return eca2;
            }
            C1197eca a2 = AbstractC1886oca.a(C1197eca.class);
            f4219b = a2;
            return a2;
        }
    }

    public final <ContainingType extends AbstractC0993bda> AbstractC2092rca.f<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (AbstractC2092rca.f<ContainingType, ?>) this.d.get(new a(containingtype, i));
    }
}
