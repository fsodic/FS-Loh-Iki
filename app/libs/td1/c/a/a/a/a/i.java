package c.a.a.a.a;

import c.a.a.a.p.a;
import java.util.Collection;
import java.util.Queue;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private b f601a = b.UNCHALLENGED;

    /* renamed from: b  reason: collision with root package name */
    private c f602b;

    /* renamed from: c  reason: collision with root package name */
    private h f603c;
    private n d;
    private Queue<a> e;

    public Queue<a> a() {
        return this.e;
    }

    public void a(b bVar) {
        if (bVar == null) {
            bVar = b.UNCHALLENGED;
        }
        this.f601a = bVar;
    }

    @Deprecated
    public void a(c cVar) {
        if (cVar == null) {
            e();
        } else {
            this.f602b = cVar;
        }
    }

    public void a(c cVar, n nVar) {
        a.a(cVar, "Auth scheme");
        a.a(nVar, "Credentials");
        this.f602b = cVar;
        this.d = nVar;
        this.e = null;
    }

    @Deprecated
    public void a(n nVar) {
        this.d = nVar;
    }

    public void a(Queue<a> queue) {
        a.a((Collection) queue, "Queue of auth options");
        this.e = queue;
        this.f602b = null;
        this.d = null;
    }

    public c b() {
        return this.f602b;
    }

    public n c() {
        return this.d;
    }

    public b d() {
        return this.f601a;
    }

    public void e() {
        this.f601a = b.UNCHALLENGED;
        this.e = null;
        this.f602b = null;
        this.f603c = null;
        this.d = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("state:");
        sb.append(this.f601a);
        sb.append(";");
        if (this.f602b != null) {
            sb.append("auth scheme:");
            sb.append(this.f602b.getSchemeName());
            sb.append(";");
        }
        if (this.d != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }
}
