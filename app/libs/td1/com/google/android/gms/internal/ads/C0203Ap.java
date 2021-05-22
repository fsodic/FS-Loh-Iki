package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.h;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Ap  reason: case insensitive filesystem */
public class C0203Ap {

    /* renamed from: a  reason: collision with root package name */
    private final C0823Yl f1563a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1564b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Context> f1565c;

    /* renamed from: com.google.android.gms.internal.ads.Ap$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private C0823Yl f1566a;

        /* renamed from: b  reason: collision with root package name */
        private Context f1567b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<Context> f1568c;

        public final a a(Context context) {
            this.f1568c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f1567b = context;
            return this;
        }

        public final a a(C0823Yl yl) {
            this.f1566a = yl;
            return this;
        }
    }

    private C0203Ap(a aVar) {
        this.f1563a = aVar.f1566a;
        this.f1564b = aVar.f1567b;
        this.f1565c = aVar.f1568c;
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f1564b;
    }

    /* access modifiers changed from: package-private */
    public final WeakReference<Context> b() {
        return this.f1565c;
    }

    /* access modifiers changed from: package-private */
    public final C0823Yl c() {
        return this.f1563a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return q.c().b(this.f1564b, this.f1563a.f3587a);
    }

    public final C1955pca e() {
        return new C1955pca(new h(this.f1564b, this.f1563a));
    }
}
