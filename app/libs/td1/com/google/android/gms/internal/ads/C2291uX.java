package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC0993bda;
import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uX  reason: case insensitive filesystem */
public class C2291uX<PrimitiveT, KeyProtoT extends AbstractC0993bda> implements AbstractC2360vX<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2429wX<KeyProtoT> f5727a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f5728b;

    public C2291uX(AbstractC2429wX<KeyProtoT> wXVar, Class<PrimitiveT> cls) {
        if (wXVar.d().contains(cls) || Void.class.equals(cls)) {
            this.f5727a = wXVar;
            this.f5728b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", wXVar.toString(), cls.getName()));
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: java.lang.Class<PrimitiveT>, java.lang.Class<P> */
    private final PrimitiveT b(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f5728b)) {
            this.f5727a.a(keyprotot);
            return (PrimitiveT) this.f5727a.a(keyprotot, (Class<PrimitiveT>) this.f5728b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    private final C2498xX<?, KeyProtoT> c() {
        return new C2498xX<>(this.f5727a.f());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2360vX
    public final AbstractC0993bda a(Iba iba) {
        try {
            return c().a(iba);
        } catch (Bca e) {
            String valueOf = String.valueOf(this.f5727a.f().a().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2360vX
    public final Class<PrimitiveT> a() {
        return this.f5728b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.ads.bda */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2360vX
    public final PrimitiveT a(AbstractC0993bda bda) {
        String valueOf = String.valueOf(this.f5727a.b().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.f5727a.b().isInstance(bda)) {
            return b(bda);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2360vX
    public final WZ b(Iba iba) {
        try {
            KeyProtoT a2 = c().a(iba);
            WZ.b q = WZ.q();
            q.a(this.f5727a.a());
            q.a(a2.d());
            q.a(this.f5727a.c());
            return (WZ) ((AbstractC2092rca) q.j());
        } catch (Bca e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2360vX
    public final String b() {
        return this.f5727a.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2360vX
    public final PrimitiveT c(Iba iba) {
        try {
            return b(this.f5727a.a(iba));
        } catch (Bca e) {
            String valueOf = String.valueOf(this.f5727a.b().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }
}
