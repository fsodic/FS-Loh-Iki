package com.google.android.gms.internal.ads;

import java.util.Iterator;

public final class QI {

    /* renamed from: a  reason: collision with root package name */
    private final OR f2916a;

    /* renamed from: b  reason: collision with root package name */
    private final C1445iD f2917b;

    /* renamed from: c  reason: collision with root package name */
    private final C1859oE f2918c;

    public QI(OR or, C1445iD iDVar, C1859oE oEVar) {
        this.f2916a = or;
        this.f2917b = iDVar;
        this.f2918c = oEVar;
    }

    public final void a(C2078rR rRVar, C1941pR pRVar, int i, C2068rH rHVar, long j) {
        C1513jD jDVar;
        C1790nE a2 = this.f2918c.a();
        a2.a(rRVar);
        a2.a(pRVar);
        a2.a("action", "adapter_status");
        a2.a("adapter_l", String.valueOf(j));
        a2.a("sc", Integer.toString(i));
        if (rHVar != null) {
            a2.a("arec", Integer.toString(rHVar.b()));
            String a3 = this.f2916a.a(rHVar.getMessage());
            if (a3 != null) {
                a2.a("areec", a3);
            }
        }
        C1445iD iDVar = this.f2917b;
        Iterator<String> it = pRVar.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                jDVar = null;
                break;
            }
            jDVar = iDVar.a(it.next());
            if (jDVar != null) {
                break;
            }
        }
        if (jDVar != null) {
            a2.a("ancn", jDVar.f4643a);
            C0194Ag ag = jDVar.f4644b;
            if (ag != null) {
                a2.a("adapter_v", ag.toString());
            }
            C0194Ag ag2 = jDVar.f4645c;
            if (ag2 != null) {
                a2.a("adapter_sv", ag2.toString());
            }
        }
        a2.a();
    }
}
