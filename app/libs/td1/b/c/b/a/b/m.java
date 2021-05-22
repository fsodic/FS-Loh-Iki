package b.c.b.a.b;

import a.e.a.AbstractC0051n;
import a.e.a.DialogInterface$OnCancelListenerC0041d;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;

public class m extends DialogInterface$OnCancelListenerC0041d {
    private Dialog ha = null;
    private DialogInterface.OnCancelListener ia = null;

    public static m a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        r.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.ha = dialog2;
        if (onCancelListener != null) {
            mVar.ia = onCancelListener;
        }
        return mVar;
    }

    @Override // a.e.a.DialogInterface$OnCancelListenerC0041d
    public void a(AbstractC0051n nVar, String str) {
        super.a(nVar, str);
    }

    @Override // a.e.a.DialogInterface$OnCancelListenerC0041d
    public Dialog n(Bundle bundle) {
        if (this.ha == null) {
            h(false);
        }
        return this.ha;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ia;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
