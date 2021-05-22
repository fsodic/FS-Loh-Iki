package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.Yj  reason: case insensitive filesystem */
public final class C0821Yj {

    /* renamed from: a  reason: collision with root package name */
    private final d f3581a;

    /* renamed from: b  reason: collision with root package name */
    private final C1556jk f3582b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<C0795Xj> f3583c;
    private final Object d = new Object();
    private final String e;
    private final String f;
    private long g = -1;
    private long h = -1;
    private boolean i = false;
    private long j = -1;
    private long k = 0;
    private long l = -1;
    private long m = -1;

    C0821Yj(d dVar, C1556jk jkVar, String str, String str2) {
        this.f3581a = dVar;
        this.f3582b = jkVar;
        this.e = str;
        this.f = str2;
        this.f3583c = new LinkedList<>();
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.e);
            bundle.putString("slotid", this.f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.l);
            bundle.putLong("tresponse", this.m);
            bundle.putLong("timp", this.h);
            bundle.putLong("tload", this.j);
            bundle.putLong("pcc", this.k);
            bundle.putLong("tfetch", this.g);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<C0795Xj> it = this.f3583c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void a(long j2) {
        synchronized (this.d) {
            this.m = j2;
            if (this.m != -1) {
                this.f3582b.a(this);
            }
        }
    }

    public final void a(Zna zna) {
        synchronized (this.d) {
            this.l = this.f3581a.b();
            this.f3582b.a(zna, this.l);
        }
    }

    public final void a(boolean z) {
        synchronized (this.d) {
            if (this.m != -1) {
                this.j = this.f3581a.b();
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            if (this.m != -1 && this.h == -1) {
                this.h = this.f3581a.b();
                this.f3582b.a(this);
            }
            this.f3582b.a();
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (this.m != -1) {
                C0795Xj xj = new C0795Xj(this);
                xj.d();
                this.f3583c.add(xj);
                this.k++;
                this.f3582b.b();
                this.f3582b.a(this);
            }
        }
    }

    public final void d() {
        synchronized (this.d) {
            if (this.m != -1 && !this.f3583c.isEmpty()) {
                C0795Xj last = this.f3583c.getLast();
                if (last.b() == -1) {
                    last.c();
                    this.f3582b.a(this);
                }
            }
        }
    }

    public final String e() {
        return this.e;
    }
}
