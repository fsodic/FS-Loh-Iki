package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mK  reason: case insensitive filesystem */
public final class BinderC1727mK extends AbstractBinderC2099rg {

    /* renamed from: a  reason: collision with root package name */
    private final String f4935a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1755mg f4936b;

    /* renamed from: c  reason: collision with root package name */
    private C1423hm<JSONObject> f4937c;
    private final JSONObject d = new JSONObject();
    private boolean e = false;

    public BinderC1727mK(String str, AbstractC1755mg mgVar, C1423hm<JSONObject> hmVar) {
        this.f4937c = hmVar;
        this.f4935a = str;
        this.f4936b = mgVar;
        try {
            this.d.put("adapter_version", this.f4936b.fa().toString());
            this.d.put("sdk_version", this.f4936b.da().toString());
            this.d.put("name", this.f4935a);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1824ng
    public final synchronized void a(String str) {
        if (!this.e) {
            try {
                this.d.put("signal_error", str);
            } catch (JSONException unused) {
            }
            this.f4937c.b(this.d);
            this.e = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1824ng
    public final synchronized void s(String str) {
        if (!this.e) {
            if (str == null) {
                a("Adapter returned null signals");
                return;
            }
            try {
                this.d.put("signals", str);
            } catch (JSONException unused) {
            }
            this.f4937c.b(this.d);
            this.e = true;
        }
    }
}
