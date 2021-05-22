package a.e.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public class s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup f134a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f135b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0045h f136c;
    final /* synthetic */ u d;

    s(u uVar, ViewGroup viewGroup, View view, ComponentCallbacksC0045h hVar) {
        this.d = uVar;
        this.f134a = viewGroup;
        this.f135b = view;
        this.f136c = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f134a.endViewTransition(this.f135b);
        animator.removeListener(this);
        View view = this.f136c.K;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
