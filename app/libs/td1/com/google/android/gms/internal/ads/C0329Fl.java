package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Fl  reason: case insensitive filesystem */
public final class C0329Fl extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0355Gl f1984a;

    C0329Fl(C0355Gl gl) {
        this.f1984a = gl;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f1984a.a((C0355Gl) context, (Context) intent);
    }
}
