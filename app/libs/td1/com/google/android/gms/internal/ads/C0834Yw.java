package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Yw  reason: case insensitive filesystem */
public class C0834Yw<ListenerT> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<ListenerT, Executor> f3607a = new HashMap();

    protected C0834Yw(Set<C0523Mx<ListenerT>> set) {
        a(set);
    }

    private final synchronized void a(Set<C0523Mx<ListenerT>> set) {
        for (C0523Mx<ListenerT> mx : set) {
            a(mx);
        }
    }

    public final synchronized void a(C0523Mx<ListenerT> mx) {
        a(mx.f2628a, mx.f2629b);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(AbstractC0886_w<ListenerT> _wVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.f3607a.entrySet()) {
            entry.getValue().execute(new RunnableC0956ax(_wVar, entry.getKey()));
        }
    }

    public final synchronized void a(ListenerT listenert, Executor executor) {
        this.f3607a.put(listenert, executor);
    }
}
