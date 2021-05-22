package androidx.lifecycle;

import a.a.a.a.c;
import a.a.a.b.b;
import androidx.lifecycle.f;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: a  reason: collision with root package name */
    static final Object f200a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final Object f201b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private b<p<? super T>, LiveData<T>.a> f202c = new b<>();
    int d = 0;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    /* access modifiers changed from: package-private */
    public class LifecycleBoundObserver extends LiveData<T>.a implements e {
        final h e;

        LifecycleBoundObserver(h hVar, p<? super T> pVar) {
            super(pVar);
            this.e = hVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.a
        public void a() {
            this.e.a().b(this);
        }

        @Override // androidx.lifecycle.e
        public void a(h hVar, f.a aVar) {
            if (this.e.a().a() == f.b.DESTROYED) {
                LiveData.this.a((p) this.f203a);
            } else {
                a(b());
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.a
        public boolean a(h hVar) {
            return this.e == hVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.a
        public boolean b() {
            return this.e.a().a().a(f.b.STARTED);
        }
    }

    /* access modifiers changed from: private */
    public abstract class a {

        /* renamed from: a  reason: collision with root package name */
        final p<? super T> f203a;

        /* renamed from: b  reason: collision with root package name */
        boolean f204b;

        /* renamed from: c  reason: collision with root package name */
        int f205c = -1;

        a(p<? super T> pVar) {
            this.f203a = pVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            if (z != this.f204b) {
                this.f204b = z;
                int i = 1;
                boolean z2 = LiveData.this.d == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.d;
                if (!this.f204b) {
                    i = -1;
                }
                liveData.d = i2 + i;
                if (z2 && this.f204b) {
                    LiveData.this.a();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.d == 0 && !this.f204b) {
                    liveData2.b();
                }
                if (this.f204b) {
                    LiveData.this.a((LiveData<T>.a) this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(h hVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean b();
    }

    public LiveData() {
        Object obj = f200a;
        this.e = obj;
        this.f = obj;
        this.g = -1;
        this.j = new m(this);
    }

    private static void a(String str) {
        if (!c.b().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    private void b(LiveData<T>.a aVar) {
        if (aVar.f204b) {
            if (!aVar.b()) {
                aVar.a(false);
                return;
            }
            int i2 = aVar.f205c;
            int i3 = this.g;
            if (i2 < i3) {
                aVar.f205c = i3;
                aVar.f203a.a((Object) this.e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: package-private */
    public void a(LiveData<T>.a aVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (aVar == null) {
                b<K, V>.d b2 = this.f202c.b();
                while (b2.hasNext()) {
                    b((a) ((Map.Entry) b2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.i);
        this.h = false;
    }

    public void a(h hVar, p<? super T> pVar) {
        a("observe");
        if (hVar.a().a() != f.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(hVar, pVar);
            LiveData<T>.a b2 = this.f202c.b(pVar, lifecycleBoundObserver);
            if (b2 != null && !b2.a(hVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b2 == null) {
                hVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(p<? super T> pVar) {
        a("removeObserver");
        LiveData<T>.a remove = this.f202c.remove(pVar);
        if (remove != null) {
            remove.a();
            remove.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        a((LiveData<T>.a) null);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }
}
