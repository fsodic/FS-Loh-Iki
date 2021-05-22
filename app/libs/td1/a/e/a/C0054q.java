package a.e.a;

import a.e.a.u;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* access modifiers changed from: package-private */
/* renamed from: a.e.a.q  reason: case insensitive filesystem */
public class C0054q extends u.b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewGroup f129b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0045h f130c;
    final /* synthetic */ u d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0054q(u uVar, Animation.AnimationListener animationListener, ViewGroup viewGroup, ComponentCallbacksC0045h hVar) {
        super(animationListener);
        this.d = uVar;
        this.f129b = viewGroup;
        this.f130c = hVar;
    }

    @Override // a.e.a.u.b
    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.f129b.post(new RunnableC0053p(this));
    }
}
