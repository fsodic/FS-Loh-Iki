package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dx  reason: case insensitive filesystem */
public class C1162dx {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C0523Mx<Ona>> f4162a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<C0523Mx<AbstractC0520Mu>> f4163b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<C0523Mx<AbstractC1229ev>> f4164c;
    private final Set<C0523Mx<AbstractC0391Hv>> d;
    private final Set<C0523Mx<AbstractC0261Cv>> e;
    private final Set<C0523Mx<AbstractC0650Ru>> f;
    private final Set<C0523Mx<AbstractC0884_u>> g;
    private final Set<C0523Mx<com.google.android.gms.ads.g.a>> h;
    private final Set<C0523Mx<com.google.android.gms.ads.a.a>> i;
    private final Set<C0523Mx<AbstractC0651Rv>> j;
    private final AbstractC2009qQ k;
    private C0598Pu l;
    private OI m;

    /* renamed from: com.google.android.gms.internal.ads.dx$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Set<C0523Mx<Ona>> f4165a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private Set<C0523Mx<AbstractC0520Mu>> f4166b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private Set<C0523Mx<AbstractC1229ev>> f4167c = new HashSet();
        private Set<C0523Mx<AbstractC0391Hv>> d = new HashSet();
        private Set<C0523Mx<AbstractC0261Cv>> e = new HashSet();
        private Set<C0523Mx<AbstractC0650Ru>> f = new HashSet();
        private Set<C0523Mx<com.google.android.gms.ads.g.a>> g = new HashSet();
        private Set<C0523Mx<com.google.android.gms.ads.a.a>> h = new HashSet();
        private Set<C0523Mx<AbstractC0884_u>> i = new HashSet();
        private Set<C0523Mx<AbstractC0651Rv>> j = new HashSet();
        private AbstractC2009qQ k;

        public final a a(com.google.android.gms.ads.a.a aVar, Executor executor) {
            this.h.add(new C0523Mx<>(aVar, executor));
            return this;
        }

        public final a a(com.google.android.gms.ads.g.a aVar, Executor executor) {
            this.g.add(new C0523Mx<>(aVar, executor));
            return this;
        }

        public final a a(AbstractC0261Cv cv, Executor executor) {
            this.e.add(new C0523Mx<>(cv, executor));
            return this;
        }

        public final a a(AbstractC0391Hv hv, Executor executor) {
            this.d.add(new C0523Mx<>(hv, executor));
            return this;
        }

        public final a a(AbstractC0520Mu mu, Executor executor) {
            this.f4166b.add(new C0523Mx<>(mu, executor));
            return this;
        }

        public final a a(Ona ona, Executor executor) {
            this.f4165a.add(new C0523Mx<>(ona, executor));
            return this;
        }

        public final a a(AbstractC0650Ru ru, Executor executor) {
            this.f.add(new C0523Mx<>(ru, executor));
            return this;
        }

        public final a a(AbstractC0651Rv rv, Executor executor) {
            this.j.add(new C0523Mx<>(rv, executor));
            return this;
        }

        public final a a(Uoa uoa, Executor executor) {
            if (this.h != null) {
                C2554yK yKVar = new C2554yK();
                yKVar.a(uoa);
                this.h.add(new C0523Mx<>(yKVar, executor));
            }
            return this;
        }

        public final a a(AbstractC0884_u _uVar, Executor executor) {
            this.i.add(new C0523Mx<>(_uVar, executor));
            return this;
        }

        public final a a(AbstractC1229ev evVar, Executor executor) {
            this.f4167c.add(new C0523Mx<>(evVar, executor));
            return this;
        }

        public final a a(AbstractC2009qQ qQVar) {
            this.k = qQVar;
            return this;
        }

        public final C1162dx a() {
            return new C1162dx(this);
        }
    }

    private C1162dx(a aVar) {
        this.f4162a = aVar.f4165a;
        this.f4164c = aVar.f4167c;
        this.d = aVar.d;
        this.f4163b = aVar.f4166b;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.i;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.j;
        this.k = aVar.k;
    }

    public final OI a(d dVar, QI qi) {
        if (this.m == null) {
            this.m = new OI(dVar, qi);
        }
        return this.m;
    }

    public final C0598Pu a(Set<C0523Mx<AbstractC0650Ru>> set) {
        if (this.l == null) {
            this.l = new C0598Pu(set);
        }
        return this.l;
    }

    public final Set<C0523Mx<AbstractC0520Mu>> a() {
        return this.f4163b;
    }

    public final Set<C0523Mx<AbstractC0261Cv>> b() {
        return this.e;
    }

    public final Set<C0523Mx<AbstractC0650Ru>> c() {
        return this.f;
    }

    public final Set<C0523Mx<AbstractC0884_u>> d() {
        return this.g;
    }

    public final Set<C0523Mx<com.google.android.gms.ads.g.a>> e() {
        return this.h;
    }

    public final Set<C0523Mx<com.google.android.gms.ads.a.a>> f() {
        return this.i;
    }

    public final Set<C0523Mx<Ona>> g() {
        return this.f4162a;
    }

    public final Set<C0523Mx<AbstractC1229ev>> h() {
        return this.f4164c;
    }

    public final Set<C0523Mx<AbstractC0391Hv>> i() {
        return this.d;
    }

    public final Set<C0523Mx<AbstractC0651Rv>> j() {
        return this.j;
    }

    public final AbstractC2009qQ k() {
        return this.k;
    }
}
