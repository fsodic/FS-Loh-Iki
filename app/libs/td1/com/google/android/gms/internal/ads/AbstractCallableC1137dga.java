package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.dga  reason: case insensitive filesystem */
public abstract class AbstractCallableC1137dga implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f4124a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    protected final C1823nfa f4125b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4126c;
    private final String d;
    protected final C1511jB.a e;
    protected Method f;
    private final int g;
    private final int h;

    public AbstractCallableC1137dga(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        this.f4125b = nfa;
        this.f4126c = str;
        this.d = str2;
        this.e = aVar;
        this.g = i;
        this.h = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.f = this.f4125b.a(this.f4126c, this.d);
            if (this.f == null) {
                return null;
            }
            a();
            C1670lW j = this.f4125b.j();
            if (!(j == null || this.g == Integer.MIN_VALUE)) {
                j.a(this.h, this.g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
