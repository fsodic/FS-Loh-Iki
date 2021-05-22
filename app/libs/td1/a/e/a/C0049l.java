package a.e.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.e.a.l  reason: case insensitive filesystem */
public class C0049l {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0050m<?> f123a;

    private C0049l(AbstractC0050m<?> mVar) {
        this.f123a = mVar;
    }

    public static C0049l a(AbstractC0050m<?> mVar) {
        return new C0049l(mVar);
    }

    public ComponentCallbacksC0045h a(String str) {
        return this.f123a.e.b(str);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f123a.e.onCreateView(view, str, context, attributeSet);
    }

    public void a() {
        this.f123a.e.e();
    }

    public void a(ComponentCallbacksC0045h hVar) {
        AbstractC0050m<?> mVar = this.f123a;
        mVar.e.a(mVar, mVar, hVar);
    }

    public void a(Configuration configuration) {
        this.f123a.e.a(configuration);
    }

    public void a(Parcelable parcelable, v vVar) {
        this.f123a.e.a(parcelable, vVar);
    }

    public void a(Menu menu) {
        this.f123a.e.a(menu);
    }

    public void a(boolean z) {
        this.f123a.e.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f123a.e.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.f123a.e.a(menuItem);
    }

    public void b() {
        this.f123a.e.f();
    }

    public void b(boolean z) {
        this.f123a.e.b(z);
    }

    public boolean b(Menu menu) {
        return this.f123a.e.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.f123a.e.b(menuItem);
    }

    public void c() {
        this.f123a.e.g();
    }

    public void d() {
        this.f123a.e.i();
    }

    public void e() {
        this.f123a.e.j();
    }

    public void f() {
        this.f123a.e.k();
    }

    public void g() {
        this.f123a.e.l();
    }

    public void h() {
        this.f123a.e.m();
    }

    public boolean i() {
        return this.f123a.e.o();
    }

    public AbstractC0051n j() {
        return this.f123a.d();
    }

    public void k() {
        this.f123a.e.r();
    }

    public v l() {
        return this.f123a.e.t();
    }

    public Parcelable m() {
        return this.f123a.e.u();
    }
}
