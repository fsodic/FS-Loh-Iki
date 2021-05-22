package com.google.android.gms.ads.b;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.l;
import com.google.android.gms.internal.ads.AbstractC0448Ka;
import com.google.android.gms.internal.ads.AbstractC0500Ma;

public class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private l f1023a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1024b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC0448Ka f1025c;
    private ImageView.ScaleType d;
    private boolean e;
    private AbstractC0500Ma f;

    public b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(AbstractC0448Ka ka) {
        this.f1025c = ka;
        if (this.f1024b) {
            ka.a(this.f1023a);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(AbstractC0500Ma ma) {
        this.f = ma;
        if (this.e) {
            ma.a(this.d);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.e = true;
        this.d = scaleType;
        AbstractC0500Ma ma = this.f;
        if (ma != null) {
            ma.a(this.d);
        }
    }

    public void setMediaContent(l lVar) {
        this.f1024b = true;
        this.f1023a = lVar;
        AbstractC0448Ka ka = this.f1025c;
        if (ka != null) {
            ka.a(lVar);
        }
    }
}
