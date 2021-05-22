package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;

final class Tca implements AbstractC2646zda {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC1062cda f3187a = new Sca();

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1062cda f3188b;

    public Tca() {
        this(new Vca(C2161sca.a(), a()));
    }

    private Tca(AbstractC1062cda cda) {
        C2230tca.a((Object) cda, "messageInfoFactory");
        this.f3188b = cda;
    }

    private static AbstractC1062cda a() {
        try {
            return (AbstractC1062cda) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f3187a;
        }
    }

    private static boolean a(_ca _ca) {
        return _ca.a() == AbstractC2092rca.e.i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2646zda
    public final <T> AbstractC2439wda<T> a(Class<T> cls) {
        C2577yda.a((Class<?>) cls);
        _ca b2 = this.f3188b.b(cls);
        return b2.b() ? AbstractC2092rca.class.isAssignableFrom(cls) ? C1406hda.a(C2577yda.c(), C1404hca.a(), b2.c()) : C1406hda.a(C2577yda.a(), C1404hca.b(), b2.c()) : AbstractC2092rca.class.isAssignableFrom(cls) ? a(b2) ? C1268fda.a(cls, b2, C1543jda.b(), Lca.b(), C2577yda.c(), C1404hca.a(), C0924ada.b()) : C1268fda.a(cls, b2, C1543jda.b(), Lca.b(), C2577yda.c(), (AbstractC1335gca<?>) null, C0924ada.b()) : a(b2) ? C1268fda.a(cls, b2, C1543jda.a(), Lca.a(), C2577yda.a(), C1404hca.b(), C0924ada.a()) : C1268fda.a(cls, b2, C1543jda.a(), Lca.a(), C2577yda.b(), (AbstractC1335gca<?>) null, C0924ada.a());
    }
}
