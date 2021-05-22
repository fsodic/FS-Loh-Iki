package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.internal.ads.C1162dx;
import com.google.android.gms.internal.ads.C1590kL;
import com.google.android.gms.internal.ads.C2537xu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

public final class XK extends AbstractBinderC0561Oj {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f3490a = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f3491b = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f3492c = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    private static final List<String> d = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private AbstractC0229Bp e;
    private Context f;
    private C1955pca g;
    private C0823Yl h;
    private RR<C1306gC> i;
    private final VW j;
    private final ScheduledExecutorService k;
    private C2101rh l;
    private Point m = new Point();
    private Point n = new Point();

    public XK(AbstractC0229Bp bp, Context context, C1955pca pca, C0823Yl yl, RR<C1306gC> rr, VW vw, ScheduledExecutorService scheduledExecutorService) {
        this.e = bp;
        this.f = context;
        this.g = pca;
        this.h = yl;
        this.i = rr;
        this.j = vw;
        this.k = scheduledExecutorService;
    }

    private final SW<String> F(String str) {
        C1306gC[] gCVarArr = new C1306gC[1];
        SW a2 = JW.a(this.i.a(), new C1177eL(this, gCVarArr, str), this.j);
        a2.a(new RunnableC1384hL(this, gCVarArr), this.j);
        return AW.c(a2).a((long) ((Integer) C2392voa.e().a(C2474x.Le)).intValue(), TimeUnit.MILLISECONDS, this.k).a(C1040cL.f3984a, this.j).a(Exception.class, C1246fL.f4284a, this.j);
    }

    private final boolean Wb() {
        Map<String, WeakReference<View>> map;
        C2101rh rhVar = this.l;
        return (rhVar == null || (map = rhVar.f5442b) == null || map.isEmpty()) ? false : true;
    }

    static /* synthetic */ Uri a(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? a(uri, "nas", str) : uri;
    }

    private static Uri a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i2 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i2) + str + "=" + str2 + "&" + uri2.substring(i2));
    }

    static /* synthetic */ ArrayList a(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (b(uri) && !TextUtils.isEmpty(str)) {
                uri = a(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    private static boolean a(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String str : list) {
                if (path.contains(str)) {
                    for (String str2 : list2) {
                        if (host.endsWith(str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Uri a(Uri uri, a aVar) {
        try {
            uri = this.g.a(uri, this.f, (View) b.Q(aVar), null);
        } catch (Rba e2) {
            C0745Vl.c(BuildConfig.FLAVOR, e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean b(Uri uri) {
        return a(uri, f3492c, d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(Uri uri) {
        return JW.a(F("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new C1109dL(this, uri), this.j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(ArrayList arrayList) {
        return JW.a(F("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new C0902aL(this, arrayList), this.j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C1306gC[] gCVarArr, String str, C1306gC gCVar) {
        gCVarArr[0] = gCVar;
        Context context = this.f;
        C2101rh rhVar = this.l;
        Map<String, WeakReference<View>> map = rhVar.f5442b;
        JSONObject a2 = C2592yl.a(context, map, map, rhVar.f5441a);
        JSONObject a3 = C2592yl.a(this.f, this.l.f5441a);
        JSONObject a4 = C2592yl.a(this.l.f5441a);
        JSONObject b2 = C2592yl.b(this.f, this.l.f5441a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", a2);
        jSONObject.put("ad_view_signal", a3);
        jSONObject.put("scroll_view_signal", a4);
        jSONObject.put("lock_screen_signal", b2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", C2592yl.a((String) null, this.f, this.n, this.m));
        }
        return gCVar.a(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList a(List list, a aVar) {
        String a2 = this.g.a() != null ? this.g.a().a(this.f, (View) b.Q(aVar), (Activity) null) : BuildConfig.FLAVOR;
        if (!TextUtils.isEmpty(a2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!b(uri)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    C0745Vl.d(sb.toString());
                } else {
                    uri = a(uri, "ms", a2);
                }
                arrayList.add(uri);
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0509Mj
    public final void a(a aVar, C0587Pj pj, AbstractC0483Lj lj) {
        this.f = (Context) b.Q(aVar);
        Context context = this.f;
        String str = pj.f2872a;
        String str2 = pj.f2873b;
        C1015boa boa = pj.f2874c;
        Zna zna = pj.d;
        UK o = this.e.o();
        C2537xu.a aVar2 = new C2537xu.a();
        aVar2.a(context);
        IR ir = new IR();
        if (str == null) {
            str = "adUnitId";
        }
        ir.a(str);
        if (zna == null) {
            zna = new Yna().a();
        }
        ir.a(zna);
        if (boa == null) {
            boa = new C1015boa();
        }
        ir.a(boa);
        aVar2.a(ir.d());
        o.a(aVar2.a());
        C1590kL.a aVar3 = new C1590kL.a();
        aVar3.a(str2);
        o.a(new C1590kL(aVar3));
        o.a(new C1162dx.a().a());
        JW.a(o.a().a(), new C1315gL(this, lj), this.e.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0509Mj
    public final void a(C2101rh rhVar) {
        this.l = rhVar;
        this.i.a(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0509Mj
    public final void a(List<Uri> list, a aVar, AbstractC1688lh lhVar) {
        if (!((Boolean) C2392voa.e().a(C2474x.Ke)).booleanValue()) {
            try {
                lhVar.d("The updating URL feature is not enabled.");
            } catch (RemoteException e2) {
                C0745Vl.b(BuildConfig.FLAVOR, e2);
            }
        } else {
            SW a2 = this.j.a(new WK(this, list, aVar));
            if (Wb()) {
                a2 = JW.a(a2, new _K(this), this.j);
            } else {
                C0745Vl.c("Asset view map is empty.");
            }
            JW.a(a2, new C1521jL(this, lhVar), this.e.a());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C1306gC[] gCVarArr) {
        if (gCVarArr[0] != null) {
            this.i.a(JW.a(gCVarArr[0]));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0509Mj
    public final void b(List<Uri> list, a aVar, AbstractC1688lh lhVar) {
        try {
            if (!((Boolean) C2392voa.e().a(C2474x.Ke)).booleanValue()) {
                lhVar.d("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                lhVar.d("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!a(uri, f3490a, f3491b)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    C0745Vl.d(sb.toString());
                    lhVar.a(list);
                    return;
                }
                SW a2 = this.j.a(new ZK(this, uri, aVar));
                if (Wb()) {
                    a2 = JW.a(a2, new C0971bL(this), this.j);
                } else {
                    C0745Vl.c("Asset view map is empty.");
                }
                JW.a(a2, new C1453iL(this, lhVar), this.e.a());
            }
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0509Mj
    public final a c(a aVar, a aVar2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0509Mj
    public final a f(a aVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0509Mj
    public final void r(a aVar) {
        if (((Boolean) C2392voa.e().a(C2474x.Ke)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) b.Q(aVar);
            C2101rh rhVar = this.l;
            this.m = C2592yl.a(motionEvent, rhVar == null ? null : rhVar.f5441a);
            if (motionEvent.getAction() == 0) {
                this.n = this.m;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.m;
            obtain.setLocation((float) point.x, (float) point.y);
            this.g.a(obtain);
            obtain.recycle();
        }
    }
}
