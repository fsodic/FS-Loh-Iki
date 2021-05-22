package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC1808nW;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.sW  reason: case insensitive filesystem */
public abstract class AbstractC2152sW<V, C> extends AbstractC1808nW<V, C> {
    private List<C2290uW<V>> p;

    AbstractC2152sW(AbstractC2634zV<? extends SW<? extends V>> zVVar, boolean z) {
        super(zVVar, true, true);
        List<C2290uW<V>> o = zVVar.isEmpty() ? AV.o() : JV.a(zVVar.size());
        for (int i = 0; i < zVVar.size(); i++) {
            o.add(null);
        }
        this.p = o;
    }

    /* access modifiers changed from: package-private */
    public abstract C a(List<C2290uW<V>> list);

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1808nW
    public final void a(int i, V v) {
        List<C2290uW<V>> list = this.p;
        if (list != null) {
            list.set(i, new C2290uW<>(v));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1808nW
    public final void a(AbstractC1808nW.a aVar) {
        super.a(aVar);
        this.p = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.sW<V, C> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1808nW
    public final void l() {
        List<C2290uW<V>> list = this.p;
        if (list != null) {
            a(a((List) list));
        }
    }
}
