package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b.c.b.a.b.b;
import b.c.b.a.b.f;
import b.c.b.a.g.e;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C0177c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class Q implements AbstractC0147fa, Fa {

    /* renamed from: a  reason: collision with root package name */
    private final Lock f1231a;

    /* renamed from: b  reason: collision with root package name */
    private final Condition f1232b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1233c;
    private final f d;
    private final T e;
    final Map<a.c<?>, a.f> f;
    final Map<a.c<?>, b> g = new HashMap();
    private final C0177c h;
    private final Map<a<?>, Boolean> i;
    private final a.AbstractC0025a<? extends e, b.c.b.a.g.a> j;
    private volatile P k;
    private b l = null;
    int m;
    final K n;
    final AbstractC0149ga o;

    public Q(Context context, K k2, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, C0177c cVar, Map<a<?>, Boolean> map2, a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar, ArrayList<Ea> arrayList, AbstractC0149ga gaVar) {
        this.f1233c = context;
        this.f1231a = lock;
        this.d = fVar;
        this.f = map;
        this.h = cVar;
        this.i = map2;
        this.j = aVar;
        this.n = k2;
        this.o = gaVar;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Ea ea = arrayList.get(i2);
            i2++;
            ea.a(this);
        }
        this.e = new T(this, looper);
        this.f1232b = lock.newCondition();
        this.k = new J(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        t.f();
        return (T) this.k.a(t);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void a() {
        if (this.k.a()) {
            this.g.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        this.f1231a.lock();
        try {
            this.l = bVar;
            this.k = new J(this);
            this.k.b();
            this.f1232b.signalAll();
        } finally {
            this.f1231a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.Fa
    public final void a(b bVar, a<?> aVar, boolean z) {
        this.f1231a.lock();
        try {
            this.k.a(bVar, aVar, z);
        } finally {
            this.f1231a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(S s) {
        this.e.sendMessage(this.e.obtainMessage(1, s));
    }

    /* access modifiers changed from: package-private */
    public final void a(RuntimeException runtimeException) {
        this.e.sendMessage(this.e.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (a<?> aVar : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.b()).println(":");
            this.f.get(aVar.a()).a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void b() {
        if (isConnected()) {
            ((C0170v) this.k).c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f1231a.lock();
        try {
            this.k = new C0173y(this, this.h, this.i, this.d, this.j, this.f1231a, this.f1233c);
            this.k.b();
            this.f1232b.signalAll();
        } finally {
            this.f1231a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void connect() {
        this.k.connect();
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f1231a.lock();
        try {
            this.n.g();
            this.k = new C0170v(this);
            this.k.b();
            this.f1232b.signalAll();
        } finally {
            this.f1231a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final boolean isConnected() {
        return this.k instanceof C0170v;
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnected(Bundle bundle) {
        this.f1231a.lock();
        try {
            this.k.onConnected(bundle);
        } finally {
            this.f1231a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnectionSuspended(int i2) {
        this.f1231a.lock();
        try {
            this.k.onConnectionSuspended(i2);
        } finally {
            this.f1231a.unlock();
        }
    }
}
