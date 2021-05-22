package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.vL  reason: case insensitive filesystem */
public final class C2348vL implements AbstractC1180eO<C2417wL> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f5798a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5799b;

    /* renamed from: c  reason: collision with root package name */
    private final GR f5800c;
    private final View d;

    public C2348vL(VW vw, Context context, GR gr, ViewGroup viewGroup) {
        this.f5798a = vw;
        this.f5799b = context;
        this.f5800c = gr;
        this.d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C2417wL> a() {
        return this.f5798a.a(new CallableC2624zL(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2417wL b() {
        Context context = this.f5799b;
        C1015boa boa = this.f5800c.e;
        ArrayList arrayList = new ArrayList();
        View view = this.d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int i = -1;
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new C2417wL(context, boa, arrayList);
    }
}
