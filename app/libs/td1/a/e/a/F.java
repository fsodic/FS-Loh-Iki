package a.e.a;

import a.c.b;
import a.d.c.c;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class F {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f72a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final O f73b = (Build.VERSION.SDK_INT >= 21 ? new K() : null);

    /* renamed from: c  reason: collision with root package name */
    private static final O f74c = a();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ComponentCallbacksC0045h f75a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f76b;

        /* renamed from: c  reason: collision with root package name */
        public C0038a f77c;
        public ComponentCallbacksC0045h d;
        public boolean e;
        public C0038a f;

        a() {
        }
    }

    private static b<String, String> a(int i, ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b<String, String> bVar = new b<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0038a aVar = arrayList.get(i4);
            if (aVar.b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar.r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.r;
                        arrayList4 = aVar.s;
                    } else {
                        ArrayList<String> arrayList6 = aVar.r;
                        arrayList3 = aVar.s;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = bVar.remove(str2);
                        if (remove != null) {
                            bVar.put(str, remove);
                        } else {
                            bVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    static b<String, View> a(O o, b<String, String> bVar, Object obj, a aVar) {
        i iVar;
        ArrayList<String> arrayList;
        String a2;
        ComponentCallbacksC0045h hVar = aVar.f75a;
        View y = hVar.y();
        if (bVar.isEmpty() || obj == null || y == null) {
            bVar.clear();
            return null;
        }
        b<String, View> bVar2 = new b<>();
        o.a((Map<String, View>) bVar2, y);
        C0038a aVar2 = aVar.f77c;
        if (aVar.f76b) {
            iVar = hVar.n();
            arrayList = aVar2.r;
        } else {
            iVar = hVar.l();
            arrayList = aVar2.s;
        }
        if (arrayList != null) {
            bVar2.a((Collection<?>) arrayList);
            bVar2.a((Collection<?>) bVar.values());
        }
        if (iVar != null) {
            iVar.a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    String a3 = a(bVar, str);
                    if (a3 != null) {
                        bVar.remove(a3);
                    }
                } else if (!str.equals(c.a(view)) && (a2 = a(bVar, str)) != null) {
                    bVar.put(a2, c.a(view));
                }
            }
        } else {
            a(bVar, bVar2);
        }
        return bVar2;
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    private static O a() {
        try {
            return (O) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static O a(ComponentCallbacksC0045h hVar, ComponentCallbacksC0045h hVar2) {
        ArrayList arrayList = new ArrayList();
        if (hVar != null) {
            Object m = hVar.m();
            if (m != null) {
                arrayList.add(m);
            }
            Object u = hVar.u();
            if (u != null) {
                arrayList.add(u);
            }
            Object w = hVar.w();
            if (w != null) {
                arrayList.add(w);
            }
        }
        if (hVar2 != null) {
            Object k = hVar2.k();
            if (k != null) {
                arrayList.add(k);
            }
            Object s = hVar2.s();
            if (s != null) {
                arrayList.add(s);
            }
            Object v = hVar2.v();
            if (v != null) {
                arrayList.add(v);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        O o = f73b;
        if (o != null && a(o, arrayList)) {
            return f73b;
        }
        O o2 = f74c;
        if (o2 != null && a(o2, arrayList)) {
            return f74c;
        }
        if (f73b == null && f74c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static View a(b<String, View> bVar, a aVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0038a aVar2 = aVar.f77c;
        if (obj == null || bVar == null || (arrayList = aVar2.r) == null || arrayList.isEmpty()) {
            return null;
        }
        return bVar.get((z ? aVar2.r : aVar2.s).get(0));
    }

    private static Object a(O o, ComponentCallbacksC0045h hVar, ComponentCallbacksC0045h hVar2, boolean z) {
        if (hVar == null || hVar2 == null) {
            return null;
        }
        return o.c(o.b(z ? hVar2.w() : hVar.v()));
    }

    private static Object a(O o, ComponentCallbacksC0045h hVar, boolean z) {
        if (hVar == null) {
            return null;
        }
        return o.b(z ? hVar.s() : hVar.k());
    }

    private static Object a(O o, ViewGroup viewGroup, View view, b<String, String> bVar, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        b<String, String> bVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        ComponentCallbacksC0045h hVar = aVar.f75a;
        ComponentCallbacksC0045h hVar2 = aVar.d;
        if (hVar == null || hVar2 == null) {
            return null;
        }
        boolean z = aVar.f76b;
        if (bVar.isEmpty()) {
            bVar2 = bVar;
            obj3 = null;
        } else {
            obj3 = a(o, hVar, hVar2, z);
            bVar2 = bVar;
        }
        b<String, View> b2 = b(o, bVar2, obj3, aVar);
        if (bVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(b2.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        a(hVar, hVar2, z, b2, true);
        if (obj4 != null) {
            rect = new Rect();
            o.b(obj4, view, arrayList);
            a(o, obj4, obj2, b2, aVar.e, aVar.f);
            if (obj != null) {
                o.a(obj, rect);
            }
        } else {
            rect = null;
        }
        P.a(viewGroup, new E(o, bVar, obj4, aVar, arrayList2, view, hVar, hVar2, z, arrayList, obj, rect));
        return obj4;
    }

    private static Object a(O o, Object obj, Object obj2, Object obj3, ComponentCallbacksC0045h hVar, boolean z) {
        return (obj == null || obj2 == null || hVar == null) ? true : z ? hVar.f() : hVar.e() ? o.b(obj2, obj, obj3) : o.a(obj2, obj, obj3);
    }

    private static String a(b<String, String> bVar, String str) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(bVar.d(i))) {
                return bVar.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(O o, Object obj, ComponentCallbacksC0045h hVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View y = hVar.y();
        if (y != null) {
            o.a(arrayList2, y);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        o.a(obj, arrayList2);
        return arrayList2;
    }

    private static void a(b<String, String> bVar, b<String, View> bVar2) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            if (!bVar2.containsKey(bVar.d(size))) {
                bVar.c(size);
            }
        }
    }

    private static void a(O o, ViewGroup viewGroup, ComponentCallbacksC0045h hVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        P.a(viewGroup, new C(obj, o, view, hVar, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void a(O o, Object obj, ComponentCallbacksC0045h hVar, ArrayList<View> arrayList) {
        if (hVar != null && obj != null && hVar.m && hVar.C && hVar.Q) {
            hVar.f(true);
            o.a(obj, hVar.y(), arrayList);
            P.a(hVar.J, new B(arrayList));
        }
    }

    private static void a(O o, Object obj, Object obj2, b<String, View> bVar, boolean z, C0038a aVar) {
        ArrayList<String> arrayList = aVar.r;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = bVar.get((z ? aVar.s : aVar.r).get(0));
            o.c(obj, view);
            if (obj2 != null) {
                o.c(obj2, view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.m != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.C == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(a.e.a.C0038a r16, a.e.a.C0038a.C0003a r17, android.util.SparseArray<a.e.a.F.a> r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.F.a(a.e.a.a, a.e.a.a$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void a(C0038a aVar, SparseArray<a> sparseArray, boolean z) {
        int size = aVar.f101b.size();
        for (int i = 0; i < size; i++) {
            a(aVar, aVar.f101b.get(i), sparseArray, false, z);
        }
    }

    static void a(ComponentCallbacksC0045h hVar, ComponentCallbacksC0045h hVar2, boolean z, b<String, View> bVar, boolean z2) {
        i l = z ? hVar2.l() : hVar.l();
        if (l != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = bVar == null ? 0 : bVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(bVar.b(i));
                arrayList.add(bVar.d(i));
            }
            if (z2) {
                l.b(arrayList2, arrayList, null);
            } else {
                l.a(arrayList2, arrayList, null);
            }
        }
    }

    private static void a(u uVar, int i, a aVar, View view, b<String, String> bVar) {
        ComponentCallbacksC0045h hVar;
        ComponentCallbacksC0045h hVar2;
        O a2;
        Object obj;
        ViewGroup viewGroup = uVar.t.a() ? (ViewGroup) uVar.t.a(i) : null;
        if (viewGroup != null && (a2 = a((hVar2 = aVar.d), (hVar = aVar.f75a))) != null) {
            boolean z = aVar.f76b;
            boolean z2 = aVar.e;
            Object a3 = a(a2, hVar, z);
            Object b2 = b(a2, hVar2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object a4 = a(a2, viewGroup, view, bVar, aVar, arrayList, arrayList2, a3, b2);
            if (a3 == null && a4 == null) {
                obj = b2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = b2;
            }
            ArrayList<View> a5 = a(a2, obj, hVar2, arrayList, view);
            Object obj2 = (a5 == null || a5.isEmpty()) ? null : obj;
            a2.a(a3, view);
            Object a6 = a(a2, a3, obj2, a4, hVar, aVar.f76b);
            if (a6 != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                a2.a(a6, a3, arrayList3, obj2, a5, a4, arrayList2);
                a(a2, viewGroup, hVar, view, arrayList2, a3, arrayList3, obj2, a5);
                a2.a((View) viewGroup, arrayList2, (Map<String, String>) bVar);
                a2.a(viewGroup, a6);
                a2.a(viewGroup, arrayList2, (Map<String, String>) bVar);
            }
        }
    }

    static void a(u uVar, ArrayList<C0038a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (uVar.r >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0038a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    b(aVar, sparseArray, z);
                } else {
                    a(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(uVar.s.c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    b<String, String> a2 = a(keyAt, arrayList, arrayList2, i, i2);
                    a aVar2 = (a) sparseArray.valueAt(i4);
                    if (z) {
                        b(uVar, keyAt, aVar2, view, a2);
                    } else {
                        a(uVar, keyAt, aVar2, view, a2);
                    }
                }
            }
        }
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    private static void a(ArrayList<View> arrayList, b<String, View> bVar, Collection<String> collection) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            View d = bVar.d(size);
            if (collection.contains(c.a(d))) {
                arrayList.add(d);
            }
        }
    }

    private static boolean a(O o, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!o.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static b<String, View> b(O o, b<String, String> bVar, Object obj, a aVar) {
        i iVar;
        ArrayList<String> arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        ComponentCallbacksC0045h hVar = aVar.d;
        b<String, View> bVar2 = new b<>();
        o.a((Map<String, View>) bVar2, hVar.y());
        C0038a aVar2 = aVar.f;
        if (aVar.e) {
            iVar = hVar.l();
            arrayList = aVar2.s;
        } else {
            iVar = hVar.n();
            arrayList = aVar2.r;
        }
        bVar2.a((Collection<?>) arrayList);
        if (iVar != null) {
            iVar.a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    bVar.remove(str);
                } else if (!str.equals(c.a(view))) {
                    bVar.put(c.a(view), bVar.remove(str));
                }
            }
        } else {
            bVar.a((Collection<?>) bVar2.keySet());
        }
        return bVar2;
    }

    private static Object b(O o, ComponentCallbacksC0045h hVar, boolean z) {
        if (hVar == null) {
            return null;
        }
        return o.b(z ? hVar.u() : hVar.m());
    }

    private static Object b(O o, ViewGroup viewGroup, View view, b<String, String> bVar, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        ComponentCallbacksC0045h hVar = aVar.f75a;
        ComponentCallbacksC0045h hVar2 = aVar.d;
        if (hVar != null) {
            hVar.y().setVisibility(0);
        }
        if (hVar == null || hVar2 == null) {
            return null;
        }
        boolean z = aVar.f76b;
        Object a2 = bVar.isEmpty() ? null : a(o, hVar, hVar2, z);
        b<String, View> b2 = b(o, bVar, a2, aVar);
        b<String, View> a3 = a(o, bVar, a2, aVar);
        if (bVar.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (a3 != null) {
                a3.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, b2, bVar.keySet());
            a(arrayList2, a3, bVar.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(hVar, hVar2, z, b2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            o.b(obj3, view, arrayList);
            a(o, obj3, obj2, b2, aVar.e, aVar.f);
            Rect rect2 = new Rect();
            View a4 = a(a3, aVar, obj, z);
            if (a4 != null) {
                o.a(obj, rect2);
            }
            rect = rect2;
            view2 = a4;
        } else {
            view2 = null;
            rect = null;
        }
        P.a(viewGroup, new D(hVar, hVar2, z, a3, view2, o, rect));
        return obj3;
    }

    public static void b(C0038a aVar, SparseArray<a> sparseArray, boolean z) {
        if (aVar.f100a.t.a()) {
            for (int size = aVar.f101b.size() - 1; size >= 0; size--) {
                a(aVar, aVar.f101b.get(size), sparseArray, true, z);
            }
        }
    }

    private static void b(u uVar, int i, a aVar, View view, b<String, String> bVar) {
        ComponentCallbacksC0045h hVar;
        ComponentCallbacksC0045h hVar2;
        O a2;
        Object obj;
        ViewGroup viewGroup = uVar.t.a() ? (ViewGroup) uVar.t.a(i) : null;
        if (viewGroup != null && (a2 = a((hVar2 = aVar.d), (hVar = aVar.f75a))) != null) {
            boolean z = aVar.f76b;
            boolean z2 = aVar.e;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object a3 = a(a2, hVar, z);
            Object b2 = b(a2, hVar2, z2);
            Object b3 = b(a2, viewGroup, view, bVar, aVar, arrayList2, arrayList, a3, b2);
            if (a3 == null && b3 == null) {
                obj = b2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = b2;
            }
            ArrayList<View> a4 = a(a2, obj, hVar2, arrayList2, view);
            ArrayList<View> a5 = a(a2, a3, hVar, arrayList, view);
            a(a5, 4);
            Object a6 = a(a2, a3, obj, b3, hVar, z);
            if (a6 != null) {
                a(a2, obj, hVar2, a4);
                ArrayList<String> a7 = a2.a(arrayList);
                a2.a(a6, a3, a5, obj, a4, b3, arrayList);
                a2.a(viewGroup, a6);
                a2.a(viewGroup, arrayList2, arrayList, a7, bVar);
                a(a5, 0);
                a2.b(b3, arrayList2, arrayList);
            }
        }
    }
}
