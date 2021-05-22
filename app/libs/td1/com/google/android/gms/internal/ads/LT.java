package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.cocos2dx.lib.BuildConfig;

public final class LT {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2490a;

    /* renamed from: b  reason: collision with root package name */
    private final C0849Zl f2491b;

    /* renamed from: c  reason: collision with root package name */
    private final OI f2492c;
    private final String d;
    private final String e;
    private final String f;
    private final Context g;
    private final AR h;
    private final d i;
    private final C1955pca j;

    public LT(Executor executor, C0849Zl zl, OI oi, C0823Yl yl, String str, String str2, Context context, AR ar, d dVar, C1955pca pca) {
        this.f2490a = executor;
        this.f2491b = zl;
        this.f2492c = oi;
        this.d = yl.f3587a;
        this.e = str;
        this.f = str2;
        this.g = context;
        this.h = ar;
        this.i = dVar;
        this.j = pca;
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = BuildConfig.FLAVOR;
        }
        return str.replaceAll(str2, str3);
    }

    private static String c(String str) {
        return (TextUtils.isEmpty(str) || !C0563Ol.a()) ? str : "fakeForAdDebugLog";
    }

    public final void a(BR br, C1941pR pRVar, List<String> list) {
        a(br, pRVar, false, BuildConfig.FLAVOR, BuildConfig.FLAVOR, list);
    }

    public final void a(BR br, C1941pR pRVar, List<String> list, AbstractC1897oi oiVar) {
        long a2 = this.i.a();
        try {
            String type = oiVar.getType();
            String num = Integer.toString(oiVar.A());
            ArrayList arrayList = new ArrayList();
            AR ar = this.h;
            String str = BuildConfig.FLAVOR;
            String c2 = ar == null ? str : c(ar.f1511a);
            AR ar2 = this.h;
            if (ar2 != null) {
                str = c(ar2.f1512b);
            }
            for (String str2 : list) {
                arrayList.add(C0431Jj.a(a(a(a(a(a(a(str2, "@gw_rwd_userid@", Uri.encode(c2)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(a2)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.d), this.g, pRVar.N));
            }
            a(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void a(BR br, C1941pR pRVar, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z ? "1" : "0";
        for (String str4 : list) {
            String a2 = a(a(a(str4, "@gw_adlocid@", br.f1610a.f5888a.f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.d);
            if (pRVar != null) {
                a2 = C0431Jj.a(a(a(a(a2, "@gw_qdata@", pRVar.v), "@gw_adnetid@", pRVar.u), "@gw_allocid@", pRVar.t), this.g, pRVar.N);
            }
            String a3 = a(a(a(a2, "@gw_adnetstatus@", this.f2492c.a()), "@gw_seqnum@", this.e), "@gw_sessid@", this.f);
            boolean z2 = ((Boolean) C2392voa.e().a(C2474x.Sb)).booleanValue() && !TextUtils.isEmpty(str);
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z2 || isEmpty) {
                if (this.j.a(Uri.parse(a3))) {
                    Uri.Builder buildUpon = Uri.parse(a3).buildUpon();
                    if (z2) {
                        buildUpon = buildUpon.appendQueryParameter("ms", str);
                    }
                    if (isEmpty) {
                        buildUpon = buildUpon.appendQueryParameter("attok", str2);
                    }
                    a3 = buildUpon.build().toString();
                }
            }
            arrayList.add(a3);
        }
        a(arrayList);
    }

    public final void a(String str) {
        this.f2490a.execute(new OT(this, str));
    }

    public final void a(List<String> list) {
        for (String str : list) {
            a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f2491b.a(str);
    }
}
