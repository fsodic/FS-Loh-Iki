package b.c.b.a.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;

public final class i extends j {
    @Deprecated
    public static final int d = j.f305a;

    @Deprecated
    public static Dialog a(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (j.b(activity, i)) {
            i = 18;
        }
        return e.a().a(activity, i, i2, onCancelListener);
    }

    public static Resources d(Context context) {
        return j.d(context);
    }
}
