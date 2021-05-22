package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Nk  reason: case insensitive filesystem */
public final class C0536Nk {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2689a;

    /* renamed from: b  reason: collision with root package name */
    private String f2690b;

    /* renamed from: c  reason: collision with root package name */
    private String f2691c;
    private String d;
    private String e;
    private int f;
    private int g;
    private PointF h;
    private PointF i;
    private Handler j;
    private Runnable k;

    public C0536Nk(Context context) {
        this.f = 0;
        this.k = new RunnableC0614Qk(this);
        this.f2689a = context;
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        q.q().b();
        this.j = q.q().a();
    }

    public C0536Nk(Context context, String str) {
        this(context);
        this.f2690b = str;
    }

    private static int a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    private final boolean a(float f2, float f3, float f4, float f5) {
        return Math.abs(this.h.x - f2) < ((float) this.g) && Math.abs(this.h.y - f3) < ((float) this.g) && Math.abs(this.i.x - f4) < ((float) this.g) && Math.abs(this.i.y - f5) < ((float) this.g);
    }

    public final void a() {
        try {
            if (!(this.f2689a instanceof Activity)) {
                C0745Vl.c("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(q.m().a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = q.m().b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a2 = a((List<String>) arrayList, "Ad Information", true);
            int a3 = a((List<String>) arrayList, str, true);
            int a4 = a((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f2689a, q.e().d());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface$OnClickListenerC0588Pk(this, a2, a3, a4));
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            C1763mk.e(BuildConfig.FLAVOR, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0536Nk.a(int, int, int, android.content.DialogInterface, int):void");
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f = 0;
            this.h = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i2 = this.f;
        if (i2 != -1) {
            boolean z = true;
            if (i2 == 0 && actionMasked == 5) {
                this.f = 5;
                this.i = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.j.postDelayed(this.k, ((Long) C2392voa.e().a(C2474x.Lc)).longValue());
            } else if (this.f == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z2 = false;
                        for (int i3 = 0; i3 < historySize; i3++) {
                            if (!a(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3))) {
                                z2 = true;
                            }
                        }
                        if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.f = -1;
                    this.j.removeCallbacks(this.k);
                }
            }
        }
    }

    public final void a(String str) {
        this.f2691c = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, DialogInterface dialogInterface, int i2) {
        q.c();
        C2452wk.a(this.f2689a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        q.m().a(this.f2689a, this.f2691c, this.d, this.e);
    }

    public final void b(String str) {
        this.d = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        q.m().a(this.f2689a, this.f2691c, this.d);
    }

    public final void c(String str) {
        this.f2690b = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f = 4;
        a();
    }

    public final void d(String str) {
        this.e = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f2690b);
        sb.append(",DebugSignal: ");
        sb.append(this.e);
        sb.append(",AFMA Version: ");
        sb.append(this.d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f2691c);
        sb.append("}");
        return sb.toString();
    }
}
