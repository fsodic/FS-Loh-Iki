package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.c.b;
import com.google.android.gms.internal.ads.AbstractC0792Xg;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C2392voa;

public final class AdActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0792Xg f1014a;

    private final void a() {
        AbstractC0792Xg xg = this.f1014a;
        if (xg != null) {
            try {
                xg.Oa();
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f1014a.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.f1014a != null) {
                z = this.f1014a.Fb();
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f1014a.G(b.a(configuration));
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1014a = C2392voa.b().a(this);
        AbstractC0792Xg xg = this.f1014a;
        if (xg == null) {
            e = null;
        } else {
            try {
                xg.j(bundle);
                return;
            } catch (RemoteException e) {
                e = e;
            }
        }
        C0745Vl.d("#007 Could not call remote method.", e);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            if (this.f1014a != null) {
                this.f1014a.onDestroy();
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            if (this.f1014a != null) {
                this.f1014a.onPause();
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            if (this.f1014a != null) {
                this.f1014a.rb();
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            if (this.f1014a != null) {
                this.f1014a.onResume();
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f1014a != null) {
                this.f1014a.g(bundle);
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            if (this.f1014a != null) {
                this.f1014a.ia();
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            if (this.f1014a != null) {
                this.f1014a.jb();
            }
        } catch (RemoteException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
