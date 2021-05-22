package a.e.a;

import a.c.g;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.i;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a.e.a.h  reason: case insensitive filesystem */
public class ComponentCallbacksC0045h implements ComponentCallbacks, View.OnCreateContextMenuListener, h, v {

    /* renamed from: a  reason: collision with root package name */
    private static final g<String, Class<?>> f112a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    static final Object f113b = new Object();
    int A;
    String B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H = true;
    boolean I;
    ViewGroup J;
    View K;
    View L;
    boolean M;
    boolean N = true;
    a O;
    boolean P;
    boolean Q;
    float R;
    LayoutInflater S;
    boolean T;
    j U = new j(this);
    j V;
    h W;
    o<h> X = new o<>();

    /* renamed from: c  reason: collision with root package name */
    int f114c = 0;
    Bundle d;
    SparseArray<Parcelable> e;
    Boolean f;
    int g = -1;
    String h;
    Bundle i;
    ComponentCallbacksC0045h j;
    int k = -1;
    int l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    u t;
    AbstractC0050m u;
    u v;
    v w;
    u x;
    ComponentCallbacksC0045h y;
    int z;

    /* access modifiers changed from: package-private */
    /* renamed from: a.e.a.h$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        View f115a;

        /* renamed from: b  reason: collision with root package name */
        Animator f116b;

        /* renamed from: c  reason: collision with root package name */
        int f117c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        i o;
        i p;
        boolean q;
        c r;
        boolean s;

