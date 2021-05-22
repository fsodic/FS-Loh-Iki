package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Wk  reason: case insensitive filesystem */
public final class RunnableC0770Wk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f3453a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3454b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f3455c;
    private final /* synthetic */ boolean d;

    RunnableC0770Wk(C0796Xk xk, Context context, String str, boolean z, boolean z2) {
        this.f3453a = context;
        this.f3454b = str;
        this.f3455c = z;
        this.d = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f3453a);
        builder.setMessage(this.f3454b);
        builder.setTitle(this.f3455c ? "Error" : "Info");
        if (this.d) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new DialogInterface$OnClickListenerC0848Zk(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
