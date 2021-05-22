package a.e.a;

import a.d.c.c;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* access modifiers changed from: package-private */
public class M implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f91a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f92b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ O f93c;

    M(O o, ArrayList arrayList, Map map) {
        this.f93c = o;
        this.f91a = arrayList;
        this.f92b = map;
    }

    public void run() {
        int size = this.f91a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f91a.get(i);
            String a2 = c.a(view);
            if (a2 != null) {
                c.a(view, O.a(this.f92b, a2));
            }
        }
    }
}
