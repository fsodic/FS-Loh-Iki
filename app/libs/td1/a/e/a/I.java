package a.e.a;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

class I implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f83a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f84b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f85c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ Object e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ K g;

    I(K k, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = k;
        this.f83a = obj;
        this.f84b = arrayList;
        this.f85c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.f83a;
        if (obj != null) {
            this.g.a(obj, this.f84b, (ArrayList<View>) null);
        }
        Object obj2 = this.f85c;
        if (obj2 != null) {
            this.g.a(obj2, this.d, (ArrayList<View>) null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            this.g.a(obj3, this.f, (ArrayList<View>) null);
        }
    }
}
