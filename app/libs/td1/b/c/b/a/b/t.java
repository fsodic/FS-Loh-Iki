package b.c.b.a.b;

import java.lang.ref.WeakReference;

abstract class t extends r {

    /* renamed from: b  reason: collision with root package name */
    private static final WeakReference<byte[]> f314b = new WeakReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<byte[]> f315c = f314b;

    t(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.b.r
    public final byte[] Jb() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f315c.get();
            if (bArr == null) {
                bArr = Kb();
                this.f315c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] Kb();
}
