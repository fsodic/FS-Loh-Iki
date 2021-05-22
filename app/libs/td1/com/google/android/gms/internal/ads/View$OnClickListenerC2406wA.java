package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.wA  reason: case insensitive filesystem */
public final class View$OnClickListenerC2406wA implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final C1306gC f5861a;

    /* renamed from: b  reason: collision with root package name */
    private final d f5862b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0657Sb f5863c;
    private AbstractC0268Dc<Object> d;
    String e;
    Long f;
    WeakReference<View> g;

    public View$OnClickListenerC2406wA(C1306gC gCVar, d dVar) {
        this.f5861a = gCVar;
        this.f5862b = dVar;
    }

    private final void c() {
        View view;
        this.e = null;
        this.f = null;
        WeakReference<View> weakReference = this.g;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener(null);
            this.g = null;
        }
    }

    public final void a() {
        if (this.f5863c != null && this.f != null) {
            c();
            try {
                this.f5863c.Gb();
            } catch (RemoteException e2) {
                C0745Vl.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void a(AbstractC0657Sb sb) {
        this.f5863c = sb;
        AbstractC0268Dc<Object> dc = this.d;
        if (dc != null) {
            this.f5861a.b("/unconfirmedClick", dc);
        }
        this.d = new C2337vA(this, sb);
        this.f5861a.a("/unconfirmedClick", this.d);
    }

    public final AbstractC0657Sb b() {
        return this.f5863c;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.e == null || this.f == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.e);
                hashMap.put("time_interval", String.valueOf(this.f5862b.a() - this.f.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f5861a.a("sendMessageToNativeJs", hashMap);
            }
            c();
        }
    }
}
