package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.e;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Hg  reason: case insensitive filesystem */
public final class C0376Hg extends C0662Sg {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f2156c = e.a("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String d = "top-right";
    private boolean e = true;
    private int f = 0;
    private int g = 0;
    private int h = -1;
    private int i = 0;
    private int j = 0;
    private int k = -1;
    private final Object l = new Object();
    private final AbstractC1564jo m;
    private final Activity n;
    private C1153dp o;
    private ImageView p;
    private LinearLayout q;
    private AbstractC0636Rg r;
    private PopupWindow s;
    private RelativeLayout t;
    private ViewGroup u;

    public C0376Hg(AbstractC1564jo joVar, AbstractC0636Rg rg) {
        super(joVar, "resize");
        this.m = joVar;
        this.n = joVar.v();
        this.r = rg;
    }

    public final void a(int i2, int i3) {
        this.f = i2;
        this.g = i3;
    }

    public final void a(int i2, int i3, boolean z) {
        synchronized (this.l) {
            this.f = i2;
            this.g = i3;
            PopupWindow popupWindow = this.s;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0423  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 1250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0376Hg.a(java.util.Map):void");
    }

    public final void a(boolean z) {
        synchronized (this.l) {
            if (this.s != null) {
                this.s.dismiss();
                this.t.removeView(this.m.getView());
                if (this.u != null) {
                    this.u.removeView(this.p);
                    this.u.addView(this.m.getView());
                    this.m.a(this.o);
                }
                if (z) {
                    c("default");
                    if (this.r != null) {
                        this.r.b();
                    }
                }
                this.s = null;
                this.t = null;
                this.u = null;
                this.q = null;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.l) {
            z = this.s != null;
        }
        return z;
    }
}
