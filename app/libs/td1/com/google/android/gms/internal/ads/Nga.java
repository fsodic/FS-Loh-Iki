package com.google.android.gms.internal.ads;

public final class Nga {

    /* renamed from: a  reason: collision with root package name */
    public static final Nga f2682a = new Nga(1.0f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public final float f2683b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2684c;
    private final int d;

    public Nga(float f, float f2) {
        this.f2683b = f;
        this.f2684c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * ((long) this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Nga.class == obj.getClass()) {
            Nga nga = (Nga) obj;
            return this.f2683b == nga.f2683b && this.f2684c == nga.f2684c;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f2683b) + 527) * 31) + Float.floatToRawIntBits(this.f2684c);
    }
}
