package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

/* renamed from: com.google.android.gms.internal.ads.sca  reason: case insensitive filesystem */
final class C2161sca implements AbstractC1062cda {

    /* renamed from: a  reason: collision with root package name */
    private static final C2161sca f5526a = new C2161sca();

    private C2161sca() {
    }

    public static C2161sca a() {
        return f5526a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1062cda
    public final boolean a(Class<?> cls) {
        return AbstractC2092rca.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1062cda
    public final _ca b(Class<?> cls) {
        if (!AbstractC2092rca.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (_ca) AbstractC2092rca.a(cls.asSubclass(AbstractC2092rca.class)).a(AbstractC2092rca.e.f5432c, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
