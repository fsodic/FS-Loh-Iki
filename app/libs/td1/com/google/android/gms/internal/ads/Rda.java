package com.google.android.gms.internal.ads;

final class Rda extends Oda<Sda, Sda> {
    Rda() {
    }

    private static void a(Object obj, Sda sda) {
        ((AbstractC2092rca) obj).zzieg = sda;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ Sda a() {
        return Sda.d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final void a(Object obj) {
        ((AbstractC2092rca) obj).zzieg.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void a(Sda sda, int i, int i2) {
        sda.a((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void a(Sda sda, int i, long j) {
        sda.a(i << 3, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, com.google.android.gms.internal.ads.Iba] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void a(Sda sda, int i, Iba iba) {
        sda.a((i << 3) | 2, iba);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void a(Sda sda, int i, Sda sda2) {
        sda.a((i << 3) | 3, sda2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.ads.mea] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void a(Sda sda, AbstractC1752mea mea) {
        sda.b(mea);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void a(Object obj, Sda sda) {
        a(obj, sda);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final boolean a(AbstractC2026qda qda) {
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ Sda b(Sda sda) {
        Sda sda2 = sda;
        sda2.a();
        return sda2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void b(Sda sda, int i, long j) {
        sda.a((i << 3) | 1, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.ads.mea] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void b(Sda sda, AbstractC1752mea mea) {
        sda.a(mea);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ void b(Object obj, Sda sda) {
        a(obj, sda);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ int c(Sda sda) {
        return sda.b();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ Sda c(Sda sda, Sda sda2) {
        Sda sda3 = sda;
        Sda sda4 = sda2;
        return sda4.equals(Sda.c()) ? sda3 : Sda.a(sda3, sda4);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ Sda d(Object obj) {
        return ((AbstractC2092rca) obj).zzieg;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ Sda e(Object obj) {
        Sda sda = ((AbstractC2092rca) obj).zzieg;
        if (sda != Sda.c()) {
            return sda;
        }
        Sda d = Sda.d();
        a(obj, d);
        return d;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Oda
    public final /* synthetic */ int f(Sda sda) {
        return sda.e();
    }
}
