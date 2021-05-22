package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.iF  reason: case insensitive filesystem */
final /* synthetic */ class C1447iF implements AbstractC1461iT {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC1461iT f4549a = new C1447iF();

    private C1447iF() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1461iT
    public final Object apply(Object obj) {
        Exception exc = (Exception) obj;
        return BuildConfig.FLAVOR;
    }
}
