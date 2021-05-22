package b.c.b.a.d.d;

import b.c.b.a.d.d.AbstractC0059c;
import b.c.b.a.d.d.AbstractC0061d;

/* renamed from: b.c.b.a.d.d.d  reason: case insensitive filesystem */
public abstract class AbstractC0061d<MessageType extends AbstractC0059c<MessageType, BuilderType>, BuilderType extends AbstractC0061d<MessageType, BuilderType>> implements AbstractC0091sa {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: b.c.b.a.d.d.d<MessageType extends b.c.b.a.d.d.c<MessageType, BuilderType>, BuilderType extends b.c.b.a.d.d.d<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.c.b.a.d.d.AbstractC0091sa
    public final /* synthetic */ AbstractC0091sa a(AbstractC0089ra raVar) {
        if (c().getClass().isInstance(raVar)) {
            a((AbstractC0059c) raVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
