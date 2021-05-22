package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class Mka implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f2616a;

    Mka(String str) {
        this.f2616a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f2616a);
    }
}
