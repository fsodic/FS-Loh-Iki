package a.e.a;

import a.d.b.c;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: a.e.a.m  reason: case insensitive filesystem */
public abstract class AbstractC0050m<E> extends AbstractC0048k {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f124a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f125b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f126c;
    private final int d;
    final u e;

    AbstractC0050m(ActivityC0047j jVar) {
        this(jVar, jVar, jVar.f119c, 0);
    }

    AbstractC0050m(Activity activity, Context context, Handler handler, int i) {
        this.e = new u();
        this.f124a = activity;
        c.a(context, "context == null");
        this.f125b = context;
        c.a(handler, "handler == null");
        this.f126c = handler;
        this.d = i;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(ComponentCallbacksC0045h hVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* access modifiers changed from: package-private */
    public Activity b() {
        return this.f124a;
    }

    public abstract boolean b(ComponentCallbacksC0045h hVar);

    /* access modifiers changed from: package-private */
    public Context c() {
        return this.f125b;
    }

    /* access modifiers changed from: package-private */
    public u d() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public Handler e() {
        return this.f126c;
    }

    public abstract LayoutInflater f();

    public abstract int g();

    public abstract boolean h();

    public abstract void i();
}
