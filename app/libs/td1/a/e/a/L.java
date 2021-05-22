package a.e.a;

import a.d.c.c;
import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class L implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f88a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f89b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ArrayList f90c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ O f;

    L(O o, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f = o;
        this.f88a = i;
        this.f89b = arrayList;
        this.f90c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f88a; i++) {
            c.a((View) this.f89b.get(i), (String) this.f90c.get(i));
            c.a((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
