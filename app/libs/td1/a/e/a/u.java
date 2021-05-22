package a.e.a;

import a.e.a.AbstractC0051n;
import a.e.a.ComponentCallbacksC0045h;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
public final class u extends AbstractC0051n implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    static boolean f138a = false;

    /* renamed from: b  reason: collision with root package name */
    static Field f139b;

    /* renamed from: c  reason: collision with root package name */
    static final Interpolator f140c = new DecelerateInterpolator(2.5f);
    static final Interpolator d = new DecelerateInterpolator(1.5f);
    static final Interpolator e = new AccelerateInterpolator(2.5f);
    static final Interpolator f = new AccelerateInterpolator(1.5f);
    String A;
    boolean B;
    ArrayList<C0038a> C;
    ArrayList<Boolean> D;
    ArrayList<ComponentCallbacksC0045h> E;
    Bundle F = null;
    SparseArray<Parcelable> G = null;
    ArrayList<j> H;
    v I;
    Runnable J = new RunnableC0052o(this);
    ArrayList<h> g;
    boolean h;
    int i = 0;
    final ArrayList<ComponentCallbacksC0045h> j = new ArrayList<>();
    SparseArray<ComponentCallbacksC0045h> k;
    ArrayList<C0038a> l;
    ArrayList<ComponentCallbacksC0045h> m;
    ArrayList<C0038a> n;
    ArrayList<Integer> o;
    ArrayList<AbstractC0051n.c> p;
    private final CopyOnWriteArrayList<f> q = new CopyOnWriteArrayList<>();
    int r = 0;
    AbstractC0050m s;
    AbstractC0048k t;
    ComponentCallbacksC0045h u;
    ComponentCallbacksC0045h v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    /* access modifiers changed from: private */
    public static class a extends b {

        /* renamed from: b  reason: collision with root package name */
        View f141b;

        a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f141b = view;
        }

        @Override // a.e.a.u.b
        public void onAnimationEnd(Animation animation) {
            if (a.d.c.c.c(this.f141b) || Build.VERSION.SDK_INT >= 24) {
                this.f141b.post(new t(this));
            } else {
                this.f141b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* access modifiers changed from: private */
    public static class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final Animation.AnimationListener f142a;

        b(Animation.AnimationListener animationListener) {
            this.f142a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f142a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f142a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f142a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f143a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f144b;

        c(Animator animator) {
            this.f143a = null;
            this.f144b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        c(Animation animation) {
            this.f143a = animation;
            this.f144b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        View f145a;

        d(View view) {
            this.f145a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f145a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f145a.setLayerType(2, null);
        }
    }

    /* access modifiers changed from: private */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f146a;

        /* renamed from: b  reason: collision with root package name */
        private final View f147b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f148c;
        private boolean d;
        private boolean e = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f146a = viewGroup;
            this.f147b = view;
            addAnimation(animation);
            this.f146a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.e = true;
            if (this.f148c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f148c = true;
                P.a(this.f146a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.e = true;
            if (this.f148c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f148c = true;
                P.a(this.f146a, this);
            }
            return true;
        }

        public void run() {
            if (this.f148c || !this.e) {
                this.f146a.endViewTransition(this.f147b);
                this.d = true;
                return;
            }
            this.e = false;
            this.f146a.post(this);
        }
    }

    /* access modifiers changed from: private */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        final AbstractC0051n.b f149a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f150b;
    }

    /* access modifiers changed from: package-private */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f151a = {16842755, 16842960, 16842961};
    }

    /* access modifiers changed from: package-private */
    public interface h {
        boolean a(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class i implements h {

        /* renamed from: a  reason: collision with root package name */
        final String f152a;

        /* renamed from: b  reason: collision with root package name */
        final int f153b;

        /* renamed from: c  reason: collision with root package name */
        final int f154c;

        i(String str, int i, int i2) {
            this.f152a = str;
            this.f153b = i;
            this.f154c = i2;
        }

        @Override // a.e.a.u.h
        public boolean a(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0051n O;
            ComponentCallbacksC0045h hVar = u.this.v;
            if (hVar == null || this.f153b >= 0 || this.f152a != null || (O = hVar.O()) == null || !O.d()) {
                return u.this.a(arrayList, arrayList2, this.f152a, this.f153b, this.f154c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class j implements ComponentCallbacksC0045h.c {

        /* renamed from: a  reason: collision with root package name */
        final boolean f155a;

        /* renamed from: b  reason: collision with root package name */
        final C0038a f156b;

        /* renamed from: c  reason: collision with root package name */
        private int f157c;

        j(C0038a aVar, boolean z) {
            this.f155a = z;
            this.f156b = aVar;
        }

        @Override // a.e.a.ComponentCallbacksC0045h.c
        public void a() {
            this.f157c++;
        }

        @Override // a.e.a.ComponentCallbacksC0045h.c
        public void b() {
            this.f157c--;
            if (this.f157c == 0) {
                this.f156b.f100a.w();
            }
        }

        public void c() {
            C0038a aVar = this.f156b;
            aVar.f100a.a(aVar, this.f155a, false, false);
        }

        public void d() {
            boolean z = this.f157c > 0;
            u uVar = this.f156b.f100a;
            int size = uVar.j.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0045h hVar = uVar.j.get(i);
                hVar.a((ComponentCallbacksC0045h.c) null);
                if (z && hVar.D()) {
                    hVar.Y();
                }
            }
            C0038a aVar = this.f156b;
            aVar.f100a.a(aVar, this.f155a, !z, true);
        }

        public boolean e() {
            return this.f157c == 0;
        }
    }

    u() {
    }

    private void A() {
        this.h = false;
        this.D.clear();
        this.C.clear();
    }

    private void B() {
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0045h valueAt = this.k.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.g() != null) {
                    int x2 = valueAt.x();
                    View g2 = valueAt.g();
                    Animation animation = g2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        g2.clearAnimation();
                    }
                    valueAt.a((View) null);
                    a(valueAt, x2, 0, 0, false);
                } else if (valueAt.h() != null) {
                    valueAt.h().end();
                }
            }
        }
    }

    private void C() {
        if (this.H != null) {
            while (!this.H.isEmpty()) {
                this.H.remove(0).d();
            }
        }
    }

    private int a(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.c.d<ComponentCallbacksC0045h> dVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0038a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.e() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.H == null) {
                    this.H = new ArrayList<>();
                }
                j jVar = new j(aVar, booleanValue);
                this.H.add(jVar);
                aVar.a(jVar);
                if (booleanValue) {
                    aVar.c();
                } else {
                    aVar.b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(dVar);
            }
        }
        return i4;
    }

    static c a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(d);
        alphaAnimation.setDuration(220);
        return new c(alphaAnimation);
    }

    static c a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f140c);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(d);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new c(animationSet);
    }

    private static Animation.AnimationListener a(Animation animation) {
        Throwable e2;
        String str;
        try {
            if (f139b == null) {
                f139b = Animation.class.getDeclaredField("mListener");
                f139b.setAccessible(true);
            }
            return (Animation.AnimationListener) f139b.get(animation);
        } catch (NoSuchFieldException e3) {
            e2 = e3;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e2);
            return null;
        } catch (IllegalAccessException e4) {
            e2 = e4;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e2);
            return null;
        }
    }

    private void a(a.c.d<ComponentCallbacksC0045h> dVar) {
        int i2 = this.r;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.j.size();
            for (int i3 = 0; i3 < size; i3++) {
                ComponentCallbacksC0045h hVar = this.j.get(i3);
                if (hVar.f114c < min) {
                    a(hVar, min, hVar.p(), hVar.q(), false);
                    if (hVar.K != null && !hVar.C && hVar.P) {
                        dVar.add(hVar);
                    }
                }
            }
        }
    }

    private void a(ComponentCallbacksC0045h hVar, c cVar, int i2) {
        View view = hVar.K;
        ViewGroup viewGroup = hVar.J;
        viewGroup.startViewTransition(view);
        hVar.b(i2);
        Animation animation = cVar.f143a;
        if (animation != null) {
            e eVar = new e(animation, viewGroup, view);
            hVar.a(hVar.K);
            eVar.setAnimationListener(new C0054q(this, a(eVar), viewGroup, hVar));
            b(view, cVar);
            hVar.K.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f144b;
        hVar.a(animator);
        animator.addListener(new r(this, viewGroup, view, hVar));
        animator.setTarget(hVar.K);
        b(hVar.K, cVar);
        animator.start();
    }

    private static void a(v vVar) {
        if (vVar != null) {
            List<ComponentCallbacksC0045h> b2 = vVar.b();
            if (b2 != null) {
                for (ComponentCallbacksC0045h hVar : b2) {
                    hVar.F = true;
                }
            }
            List<v> a2 = vVar.a();
            if (a2 != null) {
                for (v vVar2 : a2) {
                    a(vVar2);
                }
            }
        }
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.d.b.b("FragmentManager"));
        AbstractC0050m mVar = this.s;
        if (mVar != null) {
            try {
                mVar.a("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    private void a(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<j> arrayList3 = this.H;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.H.get(i2);
            if (arrayList == null || jVar.f155a || (indexOf2 = arrayList.indexOf(jVar.f156b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (jVar.e() || (arrayList != null && jVar.f156b.a(arrayList, 0, arrayList.size()))) {
                    this.H.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || jVar.f155a || (indexOf = arrayList.indexOf(jVar.f156b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.d();
                    }
                }
                i2++;
            }
            jVar.c();
            i2++;
        }
    }

    private static void a(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0038a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.a(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.b(z2);
            } else {
                aVar.a(1);
                aVar.c();
            }
            i2++;
        }
    }

    static boolean a(c cVar) {
        Animation animation = cVar.f143a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return a(cVar.f144b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    static boolean a(Animator animator) {
        PropertyValuesHolder[] values;
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean a(View view, c cVar) {
        return view != null && cVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && a.d.c.c.b(view) && a(cVar);
    }

    private boolean a(String str, int i2, int i3) {
        AbstractC0051n O;
        o();
        c(true);
        ComponentCallbacksC0045h hVar = this.v;
        if (hVar != null && i2 < 0 && str == null && (O = hVar.O()) != null && O.d()) {
            return true;
        }
        boolean a2 = a(this.C, this.D, str, i2, i3);
        if (a2) {
            this.h = true;
            try {
                c(this.C, this.D);
            } finally {
                A();
            }
        }
        n();
        y();
        return a2;
    }

    public static int b(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void b(a.c.d<ComponentCallbacksC0045h> dVar) {
        int size = dVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0045h j2 = dVar.j(i2);
            if (!j2.m) {
                View y2 = j2.y();
                j2.R = y2.getAlpha();
                y2.setAlpha(0.0f);
            }
        }
    }

    private static void b(View view, c cVar) {
        if (view != null && cVar != null && a(view, cVar)) {
            Animator animator = cVar.f144b;
            if (animator != null) {
                animator.addListener(new d(view));
                return;
            }
            Animation.AnimationListener a2 = a(cVar.f143a);
            view.setLayerType(2, null);
            cVar.f143a.setAnimationListener(new a(view, a2));
        }
    }

    private void b(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z2 = arrayList.get(i6).t;
        ArrayList<ComponentCallbacksC0045h> arrayList3 = this.E;
        if (arrayList3 == null) {
            this.E = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.E.addAll(this.j);
        ComponentCallbacksC0045h q2 = q();
        boolean z3 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            C0038a aVar = arrayList.get(i7);
            q2 = !arrayList2.get(i7).booleanValue() ? aVar.a(this.E, q2) : aVar.b(this.E, q2);
            z3 = z3 || aVar.i;
        }
        this.E.clear();
        if (!z2) {
            F.a(this, arrayList, arrayList2, i2, i3, false);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z2) {
            a.c.d<ComponentCallbacksC0045h> dVar = new a.c.d<>();
            a(dVar);
            int a2 = a(arrayList, arrayList2, i2, i3, dVar);
            b(dVar);
            i4 = a2;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z2) {
            F.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.r, true);
        }
        while (i6 < i3) {
            C0038a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.m) >= 0) {
                b(i5);
                aVar2.m = -1;
            }
            aVar2.f();
            i6++;
        }
        if (z3) {
            s();
        }
    }

    private boolean b(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.g != null) {
                if (this.g.size() != 0) {
                    int size = this.g.size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z2 |= this.g.get(i2).a(arrayList, arrayList2);
                    }
                    this.g.clear();
                    this.s.e().removeCallbacks(this.J);
                    return z2;
                }
            }
            return false;
        }
    }

    private void c(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).t) {
                    if (i3 != i2) {
                        b(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).t) {
                            i3++;
                        }
                    }
                    b(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                b(arrayList, arrayList2, i3, size);
            }
        }
    }

    private void c(boolean z2) {
        if (this.h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.s == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.s.e().getLooper()) {
            if (!z2) {
                z();
            }
            if (this.C == null) {
                this.C = new ArrayList<>();
                this.D = new ArrayList<>();
            }
            this.h = true;
            try {
                a((ArrayList<C0038a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.h = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public static int d(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    private void e(int i2) {
        try {
            this.h = true;
            a(i2, false);
            this.h = false;
            o();
        } catch (Throwable th) {
            this.h = false;
            throw th;
        }
    }

    private ComponentCallbacksC0045h p(ComponentCallbacksC0045h hVar) {
        ViewGroup viewGroup = hVar.J;
        View view = hVar.K;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.j.indexOf(hVar) - 1; indexOf >= 0; indexOf--) {
                ComponentCallbacksC0045h hVar2 = this.j.get(indexOf);
                if (hVar2.J == viewGroup && hVar2.K != null) {
                    return hVar2;
                }
            }
        }
        return null;
    }

    private void y() {
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.k.valueAt(size) == null) {
                    SparseArray<ComponentCallbacksC0045h> sparseArray2 = this.k;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private void z() {
        if (c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.A != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.A);
        }
    }

    @Override // a.e.a.AbstractC0051n
    public A a() {
        return new C0038a(this);
    }

    public ComponentCallbacksC0045h a(int i2) {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0045h hVar = this.j.get(size);
            if (hVar != null && hVar.z == i2) {
                return hVar;
            }
        }
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0045h valueAt = this.k.valueAt(size2);
            if (valueAt != null && valueAt.z == i2) {
                return valueAt;
            }
        }
        return null;
    }

    public ComponentCallbacksC0045h a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        ComponentCallbacksC0045h hVar = this.k.get(i2);
        if (hVar != null) {
            return hVar;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    public ComponentCallbacksC0045h a(String str) {
        if (str != null) {
            for (int size = this.j.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0045h hVar = this.j.get(size);
                if (hVar != null && str.equals(hVar.B)) {
                    return hVar;
                }
            }
        }
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0045h valueAt = this.k.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.B)) {
                return valueAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c a(ComponentCallbacksC0045h hVar, int i2, boolean z2, int i3) {
        int b2;
        int p2 = hVar.p();
        Animation a2 = hVar.a(i2, z2, p2);
        if (a2 != null) {
            return new c(a2);
        }
        Animator b3 = hVar.b(i2, z2, p2);
        if (b3 != null) {
            return new c(b3);
        }
        if (p2 != 0) {
            boolean equals = "anim".equals(this.s.c().getResources().getResourceTypeName(p2));
            boolean z3 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.s.c(), p2);
                    if (loadAnimation != null) {
                        return new c(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.s.c(), p2);
                    if (loadAnimator != null) {
                        return new c(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.s.c(), p2);
                        if (loadAnimation2 != null) {
                            return new c(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (b2 = b(i2, z2)) < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return a(this.s.c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(this.s.c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(this.s.c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(this.s.c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(this.s.c(), 0.0f, 1.0f);
            case 6:
                return a(this.s.c(), 1.0f, 0.0f);
            default:
                if (i3 == 0 && this.s.h()) {
                    i3 = this.s.g();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    @Override // a.e.a.AbstractC0051n
    public void a(int i2, int i3) {
        if (i2 >= 0) {
            a((h) new i(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void a(int i2, C0038a aVar) {
        synchronized (this) {
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            int size = this.n.size();
            if (i2 < size) {
                if (f138a) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.n.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.n.add(null);
                    if (this.o == null) {
                        this.o = new ArrayList<>();
                    }
                    if (f138a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.o.add(Integer.valueOf(size));
                    size++;
                }
                if (f138a) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.n.add(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2) {
        AbstractC0050m mVar;
        if (this.s == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.r) {
            this.r = i2;
            if (this.k != null) {
                int size = this.j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    h(this.j.get(i3));
                }
                int size2 = this.k.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ComponentCallbacksC0045h valueAt = this.k.valueAt(i4);
                    if (valueAt != null && ((valueAt.n || valueAt.D) && !valueAt.P)) {
                        h(valueAt);
                    }
                }
                x();
                if (this.w && (mVar = this.s) != null && this.r == 4) {
                    mVar.i();
                    this.w = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0038a aVar) {
        if (this.l == null) {
            this.l = new ArrayList<>();
        }
        this.l.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void a(C0038a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.b(z4);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            F.a(this, (ArrayList<C0038a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.r, true);
        }
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0045h valueAt = this.k.valueAt(i2);
                if (valueAt != null && valueAt.K != null && valueAt.P && aVar.b(valueAt.A)) {
                    float f2 = valueAt.R;
                    if (f2 > 0.0f) {
                        valueAt.K.setAlpha(f2);
                    }
                    if (z4) {
                        valueAt.R = 0.0f;
                    } else {
                        valueAt.R = -1.0f;
                        valueAt.P = false;
                    }
                }
            }
        }
    }

    public void a(ComponentCallbacksC0045h hVar) {
        if (f138a) {
            Log.v("FragmentManager", "attach: " + hVar);
        }
        if (hVar.D) {
            hVar.D = false;
            if (hVar.m) {
                return;
            }
            if (!this.j.contains(hVar)) {
                if (f138a) {
                    Log.v("FragmentManager", "add from attach: " + hVar);
                }
                synchronized (this.j) {
                    this.j.add(hVar);
                }
                hVar.m = true;
                if (hVar.G && hVar.H) {
                    this.w = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r0 != 3) goto L_0x041a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a.e.a.ComponentCallbacksC0045h r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 1101
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.u.a(a.e.a.h, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void a(ComponentCallbacksC0045h hVar, Context context, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).a(hVar, context, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.a(this, hVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ComponentCallbacksC0045h hVar, Bundle bundle, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).a(hVar, bundle, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.a(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ComponentCallbacksC0045h hVar, View view, Bundle bundle, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).a(hVar, view, bundle, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.a(this, hVar, view, bundle);
            }
        }
    }

    public void a(ComponentCallbacksC0045h hVar, boolean z2) {
        if (f138a) {
            Log.v("FragmentManager", "add: " + hVar);
        }
        f(hVar);
        if (hVar.D) {
            return;
        }
        if (!this.j.contains(hVar)) {
            synchronized (this.j) {
                this.j.add(hVar);
            }
            hVar.m = true;
            hVar.n = false;
            if (hVar.K == null) {
                hVar.Q = false;
            }
            if (hVar.G && hVar.H) {
                this.w = true;
            }
            if (z2) {
                i(hVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + hVar);
    }

    public void a(AbstractC0050m mVar, AbstractC0048k kVar, ComponentCallbacksC0045h hVar) {
        if (this.s == null) {
            this.s = mVar;
            this.t = kVar;
            this.u = hVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void a(h hVar, boolean z2) {
        if (!z2) {
            z();
        }
        synchronized (this) {
            if (!this.z) {
                if (this.s != null) {
                    if (this.g == null) {
                        this.g = new ArrayList<>();
                    }
                    this.g.add(hVar);
                    w();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ComponentCallbacksC0045h hVar = this.j.get(i2);
            if (hVar != null) {
                hVar.a(configuration);
            }
        }
    }

    public void a(Bundle bundle, String str, ComponentCallbacksC0045h hVar) {
        int i2 = hVar.g;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        a(new IllegalStateException("Fragment " + hVar + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void a(Parcelable parcelable, v vVar) {
        List<androidx.lifecycle.u> list;
        List<v> list2;
        if (parcelable != null) {
            x xVar = (x) parcelable;
            if (xVar.f161a != null) {
                if (vVar != null) {
                    List<ComponentCallbacksC0045h> b2 = vVar.b();
                    list2 = vVar.a();
                    list = vVar.c();
                    int size = b2 != null ? b2.size() : 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        ComponentCallbacksC0045h hVar = b2.get(i2);
                        if (f138a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + hVar);
                        }
                        int i3 = 0;
                        while (true) {
                            z[] zVarArr = xVar.f161a;
                            if (i3 >= zVarArr.length || zVarArr[i3].f165b == hVar.g) {
                                z[] zVarArr2 = xVar.f161a;
                            } else {
                                i3++;
                            }
                        }
                        z[] zVarArr22 = xVar.f161a;
                        if (i3 != zVarArr22.length) {
                            z zVar = zVarArr22[i3];
                            zVar.l = hVar;
                            hVar.e = null;
                            hVar.s = 0;
                            hVar.p = false;
                            hVar.m = false;
                            hVar.j = null;
                            Bundle bundle = zVar.k;
                            if (bundle != null) {
                                bundle.setClassLoader(this.s.c().getClassLoader());
                                hVar.e = zVar.k.getSparseParcelableArray("android:view_state");
                                hVar.d = zVar.k;
                            }
                        } else {
                            a(new IllegalStateException("Could not find active fragment with index " + hVar.g));
                            throw null;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.k = new SparseArray<>(xVar.f161a.length);
                int i4 = 0;
                while (true) {
                    z[] zVarArr3 = xVar.f161a;
                    if (i4 >= zVarArr3.length) {
                        break;
                    }
                    z zVar2 = zVarArr3[i4];
                    if (zVar2 != null) {
                        ComponentCallbacksC0045h a2 = zVar2.a(this.s, this.t, this.u, (list2 == null || i4 >= list2.size()) ? null : list2.get(i4), (list == null || i4 >= list.size()) ? null : list.get(i4));
                        if (f138a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + a2);
                        }
                        this.k.put(a2.g, a2);
                        zVar2.l = null;
                    }
                    i4++;
                }
                if (vVar != null) {
                    List<ComponentCallbacksC0045h> b3 = vVar.b();
                    int size2 = b3 != null ? b3.size() : 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        ComponentCallbacksC0045h hVar2 = b3.get(i5);
                        int i6 = hVar2.k;
                        if (i6 >= 0) {
                            hVar2.j = this.k.get(i6);
                            if (hVar2.j == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + hVar2 + " target no longer exists: " + hVar2.k);
                            }
                        }
                    }
                }
                this.j.clear();
                if (xVar.f162b != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr = xVar.f162b;
                        if (i7 >= iArr.length) {
                            break;
                        }
                        ComponentCallbacksC0045h hVar3 = this.k.get(iArr[i7]);
                        if (hVar3 != null) {
                            hVar3.m = true;
                            if (f138a) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + hVar3);
                            }
                            if (!this.j.contains(hVar3)) {
                                synchronized (this.j) {
                                    this.j.add(hVar3);
                                }
                                i7++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            a(new IllegalStateException("No instantiated fragment for index #" + xVar.f162b[i7]));
                            throw null;
                        }
                    }
                }
                C0040c[] cVarArr = xVar.f163c;
                if (cVarArr != null) {
                    this.l = new ArrayList<>(cVarArr.length);
                    int i8 = 0;
                    while (true) {
                        C0040c[] cVarArr2 = xVar.f163c;
                        if (i8 >= cVarArr2.length) {
                            break;
                        }
                        C0038a a3 = cVarArr2[i8].a(this);
                        if (f138a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + a3.m + "): " + a3);
                            PrintWriter printWriter = new PrintWriter(new a.d.b.b("FragmentManager"));
                            a3.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.l.add(a3);
                        int i9 = a3.m;
                        if (i9 >= 0) {
                            a(i9, a3);
                        }
                        i8++;
                    }
                } else {
                    this.l = null;
                }
                int i10 = xVar.d;
                if (i10 >= 0) {
                    this.v = this.k.get(i10);
                }
                this.i = xVar.e;
            }
        }
    }

    public void a(Menu menu) {
        if (this.r >= 1) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                ComponentCallbacksC0045h hVar = this.j.get(i2);
                if (hVar != null) {
                    hVar.c(menu);
                }
            }
        }
    }

    @Override // a.e.a.AbstractC0051n
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                ComponentCallbacksC0045h valueAt = this.k.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.j.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.j.get(i3).toString());
            }
        }
        ArrayList<ComponentCallbacksC0045h> arrayList = this.m;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(this.m.get(i4).toString());
            }
        }
        ArrayList<C0038a> arrayList2 = this.l;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                C0038a aVar = this.l.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.n != null && (size2 = this.n.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println((C0038a) this.n.get(i6));
                }
            }
            if (this.o != null && this.o.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.o.toArray()));
            }
        }
        ArrayList<h> arrayList3 = this.g;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println((h) this.g.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.t);
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.u);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.r);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.x);
        printWriter.print(" mStopped=");
        printWriter.print(this.y);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.z);
        if (this.w) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.w);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.A);
        }
    }

    public void a(boolean z2) {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0045h hVar = this.j.get(size);
            if (hVar != null) {
                hVar.d(z2);
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.r < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0045h> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ComponentCallbacksC0045h hVar = this.j.get(i2);
            if (hVar != null && hVar.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(hVar);
                z2 = true;
            }
        }
        if (this.m != null) {
            for (int i3 = 0; i3 < this.m.size(); i3++) {
                ComponentCallbacksC0045h hVar2 = this.m.get(i3);
                if (arrayList == null || !arrayList.contains(hVar2)) {
                    hVar2.H();
                }
            }
        }
        this.m = arrayList;
        return z2;
    }

    public boolean a(MenuItem menuItem) {
        if (this.r < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ComponentCallbacksC0045h hVar = this.j.get(i2);
            if (hVar != null && hVar.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<C0038a> arrayList3 = this.l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.l.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                i4 = this.l.size() - 1;
                while (i4 >= 0) {
                    C0038a aVar = this.l.get(i4);
                    if ((str != null && str.equals(aVar.d())) || (i2 >= 0 && i2 == aVar.m)) {
                        break;
                    }
                    i4--;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        C0038a aVar2 = this.l.get(i4);
                        if ((str == null || !str.equals(aVar2.d())) && (i2 < 0 || i2 != aVar2.m)) {
                            break;
                        }
                    }
                }
            } else {
                i4 = -1;
            }
            if (i4 == this.l.size() - 1) {
                return false;
            }
            for (int size2 = this.l.size() - 1; size2 > i4; size2--) {
                arrayList.add(this.l.remove(size2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public int b(C0038a aVar) {
        synchronized (this) {
            if (this.o != null) {
                if (this.o.size() > 0) {
                    int intValue = this.o.remove(this.o.size() - 1).intValue();
                    if (f138a) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                    }
                    this.n.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            int size = this.n.size();
            if (f138a) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.n.add(aVar);
            return size;
        }
    }

    public ComponentCallbacksC0045h b(String str) {
        ComponentCallbacksC0045h a2;
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0045h valueAt = this.k.valueAt(size);
            if (!(valueAt == null || (a2 = valueAt.a(str)) == null)) {
                return a2;
            }
        }
        return null;
    }

    @Override // a.e.a.AbstractC0051n
    public List<ComponentCallbacksC0045h> b() {
        List<ComponentCallbacksC0045h> list;
        if (this.j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.j) {
            list = (List) this.j.clone();
        }
        return list;
    }

    public void b(int i2) {
        synchronized (this) {
            this.n.set(i2, null);
            if (this.o == null) {
                this.o = new ArrayList<>();
            }
            if (f138a) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.o.add(Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ComponentCallbacksC0045h hVar) {
        Animator animator;
        if (hVar.K != null) {
            c a2 = a(hVar, hVar.q(), !hVar.C, hVar.r());
            if (a2 == null || (animator = a2.f144b) == null) {
                if (a2 != null) {
                    b(hVar.K, a2);
                    hVar.K.startAnimation(a2.f143a);
                    a2.f143a.start();
                }
                hVar.K.setVisibility((!hVar.C || hVar.B()) ? 0 : 8);
                if (hVar.B()) {
                    hVar.f(false);
                }
            } else {
                animator.setTarget(hVar.K);
                if (!hVar.C) {
                    hVar.K.setVisibility(0);
                } else if (hVar.B()) {
                    hVar.f(false);
                } else {
                    ViewGroup viewGroup = hVar.J;
                    View view = hVar.K;
                    viewGroup.startViewTransition(view);
                    a2.f144b.addListener(new s(this, viewGroup, view, hVar));
                }
                b(hVar.K, a2);
                a2.f144b.start();
            }
        }
        if (hVar.m && hVar.G && hVar.H) {
            this.w = true;
        }
        hVar.Q = false;
        hVar.a(hVar.C);
    }

    /* access modifiers changed from: package-private */
    public void b(ComponentCallbacksC0045h hVar, Context context, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).b(hVar, context, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.b(this, hVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ComponentCallbacksC0045h hVar, Bundle bundle, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).b(hVar, bundle, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.b(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ComponentCallbacksC0045h hVar, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).b(hVar, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.a(this, hVar);
            }
        }
    }

    public void b(boolean z2) {
        for (int size = this.j.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0045h hVar = this.j.get(size);
            if (hVar != null) {
                hVar.e(z2);
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.r < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ComponentCallbacksC0045h hVar = this.j.get(i2);
            if (hVar != null && hVar.d(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean b(MenuItem menuItem) {
        if (this.r < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ComponentCallbacksC0045h hVar = this.j.get(i2);
            if (hVar != null && hVar.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void c(ComponentCallbacksC0045h hVar) {
        if (f138a) {
            Log.v("FragmentManager", "detach: " + hVar);
        }
        if (!hVar.D) {
            hVar.D = true;
            if (hVar.m) {
                if (f138a) {
                    Log.v("FragmentManager", "remove from detach: " + hVar);
                }
                synchronized (this.j) {
                    this.j.remove(hVar);
                }
                if (hVar.G && hVar.H) {
                    this.w = true;
                }
                hVar.m = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(ComponentCallbacksC0045h hVar, Bundle bundle, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).c(hVar, bundle, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.c(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(ComponentCallbacksC0045h hVar, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).c(hVar, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.b(this, hVar);
            }
        }
    }

    @Override // a.e.a.AbstractC0051n
    public boolean c() {
        return this.x || this.y;
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2) {
        return this.r >= i2;
    }

    /* access modifiers changed from: package-private */
    public void d(ComponentCallbacksC0045h hVar) {
        if (hVar.o && !hVar.r) {
            hVar.b(hVar.i(hVar.d), (ViewGroup) null, hVar.d);
            View view = hVar.K;
            if (view != null) {
                hVar.L = view;
                view.setSaveFromParentEnabled(false);
                if (hVar.C) {
                    hVar.K.setVisibility(8);
                }
                hVar.a(hVar.K, hVar.d);
                a(hVar, hVar.K, hVar.d, false);
                return;
            }
            hVar.L = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(ComponentCallbacksC0045h hVar, Bundle bundle, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).d(hVar, bundle, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.d(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(ComponentCallbacksC0045h hVar, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).d(hVar, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.c(this, hVar);
            }
        }
    }

    @Override // a.e.a.AbstractC0051n
    public boolean d() {
        z();
        return a((String) null, -1, 0);
    }

    public void e() {
        this.x = false;
        this.y = false;
        e(2);
    }

    public void e(ComponentCallbacksC0045h hVar) {
        if (f138a) {
            Log.v("FragmentManager", "hide: " + hVar);
        }
        if (!hVar.C) {
            hVar.C = true;
            hVar.Q = true ^ hVar.Q;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(ComponentCallbacksC0045h hVar, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).e(hVar, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.d(this, hVar);
            }
        }
    }

    public void f() {
        this.x = false;
        this.y = false;
        e(1);
    }

    /* access modifiers changed from: package-private */
    public void f(ComponentCallbacksC0045h hVar) {
        if (hVar.g < 0) {
            int i2 = this.i;
            this.i = i2 + 1;
            hVar.a(i2, this.u);
            if (this.k == null) {
                this.k = new SparseArray<>();
            }
            this.k.put(hVar.g, hVar);
            if (f138a) {
                Log.v("FragmentManager", "Allocated fragment index " + hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(ComponentCallbacksC0045h hVar, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).f(hVar, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.e(this, hVar);
            }
        }
    }

    public void g() {
        this.z = true;
        o();
        e(0);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    /* access modifiers changed from: package-private */
    public void g(ComponentCallbacksC0045h hVar) {
        if (hVar.g >= 0) {
            if (f138a) {
                Log.v("FragmentManager", "Freeing fragment index " + hVar);
            }
            this.k.put(hVar.g, null);
            hVar.z();
        }
    }

    /* access modifiers changed from: package-private */
    public void g(ComponentCallbacksC0045h hVar, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).g(hVar, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.f(this, hVar);
            }
        }
    }

    public void h() {
        e(1);
    }

    /* access modifiers changed from: package-private */
    public void h(ComponentCallbacksC0045h hVar) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (hVar != null) {
            int i2 = this.r;
            if (hVar.n) {
                i2 = hVar.C() ? Math.min(i2, 1) : Math.min(i2, 0);
            }
            a(hVar, i2, hVar.q(), hVar.r(), false);
            if (hVar.K != null) {
                ComponentCallbacksC0045h p2 = p(hVar);
                if (p2 != null && (indexOfChild2 = viewGroup.indexOfChild(hVar.K)) < (indexOfChild = (viewGroup = hVar.J).indexOfChild(p2.K))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(hVar.K, indexOfChild);
                }
                if (hVar.P && hVar.J != null) {
                    float f2 = hVar.R;
                    if (f2 > 0.0f) {
                        hVar.K.setAlpha(f2);
                    }
                    hVar.R = 0.0f;
                    hVar.P = false;
                    c a2 = a(hVar, hVar.q(), true, hVar.r());
                    if (a2 != null) {
                        b(hVar.K, a2);
                        Animation animation = a2.f143a;
                        if (animation != null) {
                            hVar.K.startAnimation(animation);
                        } else {
                            a2.f144b.setTarget(hVar.K);
                            a2.f144b.start();
                        }
                    }
                }
            }
            if (hVar.Q) {
                b(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(ComponentCallbacksC0045h hVar, boolean z2) {
        ComponentCallbacksC0045h hVar2 = this.u;
        if (hVar2 != null) {
            AbstractC0051n o2 = hVar2.o();
            if (o2 instanceof u) {
                ((u) o2).h(hVar, true);
            }
        }
        Iterator<f> it = this.q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f150b) {
                next.f149a.g(this, hVar);
            }
        }
    }

    public void i() {
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ComponentCallbacksC0045h hVar = this.j.get(i2);
            if (hVar != null) {
                hVar.S();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(ComponentCallbacksC0045h hVar) {
        a(hVar, this.r, 0, 0, false);
    }

    public void j() {
        e(3);
    }

    public void j(ComponentCallbacksC0045h hVar) {
        if (!hVar.M) {
            return;
        }
        if (this.h) {
            this.B = true;
            return;
        }
        hVar.M = false;
        a(hVar, this.r, 0, 0, false);
    }

    public void k() {
        this.x = false;
        this.y = false;
        e(4);
    }

    public void k(ComponentCallbacksC0045h hVar) {
        if (f138a) {
            Log.v("FragmentManager", "remove: " + hVar + " nesting=" + hVar.s);
        }
        boolean z2 = !hVar.C();
        if (!hVar.D || z2) {
            synchronized (this.j) {
                this.j.remove(hVar);
            }
            if (hVar.G && hVar.H) {
                this.w = true;
            }
            hVar.m = false;
            hVar.n = true;
        }
    }

    /* access modifiers changed from: package-private */
    public Bundle l(ComponentCallbacksC0045h hVar) {
        Bundle bundle;
        if (this.F == null) {
            this.F = new Bundle();
        }
        hVar.j(this.F);
        d(hVar, this.F, false);
        if (!this.F.isEmpty()) {
            bundle = this.F;
            this.F = null;
        } else {
            bundle = null;
        }
        if (hVar.K != null) {
            m(hVar);
        }
        if (hVar.e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", hVar.e);
        }
        if (!hVar.N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", hVar.N);
        }
        return bundle;
    }

    public void l() {
        this.x = false;
        this.y = false;
        e(3);
    }

    public void m() {
        this.y = true;
        e(2);
    }

    /* access modifiers changed from: package-private */
    public void m(ComponentCallbacksC0045h hVar) {
        if (hVar.L != null) {
            SparseArray<Parcelable> sparseArray = this.G;
            if (sparseArray == null) {
                this.G = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            hVar.L.saveHierarchyState(this.G);
            if (this.G.size() > 0) {
                hVar.e = this.G;
                this.G = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (this.B) {
            this.B = false;
            x();
        }
    }

    public void n(ComponentCallbacksC0045h hVar) {
        if (hVar == null || (this.k.get(hVar.g) == hVar && (hVar.u == null || hVar.o() == this))) {
            this.v = hVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + hVar + " is not an active fragment of FragmentManager " + this);
    }

    public void o(ComponentCallbacksC0045h hVar) {
        if (f138a) {
            Log.v("FragmentManager", "show: " + hVar);
        }
        if (hVar.C) {
            hVar.C = false;
            hVar.Q = !hVar.Q;
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean o() {
        c(true);
        boolean z2 = false;
        while (b(this.C, this.D)) {
            this.h = true;
            try {
                c(this.C, this.D);
                A();
                z2 = true;
            } catch (Throwable th) {
                A();
                throw th;
            }
        }
        n();
        y();
        return z2;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ComponentCallbacksC0045h hVar;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f151a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!ComponentCallbacksC0045h.a(this.s.c(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        ComponentCallbacksC0045h a2 = resourceId != -1 ? a(resourceId) : null;
        if (a2 == null && string != null) {
            a2 = a(string);
        }
        if (a2 == null && i2 != -1) {
            a2 = a(i2);
        }
        if (f138a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + a2);
        }
        if (a2 == null) {
            ComponentCallbacksC0045h a3 = this.t.a(context, attributeValue, null);
            a3.o = true;
            a3.z = resourceId != 0 ? resourceId : i2;
            a3.A = i2;
            a3.B = string;
            a3.p = true;
            a3.t = this;
            AbstractC0050m mVar = this.s;
            a3.u = mVar;
            a3.a(mVar.c(), attributeSet, a3.d);
            a(a3, true);
            hVar = a3;
        } else if (!a2.p) {
            a2.p = true;
            AbstractC0050m mVar2 = this.s;
            a2.u = mVar2;
            if (!a2.F) {
                a2.a(mVar2.c(), attributeSet, a2.d);
            }
            hVar = a2;
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
        }
        if (this.r >= 1 || !hVar.o) {
            i(hVar);
        } else {
            a(hVar, 1, 0, 0, false);
        }
        View view2 = hVar.K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (hVar.K.getTag() == null) {
                hVar.K.setTag(string);
            }
            return hVar.K;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 p() {
        return this;
    }

    public ComponentCallbacksC0045h q() {
        return this.v;
    }

    public void r() {
        this.I = null;
        this.x = false;
        this.y = false;
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0045h hVar = this.j.get(i2);
            if (hVar != null) {
                hVar.F();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                this.p.get(i2).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public v t() {
        a(this.I);
        return this.I;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.u;
        if (obj == null) {
            obj = this.s;
        }
        a.d.b.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public Parcelable u() {
        int[] iArr;
        int size;
        C();
        B();
        o();
        this.x = true;
        C0040c[] cVarArr = null;
        this.I = null;
        SparseArray<ComponentCallbacksC0045h> sparseArray = this.k;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.k.size();
        z[] zVarArr = new z[size2];
        boolean z2 = false;
        for (int i2 = 0; i2 < size2; i2++) {
            ComponentCallbacksC0045h valueAt = this.k.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.g >= 0) {
                    z zVar = new z(valueAt);
                    zVarArr[i2] = zVar;
                    if (valueAt.f114c <= 0 || zVar.k != null) {
                        zVar.k = valueAt.d;
                    } else {
                        zVar.k = l(valueAt);
                        ComponentCallbacksC0045h hVar = valueAt.j;
                        if (hVar != null) {
                            if (hVar.g >= 0) {
                                if (zVar.k == null) {
                                    zVar.k = new Bundle();
                                }
                                a(zVar.k, "android:target_state", valueAt.j);
                                int i3 = valueAt.l;
                                if (i3 != 0) {
                                    zVar.k.putInt("android:target_req_state", i3);
                                }
                            } else {
                                a(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.j));
                                throw null;
                            }
                        }
                    }
                    if (f138a) {
                        Log.v("FragmentManager", "Saved state of " + valueAt + ": " + zVar.k);
                    }
                    z2 = true;
                } else {
                    a(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.g));
                    throw null;
                }
            }
        }
        if (!z2) {
            if (f138a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.j.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = this.j.get(i4).g;
                if (iArr[i4] >= 0) {
                    if (f138a) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.j.get(i4));
                    }
                } else {
                    a(new IllegalStateException("Failure saving state: active " + this.j.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0038a> arrayList = this.l;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            cVarArr = new C0040c[size];
            for (int i5 = 0; i5 < size; i5++) {
                cVarArr[i5] = new C0040c(this.l.get(i5));
                if (f138a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.l.get(i5));
                }
            }
        }
        x xVar = new x();
        xVar.f161a = zVarArr;
        xVar.f162b = iArr;
        xVar.f163c = cVarArr;
        ComponentCallbacksC0045h hVar2 = this.v;
        if (hVar2 != null) {
            xVar.d = hVar2.g;
        }
        xVar.e = this.i;
        v();
        return xVar;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        v vVar;
        if (this.k != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                ComponentCallbacksC0045h valueAt = this.k.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.E) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        ComponentCallbacksC0045h hVar = valueAt.j;
                        valueAt.k = hVar != null ? hVar.g : -1;
                        if (f138a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    u uVar = valueAt.v;
                    if (uVar != null) {
                        uVar.v();
                        vVar = valueAt.v.I;
                    } else {
                        vVar = valueAt.w;
                    }
                    if (arrayList2 == null && vVar != null) {
                        arrayList2 = new ArrayList(this.k.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(vVar);
                    }
                    if (arrayList == null && valueAt.x != null) {
                        arrayList = new ArrayList(this.k.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.x);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.I = null;
        } else {
            this.I = new v(arrayList3, arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        synchronized (this) {
            boolean z2 = false;
            boolean z3 = this.H != null && !this.H.isEmpty();
            if (this.g != null && this.g.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.s.e().removeCallbacks(this.J);
                this.s.e().post(this.J);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                ComponentCallbacksC0045h valueAt = this.k.valueAt(i2);
                if (valueAt != null) {
                    j(valueAt);
                }
            }
        }
    }
}
