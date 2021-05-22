package c.a.a.a.b.c;

import c.a.a.a.c.a;
import c.a.a.a.e.i;
import java.io.IOException;

class c implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f621a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f622b;

    c(d dVar, i iVar) {
        this.f622b = dVar;
        this.f621a = iVar;
    }

    @Override // c.a.a.a.c.a
    public boolean cancel() {
        try {
            this.f621a.abortConnection();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
