package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.cocos2dx.lib.BuildConfig;

public abstract class JI<AdT> implements AbstractC1793nH<AdT> {
    private static Bundle a(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<AdT> a(BR br, C1941pR pRVar) {
        String optString = pRVar.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR);
        GR gr = br.f1610a.f5888a;
        IR ir = new IR();
        ir.a(gr);
        ir.a(optString);
        Bundle a2 = a(gr.d.m);
        Bundle a3 = a(a2.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        a3.putInt("gw", 1);
        String optString2 = pRVar.s.optString("mad_hac", null);
        if (optString2 != null) {
            a3.putString("mad_hac", optString2);
        }
        String optString3 = pRVar.s.optString("adJson", null);
        if (optString3 != null) {
            a3.putString("_ad", optString3);
        }
        a3.putBoolean("_noRefresh", true);
        Iterator<String> keys = pRVar.A.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = pRVar.A.optString(next, null);
            if (next != null) {
                a3.putString(next, optString4);
            }
        }
        a2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", a3);
        Zna zna = gr.d;
        ir.a(new Zna(zna.f3677a, zna.f3678b, a3, zna.d, zna.e, zna.f, zna.g, zna.h, zna.i, zna.j, zna.k, zna.l, a2, zna.n, zna.o, zna.p, zna.q, zna.r, zna.s, zna.t, zna.u, zna.v));
        GR d = ir.d();
        Bundle bundle = new Bundle();
        C2078rR rRVar = br.f1611b.f6181b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(rRVar.f5409a));
        bundle2.putInt("refresh_interval", rRVar.f5411c);
        bundle2.putString("gws_query_id", rRVar.f5410b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = br.f1610a.f5888a.f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", pRVar.t);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(pRVar.f5231c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(pRVar.d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(pRVar.n));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(pRVar.m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(pRVar.g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(pRVar.h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(pRVar.i));
        bundle3.putString("transaction_id", pRVar.j);
        bundle3.putString("valid_from_timestamp", pRVar.k);
        bundle3.putBoolean("is_closable_area_disabled", pRVar.H);
        if (pRVar.l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", pRVar.l.f2423b);
            bundle4.putString("rb_type", pRVar.l.f2422a);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return a(d, bundle);
    }

    /* access modifiers changed from: protected */
    public abstract SW<AdT> a(GR gr, Bundle bundle);

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        return !TextUtils.isEmpty(pRVar.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR));
    }
}
