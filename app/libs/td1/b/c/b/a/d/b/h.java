package b.c.b.a.d.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class h extends Handler {
    public h(Looper looper) {
        super(looper);
    }

    public h(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
