package a.e.a;

import android.graphics.Rect;
import android.transition.Transition;

class J extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Rect f86a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ K f87b;

    J(K k, Rect rect) {
        this.f87b = k;
        this.f86a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f86a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f86a;
    }
}
