package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Zk  reason: case insensitive filesystem */
final class DialogInterface$OnClickListenerC0848Zk implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ RunnableC0770Wk f3670a;

    DialogInterface$OnClickListenerC0848Zk(RunnableC0770Wk wk) {
        this.f3670a = wk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        q.c();
        C2452wk.a(this.f3670a.f3453a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
