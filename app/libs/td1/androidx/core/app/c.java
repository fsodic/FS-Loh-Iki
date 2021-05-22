package androidx.core.app;

import a.c.g;
import a.d.c.a;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.r;

public class c extends Activity implements h, a.AbstractC0002a {

    /* renamed from: a  reason: collision with root package name */
    private g<Class<? extends Object>, Object> f178a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private j f179b = new j(this);

    @Override // androidx.lifecycle.h
    public f a() {
        return this.f179b;
    }

    @Override // a.d.c.a.AbstractC0002a
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.a(decorView, keyEvent)) {
            return a.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f179b.a(f.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
