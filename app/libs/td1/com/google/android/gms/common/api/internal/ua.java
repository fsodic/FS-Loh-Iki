package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.o;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class ua implements IBinder.DeathRecipient, va {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<BasePendingResult<?>> f1300a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<o> f1301b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<IBinder> f1302c;

    private ua(BasePendingResult<?> basePendingResult, o oVar, IBinder iBinder) {
        this.f1301b = new WeakReference<>(oVar);
        this.f1300a = new WeakReference<>(basePendingResult);
        this.f1302c = new WeakReference<>(iBinder);
    }

    /* synthetic */ ua(BasePendingResult basePendingResult, o oVar, IBinder iBinder, ta taVar) {
        this(basePendingResult, null, iBinder);
    }

    private final void a() {
        BasePendingResult<?> basePendingResult = this.f1300a.get();
        o oVar = this.f1301b.get();
        if (!(oVar == null || basePendingResult == null)) {
            oVar.a(basePendingResult.d().intValue());
        }
        IBinder iBinder = this.f1302c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.va
    public final void a(BasePendingResult<?> basePendingResult) {
        a();
    }

    public final void binderDied() {
        a();
    }
}
