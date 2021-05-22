package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.Hpa;
import com.google.android.gms.internal.ads.Ona;

/* access modifiers changed from: package-private */
public class i extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final Hpa f1071a;

    public i(Context context, int i) {
        super(context);
        this.f1071a = new Hpa(this, i);
    }

    public void a() {
        this.f1071a.a();
    }

    public void a(e eVar) {
        this.f1071a.a(eVar.a());
    }

    public void b() {
        this.f1071a.l();
    }

    public void c() {
        this.f1071a.m();
    }

    public c getAdListener() {
        return this.f1071a.b();
    }

    public f getAdSize() {
        return this.f1071a.c();
    }

    public String getAdUnitId() {
        return this.f1071a.e();
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        return this.f1071a.g();
    }

    public r getResponseInfo() {
        return this.f1071a.i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            f fVar = null;
            try {
                fVar = getAdSize();
            } catch (NullPointerException e) {
                C0745Vl.b("Unable to retrieve ad size.", e);
            }
            if (fVar != null) {
                Context context = getContext();
                int b2 = fVar.b(context);
                i3 = fVar.a(context);
                i4 = b2;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(c cVar) {
        this.f1071a.a(cVar);
        if (cVar == null) {
            this.f1071a.a((Ona) null);
            this.f1071a.a((a) null);
            return;
        }
        if (cVar instanceof Ona) {
            this.f1071a.a((Ona) cVar);
        }
        if (cVar instanceof a) {
            this.f1071a.a((a) cVar);
        }
    }

    public void setAdSize(f fVar) {
        this.f1071a.a(fVar);
    }

    public void setAdUnitId(String str) {
        this.f1071a.a(str);
    }

    public void setOnPaidEventListener(o oVar) {
        this.f1071a.a(oVar);
    }
}
