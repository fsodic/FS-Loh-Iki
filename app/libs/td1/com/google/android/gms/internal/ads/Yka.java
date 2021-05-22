package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* access modifiers changed from: package-private */
public final class Yka implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    private static final Yka f3584a = new Yka();

    /* renamed from: b  reason: collision with root package name */
    public volatile long f3585b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3586c;
    private final HandlerThread d = new HandlerThread("ChoreographerOwner:Handler");
    private Choreographer e;
    private int f;

    private Yka() {
        this.d.start();
        this.f3586c = new Handler(this.d.getLooper(), this);
        this.f3586c.sendEmptyMessage(0);
    }

    public static Yka a() {
        return f3584a;
    }

    public final void b() {
        this.f3586c.sendEmptyMessage(1);
    }

    public final void c() {
        this.f3586c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f3585b = j;
        this.e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            this.f++;
            if (this.f == 1) {
                this.e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f--;
            if (this.f == 0) {
                this.e.removeFrameCallback(this);
                this.f3585b = 0;
            }
            return true;
        }
    }
}
