package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.vda */
public final class C2370vda {

    /* renamed from: a */
    private final ArrayDeque<Iba> f5817a;

    private C2370vda() {
        this.f5817a = new ArrayDeque<>();
    }

    /* synthetic */ C2370vda(C2163sda sda) {
        this();
    }

    private static int a(int i) {
        int binarySearch = Arrays.binarySearch(C2232tda.e, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* access modifiers changed from: public */
    private final Iba a(Iba iba, Iba iba2) {
        a(iba);
        a(iba2);
        Iba pop = this.f5817a.pop();
        while (!this.f5817a.isEmpty()) {
            pop = new C2232tda(this.f5817a.pop(), pop, null);
        }
        return pop;
    }

    private final void a(Iba iba) {
        while (!iba.p()) {
            if (iba instanceof C2232tda) {
                C2232tda tda = (C2232tda) iba;
                a(tda.g);
                iba = tda.h;
            } else {
                String valueOf = String.valueOf(iba.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int a2 = a(iba.size());
        int k = C2232tda.k(a2 + 1);
        if (this.f5817a.isEmpty() || this.f5817a.peek().size() >= k) {
            this.f5817a.push(iba);
            return;
        }
        int k2 = C2232tda.k(a2);
        Iba pop = this.f5817a.pop();
        while (!this.f5817a.isEmpty() && this.f5817a.peek().size() < k2) {
            pop = new C2232tda(this.f5817a.pop(), pop, null);
        }
        C2232tda tda2 = new C2232tda(pop, iba, null);
        while (!this.f5817a.isEmpty() && this.f5817a.peek().size() < C2232tda.k(a(tda2.size()) + 1)) {
            tda2 = new C2232tda(this.f5817a.pop(), tda2, null);
        }
        this.f5817a.push(tda2);
    }
}
