package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b.c.b.a.b.d.c;
import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.ads.e  reason: case insensitive filesystem */
public final class C1165e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4172a;

    public C1165e(Context context) {
        r.a(context, "Context can not be null");
        this.f4172a = context;
    }

    private final boolean a(Intent intent) {
        r.a(intent, "Intent can not be null");
        return !this.f4172a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(intent);
    }

    public final boolean b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(intent);
    }

    public final boolean c() {
        return ((Boolean) C0251Cl.a(this.f4172a, new CallableC1372h())).booleanValue() && c.a(this.f4172a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean d() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
