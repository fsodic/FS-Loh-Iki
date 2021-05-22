package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;
import java.util.concurrent.Callable;

public final class Lfa implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1823nfa f2514a;

    /* renamed from: b  reason: collision with root package name */
    private final C1511jB.a f2515b;

    public Lfa(C1823nfa nfa, C1511jB.a aVar) {
        this.f2514a = nfa;
        this.f2515b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.f2514a.n() != null) {
            this.f2514a.n().get();
        }
        C1511jB m = this.f2514a.m();
        if (m == null) {
            return null;
        }
        try {
            synchronized (this.f2515b) {
                C1511jB.a aVar = this.f2515b;
                byte[] f = m.f();
                aVar.a(f, 0, f.length, C1197eca.b());
            }
            return null;
        } catch (Bca unused) {
            return null;
        }
    }
}
