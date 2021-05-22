package com.google.android.gms.internal.ads;

public final class Oea<T> implements Lea<T>, _ea<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2762a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile _ea<T> f2763b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f2764c = f2762a;

    private Oea(_ea<T> _ea) {
        this.f2763b = _ea;
    }

    public static <P extends _ea<T>, T> _ea<T> a(P p) {
        Xea.a(p);
        return p instanceof Oea ? p : new Oea(p);
    }

    public static <P extends _ea<T>, T> Lea<T> b(P p) {
        if (p instanceof Lea) {
            return (Lea) p;
        }
        Xea.a(p);
        return new Oea(p);
    }

    @Override // com.google.android.gms.internal.ads.Lea, com.google.android.gms.internal.ads._ea
    public final T get() {
        T t = (T) this.f2764c;
        if (t == f2762a) {
            synchronized (this) {
                t = this.f2764c;
                if (t == f2762a) {
                    t = this.f2763b.get();
                    Object obj = this.f2764c;
                    if (obj != f2762a) {
                        if (obj != t) {
                            String valueOf = String.valueOf(obj);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f2764c = t;
                    this.f2763b = null;
                }
            }
        }
        return t;
    }
}
