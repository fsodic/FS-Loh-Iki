package a.e.a;

import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class C implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f63a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ O f64b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f65c;
    final /* synthetic */ ComponentCallbacksC0045h d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ ArrayList g;
    final /* synthetic */ Object h;

    C(Object obj, O o, View view, ComponentCallbacksC0045h hVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f63a = obj;
        this.f64b = o;
        this.f65c = view;
        this.d = hVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    public void run() {
        Object obj = this.f63a;
        if (obj != null) {
            this.f64b.b(obj, this.f65c);
            this.f.addAll(F.a(this.f64b, this.f63a, this.d, this.e, this.f65c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f65c);
                this.f64b.a(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.f65c);
        }
    }
}
