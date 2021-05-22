package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ca  reason: case insensitive filesystem */
public final class C1055ca<T> extends C0986ba<T> {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    protected C1055ca(String str, Object obj, int i) {
        super(str, obj, i);
    }

    public static C0986ba<Boolean> a(String str, boolean z) {
        return new C1055ca(str, true, C1124da.f4108a);
    }

    @Override // com.google.android.gms.internal.ads.C0986ba
    public final T a() {
        if (C0266Da.f1779b.get()) {
            return (T) super.a();
        }
        throw new IllegalStateException("Striped code is accessed: 54c42518-856a-44fb-aae0-cd6676d514e5");
    }
}
