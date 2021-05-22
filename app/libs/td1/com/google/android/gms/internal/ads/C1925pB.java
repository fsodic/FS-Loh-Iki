package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.pB  reason: case insensitive filesystem */
public final /* synthetic */ class C1925pB implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final String f5199a;

    /* renamed from: b  reason: collision with root package name */
    private final double f5200b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5201c;
    private final int d;

    C1925pB(String str, double d2, int i, int i2) {
        this.f5199a = str;
        this.f5200b = d2;
        this.f5201c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        String str = this.f5199a;
        return new BinderC0474La(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f5200b, this.f5201c, this.d);
    }
}
