package a.e.a;

import a.c.b;
import android.graphics.Rect;
import android.view.View;

/* access modifiers changed from: package-private */
public class D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0045h f66a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0045h f67b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f68c;
    final /* synthetic */ b d;
    final /* synthetic */ View e;
    final /* synthetic */ O f;
    final /* synthetic */ Rect g;

    D(ComponentCallbacksC0045h hVar, ComponentCallbacksC0045h hVar2, boolean z, b bVar, View view, O o, Rect rect) {
        this.f66a = hVar;
        this.f67b = hVar2;
        this.f68c = z;
        this.d = bVar;
        this.e = view;
        this.f = o;
        this.g = rect;
    }

    public void run() {
        F.a(this.f66a, this.f67b, this.f68c, (b<String, View>) this.d, false);
        View view = this.e;
        if (view != null) {
            this.f.a(view, this.g);
        }
    }
}
