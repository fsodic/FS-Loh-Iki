package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC0183i;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class G implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ServiceConnection> f1333a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private int f1334b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1335c;
    private IBinder d;
    private final AbstractC0183i.a e;
    private ComponentName f;
    private final /* synthetic */ F g;

    public G(F f2, AbstractC0183i.a aVar) {
        this.g = f2;
        this.e = aVar;
    }

    public final IBinder a() {
        return this.d;
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        F.d(this.g);
        F.c(this.g);
        this.e.a(F.c(this.g));
        this.f1333a.add(serviceConnection);
    }

    public final void a(String str) {
        this.f1334b = 3;
        this.f1335c = F.d(this.g).a(F.c(this.g), str, this.e.a(F.c(this.g)), this, this.e.c());
        if (this.f1335c) {
            F.b(this.g).sendMessageDelayed(F.b(this.g).obtainMessage(1, this.e), F.e(this.g));
            return;
        }
        this.f1334b = 2;
        try {
            F.d(this.g).a(F.c(this.g), this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.f1333a.contains(serviceConnection);
    }

    public final ComponentName b() {
        return this.f;
    }

    public final void b(ServiceConnection serviceConnection, String str) {
        F.d(this.g);
        F.c(this.g);
        this.f1333a.remove(serviceConnection);
    }

    public final void b(String str) {
        F.b(this.g).removeMessages(1, this.e);
        F.d(this.g).a(F.c(this.g), this);
        this.f1335c = false;
        this.f1334b = 2;
    }

    public final int c() {
        return this.f1334b;
    }

    public final boolean d() {
        return this.f1335c;
    }

    public final boolean e() {
        return this.f1333a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (F.a(this.g)) {
            F.b(this.g).removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.f1333a) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f1334b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (F.a(this.g)) {
            F.b(this.g).removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.f1333a) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f1334b = 2;
        }
    }
}
