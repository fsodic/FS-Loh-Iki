package a.e.a;

import a.d.b.b;
import a.e.a.AbstractC0051n;
import a.e.a.ComponentCallbacksC0045h;
import a.e.a.u;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: a.e.a.a  reason: case insensitive filesystem */
public final class C0038a extends A implements AbstractC0051n.a, u.h {

    /* renamed from: a  reason: collision with root package name */
    final u f100a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<C0003a> f101b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    int f102c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j = true;
    String k;
    boolean l;
    int m = -1;
    int n;
    CharSequence o;
    int p;
    CharSequence q;
    ArrayList<String> r;
    ArrayList<String> s;
    boolean t = false;
    ArrayList<Runnable> u;

    /* access modifiers changed from: package-private */
    /* renamed from: a.e.a.a$a  reason: collision with other inner class name */
    public static final class C0003a {

        /* renamed from: a  reason: collision with root package name */
        int f103a;

        /* renamed from: b  reason: collision with root package name */
        ComponentCallbacksC0045h f104b;

        /* renamed from: c  reason: collision with root package name */
        int f105c;
        int d;
        int e;
        int f;

        C0003a() {
        }

        C0003a(int i, ComponentCallbacksC0045h hVar) {
            this.f103a = i;
            this.f104b = hVar;
        }
    }

    public C0038a(u uVar) {
        this.f100a = uVar;
    }

    private void a(int i2, ComponentCallbacksC0045h hVar, String str, int i3) {
        Class<?> cls = hVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        hVar.t = this.f100a;
        if (str != null) {
            String str2 = hVar.B;
            if (str2 == null || str.equals(str2)) {
                hVar.B = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + hVar + ": was " + hVar.B + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = hVar.z;
                if (i4 == 0 || i4 == i2) {
                    hVar.z = i2;
                    hVar.A = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + hVar + ": was " + hVar.z + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + hVar + " with tag " + str + " to container view with no id");
            }
        }
        a(new C0003a(i3, hVar));
    }

    private static boolean b(C0003a aVar) {
        ComponentCallbacksC0045h hVar = aVar.f104b;
        return hVar != null && hVar.m && hVar.K != null && !hVar.D && !hVar.C && hVar.D();
    }

    @Override // a.e.a.A
    public int a() {
        return a(false);
    }

