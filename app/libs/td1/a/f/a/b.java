package a.f.a;

import a.f.b.a;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* access modifiers changed from: package-private */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f167a = false;

    /* renamed from: b  reason: collision with root package name */
    private final h f168b;

    /* renamed from: c  reason: collision with root package name */
    private final c f169c;

    public static class a<D> extends o<D> implements a.AbstractC0005a<D> {
        private final int k;
        private final Bundle l;
        private final a.f.b.a<D> m;
        private h n;
        private C0004b<D> o;
        private a.f.b.a<D> p;

        /* access modifiers changed from: package-private */
        public a.f.b.a<D> a(boolean z) {
            if (b.f167a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.m.a();
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void a() {
            if (b.f167a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.m.c();
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.p<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void a(p<? super D> pVar) {
            super.a((p) pVar);
            this.n = null;
            this.o = null;
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.o
        public void a(D d) {
            super.a((Object) d);
            a.f.b.a<D> aVar = this.p;
            if (aVar != null) {
                aVar.b();
                throw null;
            }
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            a.f.b.a<D> aVar = this.m;
            aVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void b() {
            if (b.f167a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.m.d();
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            h hVar = this.n;
            C0004b<D> bVar = this.o;
            if (hVar != null && bVar != null) {
                super.a((p) bVar);
                a(hVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            a.d.b.a.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.f.a.b$b  reason: collision with other inner class name */
    public static class C0004b<D> implements p<D> {
    }

    static class c extends s {

        /* renamed from: a  reason: collision with root package name */
        private static final t.a f170a = new c();

        /* renamed from: b  reason: collision with root package name */
        private a.c.h<a> f171b = new a.c.h<>();

        /* renamed from: c  reason: collision with root package name */
        private boolean f172c = false;

        c() {
        }

        static c a(u uVar) {
            return (c) new t(uVar, f170a).a(c.class);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.s
        public void a() {
            super.a();
            if (this.f171b.d() <= 0) {
                this.f171b.c();
            } else {
                this.f171b.e(0).a(true);
                throw null;
            }
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f171b.d() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f171b.d() > 0) {
                    a e = this.f171b.e(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f171b.c(0));
                    printWriter.print(": ");
                    printWriter.println(e.toString());
                    e.a(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int d = this.f171b.d();
            for (int i = 0; i < d; i++) {
                this.f171b.e(i).c();
            }
        }
    }

    b(h hVar, u uVar) {
        this.f168b = hVar;
        this.f169c = c.a(uVar);
    }

    @Override // a.f.a.a
    public void a() {
        this.f169c.b();
    }

    @Override // a.f.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f169c.a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.d.b.a.a(this.f168b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
