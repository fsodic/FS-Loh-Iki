package a.b.a;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.b;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f19a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f20b;

    /* renamed from: a.b.a.a$a  reason: collision with other inner class name */
    public static final class C0001a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f21a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f22b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f23c;
        private ArrayList<Bundle> d;
        private boolean e;

        public C0001a() {
            this(null);
        }

        public C0001a(b bVar) {
            this.f21a = new Intent("android.intent.action.VIEW");
            this.f22b = null;
            this.f23c = null;
            this.d = null;
            this.e = true;
            if (bVar == null) {
                Bundle bundle = new Bundle();
                if (bVar == null) {
                    b.a(bundle, "android.support.customtabs.extra.SESSION", null);
                    this.f21a.putExtras(bundle);
                    return;
                }
                bVar.a();
                throw null;
            }
            Intent intent = this.f21a;
            bVar.b();
            throw null;
        }

        public a a() {
            ArrayList<Bundle> arrayList = this.f22b;
            if (arrayList != null) {
                this.f21a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.d;
            if (arrayList2 != null) {
                this.f21a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f21a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
            return new a(this.f21a, this.f23c);
        }
    }

    a(Intent intent, Bundle bundle) {
        this.f19a = intent;
        this.f20b = bundle;
    }
}
