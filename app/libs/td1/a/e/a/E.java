package a.e.a;

import a.c.b;
import a.e.a.F;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class E implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ O f69a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f70b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f71c;
    final /* synthetic */ F.a d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ View f;
    final /* synthetic */ ComponentCallbacksC0045h g;
    final /* synthetic */ ComponentCallbacksC0045h h;
    final /* synthetic */ boolean i;
    final /* synthetic */ ArrayList j;
    final /* synthetic */ Object k;
    final /* synthetic */ Rect l;

    E(O o, b bVar, Object obj, F.a aVar, ArrayList arrayList, View view, ComponentCallbacksC0045h hVar, ComponentCallbacksC0045h hVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f69a = o;
        this.f70b = bVar;
        this.f71c = obj;
        this.d = aVar;
        this.e = arrayList;
        this.f = view;
        this.g = hVar;
        this.h = hVar2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    public void run() {
        b<String, View> a2 = F.a(this.f69a, this.f70b, this.f71c, this.d);
        if (a2 != null) {
            this.e.addAll(a2.values());
            this.e.add(this.f);
        }
        F.a(this.g, this.h, this.i, a2, false);
        Object obj = this.f71c;
        if (obj != null) {
            this.f69a.b(obj, this.j, this.e);
            View a3 = F.a(a2, this.d, this.k, this.i);
            if (a3 != null) {
                this.f69a.a(a3, this.l);
            }
        }
    }
}
