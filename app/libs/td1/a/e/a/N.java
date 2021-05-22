package a.e.a;

import a.d.c.c;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* access modifiers changed from: package-private */
public class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f94a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f95b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ O f96c;

    N(O o, ArrayList arrayList, Map map) {
        this.f96c = o;
        this.f94a = arrayList;
        this.f95b = map;
    }

    public void run() {
        int size = this.f94a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f94a.get(i);
            c.a(view, (String) this.f95b.get(c.a(view)));
        }
    }
}
