package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ba  reason: case insensitive filesystem */
public class C0986ba<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f3904a;

    /* renamed from: b  reason: collision with root package name */
    private final T f3905b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3906c;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    protected C0986ba(String str, Object obj, int i) {
        this.f3904a = str;
        this.f3905b = obj;
        this.f3906c = i;
    }

    public static C0986ba<Double> a(String str, double d) {
        return new C0986ba<>(str, Double.valueOf(d), C1124da.f4110c);
    }

    public static C0986ba<Long> a(String str, long j) {
        return new C0986ba<>(str, Long.valueOf(j), C1124da.f4109b);
    }

    public static C0986ba<String> a(String str, String str2) {
        return new C0986ba<>(str, str2, C1124da.d);
    }

    public static C0986ba<Boolean> a(String str, boolean z) {
        return new C0986ba<>(str, Boolean.valueOf(z), C1124da.f4108a);
    }

    public T a() {
        AbstractC0292Ea a2 = C0266Da.a();
        if (a2 != null) {
            int i = C0917aa.f3817a[this.f3906c - 1];
            if (i == 1) {
                return (T) a2.a(this.f3904a, this.f3905b.booleanValue());
            }
            if (i == 2) {
                return (T) a2.getLong(this.f3904a, this.f3905b.longValue());
            }
            if (i == 3) {
                return (T) a2.a(this.f3904a, this.f3905b.doubleValue());
            }
            if (i == 4) {
                return (T) a2.a(this.f3904a, this.f3905b);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
