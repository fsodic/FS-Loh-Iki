package androidx.lifecycle;

/* access modifiers changed from: package-private */
public class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData f229a;

    m(LiveData liveData) {
        this.f229a = liveData;
    }

    public void run() {
        Object obj;
        synchronized (this.f229a.f201b) {
            obj = this.f229a.f;
            this.f229a.f = LiveData.f200a;
        }
        this.f229a.a(obj);
    }
}
