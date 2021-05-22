package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class Iea {

    /* renamed from: a  reason: collision with root package name */
    public static final Iea f2244a = new Iea(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: b  reason: collision with root package name */
    private static final Iea f2245b = new Iea(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: c  reason: collision with root package name */
    private static final Iea f2246c = new Iea(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final Iea d = new Iea(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double j;
    private final double k;
    private final double l;
    private final double m;

    private Iea(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.e = d6;
        this.f = d7;
        this.g = d8;
        this.h = d2;
        this.i = d3;
        this.j = d4;
        this.k = d5;
        this.l = d9;
        this.m = d10;
    }

    public static Iea a(ByteBuffer byteBuffer) {
        double d2 = C2674zt.d(byteBuffer);
        double d3 = C2674zt.d(byteBuffer);
        double e2 = C2674zt.e(byteBuffer);
        return new Iea(d2, d3, C2674zt.d(byteBuffer), C2674zt.d(byteBuffer), e2, C2674zt.e(byteBuffer), C2674zt.e(byteBuffer), C2674zt.d(byteBuffer), C2674zt.d(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Iea.class != obj.getClass()) {
            return false;
        }
        Iea iea = (Iea) obj;
        return Double.compare(iea.h, this.h) == 0 && Double.compare(iea.i, this.i) == 0 && Double.compare(iea.j, this.j) == 0 && Double.compare(iea.k, this.k) == 0 && Double.compare(iea.l, this.l) == 0 && Double.compare(iea.m, this.m) == 0 && Double.compare(iea.e, this.e) == 0 && Double.compare(iea.f, this.f) == 0 && Double.compare(iea.g, this.g) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f);
        long doubleToLongBits3 = Double.doubleToLongBits(this.g);
        long doubleToLongBits4 = Double.doubleToLongBits(this.h);
        long doubleToLongBits5 = Double.doubleToLongBits(this.i);
        long doubleToLongBits6 = Double.doubleToLongBits(this.j);
        long doubleToLongBits7 = Double.doubleToLongBits(this.k);
        long doubleToLongBits8 = Double.doubleToLongBits(this.l);
        long doubleToLongBits9 = Double.doubleToLongBits(this.m);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f2244a)) {
            return "Rotate 0°";
        }
        if (equals(f2245b)) {
            return "Rotate 90°";
        }
        if (equals(f2246c)) {
            return "Rotate 180°";
        }
        if (equals(d)) {
            return "Rotate 270°";
        }
        double d2 = this.e;
        double d3 = this.f;
        double d4 = this.g;
        double d5 = this.h;
        double d6 = this.i;
        double d7 = this.j;
        double d8 = this.k;
        double d9 = this.l;
        double d10 = this.m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
