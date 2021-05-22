package b.c.b.a.d.d;

import java.util.Comparator;

/* renamed from: b.c.b.a.d.d.k  reason: case insensitive filesystem */
final class C0075k implements Comparator<AbstractC0071i> {
    C0075k() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC0071i iVar, AbstractC0071i iVar2) {
        AbstractC0071i iVar3 = iVar;
        AbstractC0071i iVar4 = iVar2;
        AbstractC0085p pVar = (AbstractC0085p) iVar3.iterator();
        AbstractC0085p pVar2 = (AbstractC0085p) iVar4.iterator();
        while (pVar.hasNext() && pVar2.hasNext()) {
            int compare = Integer.compare(AbstractC0071i.b(pVar.nextByte()), AbstractC0071i.b(pVar2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(iVar3.size(), iVar4.size());
    }
}
