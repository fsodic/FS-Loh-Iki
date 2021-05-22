package com.google.android.gms.internal.ads;

import android.view.View;

final class Hla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ View f2169a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Ela f2170b;

    Hla(Ela ela, View view) {
        this.f2170b = ela;
        this.f2169a = view;
    }

    public final void run() {
        this.f2170b.a(this.f2169a);
    }
}
