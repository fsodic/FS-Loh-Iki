package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.ads.internal.overlay.x;
import com.google.android.gms.ads.internal.overlay.z;
import com.google.android.gms.internal.ads.AbstractC0229Bp;
import com.google.android.gms.internal.ads.AbstractC0509Mj;
import com.google.android.gms.internal.ads.AbstractC0638Ri;
import com.google.android.gms.internal.ads.AbstractC0792Xg;
import com.google.android.gms.internal.ads.AbstractC0988bb;
import com.google.android.gms.internal.ads.AbstractC1017bpa;
import com.google.android.gms.internal.ads.AbstractC1194eb;
import com.google.android.gms.internal.ads.AbstractC1321gR;
import com.google.android.gms.internal.ads.AbstractC1413hh;
import com.google.android.gms.internal.ads.AbstractC1891of;
import com.google.android.gms.internal.ads.AbstractC2103ri;
import com.google.android.gms.internal.ads.BK;
import com.google.android.gms.internal.ads.BinderC1796nK;
import com.google.android.gms.internal.ads.BinderC1934pK;
import com.google.android.gms.internal.ads.C0823Yl;
import com.google.android.gms.internal.ads.C1015boa;
import com.google.android.gms.internal.ads.Eoa;
import com.google.android.gms.internal.ads.JP;
import com.google.android.gms.internal.ads.Loa;
import com.google.android.gms.internal.ads.ViewTreeObserver$OnGlobalLayoutListenerC1786nA;
import com.google.android.gms.internal.ads.ViewTreeObserver$OnGlobalLayoutListenerC1855oA;
import com.google.android.gms.internal.ads.Yoa;
import java.util.HashMap;

public class ClientApi extends Yoa {
    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC1413hh H(a aVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC1017bpa M(a aVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Loa a(a aVar, C1015boa boa, String str, int i) {
        return new l((Context) b.Q(aVar), boa, str, new C0823Yl(201604000, i, true, false));
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Loa a(a aVar, C1015boa boa, String str, AbstractC1891of ofVar, int i) {
        Context context = (Context) b.Q(aVar);
        JP j = AbstractC0229Bp.a(context, ofVar, i).j();
        j.a(str);
        j.a(context);
        return j.a().a();
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC0509Mj a(a aVar, AbstractC1891of ofVar, int i) {
        return AbstractC0229Bp.a((Context) b.Q(aVar), ofVar, i).p();
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Eoa b(a aVar, String str, AbstractC1891of ofVar, int i) {
        Context context = (Context) b.Q(aVar);
        return new BinderC1796nK(AbstractC0229Bp.a(context, ofVar, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Loa b(a aVar, C1015boa boa, String str, AbstractC1891of ofVar, int i) {
        Context context = (Context) b.Q(aVar);
        return new BK(AbstractC0229Bp.a(context, ofVar, i), context, boa, str);
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC1194eb b(a aVar, a aVar2, a aVar3) {
        return new ViewTreeObserver$OnGlobalLayoutListenerC1855oA((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Loa c(a aVar, C1015boa boa, String str, AbstractC1891of ofVar, int i) {
        Context context = (Context) b.Q(aVar);
        return new BinderC1934pK(AbstractC0229Bp.a(context, ofVar, i), context, boa, str);
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC0638Ri c(a aVar, String str, AbstractC1891of ofVar, int i) {
        Context context = (Context) b.Q(aVar);
        AbstractC1321gR n = AbstractC0229Bp.a(context, ofVar, i).n();
        n.a(context);
        n.a(str);
        return n.a().a();
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC2103ri c(a aVar, AbstractC1891of ofVar, int i) {
        Context context = (Context) b.Q(aVar);
        AbstractC1321gR n = AbstractC0229Bp.a(context, ofVar, i).n();
        n.a(context);
        return n.a().b();
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC0988bb d(a aVar, a aVar2) {
        return new ViewTreeObserver$OnGlobalLayoutListenerC1786nA((FrameLayout) b.Q(aVar), (FrameLayout) b.Q(aVar2), 201604000);
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC1017bpa d(a aVar, int i) {
        return AbstractC0229Bp.a((Context) b.Q(aVar), i).g();
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC0792Xg w(a aVar) {
        Activity activity = (Activity) b.Q(aVar);
        AdOverlayInfoParcel a2 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a2 == null) {
            return new r(activity);
        }
        int i = a2.k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new r(activity) : new u(activity, a2) : new z(activity) : new x(activity) : new s(activity);
    }
}
