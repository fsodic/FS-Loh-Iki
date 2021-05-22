package a.e.a;

import android.os.Handler;
import android.os.Message;

/* renamed from: a.e.a.i  reason: case insensitive filesystem */
class HandlerC0046i extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ActivityC0047j f118a;

    HandlerC0046i(ActivityC0047j jVar) {
        this.f118a = jVar;
    }

    public void handleMessage(Message message) {
        if (message.what != 2) {
            super.handleMessage(message);
            return;
        }
        this.f118a.d();
        this.f118a.d.i();
    }
}
