package b.c.b.a.d.d;

import b.c.b.a.d.d.M;
import b.c.b.a.d.d.M.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class M<MessageType extends M<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0059c<MessageType, BuilderType> {
    private static Map<Object, M<?, ?>> zzrs = new ConcurrentHashMap();
    protected Ya zzrq = Ya.c();
    private int zzrr = -1;

    public static abstract class a<MessageType extends M<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0061d<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f369a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f370b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f371c = false;

        protected a(MessageType messagetype) {
            this.f369a = messagetype;
            this.f370b = (MessageType) ((M) messagetype.a(d.d, null, null));
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            Da.a().a(messagetype).b(messagetype, messagetype2);
        }

        public final BuilderType a(MessageType messagetype) {
            g();
            a(this.f370b, messagetype);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: b.c.b.a.d.d.M$a<MessageType extends b.c.b.a.d.d.M<MessageType, BuilderType>, BuilderType extends b.c.b.a.d.d.M$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // b.c.b.a.d.d.AbstractC0061d
        public final /* synthetic */ AbstractC0061d a(AbstractC0059c cVar) {
            a((M) cVar);
            return this;
        }

        @Override // b.c.b.a.d.d.AbstractC0093ta
        public final /* synthetic */ AbstractC0089ra c() {
            return this.f369a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: b.c.b.a.d.d.M$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f369a.a(d.e, null, null);
            aVar.a((M) b());
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final void g() {
            if (this.f371c) {
                MessageType messagetype = (MessageType) ((M) this.f370b.a(d.d, null, null));
                a(messagetype, this.f370b);
                this.f370b = messagetype;
                this.f371c = false;
            }
        }

        /* renamed from: h */
        public MessageType b() {
            if (this.f371c) {
                return this.f370b;
            }
            this.f370b.i();
            this.f371c = true;
            return this.f370b;
        }

        /* renamed from: i */
        public final MessageType a() {
            MessageType messagetype = (MessageType) ((M) b());
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new Wa(messagetype);
        }
    }

    public static class b<T extends M<T, ?>> extends C0063e<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f372b;

        public b(T t) {
            this.f372b = t;
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends M<MessageType, BuilderType> implements AbstractC0093ta {
        protected F<Object> zzrw = F.f();

        /* access modifiers changed from: package-private */
        public final F<Object> k() {
            if (this.zzrw.b()) {
                this.zzrw = (F) this.zzrw.clone();
            }
            return this.zzrw;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f373a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f374b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f375c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {f373a, f374b, f375c, d, e, f, g};
        public static final int i = 1;
        public static final int j = 2;
        private static final /* synthetic */ int[] k = {i, j};
        public static final int l = 1;
        public static final int m = 2;
        private static final /* synthetic */ int[] n = {l, m};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    static <T extends M<?, ?>> T a(Class<T> cls) {
        M<?, ?> m = zzrs.get(cls);
        if (m == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m = (T) zzrs.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (m == null) {
            m = (T) ((M) ((M) cb.a(cls)).a(d.f, (Object) null, (Object) null));
            if (m != null) {
                zzrs.put(cls, m);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) m;
    }

    protected static Object a(AbstractC0089ra raVar, String str, Object[] objArr) {
        return new Ea(raVar, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends M<?, ?>> void a(Class<T> cls, T t) {
        zzrs.put(cls, t);
    }

    protected static final <T extends M<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(d.f373a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a2 = Da.a().a(t).a(t);
        if (z) {
            t.a(d.f374b, a2 ? t : null, null);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0059c
    public final void a(int i) {
        this.zzrr = i;
    }

    @Override // b.c.b.a.d.d.AbstractC0089ra
    public final void a(AbstractC0100x xVar) {
        Da.a().a((Class) getClass()).a((Object) this, (qb) C0104z.a(xVar));
    }

    @Override // b.c.b.a.d.d.AbstractC0093ta
    public final /* synthetic */ AbstractC0089ra c() {
        return (M) a(d.f, (Object) null, (Object) null);
    }

    @Override // b.c.b.a.d.d.AbstractC0089ra
    public final int e() {
        if (this.zzrr == -1) {
            this.zzrr = Da.a().a(this).c(this);
        }
        return this.zzrr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((M) a(d.f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return Da.a().a(this).a(this, (M) obj);
    }

    @Override // b.c.b.a.d.d.AbstractC0089ra
    public final /* synthetic */ AbstractC0091sa f() {
        a aVar = (a) a(d.e, (Object) null, (Object) null);
        aVar.a((M) this);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0059c
    public final int h() {
        return this.zzrr;
    }

    public int hashCode() {
        int i = this.zzne;
        if (i != 0) {
            return i;
        }
        this.zzne = Da.a().a(this).b(this);
        return this.zzne;
    }

    /* access modifiers changed from: protected */
    public final void i() {
        Da.a().a(this).d(this);
    }

    @Override // b.c.b.a.d.d.AbstractC0093ta
    public final boolean isInitialized() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends M<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType j() {
        return (BuilderType) ((a) a(d.e, (Object) null, (Object) null));
    }

    public String toString() {
        return C0095ua.a(this, super.toString());
    }
}
