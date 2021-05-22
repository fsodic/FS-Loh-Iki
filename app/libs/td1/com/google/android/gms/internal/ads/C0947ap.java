package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.ap  reason: case insensitive filesystem */
public final class C0947ap extends MutableContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Activity f3839a;

    /* renamed from: b  reason: collision with root package name */
    private Context f3840b;

    /* renamed from: c  reason: collision with root package name */
    private Context f3841c;

    public C0947ap(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Context a() {
        return this.f3841c;
    }

    public final Activity b() {
        return this.f3839a;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        return this.f3841c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f3840b = context.getApplicationContext();
        this.f3839a = context instanceof Activity ? (Activity) context : null;
        this.f3841c = context;
        super.setBaseContext(this.f3840b);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f3839a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f3840b.startActivity(intent);
    }
}
