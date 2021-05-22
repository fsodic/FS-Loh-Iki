package b.c.b.a.d.d;

/* renamed from: b.c.b.a.d.d.u  reason: case insensitive filesystem */
public abstract class AbstractC0094u {

    /* renamed from: a  reason: collision with root package name */
    private int f449a;

    /* renamed from: b  reason: collision with root package name */
    private int f450b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f451c;

    private AbstractC0094u() {
        this.f449a = 100;
        this.f450b = Integer.MAX_VALUE;
        this.f451c = false;
    }

    static AbstractC0094u a(byte[] bArr, int i, int i2, boolean z) {
        C0098w wVar = new C0098w(bArr, 0, i2, false);
        try {
            wVar.a(i2);
            return wVar;
        } catch (S e) {
            throw new IllegalArgumentException(e);
        }
    }
}
