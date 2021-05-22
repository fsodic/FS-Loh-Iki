package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.j  reason: case insensitive filesystem */
public final class C0154j<L> {

    /* renamed from: a  reason: collision with root package name */
    private volatile L f1273a;

    /* renamed from: com.google.android.gms.common.api.internal.j$a */
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        private final L f1274a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1275b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1274a == aVar.f1274a && this.f1275b.equals(aVar.f1275b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f1274a) * 31) + this.f1275b.hashCode();
        }
    }

    public final void a() {
        this.f1273a = null;
    }
}
