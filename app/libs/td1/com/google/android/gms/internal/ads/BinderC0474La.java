package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import b.c.b.a.c.a;
import b.c.b.a.c.b;

/* renamed from: com.google.android.gms.internal.ads.La  reason: case insensitive filesystem */
public final class BinderC0474La extends AbstractBinderC0786Xa {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f2506a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f2507b;

    /* renamed from: c  reason: collision with root package name */
    private final double f2508c;
    private final int d;
    private final int e;

    public BinderC0474La(Drawable drawable, Uri uri, double d2, int i, int i2) {
        this.f2506a = drawable;
        this.f2507b = uri;
        this.f2508c = d2;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final a Ja() {
        return b.a(this.f2506a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final double Ya() {
        return this.f2508c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final int getHeight() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final Uri getUri() {
        return this.f2507b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final int getWidth() {
        return this.d;
    }
}
