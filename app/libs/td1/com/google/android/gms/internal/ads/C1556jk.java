package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.jk  reason: case insensitive filesystem */
public final class C1556jk implements Fla {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4713a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1901ok f4714b;

    /* renamed from: c  reason: collision with root package name */
    private final C1419hk f4715c;
    private final C1281fk d;
    private final HashSet<C0821Yj> e = new HashSet<>();
    private final HashSet<C1350gk> f = new HashSet<>();

    public C1556jk(String str, AbstractC1901ok okVar) {
        this.d = new C1281fk(str, okVar);
        this.f4714b = okVar;
        this.f4715c = new C1419hk();
    }

    public final Bundle a(Context context, AbstractC1212ek ekVar) {
        HashSet<C0821Yj> hashSet = new HashSet<>();
        synchronized (this.f4713a) {
            hashSet.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.d.a(context, this.f4715c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<C1350gk> it = this.f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<C0821Yj> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            ekVar.a(hashSet);
            return bundle;
        }
        it.next();
        throw new NoSuchMethodError();
    }

    public final C0821Yj a(d dVar, String str) {
        return new C0821Yj(dVar, this, this.f4715c.a(), str);
    }

    public final void a() {
        synchronized (this.f4713a) {
            this.d.a();
        }
    }

    public final void a(C0821Yj yj) {
        synchronized (this.f4713a) {
            this.e.add(yj);
        }
    }

    public final void a(Zna zna, long j) {
        synchronized (this.f4713a) {
            this.d.a(zna, j);
        }
    }

    public final void a(HashSet<C0821Yj> hashSet) {
        synchronized (this.f4713a) {
            this.e.addAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fla
    public final void a(boolean z) {
        long a2 = q.j().a();
        if (z) {
            if (a2 - this.f4714b.f() > ((Long) C2392voa.e().a(C2474x.xa)).longValue()) {
                this.d.d = -1;
                return;
            }
            this.d.d = this.f4714b.d();
            return;
        }
        this.f4714b.a(a2);
        this.f4714b.a(this.d.d);
    }

    public final void b() {
        synchronized (this.f4713a) {
            this.d.b();
        }
    }
}
