package a.e.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: a.e.a.f  reason: case insensitive filesystem */
public class C0043f extends AbstractC0048k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC0045h f110a;

    C0043f(ComponentCallbacksC0045h hVar) {
        this.f110a = hVar;
    }

    @Override // a.e.a.AbstractC0048k
    public ComponentCallbacksC0045h a(Context context, String str, Bundle bundle) {
        return this.f110a.u.a(context, str, bundle);
    }

    @Override // a.e.a.AbstractC0048k
    public View a(int i) {
        View view = this.f110a.K;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    @Override // a.e.a.AbstractC0048k
    public boolean a() {
        return this.f110a.K != null;
    }
}
