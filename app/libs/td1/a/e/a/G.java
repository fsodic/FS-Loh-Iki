package a.e.a;

import android.graphics.Rect;
import android.transition.Transition;

class G extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Rect f78a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ K f79b;

    G(K k, Rect rect) {
        this.f79b = k;
        this.f78a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f78a;
    }
}
