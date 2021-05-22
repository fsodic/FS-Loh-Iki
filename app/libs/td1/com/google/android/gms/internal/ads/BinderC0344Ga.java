package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ga  reason: case insensitive filesystem */
public final class BinderC0344Ga extends AbstractBinderC0604Qa {

    /* renamed from: a  reason: collision with root package name */
    private static final int f2046a = Color.rgb(12, 174, 206);

    /* renamed from: b  reason: collision with root package name */
    private static final int f2047b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f2048c;
    private static final int d = f2046a;
    private final String e;
    private final List<BinderC0474La> f = new ArrayList();
    private final List<AbstractC0812Ya> g = new ArrayList();
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    static {
        int rgb = Color.rgb(204, 204, 204);
        f2047b = rgb;
        f2048c = rgb;
    }

    public BinderC0344Ga(String str, List<BinderC0474La> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.e = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                BinderC0474La la = list.get(i4);
                this.f.add(la);
                this.g.add(la);
            }
        }
        this.h = num != null ? num.intValue() : f2048c;
        this.i = num2 != null ? num2.intValue() : d;
        this.j = num3 != null ? num3.intValue() : 12;
        this.k = i2;
        this.l = i3;
        this.m = z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0630Ra
    public final List<AbstractC0812Ya> Hb() {
        return this.g;
    }

    public final int Wb() {
        return this.h;
    }

    public final int Xb() {
        return this.i;
    }

    public final int Yb() {
        return this.j;
    }

    public final List<BinderC0474La> Zb() {
        return this.f;
    }

    public final int _b() {
        return this.k;
    }

    public final int ac() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0630Ra
    public final String getText() {
        return this.e;
    }
}
