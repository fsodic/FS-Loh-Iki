package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class Lja {

    /* renamed from: a  reason: collision with root package name */
    public static final Lja f2520a = new Lja(new Ija[0]);

    /* renamed from: b  reason: collision with root package name */
    public final int f2521b;

    /* renamed from: c  reason: collision with root package name */
    private final Ija[] f2522c;
    private int d;

    public Lja(Ija... ijaArr) {
        this.f2522c = ijaArr;
        this.f2521b = ijaArr.length;
    }

    public final int a(Ija ija) {
        for (int i = 0; i < this.f2521b; i++) {
            if (this.f2522c[i] == ija) {
                return i;
            }
        }
        return -1;
    }

    public final Ija a(int i) {
        return this.f2522c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Lja.class == obj.getClass()) {
            Lja lja = (Lja) obj;
            return this.f2521b == lja.f2521b && Arrays.equals(this.f2522c, lja.f2522c);
        }
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = Arrays.hashCode(this.f2522c);
        }
        return this.d;
    }
}
