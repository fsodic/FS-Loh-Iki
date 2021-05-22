package a.e.a;

import a.c.h;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.a;
import androidx.core.app.c;
import androidx.lifecycle.f;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: a.e.a.j  reason: case insensitive filesystem */
public class ActivityC0047j extends c implements v, a.AbstractC0006a, a.c {

    /* renamed from: c  reason: collision with root package name */
    final Handler f119c = new HandlerC0046i(this);
    final C0049l d = C0049l.a(new a());
    private u e;
    boolean f;
    boolean g;
    boolean h = true;
    boolean i;
    boolean j;
    int k;
    h<String> l;

    /* renamed from: a.e.a.j$a */
    class a extends AbstractC0050m<ActivityC0047j> {
        public a() {
            super(ActivityC0047j.this);
        }

        @Override // a.e.a.AbstractC0048k
        public View a(int i) {
            return ActivityC0047j.this.findViewById(i);
        }

        @Override // a.e.a.AbstractC0050m
        public void a(ComponentCallbacksC0045h hVar) {
            ActivityC0047j.this.a(hVar);
        }

        @Override // a.e.a.AbstractC0050m
        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0047j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // a.e.a.AbstractC0048k
        public boolean a() {
            Window window = ActivityC0047j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // a.e.a.AbstractC0050m
        public boolean b(ComponentCallbacksC0045h hVar) {
            return !ActivityC0047j.this.isFinishing();
        }

        @Override // a.e.a.AbstractC0050m
        public LayoutInflater f() {
            return ActivityC0047j.this.getLayoutInflater().cloneInContext(ActivityC0047j.this);
        }

        @Override // a.e.a.AbstractC0050m
        public int g() {
            Window window = ActivityC0047j.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // a.e.a.AbstractC0050m
        public boolean h() {
            return ActivityC0047j.this.getWindow() != null;
        }

        @Override // a.e.a.AbstractC0050m
        public void i() {
            ActivityC0047j.this.f();
        }
    }

    /* renamed from: a.e.a.j$b */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        Object f120a;

        /* renamed from: b  reason: collision with root package name */
        u f121b;

        /* renamed from: c  reason: collision with root package name */
        v f122c;

        b() {
        }
    }

    static void a(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private static boolean a(AbstractC0051n nVar, f.b bVar) {
        boolean z = false;
        for (ComponentCallbacksC0045h hVar : nVar.b()) {
            if (hVar != null) {
                if (hVar.a().a().a(f.b.STARTED)) {
                    hVar.U.a(bVar);
                    z = true;
                }
                AbstractC0051n O = hVar.O();
                if (O != null) {
                    z |= a(O, bVar);
                }
            }
        }
        return z;
    }

    private void g() {
        do {
        } while (a(c(), f.b.CREATED));
    }

    /* access modifiers changed from: package-private */
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.d.a(view, str, context, attributeSet);
    }

    @Override // androidx.lifecycle.h, androidx.core.app.c
    public f a() {
        return super.a();
    }

    public void a(ComponentCallbacksC0045h hVar) {
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.lifecycle.v
    public u b() {
        if (getApplication() != null) {
            if (this.e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.e = bVar.f121b;
                }
                if (this.e == null) {
                    this.e = new u();
                }
            }
            return this.e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public AbstractC0051n c() {
        return this.d.j();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.d.f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f);
        printWriter.print(" mResumed=");
        printWriter.print(this.g);
        printWriter.print(" mStopped=");
        printWriter.print(this.h);
        if (getApplication() != null) {
            a.f.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.d.j().a(str, fileDescriptor, printWriter, strArr);
    }

    public Object e() {
        return null;
    }

    @Deprecated
    public void f() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.d.k();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String b2 = this.l.b(i5);
            this.l.d(i5);
            if (b2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0045h a2 = this.d.a(b2);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + b2);
                return;
            }
            a2.a(i2 & 65535, i3, intent);
            return;
        }
        a.b a3 = androidx.core.app.a.a();
        if (a3 == null || !a3.a(this, i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        AbstractC0051n j2 = this.d.j();
        boolean c2 = j2.c();
        if (c2 && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (c2 || !j2.d()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.k();
        this.d.a(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.c
    public void onCreate(Bundle bundle) {
        u uVar;
        v vVar = null;
        this.d.a((ComponentCallbacksC0045h) null);
        super.onCreate(bundle);
        b bVar = (b) getLastNonConfigurationInstance();
        if (!(bVar == null || (uVar = bVar.f121b) == null || this.e != null)) {
            this.e = uVar;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0049l lVar = this.d;
            if (bVar != null) {
                vVar = bVar.f122c;
            }
            lVar.a(parcelable, vVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.l = new h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.l.b(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.l == null) {
            this.l = new h<>();
            this.k = 0;
        }
        this.d.b();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.d.a(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a(null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.e != null && !isChangingConfigurations()) {
            this.e.a();
        }
        this.d.c();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.d.d();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.d.b(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.d.a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.d.a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.d.k();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.d.a(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.g = false;
        if (this.f119c.hasMessages(2)) {
            this.f119c.removeMessages(2);
            d();
        }
        this.d.e();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.d.b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f119c.removeMessages(2);
        d();
        this.d.i();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return (i2 != 0 || menu == null) ? super.onPreparePanel(i2, view, menu) : a(view, menu) | this.d.b(menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.d.k();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String b2 = this.l.b(i4);
            this.l.d(i4);
            if (b2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0045h a2 = this.d.a(b2);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + b2);
                return;
            }
            a2.a(i2 & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f119c.sendEmptyMessage(2);
        this.g = true;
        this.d.i();
    }

    public final Object onRetainNonConfigurationInstance() {
        Object e2 = e();
        v l2 = this.d.l();
        if (l2 == null && this.e == null && e2 == null) {
            return null;
        }
        b bVar = new b();
        bVar.f120a = e2;
        bVar.f121b = this.e;
        bVar.f122c = l2;
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.c
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g();
        Parcelable m = this.d.m();
        if (m != null) {
            bundle.putParcelable("android:support:fragments", m);
        }
        if (this.l.d() > 0) {
            bundle.putInt("android:support:next_request_index", this.k);
            int[] iArr = new int[this.l.d()];
            String[] strArr = new String[this.l.d()];
            for (int i2 = 0; i2 < this.l.d(); i2++) {
                iArr[i2] = this.l.c(i2);
                strArr[i2] = this.l.e(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.h = false;
        if (!this.f) {
            this.f = true;
            this.d.a();
        }
        this.d.k();
        this.d.i();
        this.d.g();
    }

    public void onStateNotSaved() {
        this.d.k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.h = true;
        g();
        this.d.h();
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (!this.j && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (!this.j && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.i && i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (!this.i && i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
