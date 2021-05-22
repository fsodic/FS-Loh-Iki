package com.google.android.gms.common.internal;

import a.c.d;
import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.c  reason: case insensitive filesystem */
public final class C0177c {

    /* renamed from: a  reason: collision with root package name */
    private final Account f1356a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f1357b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f1358c;
    private final Map<com.google.android.gms.common.api.a<?>, b> d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final b.c.b.a.g.a i;
    private final boolean j;
    private Integer k;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f1359a;

        /* renamed from: b  reason: collision with root package name */
        private d<Scope> f1360b;

        /* renamed from: c  reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f1361c;
        private int d = 0;
        private View e;
        private String f;
        private String g;
        private b.c.b.a.g.a h = b.c.b.a.g.a.f523a;
        private boolean i;

        public final a a(Account account) {
            this.f1359a = account;
            return this;
        }

        public final a a(String str) {
            this.g = str;
            return this;
        }

        public final a a(Collection<Scope> collection) {
            if (this.f1360b == null) {
                this.f1360b = new d<>();
            }
            this.f1360b.addAll(collection);
            return this;
        }

        public final C0177c a() {
            return new C0177c(this.f1359a, this.f1360b, this.f1361c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final a b(String str) {
            this.f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f1362a;
    }

    public C0177c(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, b.c.b.a.g.a aVar, boolean z) {
        this.f1356a = account;
        this.f1357b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.EMPTY_MAP : map;
        this.f = view;
        this.e = i2;
        this.g = str;
        this.h = str2;
        this.i = aVar;
        this.j = z;
        HashSet hashSet = new HashSet(this.f1357b);
        for (b bVar : this.d.values()) {
            hashSet.addAll(bVar.f1362a);
        }
        this.f1358c = Collections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.f1356a;
    }

    public final Set<Scope> a(com.google.android.gms.common.api.a<?> aVar) {
        b bVar = this.d.get(aVar);
        if (bVar == null || bVar.f1362a.isEmpty()) {
            return this.f1357b;
        }
        HashSet hashSet = new HashSet(this.f1357b);
        hashSet.addAll(bVar.f1362a);
        return hashSet;
    }

    public final void a(Integer num) {
        this.k = num;
    }

    public final Account b() {
        Account account = this.f1356a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.f1358c;
    }

    public final Integer d() {
        return this.k;
    }

    public final int e() {
        return this.e;
    }

    public final Map<com.google.android.gms.common.api.a<?>, b> f() {
        return this.d;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    public final Set<Scope> i() {
        return this.f1357b;
    }

    public final b.c.b.a.g.a j() {
        return this.i;
    }

    public final View k() {
        return this.f;
    }

    public final boolean l() {
        return this.j;
    }
}
