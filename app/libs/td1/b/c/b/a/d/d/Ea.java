package b.c.b.a.d.d;

import b.c.b.a.d.d.M;

/* access modifiers changed from: package-private */
public final class Ea implements AbstractC0086pa {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0089ra f342a;

    /* renamed from: b  reason: collision with root package name */
    private final String f343b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f344c;
    private final int d;

    Ea(AbstractC0089ra raVar, String str, Object[] objArr) {
        this.f342a = raVar;
        this.f343b = str;
        this.f344c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.f343b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f344c;
    }

    @Override // b.c.b.a.d.d.AbstractC0086pa
    public final int r() {
        return (this.d & 1) == 1 ? M.d.i : M.d.j;
    }

    @Override // b.c.b.a.d.d.AbstractC0086pa
    public final boolean s() {
        return (this.d & 2) == 2;
    }

    @Override // b.c.b.a.d.d.AbstractC0086pa
    public final AbstractC0089ra t() {
        return this.f342a;
    }
}
