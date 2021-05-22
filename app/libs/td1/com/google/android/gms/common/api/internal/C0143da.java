package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.da  reason: case insensitive filesystem */
public final class C0143da extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private Context f1250a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0145ea f1251b;

    public C0143da(AbstractC0145ea eaVar) {
        this.f1251b = eaVar;
    }

    public final synchronized void a() {
        if (this.f1250a != null) {
            this.f1250a.unregisterReceiver(this);
        }
        this.f1250a = null;
    }

    public final void a(Context context) {
        this.f1250a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f1251b.a();
            a();
        }
    }
}
