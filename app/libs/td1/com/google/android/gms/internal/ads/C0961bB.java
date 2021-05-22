package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.bB  reason: case insensitive filesystem */
public final class C0961bB implements AbstractC1187eV<C1912opa, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ double f3864a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f3865b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1030cB f3866c;

    C0961bB(C1030cB cBVar, double d, boolean z) {
        this.f3866c = cBVar;
        this.f3864a = d;
        this.f3865b = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final /* synthetic */ Bitmap apply(C1912opa opa) {
        return this.f3866c.a(opa.f5178b, this.f3864a, this.f3865b);
    }
}
