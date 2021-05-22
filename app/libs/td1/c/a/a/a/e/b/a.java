package c.a.a.a.e.b;

public class a implements c {
    /* access modifiers changed from: protected */
    public int a(e eVar) {
        return eVar.getHopCount() > 1 ? 2 : 1;
    }

    @Override // c.a.a.a.e.b.c
    public int a(e eVar, e eVar2) {
        c.a.a.a.p.a.a(eVar, "Planned route");
        return (eVar2 == null || eVar2.getHopCount() < 1) ? a(eVar) : eVar.getHopCount() > 1 ? c(eVar, eVar2) : b(eVar, eVar2);
    }

    /* access modifiers changed from: protected */
    public int b(e eVar, e eVar2) {
        if (eVar2.getHopCount() <= 1 && eVar.getTargetHost().equals(eVar2.getTargetHost()) && eVar.isSecure() == eVar2.isSecure()) {
            return (eVar.getLocalAddress() == null || eVar.getLocalAddress().equals(eVar2.getLocalAddress())) ? 0 : -1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int c(e eVar, e eVar2) {
        int hopCount;
        int hopCount2;
        if (eVar2.getHopCount() <= 1 || !eVar.getTargetHost().equals(eVar2.getTargetHost()) || (hopCount = eVar.getHopCount()) < (hopCount2 = eVar2.getHopCount())) {
            return -1;
        }
        for (int i = 0; i < hopCount2 - 1; i++) {
            if (!eVar.getHopTarget(i).equals(eVar2.getHopTarget(i))) {
                return -1;
            }
        }
        if (hopCount > hopCount2) {
            return 4;
        }
        if ((eVar2.isTunnelled() && !eVar.isTunnelled()) || (eVar2.isLayered() && !eVar.isLayered())) {
            return -1;
        }
        if (eVar.isTunnelled() && !eVar2.isTunnelled()) {
            return 3;
        }
        if (!eVar.isLayered() || eVar2.isLayered()) {
            return eVar.isSecure() != eVar2.isSecure() ? -1 : 0;
        }
        return 5;
    }
}
