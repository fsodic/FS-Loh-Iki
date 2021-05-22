package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Cg  reason: case insensitive filesystem */
public final class C0246Cg extends C0662Sg {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f1704c;
    private final Context d;
    private String e = d("description");
    private long f = e("start_ticks");
    private long g = e("end_ticks");
    private String h = d("summary");
    private String i = d("location");

    public C0246Cg(AbstractC1564jo joVar, Map<String, String> map) {
        super(joVar, "createCalendarEvent");
        this.f1704c = map;
        this.d = joVar.v();
    }

    private final String d(String str) {
        return TextUtils.isEmpty(this.f1704c.get(str)) ? BuildConfig.FLAVOR : this.f1704c.get(str);
    }

    private final long e(String str) {
        String str2 = this.f1704c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent a() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void b() {
        if (this.d == null) {
            a("Activity context is not available.");
            return;
        }
        q.c();
        if (!C2452wk.f(this.d).d()) {
            a("This feature is not available on the device.");
            return;
        }
        q.c();
        AlertDialog.Builder e2 = C2452wk.e(this.d);
        Resources b2 = q.g().b();
        e2.setTitle(b2 != null ? b2.getString(a.s5) : "Create calendar event");
        e2.setMessage(b2 != null ? b2.getString(a.s6) : "Allow Ad to create a calendar event?");
        e2.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new DialogInterface$OnClickListenerC0324Fg(this));
        e2.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new DialogInterface$OnClickListenerC0298Eg(this));
        e2.create().show();
    }
}