        a() {
            Object obj = ComponentCallbacksC0045h.f113b;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    /* renamed from: a.e.a.h$b */
    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.e.a.h$c */
    public interface c {
        void a();

        void b();
    }

    private a Z() {
        if (this.O == null) {
            this.O = new a();
        }
        return this.O;
    }

    public static ComponentCallbacksC0045h a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f112a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f112a.put(str, cls);
            }
            ComponentCallbacksC0045h hVar = (ComponentCallbacksC0045h) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(hVar.getClass().getClassLoader());
                hVar.m(bundle);
            }
            return hVar;
        } catch (ClassNotFoundException e2) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    static boolean a(Context context, String str) {
        try {
            Class<?> cls = f112a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f112a.put(str, cls);
            }
            return ComponentCallbacksC0045h.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void A() {
        if (this.u != null) {
            this.v = new u();
            this.v.a(this.u, new C0043f(this), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        a aVar = this.O;
        if (aVar == null) {
            return false;
        }
        return aVar.s;
    }

    /* access modifiers changed from: package-private */
    public final boolean C() {
        return this.s > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        a aVar = this.O;
        if (aVar == null) {
            return false;
        }
        return aVar.q;
    }

    public final boolean E() {
        u uVar = this.t;
        if (uVar == null) {
            return false;
        }
        return uVar.c();
    }

    /* access modifiers changed from: package-private */
    public void F() {
        u uVar = this.v;
        if (uVar != null) {
            uVar.r();
        }
    }

    public void G() {
        boolean z2 = true;
        this.I = true;
        ActivityC0047j d2 = d();
        if (d2 == null || !d2.isChangingConfigurations()) {
            z2 = false;
        }
        u uVar = this.x;
        if (uVar != null && !z2) {
            uVar.a();
        }
    }

    public void H() {
    }

    public void I() {
        this.I = true;
    }

    public void J() {
        this.I = true;
    }

    public void K() {
        this.I = true;
    }

    public void L() {
        this.I = true;
    }

    public void M() {
        this.I = true;
    }

    public void N() {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public AbstractC0051n O() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public void P() {
        this.U.b(f.a.ON_DESTROY);
        u uVar = this.v;
        if (uVar != null) {
            uVar.g();
        }
        this.f114c = 0;
        this.I = false;
        this.T = false;
        G();
        if (this.I) {
            this.v = null;
            return;
        }
        throw new Q("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        if (this.K != null) {
            this.V.b(f.a.ON_DESTROY);
        }
        u uVar = this.v;
        if (uVar != null) {
            uVar.h();
        }
        this.f114c = 1;
        this.I = false;
        I();
        if (this.I) {
            a.f.a.a.a(this).a();
            this.r = false;
            return;
        }
        throw new Q("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void R() {
        this.I = false;
        J();
        this.S = null;
        if (this.I) {
            u uVar = this.v;
            if (uVar == null) {
                return;
            }
            if (this.F) {
                uVar.g();
                this.v = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new Q("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    public void S() {
        onLowMemory();
        u uVar = this.v;
        if (uVar != null) {
            uVar.i();
        }
    }

    /* access modifiers changed from: package-private */
    public void T() {
        if (this.K != null) {
            this.V.b(f.a.ON_PAUSE);
        }
        this.U.b(f.a.ON_PAUSE);
        u uVar = this.v;
        if (uVar != null) {
            uVar.j();
        }
        this.f114c = 3;
        this.I = false;
        K();
        if (!this.I) {
            throw new Q("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        u uVar = this.v;
        if (uVar != null) {
            uVar.r();
            this.v.o();
        }
        this.f114c = 4;
        this.I = false;
        L();
        if (this.I) {
            u uVar2 = this.v;
            if (uVar2 != null) {
                uVar2.k();
                this.v.o();
            }
            this.U.b(f.a.ON_RESUME);
            if (this.K != null) {
                this.V.b(f.a.ON_RESUME);
                return;
            }
            return;
        }
        throw new Q("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void V() {
        u uVar = this.v;
        if (uVar != null) {
            uVar.r();
            this.v.o();
        }
        this.f114c = 3;
        this.I = false;
        M();
        if (this.I) {
            u uVar2 = this.v;
            if (uVar2 != null) {
                uVar2.l();
            }
            this.U.b(f.a.ON_START);
            if (this.K != null) {
                this.V.b(f.a.ON_START);
                return;
            }
            return;
        }
        throw new Q("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void W() {
        if (this.K != null) {
            this.V.b(f.a.ON_STOP);
        }
        this.U.b(f.a.ON_STOP);
        u uVar = this.v;
        if (uVar != null) {
            uVar.m();
        }
        this.f114c = 2;
        this.I = false;
        N();
        if (!this.I) {
            throw new Q("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public final Context X() {
        Context j2 = j();
        if (j2 != null) {
            return j2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void Y() {
        u uVar = this.t;
        if (uVar == null || uVar.s == null) {
            Z().q = false;
        } else if (Looper.myLooper() != this.t.s.e().getLooper()) {
            this.t.s.e().postAtFrontOfQueue(new RunnableC0042e(this));
        } else {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public ComponentCallbacksC0045h a(String str) {
        if (str.equals(this.h)) {
            return this;
        }
        u uVar = this.v;
        if (uVar != null) {
            return uVar.b(str);
        }
        return null;
    }

    @Deprecated
    public LayoutInflater a(Bundle bundle) {
        AbstractC0050m mVar = this.u;
        if (mVar != null) {
            LayoutInflater f2 = mVar.f();
            i();
            u uVar = this.v;
            uVar.p();
            a.d.c.b.a(f2, uVar);
            return f2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation a(int i2, boolean z2, int i3) {
        return null;
    }

    @Override // androidx.lifecycle.h
    public f a() {
        return this.U;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (this.O != null || i2 != 0) {
            Z().d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (this.O != null || i2 != 0 || i3 != 0) {
            Z();
            a aVar = this.O;
            aVar.e = i2;
            aVar.f = i3;
        }
    }

    public void a(int i2, int i3, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, ComponentCallbacksC0045h hVar) {
        String str;
        StringBuilder sb;
        this.g = i2;
        if (hVar != null) {
            sb = new StringBuilder();
            sb.append(hVar.h);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.g);
        this.h = sb.toString();
    }

    public void a(int i2, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        Z();
        c cVar2 = this.O.r;
        if (cVar != cVar2) {
            if (cVar == null || cVar2 == null) {
                a aVar = this.O;
                if (aVar.q) {
                    aVar.r = cVar;
                }
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void a(ComponentCallbacksC0045h hVar) {
    }

    /* access modifiers changed from: package-private */
    public void a(Animator animator) {
        Z().f116b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.I = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
    }

    public void a(Context context) {
        this.I = true;
        AbstractC0050m mVar = this.u;
        Activity b2 = mVar == null ? null : mVar.b();
        if (b2 != null) {
            this.I = false;
            a(b2);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        AbstractC0050m mVar = this.u;
        Activity b2 = mVar == null ? null : mVar.b();
        if (b2 != null) {
            this.I = false;
            a(b2, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        u uVar = this.v;
        if (uVar != null) {
            uVar.a(configuration);
        }
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        Z().f115a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f114c);
        printWriter.print(" mIndex=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mRetaining=");
        printWriter.print(this.F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.y);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.i);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.d);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.j);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.l);
        }
        if (p() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(p());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.K);
        }
        if (g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(g());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(x());
        }
        if (j() != null) {
            a.f.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.v + ":");
            u uVar = this.v;
            uVar.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void a(boolean z2) {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public Animator b(int i2, boolean z2, int i3) {
        return null;
    }

    @Override // androidx.lifecycle.v
    public u b() {
        if (j() != null) {
            if (this.x == null) {
                this.x = new u();
            }
            return this.x;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        Z().f117c = i2;
    }

    public void b(Bundle bundle) {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u uVar = this.v;
        if (uVar != null) {
            uVar.r();
        }
        this.r = true;
        this.W = new C0044g(this);
        this.V = null;
        this.K = a(layoutInflater, viewGroup, bundle);
        if (this.K != null) {
            this.W.a();
            this.X.a(this.W);
        } else if (this.V == null) {
            this.W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void b(Menu menu) {
    }

    public void b(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            a(menu, menuInflater);
            z2 = true;
        }
        u uVar = this.v;
        return uVar != null ? z2 | uVar.a(menu, menuInflater) : z2;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a aVar = this.O;
        c cVar = null;
        if (aVar != null) {
            aVar.q = false;
            c cVar2 = aVar.r;
            aVar.r = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.b();
        }
    }

    public void c(Bundle bundle) {
        this.I = true;
        k(bundle);
        u uVar = this.v;
        if (uVar != null && !uVar.c(1)) {
            this.v.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Menu menu) {
        if (!this.C) {
            if (this.G && this.H) {
                a(menu);
            }
            u uVar = this.v;
            if (uVar != null) {
                uVar.a(menu);
            }
        }
    }

    public void c(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean c(MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        if (a(menuItem)) {
            return true;
        }
        u uVar = this.v;
        return uVar != null && uVar.a(menuItem);
    }

    public final ActivityC0047j d() {
        AbstractC0050m mVar = this.u;
        if (mVar == null) {
            return null;
        }
        return (ActivityC0047j) mVar.b();
    }

    public LayoutInflater d(Bundle bundle) {
        return a(bundle);
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z2) {
        b(z2);
        u uVar = this.v;
        if (uVar != null) {
            uVar.a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d(Menu menu) {
        boolean z2 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            b(menu);
            z2 = true;
        }
        u uVar = this.v;
        return uVar != null ? z2 | uVar.b(menu) : z2;
    }

    /* access modifiers changed from: package-private */
    public boolean d(MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        if (this.G && this.H && b(menuItem)) {
            return true;
        }
        u uVar = this.v;
        return uVar != null && uVar.b(menuItem);
    }

    public void e(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z2) {
        c(z2);
        u uVar = this.v;
        if (uVar != null) {
            uVar.b(z2);
        }
    }

    public boolean e() {
        Boolean bool;
        a aVar = this.O;
        if (aVar == null || (bool = aVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(Bundle bundle) {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z2) {
        Z().s = z2;
    }

    public boolean f() {
        Boolean bool;
        a aVar = this.O;
        if (aVar == null || (bool = aVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public View g() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        return aVar.f115a;
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        u uVar = this.v;
        if (uVar != null) {
            uVar.r();
        }
        this.f114c = 2;
        this.I = false;
        b(bundle);
        if (this.I) {
            u uVar2 = this.v;
            if (uVar2 != null) {
                uVar2.e();
                return;
            }
            return;
        }
        throw new Q("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public Animator h() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        return aVar.f116b;
    }

    /* access modifiers changed from: package-private */
    public void h(Bundle bundle) {
        u uVar = this.v;
        if (uVar != null) {
            uVar.r();
        }
        this.f114c = 1;
        this.I = false;
        c(bundle);
        this.T = true;
        if (this.I) {
            this.U.b(f.a.ON_CREATE);
            return;
        }
        throw new Q("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final AbstractC0051n i() {
        if (this.v == null) {
            A();
            int i2 = this.f114c;
            if (i2 >= 4) {
                this.v.k();
            } else if (i2 >= 3) {
                this.v.l();
            } else if (i2 >= 2) {
                this.v.e();
            } else if (i2 >= 1) {
                this.v.f();
            }
        }
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater i(Bundle bundle) {
        this.S = d(bundle);
        return this.S;
    }

    public Context j() {
        AbstractC0050m mVar = this.u;
        if (mVar == null) {
            return null;
        }
        return mVar.c();
    }

    /* access modifiers changed from: package-private */
    public void j(Bundle bundle) {
        Parcelable u2;
        e(bundle);
        u uVar = this.v;
        if (uVar != null && (u2 = uVar.u()) != null) {
            bundle.putParcelable("android:support:fragments", u2);
        }
    }

    public Object k() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        return aVar.g;
    }

    /* access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.v == null) {
                A();
            }
            this.v.a(parcelable, this.w);
            this.w = null;
            this.v.f();
        }
    }

    /* access modifiers changed from: package-private */
    public i l() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        return aVar.o;
    }

    /* access modifiers changed from: package-private */
    public final void l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.e;
        if (sparseArray != null) {
            this.L.restoreHierarchyState(sparseArray);
            this.e = null;
        }
        this.I = false;
        f(bundle);
        if (!this.I) {
            throw new Q("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.K != null) {
            this.V.b(f.a.ON_CREATE);
        }
    }

    public Object m() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        return aVar.i;
    }

    public void m(Bundle bundle) {
        if (this.g < 0 || !E()) {
            this.i = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* access modifiers changed from: package-private */
    public i n() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        return aVar.p;
    }

    public final AbstractC0051n o() {
        return this.t;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.I = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        d().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        a aVar = this.O;
        if (aVar == null) {
            return 0;
        }
        return aVar.d;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        a aVar = this.O;
        if (aVar == null) {
            return 0;
        }
        return aVar.e;
    }

    /* access modifiers changed from: package-private */
    public int r() {
        a aVar = this.O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f;
    }

    public Object s() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.j;
        return obj == f113b ? m() : obj;
    }

    public final Resources t() {
        return X().getResources();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.d.b.a.a(this, sb);
        if (this.g >= 0) {
            sb.append(" #");
            sb.append(this.g);
        }
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.h;
        return obj == f113b ? k() : obj;
    }

    public Object v() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        return aVar.k;
    }

    public Object w() {
        a aVar = this.O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.l;
        return obj == f113b ? v() : obj;
    }

    /* access modifiers changed from: package-private */
    public int x() {
        a aVar = this.O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f117c;
    }

    public View y() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        this.g = -1;
        this.h = null;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.v = null;
        this.u = null;
        this.z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
        this.F = false;
    }
}
