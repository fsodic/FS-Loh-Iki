package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.Gl  reason: case insensitive filesystem */
public final class C0355Gl {

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f2068a = new C0329Fl(this);

    /* renamed from: b  reason: collision with root package name */
    private final Map<BroadcastReceiver, IntentFilter> f2069b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f2070c = false;
    private boolean d;
    private Context e;

    /* access modifiers changed from: private */
    public final synchronized void a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f2069b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }

    public final synchronized void a(Context context) {
        if (!this.f2070c) {
            this.e = context.getApplicationContext();
            if (this.e == null) {
                this.e = context;
            }
            C2474x.a(this.e);
            this.d = ((Boolean) C2392voa.e().a(C2474x.fc)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.e.registerReceiver(this.f2068a, intentFilter);
            this.f2070c = true;
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.f2069b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.f2069b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
