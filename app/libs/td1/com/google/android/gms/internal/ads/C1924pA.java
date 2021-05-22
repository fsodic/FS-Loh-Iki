package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.pA  reason: case insensitive filesystem */
public final class C1924pA {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1901ok f5196a;

    /* renamed from: b  reason: collision with root package name */
    private final GR f5197b;

    /* renamed from: c  reason: collision with root package name */
    private final C0811Xz f5198c;
    private final C0707Tz d;
    private final C2475xA e;
    private final FA f;
    private final Executor g;
    private final Executor h;
    private final C0578Pa i;
    private final C0681Sz j;

    public C1924pA(AbstractC1901ok okVar, GR gr, C0811Xz xz, C0707Tz tz, C2475xA xAVar, FA fa, Executor executor, Executor executor2, C0681Sz sz) {
        this.f5196a = okVar;
        this.f5197b = gr;
        this.i = gr.i;
        this.f5198c = xz;
        this.d = tz;
        this.e = xAVar;
        this.f = fa;
        this.g = executor;
        this.h = executor2;
        this.j = sz;
    }

    private static void a(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* access modifiers changed from: private */
    public static boolean a(OA oa, String[] strArr) {
        Map<String, WeakReference<View>> Ob = oa.Ob();
        if (Ob == null) {
            return false;
        }
        for (String str : strArr) {
            if (Ob.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final void a(OA oa) {
        this.g.execute(new RunnableC2130sA(this, oa));
    }

    public final boolean a(ViewGroup viewGroup) {
        View s = this.d.s();
        if (s == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (s.getParent() instanceof ViewGroup) {
            ((ViewGroup) s.getParent()).removeView(s);
        }
        viewGroup.addView(s, ((Boolean) C2392voa.e().a(C2474x.gc)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.d.s() == null) {
            return;
        }
        if (2 == this.d.o() || 1 == this.d.o()) {
            this.f5196a.a(this.f5197b.f, String.valueOf(this.d.o()), z);
        } else if (6 == this.d.o()) {
            this.f5196a.a(this.f5197b.f, "2", z);
            this.f5196a.a(this.f5197b.f, "1", z);
        }
    }

    public final void b(OA oa) {
        if (oa != null && this.e != null && oa.Jb() != null && this.f5198c.c()) {
            try {
                oa.Jb().addView(this.e.a());
            } catch (C2391vo e2) {
                C1763mk.e("web view can not be obtained", e2);
            }
        }
    }

    public final void c(OA oa) {
        if (oa != null) {
            Context context = oa.Nb().getContext();
            if (C2592yl.a(this.f5198c.f3531a)) {
                if (!(context instanceof Activity)) {
                    C0745Vl.a("Activity context is needed for policy validator.");
                } else if (this.f != null && oa.Jb() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f.a(this.f5198c.f3531a, oa.Jb(), windowManager), C2592yl.a());
                    } catch (C2391vo e2) {
                        C1763mk.e("web view can not be obtained", e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(OA oa) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        a aVar;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        int i2 = 0;
        a aVar2 = null;
        if (this.f5198c.e() || this.f5198c.d()) {
            String[] strArr = {"1098", "3011"};
            int i3 = 0;
            while (true) {
                if (i3 < 2) {
                    View E = oa.E(strArr[i3]);
                    if (E != null && (E instanceof ViewGroup)) {
                        viewGroup = (ViewGroup) E;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
        }
        viewGroup = null;
        boolean z = viewGroup != null;
        Context context = oa.Nb().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.d.p() != null) {
            view = this.d.p();
            C0578Pa pa = this.i;
            if (pa != null && !z) {
                a(layoutParams, pa.e);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(this.d.A() instanceof BinderC0344Ga)) {
            view = null;
        } else {
            BinderC0344Ga ga = (BinderC0344Ga) this.d.A();
            if (!z) {
                a(layoutParams, ga.ac());
            }
            View ja = new C0422Ja(context, ga, layoutParams);
            ja.setContentDescription((CharSequence) C2392voa.e().a(C2474x.dc));
            view = ja;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.b.a aVar3 = new com.google.android.gms.ads.b.a(oa.Nb().getContext());
                aVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                aVar3.addView(view);
                FrameLayout Jb = oa.Jb();
                if (Jb != null) {
                    Jb.addView(aVar3);
                }
            }
            oa.a(oa.Pb(), view, true);
        }
        String[] strArr2 = ViewTreeObserver$OnGlobalLayoutListenerC1786nA.f5016a;
        int length = strArr2.length;
        while (true) {
            if (i2 >= length) {
                viewGroup2 = null;
                break;
            }
            View E2 = oa.E(strArr2[i2]);
            if (E2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) E2;
                break;
            }
            i2++;
        }
        this.h.execute(new RunnableC2061rA(this, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (!a(viewGroup2)) {
            viewGroup2.removeAllViews();
            View Nb = oa.Nb();
            Context context2 = Nb != null ? Nb.getContext() : null;
            if (context2 != null) {
                if (((Boolean) C2392voa.e().a(C2474x.cc)).booleanValue()) {
                    AbstractC0708Ua a2 = this.j.a();
                    if (a2 != null) {
                        try {
                            aVar = a2.Pa();
                        } catch (RemoteException unused) {
                            C0745Vl.d("Could not get main image drawable");
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    AbstractC0812Ya q = this.d.q();
                    if (q != null) {
                        try {
                            aVar = q.Ja();
                        } catch (RemoteException unused2) {
                            C0745Vl.d("Could not get drawable from image");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (aVar != null && (drawable = (Drawable) b.Q(aVar)) != null) {
                    ImageView imageView = new ImageView(context2);
                    imageView.setImageDrawable(drawable);
                    if (oa != null) {
                        aVar2 = oa.Lb();
                    }
                    if (aVar2 != null) {
                        if (((Boolean) C2392voa.e().a(C2474x.ee)).booleanValue()) {
                            scaleType = (ImageView.ScaleType) b.Q(aVar2);
                            imageView.setScaleType(scaleType);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    }
                    scaleType = ImageView.ScaleType.CENTER_INSIDE;
                    imageView.setScaleType(scaleType);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
        } else if (this.d.t() != null) {
            this.d.t().a(new C2268uA(this, oa, viewGroup2));
        }
    }
}
