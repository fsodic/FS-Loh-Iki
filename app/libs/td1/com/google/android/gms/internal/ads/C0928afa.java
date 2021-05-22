package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.afa  reason: case insensitive filesystem */
public final class C0928afa<T> implements _ea<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3824a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile _ea<T> f3825b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f3826c = f3824a;

    private C0928afa(_ea<T> _ea) {
        this.f3825b = _ea;
    }

    public static <P extends _ea<T>, T> _ea<T> a(P p) {
        if ((p instanceof C0928afa) || (p instanceof Oea)) {
            return p;
        }
        Xea.a(p);
        return new C0928afa(p);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final T get() {
        T t = (T) this.f3826c;
        if (t != f3824a) {
            return t;
        }
        _ea<T> _ea = this.f3825b;
        if (_ea == null) {
            return (T) this.f3826c;
        }
        T t2 = _ea.get();
        this.f3826c = t2;
        this.f3825b = null;
        return t2;
    }
}
