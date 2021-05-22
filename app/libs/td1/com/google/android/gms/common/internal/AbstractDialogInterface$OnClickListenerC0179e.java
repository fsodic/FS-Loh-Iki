package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.e  reason: case insensitive filesystem */
public abstract class AbstractDialogInterface$OnClickListenerC0179e implements DialogInterface.OnClickListener {
    public static AbstractDialogInterface$OnClickListenerC0179e a(Activity activity, Intent intent, int i) {
        return new w(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
