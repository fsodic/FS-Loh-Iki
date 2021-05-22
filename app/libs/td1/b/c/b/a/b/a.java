package b.c.b.a.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private boolean f255a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<IBinder> f256b = new LinkedBlockingQueue();

    public IBinder a(long j, TimeUnit timeUnit) {
        r.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f255a) {
            this.f255a = true;
            IBinder poll = this.f256b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f256b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
