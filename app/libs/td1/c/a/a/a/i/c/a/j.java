package c.a.a.a.i.c.a;

import c.a.a.a.p.a;
import java.util.Date;
import java.util.concurrent.locks.Condition;

@Deprecated
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final Condition f808a;

    /* renamed from: b  reason: collision with root package name */
    private final g f809b;

    /* renamed from: c  reason: collision with root package name */
    private Thread f810c;
    private boolean d;

    public j(Condition condition, g gVar) {
        a.a(condition, "Condition");
        this.f808a = condition;
        this.f809b = gVar;
    }

    public void a() {
        this.d = true;
        this.f808a.signalAll();
    }

    public boolean a(Date date) {
        boolean z;
        if (this.f810c != null) {
            throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.f810c);
        } else if (!this.d) {
            this.f810c = Thread.currentThread();
            if (date != null) {
                try {
                    z = this.f808a.awaitUntil(date);
                } catch (Throwable th) {
                    this.f810c = null;
                    throw th;
                }
            } else {
                this.f808a.await();
                z = true;
            }
            if (!this.d) {
                this.f810c = null;
                return z;
            }
            throw new InterruptedException("Operation interrupted");
        } else {
            throw new InterruptedException("Operation interrupted");
        }
    }

    public void b() {
        if (this.f810c != null) {
            this.f808a.signalAll();
            return;
        }
        throw new IllegalStateException("Nobody waiting on this object.");
    }
}
