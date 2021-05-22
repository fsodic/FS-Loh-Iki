package a.e.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: a.e.a.d  reason: case insensitive filesystem */
public class DialogInterface$OnCancelListenerC0041d extends ComponentCallbacksC0045h implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    int Y = 0;
    int Z = 0;
    boolean aa = true;
    boolean ba = true;
    int ca = -1;
    Dialog da;
    boolean ea;
    boolean fa;
    boolean ga;

    @Override // a.e.a.ComponentCallbacksC0045h
    public void I() {
        super.I();
        Dialog dialog = this.da;
        if (dialog != null) {
            this.ea = true;
            dialog.dismiss();
            this.da = null;
        }
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public void J() {
        super.J();
        if (!this.ga && !this.fa) {
            this.fa = true;
        }
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public void M() {
        super.M();
        Dialog dialog = this.da;
        if (dialog != null) {
            this.ea = false;
            dialog.show();
        }
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public void N() {
        super.N();
        Dialog dialog = this.da;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void a(AbstractC0051n nVar, String str) {
        this.fa = false;
        this.ga = true;
        A a2 = nVar.a();
        a2.a(this, str);
        a2.a();
    }

    public void a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public void a(Context context) {
        super.a(context);
        if (!this.ga) {
            this.fa = false;
        }
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public void b(Bundle bundle) {
        Bundle bundle2;
        super.b(bundle);
        if (this.ba) {
            View y = y();
            if (y != null) {
                if (y.getParent() == null) {
                    this.da.setContentView(y);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            ActivityC0047j d = d();
            if (d != null) {
                this.da.setOwnerActivity(d);
            }
            this.da.setCancelable(this.aa);
            this.da.setOnCancelListener(this);
            this.da.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.da.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public void c(Bundle bundle) {
        super.c(bundle);
        this.ba = this.A == 0;
        if (bundle != null) {
            this.Y = bundle.getInt("android:style", 0);
            this.Z = bundle.getInt("android:theme", 0);
            this.aa = bundle.getBoolean("android:cancelable", true);
            this.ba = bundle.getBoolean("android:showsDialog", this.ba);
            this.ca = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public LayoutInflater d(Bundle bundle) {
        Context c2;
        if (!this.ba) {
            return super.d(bundle);
        }
        this.da = n(bundle);
        Dialog dialog = this.da;
        if (dialog != null) {
            a(dialog, this.Y);
            c2 = this.da.getContext();
        } else {
            c2 = this.u.c();
        }
        return (LayoutInflater) c2.getSystemService("layout_inflater");
    }

    @Override // a.e.a.ComponentCallbacksC0045h
    public void e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.e(bundle);
        Dialog dialog = this.da;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.Y;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Z;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.aa;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.ba;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.ca;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        if (!this.fa) {
            this.fa = true;
            this.ga = false;
            Dialog dialog = this.da;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.ea = true;
            if (this.ca >= 0) {
                o().a(this.ca, 1);
                this.ca = -1;
                return;
            }
            A a2 = o().a();
            a2.a(this);
            if (z) {
                a2.b();
            } else {
                a2.a();
            }
        }
    }

    public void h(boolean z) {
        this.ba = z;
    }

    public Dialog n(Bundle bundle) {
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ea) {
            g(true);
        }
    }
}
