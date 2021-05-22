package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import b.c.b.a.b.c.a;
import b.c.b.a.d.c.d;
import com.google.android.gms.common.internal.AbstractC0183i;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class F extends AbstractC0183i implements Handler.Callback {

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<AbstractC0183i.a, G> f1332c = new HashMap<>();
    private final Context d;
    private final Handler e;
    private final a f;
    private final long g;
    private final long h;

    F(Context context) {
        this.d = context.getApplicationContext();
        this.e = new d(context.getMainLooper(), this);
        this.f = a.a();
        this.g = 5000;
        this.h = 300000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0183i
    public final boolean a(AbstractC0183i.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        r.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1332c) {
            G g2 = this.f1332c.get(aVar);
            if (g2 == null) {
                g2 = new G(this, aVar);
                g2.a(serviceConnection, str);
                g2.a(str);
                this.f1332c.put(aVar, g2);
            } else {
                this.e.removeMessages(0, aVar);
                if (!g2.a(serviceConnection)) {
                    g2.a(serviceConnection, str);
                    int c2 = g2.c();
                    if (c2 == 1) {
                        serviceConnection.onServiceConnected(g2.b(), g2.a());
                    } else if (c2 == 2) {
                        g2.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = g2.d();
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC0183i
    public final void b(AbstractC0183i.a aVar, ServiceConnection serviceConnection, String str) {
        r.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1332c) {
            G g2 = this.f1332c.get(aVar);
            if (g2 == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (g2.a(serviceConnection)) {
                g2.b(serviceConnection, str);
                if (g2.e()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, aVar), this.g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f1332c) {
                AbstractC0183i.a aVar = (AbstractC0183i.a) message.obj;
                G g2 = this.f1332c.get(aVar);
                if (g2 != null && g2.e()) {
                    if (g2.d()) {
                        g2.b("GmsClientSupervisor");
                    }
                    this.f1332c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f1332c) {
                AbstractC0183i.a aVar2 = (AbstractC0183i.a) message.obj;
                G g3 = this.f1332c.get(aVar2);
                if (g3 != null && g3.c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b2 = g3.b();
                    if (b2 == null) {
                        b2 = aVar2.a();
                    }
                    if (b2 == null) {
                        b2 = new ComponentName(aVar2.b(), "unknown");
                    }
                    g3.onServiceDisconnected(b2);
                }
            }
            return true;
        }
    }
}
