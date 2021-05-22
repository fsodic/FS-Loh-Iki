package a.e.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: a.e.a.n  reason: case insensitive filesystem */
public abstract class AbstractC0051n {

    /* renamed from: a.e.a.n$a */
    public interface a {
    }

    /* renamed from: a.e.a.n$b */
    public static abstract class b {
        public abstract void a(AbstractC0051n nVar, ComponentCallbacksC0045h hVar);

        public abstract void a(AbstractC0051n nVar, ComponentCallbacksC0045h hVar, Context context);

        public abstract void a(AbstractC0051n nVar, ComponentCallbacksC0045h hVar, Bundle bundle);

        public abstract void a(AbstractC0051n nVar, ComponentCallbacksC0045h hVar, View view, Bundle bundle);

        public abstract void b(AbstractC0051n nVar, ComponentCallbacksC0045h hVar);

        public abstract void b(AbstractC0051n nVar, ComponentCallbacksC0045h hVar, Context context);

        public abstract void b(AbstractC0051n nVar, ComponentCallbacksC0045h hVar, Bundle bundle);

        public abstract void c(AbstractC0051n nVar, ComponentCallbacksC0045h hVar);

        public abstract void c(AbstractC0051n nVar, ComponentCallbacksC0045h hVar, Bundle bundle);

        public abstract void d(AbstractC0051n nVar, ComponentCallbacksC0045h hVar);

        public abstract void d(AbstractC0051n nVar, ComponentCallbacksC0045h hVar, Bundle bundle);

        public abstract void e(AbstractC0051n nVar, ComponentCallbacksC0045h hVar);

        public abstract void f(AbstractC0051n nVar, ComponentCallbacksC0045h hVar);

        public abstract void g(AbstractC0051n nVar, ComponentCallbacksC0045h hVar);
    }

    /* renamed from: a.e.a.n$c */
    public interface c {
        void onBackStackChanged();
    }

    public abstract A a();

    public abstract void a(int i, int i2);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract List<ComponentCallbacksC0045h> b();

    public abstract boolean c();

    public abstract boolean d();
}
