package a.e.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public class r extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup f131a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f132b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0045h f133c;
    final /* synthetic */ u d;

    r(u uVar, ViewGroup viewGroup, View view, ComponentCallbacksC0045h hVar) {
        this.d = uVar;
        this.f131a = viewGroup;
        this.f132b = view;
        this.f133c = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f131a.endViewTransition(this.f132b);
        Animator h = this.f133c.h();
        this.f133c.a((Animator) null);
        if (h != null && this.f131a.indexOfChild(this.f132b) < 0) {
            u uVar = this.d;
            ComponentCallbacksC0045h hVar = this.f133c;
            uVar.a(hVar, hVar.x(), 0, 0, false);
        }
    }
}
