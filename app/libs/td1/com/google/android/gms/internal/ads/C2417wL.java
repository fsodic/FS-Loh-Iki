package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.q;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wL  reason: case insensitive filesystem */
public final class C2417wL implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5879a;

    /* renamed from: b  reason: collision with root package name */
    private final C1015boa f5880b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Parcelable> f5881c;

    public C2417wL(Context context, C1015boa boa, List<Parcelable> list) {
        this.f5879a = context;
        this.f5880b = boa;
        this.f5881c = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (C2156sa.f5521a.a().booleanValue()) {
            Bundle bundle3 = new Bundle();
            q.c();
            bundle3.putString("activity", C2452wk.g(this.f5879a));
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.f5880b.e);
            bundle4.putInt("height", this.f5880b.f3941b);
            bundle3.putBundle("size", bundle4);
            if (this.f5881c.size() > 0) {
                List<Parcelable> list = this.f5881c;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
