package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Fg  reason: case insensitive filesystem */
final class DialogInterface$OnClickListenerC0324Fg implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0246Cg f1978a;

    DialogInterface$OnClickListenerC0324Fg(C0246Cg cg) {
        this.f1978a = cg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent a2 = this.f1978a.a();
        q.c();
        C2452wk.a(C0246Cg.a(this.f1978a), a2);
    }
}
