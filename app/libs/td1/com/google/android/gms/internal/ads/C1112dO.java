package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dO  reason: case insensitive filesystem */
public final class C1112dO<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<AbstractC1180eO<? extends AbstractC0905aO<T>>> f4069a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4070b;

    public C1112dO(Executor executor, Set<AbstractC1180eO<? extends AbstractC0905aO<T>>> set) {
        this.f4070b = executor;
        this.f4069a = set;
    }

    public final SW<T> a(T t) {
        ArrayList arrayList = new ArrayList(this.f4069a.size());
        for (AbstractC1180eO<? extends AbstractC0905aO<T>> eOVar : this.f4069a) {
            SW<? extends AbstractC0905aO<T>> a2 = eOVar.a();
            if (C1950pa.f5237a.a().booleanValue()) {
                a2.a(new RunnableC1318gO(eOVar, q.j().b()), C0875_l.f);
            }
            arrayList.add(a2);
        }
        return JW.c(arrayList).a(new CallableC1249fO(arrayList, t), this.f4070b);
    }
}
