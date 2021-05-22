package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import b.c.b.a.b.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.common.internal.C0182h;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.g  reason: case insensitive filesystem */
public abstract class AbstractC0181g<T extends IInterface> extends AbstractC0176b<T> implements a.f, C0182h.a {
    private final C0177c D;
    private final Set<Scope> E;
    private final Account F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected AbstractC0181g(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C0177c r13, com.google.android.gms.common.api.f.b r14, com.google.android.gms.common.api.f.c r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.AbstractC0183i.a(r10)
            b.c.b.a.b.e r4 = b.c.b.a.b.e.a()
            com.google.android.gms.common.internal.r.a(r14)
            r7 = r14
            com.google.android.gms.common.api.f$b r7 = (com.google.android.gms.common.api.f.b) r7
            com.google.android.gms.common.internal.r.a(r15)
            r8 = r15
            com.google.android.gms.common.api.f$c r8 = (com.google.android.gms.common.api.f.c) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC0181g.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c, com.google.android.gms.common.api.f$b, com.google.android.gms.common.api.f$c):void");
    }

    protected AbstractC0181g(Context context, Looper looper, AbstractC0183i iVar, e eVar, int i, C0177c cVar, f.b bVar, f.c cVar2) {
        super(context, looper, iVar, eVar, i, a(bVar), a(cVar2), cVar.g());
        this.D = cVar;
        this.F = cVar.a();
        this.E = b(cVar.c());
    }

    private static AbstractC0176b.a a(f.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new x(bVar);
    }

    private static AbstractC0176b.AbstractC0028b a(f.c cVar) {
        if (cVar == null) {
            return null;
        }
        return new y(cVar);
    }

    private final Set<Scope> b(Set<Scope> set) {
        Set<Scope> a2 = a(set);
        for (Scope scope : a2) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> a(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.AbstractC0176b
    public int g() {
        return super.g();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final Account o() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0176b
    public final Set<Scope> t() {
        return this.E;
    }

    /* access modifiers changed from: protected */
    public final C0177c z() {
        return this.D;
    }
}
