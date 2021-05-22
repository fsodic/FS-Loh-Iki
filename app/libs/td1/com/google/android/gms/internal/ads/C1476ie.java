package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ie  reason: case insensitive filesystem */
public final class C1476ie implements AbstractC0268Dc<AbstractC0244Ce> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2302ue f4575a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC0607Qd f4576b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1132de f4577c;

    C1476ie(C1132de deVar, C2302ue ueVar, AbstractC0607Qd qd) {
        this.f4577c = deVar;
        this.f4575a = ueVar;
        this.f4576b = qd;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC0244Ce ce, Map map) {
        synchronized (this.f4577c.f4119a) {
            if (this.f4575a.a() != -1) {
                if (this.f4575a.a() != 1) {
                    this.f4577c.h = 0;
                    this.f4577c.e.a(this.f4576b);
                    this.f4575a.a(this.f4576b);
                    this.f4577c.g = this.f4575a;
                    C1763mk.f("Successfully loaded JS Engine.");
                }
            }
        }
    }
}
