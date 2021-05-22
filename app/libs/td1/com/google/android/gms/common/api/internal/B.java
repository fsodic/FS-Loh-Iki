package com.google.android.gms.common.api.internal;

import b.c.b.a.b.b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C0185k;
import java.util.ArrayList;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class B extends I {

    /* renamed from: b  reason: collision with root package name */
    private final Map<a.f, A> f1193b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0173y f1194c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B(C0173y yVar, Map<a.f, A> map) {
        super(yVar, null);
        this.f1194c = yVar;
        this.f1193b = map;
    }

    @Override // com.google.android.gms.common.api.internal.I
    public final void a() {
        C0185k kVar = new C0185k(this.f1194c.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f1193b.keySet()) {
            if (!fVar.f() || (this.f1193b.get(fVar).f1192c)) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                i = kVar.a(this.f1194c.f1311c, (a.f) obj);
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                i = kVar.a(this.f1194c.f1311c, (a.f) obj2);
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f1194c.f1309a.a(new C(this, this.f1194c, new b(i, null)));
            return;
        }
        if ((this.f1194c.m) && this.f1194c.k != null) {
            this.f1194c.k.connect();
        }
        for (a.f fVar2 : this.f1193b.keySet()) {
            A a2 = this.f1193b.get(fVar2);
            if (!fVar2.f() || kVar.a(this.f1194c.f1311c, fVar2) == 0) {
                fVar2.a(a2);
            } else {
                this.f1194c.f1309a.a(new D(this, this.f1194c, a2));
            }
        }
    }
}
