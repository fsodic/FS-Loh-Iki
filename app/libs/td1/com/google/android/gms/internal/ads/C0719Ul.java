package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ul  reason: case insensitive filesystem */
public final class C0719Ul {

    /* renamed from: a  reason: collision with root package name */
    private final int f3278a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C2252tna> f3279b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3280c;
    private final InputStream d;

    public C0719Ul(int i, List<C2252tna> list) {
        this(i, list, -1, null);
    }

    public C0719Ul(int i, List<C2252tna> list, int i2, InputStream inputStream) {
        this.f3278a = i;
        this.f3279b = list;
        this.f3280c = i2;
        this.d = inputStream;
    }

    public final InputStream a() {
        return this.d;
    }

    public final int b() {
        return this.f3280c;
    }

    public final int c() {
        return this.f3278a;
    }

    public final List<C2252tna> d() {
        return Collections.unmodifiableList(this.f3279b);
    }
}
