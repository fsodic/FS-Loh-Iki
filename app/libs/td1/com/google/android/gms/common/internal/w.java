package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* access modifiers changed from: package-private */
public final class w extends AbstractDialogInterface$OnClickListenerC0179e {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Intent f1390a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f1391b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f1392c;

    w(Intent intent, Activity activity, int i) {
        this.f1390a = intent;
        this.f1391b = activity;
        this.f1392c = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC0179e
    public final void a() {
        Intent intent = this.f1390a;
        if (intent != null) {
            this.f1391b.startActivityForResult(intent, this.f1392c);
        }
    }
}
