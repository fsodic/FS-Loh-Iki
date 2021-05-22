package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C0916aZ;
import com.google.android.gms.internal.ads.C1742mZ;
import com.google.android.gms.internal.ads.NZ;
import com.google.android.gms.internal.ads.XY;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class GY implements Naa {

    /* renamed from: a  reason: collision with root package name */
    private final String f2043a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2044b;

    /* renamed from: c  reason: collision with root package name */
    private C1742mZ f2045c;
    private XY d;
    private int e;

    GY(ZZ zz) {
        this.f2043a = zz.n();
        if (this.f2043a.equals(SX.f3093b)) {
            try {
                C2086rZ a2 = C2086rZ.a(zz.o(), C1197eca.a());
                this.f2045c = (C1742mZ) LX.b(zz);
                this.f2044b = a2.n();
            } catch (Bca e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.f2043a.equals(SX.f3092a)) {
            try {
                _Y a3 = _Y.a(zz.o(), C1197eca.a());
                this.d = (XY) LX.b(zz);
                this.e = a3.n().n();
                this.f2044b = this.e + a3.o().n();
            } catch (Bca e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(this.f2043a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.Naa
    public final int a() {
        return this.f2044b;
    }

    @Override // com.google.android.gms.internal.ads.Naa
    public final AbstractC1947pX a(byte[] bArr) {
        AbstractC0993bda bda;
        if (bArr.length == this.f2044b) {
            if (this.f2043a.equals(SX.f3093b)) {
                C1742mZ.a p = C1742mZ.p();
                p.a((AbstractC2092rca) this.f2045c);
                C1742mZ.a aVar = p;
                aVar.a(Iba.a(bArr, 0, this.f2044b));
                bda = (C1742mZ) aVar.j();
            } else if (this.f2043a.equals(SX.f3092a)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.e, this.f2044b);
                C0916aZ.a q = C0916aZ.q();
                q.a((AbstractC2092rca) this.d.o());
                C0916aZ.a aVar2 = q;
                aVar2.a(Iba.a(copyOfRange));
                NZ.a q2 = NZ.q();
                q2.a((AbstractC2092rca) this.d.p());
                NZ.a aVar3 = q2;
                aVar3.a(Iba.a(copyOfRange2));
                XY.a q3 = XY.q();
                q3.a(this.d.n());
                q3.a((C0916aZ) aVar2.j());
                q3.a((NZ) aVar3.j());
                bda = (XY) q3.j();
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            return (AbstractC1947pX) LX.a(this.f2043a, bda, AbstractC1947pX.class);
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