    /* access modifiers changed from: package-private */
    public int a(boolean z) {
        if (!this.l) {
            if (u.f138a) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b("FragmentManager"));
                a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.l = true;
            this.m = this.i ? this.f100a.b(this) : -1;
            this.f100a.a(this, z);
            return this.m;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // a.e.a.A
    public A a(ComponentCallbacksC0045h hVar) {
        a(new C0003a(3, hVar));
        return this;
    }

    @Override // a.e.a.A
    public A a(ComponentCallbacksC0045h hVar, String str) {
        a(0, hVar, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public ComponentCallbacksC0045h a(ArrayList<ComponentCallbacksC0045h> arrayList, ComponentCallbacksC0045h hVar) {
        ComponentCallbacksC0045h hVar2 = hVar;
        int i2 = 0;
        while (i2 < this.f101b.size()) {
            C0003a aVar = this.f101b.get(i2);
            int i3 = aVar.f103a;
            if (i3 != 1) {
                if (i3 == 2) {
                    ComponentCallbacksC0045h hVar3 = aVar.f104b;
                    int i4 = hVar3.A;
                    ComponentCallbacksC0045h hVar4 = hVar2;
                    int i5 = i2;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ComponentCallbacksC0045h hVar5 = arrayList.get(size);
                        if (hVar5.A == i4) {
                            if (hVar5 == hVar3) {
                                z = true;
                            } else {
                                if (hVar5 == hVar4) {
                                    this.f101b.add(i5, new C0003a(9, hVar5));
                                    i5++;
                                    hVar4 = null;
                                }
                                C0003a aVar2 = new C0003a(3, hVar5);
                                aVar2.f105c = aVar.f105c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.f101b.add(i5, aVar2);
                                arrayList.remove(hVar5);
                                i5++;
                            }
                        }
                    }
                    if (z) {
                        this.f101b.remove(i5);
                        i5--;
                    } else {
                        aVar.f103a = 1;
                        arrayList.add(hVar3);
                    }
                    i2 = i5;
                    hVar2 = hVar4;
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.f104b);
                    ComponentCallbacksC0045h hVar6 = aVar.f104b;
                    if (hVar6 == hVar2) {
                        this.f101b.add(i2, new C0003a(9, hVar6));
                        i2++;
                        hVar2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f101b.add(i2, new C0003a(9, hVar2));
                        i2++;
                        hVar2 = aVar.f104b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.f104b);
            i2++;
        }
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (this.i) {
            if (u.f138a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f101b.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0003a aVar = this.f101b.get(i3);
                ComponentCallbacksC0045h hVar = aVar.f104b;
                if (hVar != null) {
                    hVar.s += i2;
                    if (u.f138a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f104b + " to " + aVar.f104b.s);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0003a aVar) {
        this.f101b.add(aVar);
        aVar.f105c = this.f102c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
    }

    /* access modifiers changed from: package-private */
    public void a(ComponentCallbacksC0045h.c cVar) {
        for (int i2 = 0; i2 < this.f101b.size(); i2++) {
            C0003a aVar = this.f101b.get(i2);
            if (b(aVar)) {
                aVar.f104b.a(cVar);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.l);
            if (this.g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.f102c == 0 && this.d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f102c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.d));
            }
            if (!(this.e == 0 && this.f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (!(this.n == 0 && this.o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (!(this.p == 0 && this.q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        if (!this.f101b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int size = this.f101b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0003a aVar = this.f101b.get(i2);
                switch (aVar.f103a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f103a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f104b);
                if (z) {
                    if (!(aVar.f105c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f105c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<C0038a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f101b.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            ComponentCallbacksC0045h hVar = this.f101b.get(i5).f104b;
            int i6 = hVar != null ? hVar.A : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    C0038a aVar = arrayList.get(i7);
                    int size2 = aVar.f101b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        ComponentCallbacksC0045h hVar2 = aVar.f101b.get(i8).f104b;
                        if ((hVar2 != null ? hVar2.A : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    @Override // a.e.a.u.h
    public boolean a(ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2) {
        if (u.f138a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.i) {
            return true;
        }
        this.f100a.a(this);
        return true;
    }

    @Override // a.e.a.A
    public int b() {
        return a(true);
    }

    /* access modifiers changed from: package-private */
    public ComponentCallbacksC0045h b(ArrayList<ComponentCallbacksC0045h> arrayList, ComponentCallbacksC0045h hVar) {
        for (int i2 = 0; i2 < this.f101b.size(); i2++) {
            C0003a aVar = this.f101b.get(i2);
            int i3 = aVar.f103a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case 8:
                            hVar = null;
                            break;
                        case 9:
                            hVar = aVar.f104b;
                            break;
                    }
                }
                arrayList.add(aVar.f104b);
            }
            arrayList.remove(aVar.f104b);
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        for (int size = this.f101b.size() - 1; size >= 0; size--) {
            C0003a aVar = this.f101b.get(size);
            ComponentCallbacksC0045h hVar = aVar.f104b;
            if (hVar != null) {
                hVar.a(u.d(this.g), this.h);
            }
            switch (aVar.f103a) {
                case 1:
                    hVar.a(aVar.f);
                    this.f100a.k(hVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f103a);
                case 3:
                    hVar.a(aVar.e);
                    this.f100a.a(hVar, false);
                    break;
                case 4:
                    hVar.a(aVar.e);
                    this.f100a.o(hVar);
                    break;
                case 5:
                    hVar.a(aVar.f);
                    this.f100a.e(hVar);
                    break;
                case 6:
                    hVar.a(aVar.e);
                    this.f100a.a(hVar);
                    break;
                case 7:
                    hVar.a(aVar.f);
                    this.f100a.c(hVar);
                    break;
                case 8:
                    this.f100a.n(null);
                    break;
                case 9:
                    this.f100a.n(hVar);
                    break;
            }
            if (!(this.t || aVar.f103a == 3 || hVar == null)) {
                this.f100a.h(hVar);
            }
        }
        if (!this.t && z) {
            u uVar = this.f100a;
            uVar.a(uVar.r, true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        int size = this.f101b.size();
        for (int i3 = 0; i3 < size; i3++) {
            ComponentCallbacksC0045h hVar = this.f101b.get(i3).f104b;
            int i4 = hVar != null ? hVar.A : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int size = this.f101b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0003a aVar = this.f101b.get(i2);
            ComponentCallbacksC0045h hVar = aVar.f104b;
            if (hVar != null) {
                hVar.a(this.g, this.h);
            }
            switch (aVar.f103a) {
                case 1:
                    hVar.a(aVar.f105c);
                    this.f100a.a(hVar, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f103a);
                case 3:
                    hVar.a(aVar.d);
                    this.f100a.k(hVar);
                    break;
                case 4:
                    hVar.a(aVar.d);
                    this.f100a.e(hVar);
                    break;
                case 5:
                    hVar.a(aVar.f105c);
                    this.f100a.o(hVar);
                    break;
                case 6:
                    hVar.a(aVar.d);
                    this.f100a.c(hVar);
                    break;
                case 7:
                    hVar.a(aVar.f105c);
                    this.f100a.a(hVar);
                    break;
                case 8:
                    this.f100a.n(hVar);
                    break;
                case 9:
                    this.f100a.n(null);
                    break;
            }
            if (!(this.t || aVar.f103a == 1 || hVar == null)) {
                this.f100a.h(hVar);
            }
        }
        if (!this.t) {
            u uVar = this.f100a;
            uVar.a(uVar.r, true);
        }
    }

    public String d() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        for (int i2 = 0; i2 < this.f101b.size(); i2++) {
            if (b(this.f101b.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        ArrayList<Runnable> arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.u.get(i2).run();
            }
            this.u = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.m >= 0) {
            sb.append(" #");
            sb.append(this.m);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
