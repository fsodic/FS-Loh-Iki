package com.google.android.gms.internal.ads;

import a.b.a.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.common.util.o;
import java.util.concurrent.Executor;

public final class NH implements AbstractC1793nH<C1990py> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2645a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0524My f2646b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2647c;
    private final C1803nR d;

    public NH(Context context, Executor executor, AbstractC0524My my, C1803nR nRVar) {
        this.f2645a = context;
        this.f2646b = my;
        this.f2647c = executor;
        this.d = nRVar;
    }

    private static String a(C1941pR pRVar) {
        try {
            return pRVar.s.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(Uri uri, BR br, C1941pR pRVar, Object obj) {
        try {
            a a2 = new a.C0001a().a();
            a2.f19a.setData(uri);
            d dVar = new d(a2.f19a);
            C1423hm hmVar = new C1423hm();
            AbstractC2127ry a3 = this.f2646b.a(new C2054qt(br, pRVar, null), new C2059qy(new PH(hmVar)));
            hmVar.b(new AdOverlayInfoParcel(dVar, null, a3.j(), null, new C0823Yl(0, 0, false)));
            this.d.c();
            return JW.a(a3.i());
        } catch (Throwable th) {
            C0745Vl.b("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<C1990py> a(BR br, C1941pR pRVar) {
        String a2 = a(pRVar);
        return JW.a(JW.a((Object) null), new QH(this, a2 != null ? Uri.parse(a2) : null, br, pRVar), this.f2647c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        return (this.f2645a instanceof Activity) && o.b() && W.a(this.f2645a) && !TextUtils.isEmpty(a(pRVar));
    }
}
