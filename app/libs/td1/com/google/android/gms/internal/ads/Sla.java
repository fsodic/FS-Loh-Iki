package com.google.android.gms.internal.ads;

public final class Sla {

    /* renamed from: a  reason: collision with root package name */
    final long f3122a;

    /* renamed from: b  reason: collision with root package name */
    final String f3123b;

    /* renamed from: c  reason: collision with root package name */
    final int f3124c;

    Sla(long j, String str, int i) {
        this.f3122a = j;
        this.f3123b = str;
        this.f3124c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Sla)) {
            Sla sla = (Sla) obj;
            return sla.f3122a == this.f3122a && sla.f3124c == this.f3124c;
        }
    }

    public final int hashCode() {
        return (int) this.f3122a;
    }
}
