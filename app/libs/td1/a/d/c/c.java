package a.d.c;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f56a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap<View, String> f57b;

    /* renamed from: c  reason: collision with root package name */
    private static WeakHashMap<View, Object> f58c = null;
    private static boolean d = false;

    public interface a {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f59a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f60b = null;

        /* renamed from: c  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f61c = null;
        private WeakReference<KeyEvent> d = null;

        b() {
        }

        static b a(View view) {
            b bVar = (b) view.getTag(a.d.a.tag_unhandled_key_event_manager);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b();
            view.setTag(a.d.a.tag_unhandled_key_event_manager, bVar2);
            return bVar2;
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.f61c == null) {
                this.f61c = new SparseArray<>();
            }
            return this.f61c;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f60b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b2 = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f60b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f59a.isEmpty()) {
                synchronized (f59a) {
                    if (this.f60b == null) {
                        this.f60b = new WeakHashMap<>();
                    }
                    for (int size = f59a.size() - 1; size >= 0; size--) {
                        View view = f59a.get(size).get();
                        if (view == null) {
                            f59a.remove(size);
                        } else {
                            this.f60b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f60b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.d.a.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((a) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> a2 = a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a2.valueAt(indexOfKey);
                a2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && c.c(view)) {
                c(view, keyEvent);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View b2 = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    a().put(keyCode, new WeakReference<>(b2));
                }
            }
            return b2 != null;
        }
    }

    public static String a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f57b;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f57b == null) {
            f57b = new WeakHashMap<>();
        }
        f57b.put(view, str);
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return b.a(view).a(view, keyEvent);
    }

    public static boolean b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return b.a(view).a(keyEvent);
    }

    public static boolean c(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }
}
