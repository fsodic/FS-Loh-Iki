package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ck  reason: case insensitive filesystem */
public final class C0250Ck extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2452wk f1721a;

    private C0250Ck(C2452wk wkVar) {
        this.f1721a = wkVar;
    }

    /* synthetic */ C0250Ck(C2452wk wkVar, C2590yk ykVar) {
        this(wkVar);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f1721a.d = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f1721a.d = false;
        }
    }
}
