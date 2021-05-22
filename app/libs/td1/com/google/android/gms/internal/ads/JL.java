package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;

public final class JL implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final C1015boa f2311a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2312b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2313c;
    private final String d;
    private final float e;
    private final int f;
    private final int g;
    private final String h;
    private final boolean i;

    public JL(C1015boa boa, String str, boolean z, String str2, float f2, int i2, int i3, String str3, boolean z2) {
        r.a(boa, "the adSize must not be null");
        this.f2311a = boa;
        this.f2312b = str;
        this.f2313c = z;
        this.d = str2;
        this.e = f2;
        this.f = i2;
        this.g = i3;
        this.h = str3;
        this.i = z2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        LR.a(bundle2, "smart_w", "full", this.f2311a.e == -1);
        LR.a(bundle2, "smart_h", "auto", this.f2311a.f3941b == -2);
        LR.a(bundle2, "ene", (Boolean) true, this.f2311a.j);
        LR.a(bundle2, "rafmt", "102", this.f2311a.m);
        LR.a(bundle2, "rafmt", "103", this.f2311a.n);
        LR.a(bundle2, "inline_adaptive_slot", (Boolean) true, this.i);
        LR.a(bundle2, "format", this.f2312b);
        LR.a(bundle2, "fluid", "height", this.f2313c);
        String str = this.d;
        LR.a(bundle2, "sz", str, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.e);
        bundle2.putInt("sw", this.f);
        bundle2.putInt("sh", this.g);
        String str2 = this.h;
        LR.a(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        C1015boa[] boaArr = this.f2311a.g;
        if (boaArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f2311a.f3941b);
            bundle3.putInt("width", this.f2311a.e);
            bundle3.putBoolean("is_fluid_height", this.f2311a.i);
            arrayList.add(bundle3);
        } else {
            for (C1015boa boa : boaArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", boa.i);
                bundle4.putInt("height", boa.f3941b);
                bundle4.putInt("width", boa.e);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
