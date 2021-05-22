package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.Px  reason: case insensitive filesystem */
public final class C0601Px extends C0834Yw<AbstractC1835nla> implements AbstractC1835nla {

    /* renamed from: b  reason: collision with root package name */
    private Map<View, View$OnAttachStateChangeListenerC1559jla> f2897b = new WeakHashMap(1);

    /* renamed from: c  reason: collision with root package name */
    private final Context f2898c;
    private final C1941pR d;

    public C0601Px(Context context, Set<C0523Mx<AbstractC1835nla>> set, C1941pR pRVar) {
        super(set);
        this.f2898c = context;
        this.d = pRVar;
    }

    public final synchronized void a(View view) {
        View$OnAttachStateChangeListenerC1559jla jla = this.f2897b.get(view);
        if (jla == null) {
            jla = new View$OnAttachStateChangeListenerC1559jla(this.f2898c, view);
            jla.a(this);
            this.f2897b.put(view, jla);
        }
        if (this.d != null && this.d.O) {
            if (((Boolean) C2392voa.e().a(C2474x.db)).booleanValue()) {
                jla.a(((Long) C2392voa.e().a(C2474x.cb)).longValue());
                return;
            }
        }
        jla.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final synchronized void a(C1904ola ola) {
        a(new C0575Ox(ola));
    }

    public final synchronized void b(View view) {
        if (this.f2897b.containsKey(view)) {
            this.f2897b.get(view).b(this);
            this.f2897b.remove(view);
        }
    }
}
