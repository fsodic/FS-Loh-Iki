package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class E extends I {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a.f> f1205b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0173y f1206c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(C0173y yVar, ArrayList<a.f> arrayList) {
        super(yVar, null);
        this.f1206c = yVar;
        this.f1205b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.I
    public final void a() {
        this.f1206c.f1309a.n.q = this.f1206c.h();
        ArrayList<a.f> arrayList = this.f1205b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            a.f fVar = arrayList.get(i);
            i++;
            fVar.a(this.f1206c.o, this.f1206c.f1309a.n.q);
        }
    }
}
