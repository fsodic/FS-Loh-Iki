package a.e.a;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

class H implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f80a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f81b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ K f82c;

    H(K k, View view, ArrayList arrayList) {
        this.f82c = k;
        this.f80a = view;
        this.f81b = arrayList;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f80a.setVisibility(8);
        int size = this.f81b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f81b.get(i)).setVisibility(0);
        }
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
