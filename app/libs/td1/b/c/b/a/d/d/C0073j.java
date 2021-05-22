package b.c.b.a.d.d;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
/* renamed from: b.c.b.a.d.d.j  reason: case insensitive filesystem */
public final class C0073j extends AbstractC0077l {

    /* renamed from: a  reason: collision with root package name */
    private int f432a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f433b = this.f434c.size();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AbstractC0071i f434c;

    C0073j(AbstractC0071i iVar) {
        this.f434c = iVar;
    }

    public final boolean hasNext() {
        return this.f432a < this.f433b;
    }

    @Override // b.c.b.a.d.d.AbstractC0085p
    public final byte nextByte() {
        int i = this.f432a;
        if (i < this.f433b) {
            this.f432a = i + 1;
            return this.f434c.i(i);
        }
        throw new NoSuchElementException();
    }
}
