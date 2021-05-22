package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C1511jB;
import java.util.Iterator;
import java.util.LinkedList;
import org.cocos2dx.lib.GameControllerDelegate;

public abstract class MW implements AbstractC1740mX {

    /* renamed from: a  reason: collision with root package name */
    protected static volatile C1823nfa f2593a;

    /* renamed from: b  reason: collision with root package name */
    protected MotionEvent f2594b;

    /* renamed from: c  reason: collision with root package name */
    protected LinkedList<MotionEvent> f2595c = new LinkedList<>();
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    protected double k;
    private double l;
    private double m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    private boolean r = false;
    protected boolean s = false;
    protected DisplayMetrics t;

    protected MW(Context context) {
        try {
            if (((Boolean) C2392voa.e().a(C2474x.Hb)).booleanValue()) {
                C2485xK.a();
            } else {
                C2374vfa.a(f2593a);
            }
            this.t = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String a(Context context, String str, int i2, View view, Activity activity, byte[] bArr) {
        String str2;
        C1670lW lWVar;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) C2392voa.e().a(C2474x.wb)).booleanValue();
        C1511jB.a aVar = null;
        if (booleanValue) {
            lWVar = f2593a != null ? f2593a.j() : null;
            str2 = ((Boolean) C2392voa.e().a(C2474x.Hb)).booleanValue() ? "be" : "te";
        } else {
            lWVar = null;
            str2 = null;
        }
        try {
            if (i2 == XJ.g) {
                aVar = b(context, view, activity);
                this.r = true;
                i3 = GameControllerDelegate.THUMBSTICK_RIGHT_X;
            } else if (i2 == XJ.f) {
                aVar = c(context, view, activity);
                i3 = GameControllerDelegate.BUTTON_Y;
            } else {
                aVar = a(context, null);
                i3 = 1000;
            }
            if (booleanValue && lWVar != null) {
                lWVar.a(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e2) {
            if (booleanValue && lWVar != null) {
                lWVar.a(i2 == XJ.g ? GameControllerDelegate.THUMBSTICK_RIGHT_Y : i2 == XJ.f ? GameControllerDelegate.BUTTON_Z : i2 == XJ.e ? GameControllerDelegate.THUMBSTICK_LEFT_Y : -1, -1, System.currentTimeMillis() - currentTimeMillis, str2, e2);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (aVar != null) {
            try {
                if (((C1511jB) ((AbstractC2092rca) aVar.j())).e() != 0) {
                    String a2 = C2485xK.a((C1511jB) ((AbstractC2092rca) aVar.j()), str);
                    if (!booleanValue || lWVar == null) {
                        return a2;
                    }
                    lWVar.a(i2 == XJ.g ? GameControllerDelegate.BUTTON_C : i2 == XJ.f ? GameControllerDelegate.BUTTON_DPAD_UP : i2 == XJ.e ? GameControllerDelegate.BUTTON_A : -1, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return a2;
                }
            } catch (Exception e3) {
                String num = Integer.toString(7);
                if (!booleanValue || lWVar == null) {
                    return num;
                }
                lWVar.a(i2 == XJ.g ? GameControllerDelegate.BUTTON_X : i2 == XJ.f ? GameControllerDelegate.BUTTON_DPAD_DOWN : i2 == XJ.e ? GameControllerDelegate.BUTTON_B : -1, -1, System.currentTimeMillis() - currentTimeMillis2, str2, e3);
                return num;
            }
        }
        return Integer.toString(5);
    }

    private final void a() {
        this.h = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.i = 0;
        this.j = 0;
        if (this.f2595c.size() > 0) {
            Iterator<MotionEvent> it = this.f2595c.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f2595c.clear();
        } else {
            MotionEvent motionEvent = this.f2594b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f2594b = null;
    }

    /* access modifiers changed from: protected */
    public abstract long a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    public abstract C1511jB.a a(Context context, C0289Dx dx);

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public String a(Context context) {
        if (C2512xfa.a()) {
            if (((Boolean) C2392voa.e().a(C2474x.Jb)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return a(context, null, XJ.e, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public String a(Context context, View view, Activity activity) {
        return a(context, null, XJ.f, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public String a(Context context, String str, View view, Activity activity) {
        return a(context, str, XJ.g, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public void a(int i2, int i3, int i4) {
        MotionEvent motionEvent;
        if (this.f2594b != null) {
            if (((Boolean) C2392voa.e().a(C2474x.ub)).booleanValue()) {
                a();
            } else {
                this.f2594b.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.t;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            motionEvent = MotionEvent.obtain(0, (long) i4, 1, ((float) i2) * f2, ((float) i3) * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.f2594b = motionEvent;
        this.s = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public void a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.r) {
            a();
            this.r = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.l = (double) motionEvent.getRawX();
            this.m = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d2 = this.l;
            Double.isNaN(rawX);
            double d3 = rawX - d2;
            double d4 = this.m;
            Double.isNaN(rawY);
            double d5 = rawY - d4;
            this.k += Math.sqrt((d3 * d3) + (d5 * d5));
            this.l = rawX;
            this.m = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.n = motionEvent.getX();
            this.o = motionEvent.getY();
            this.p = motionEvent.getRawX();
            this.q = motionEvent.getRawY();
            this.d++;
        } else if (action2 == 1) {
            this.f2594b = MotionEvent.obtain(motionEvent);
            this.f2595c.add(this.f2594b);
            if (this.f2595c.size() > 6) {
                this.f2595c.remove().recycle();
            }
            this.f++;
            this.h = a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.e += (long) (motionEvent.getHistorySize() + 1);
            try {
                C2305ufa b2 = b(motionEvent);
                if ((b2 == null || b2.e == null || b2.h == null) ? false : true) {
                    this.i += b2.e.longValue() + b2.h.longValue();
                }
                if (!(this.t == null || b2 == null || b2.f == null || b2.i == null)) {
                    z = true;
                }
                if (z) {
                    this.j += b2.f.longValue() + b2.i.longValue();
                }
            } catch (C1616kfa unused) {
            }
        } else if (action2 == 3) {
            this.g++;
        }
        this.s = true;
    }

    /* access modifiers changed from: protected */
    public abstract C1511jB.a b(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract C2305ufa b(MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    public abstract C1511jB.a c(Context context, View view, Activity activity);
}
