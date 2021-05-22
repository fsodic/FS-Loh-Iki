package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import com.google.android.gms.internal.ads.AbstractC2092rca.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.rca  reason: case insensitive filesystem */
public abstract class AbstractC2092rca<MessageType extends AbstractC2092rca<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC2642zba<MessageType, BuilderType> {
    private static Map<Object, AbstractC2092rca<?, ?>> zziei = new ConcurrentHashMap();
    protected Sda zzieg = Sda.c();
    private int zzieh = -1;

    /* renamed from: com.google.android.gms.internal.ads.rca$a */
    public static class a<T extends AbstractC2092rca<T, ?>> extends Aba<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f5426b;

        public a(T t) {
            this.f5426b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.rca$b */
    public static abstract class b<MessageType extends AbstractC2092rca<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC2573yba<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f5427a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f5428b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f5429c = false;

        protected b(MessageType messagetype) {
            this.f5427a = messagetype;
            this.f5428b = (MessageType) ((AbstractC2092rca) messagetype.a(e.d, null, null));
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            C1957pda.a().a(messagetype).b(messagetype, messagetype2);
        }

        private final BuilderType b(byte[] bArr, int i, int i2, C1197eca eca) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            try {
                C1957pda.a().a(this.f5428b).a(this.f5428b, bArr, 0, i2 + 0, new Dba(eca));
                return this;
            } catch (Bca e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw Bca.a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.AbstractC1131dda
        public final /* synthetic */ AbstractC0993bda a() {
            return this.f5427a;
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.f5429c) {
                g();
                this.f5429c = false;
            }
            a(this.f5428b, messagetype);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.rca$b<MessageType extends com.google.android.gms.internal.ads.rca<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.rca$b<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.AbstractC2573yba
        public final /* synthetic */ AbstractC2573yba a(AbstractC2642zba zba) {
            a((AbstractC2092rca) zba);
            return this;
        }

        public final /* synthetic */ AbstractC2573yba a(byte[] bArr, int i, int i2, C1197eca eca) {
            b(bArr, 0, i2, eca);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.internal.ads.rca$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f5427a.a(e.e, null, null);
            bVar.a((AbstractC2092rca) K());
            return bVar;
        }

        /* access modifiers changed from: protected */
        public void g() {
            MessageType messagetype = (MessageType) ((AbstractC2092rca) this.f5428b.a(e.d, null, null));
            a(messagetype, this.f5428b);
            this.f5428b = messagetype;
        }

        /* renamed from: h */
        public MessageType K() {
            if (this.f5429c) {
                return this.f5428b;
            }
            MessageType messagetype = this.f5428b;
            C1957pda.a().a(messagetype).c(messagetype);
            this.f5429c = true;
            return this.f5428b;
        }

        /* renamed from: i */
        public final MessageType j() {
            MessageType messagetype = (MessageType) ((AbstractC2092rca) K());
            if (messagetype.h()) {
                return messagetype;
            }
            throw new Qda(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.rca$c */
    static final class c implements AbstractC1679lca<c> {
        @Override // com.google.android.gms.internal.ads.AbstractC1679lca
        public final EnumC1270fea L() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.AbstractC1679lca
        public final EnumC1477iea M() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.AbstractC1679lca
        public final boolean N() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.rca$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends AbstractC2092rca<MessageType, BuilderType> implements AbstractC1131dda {
        protected C1541jca<c> zzien = C1541jca.f();

        /* access modifiers changed from: package-private */
        public final C1541jca<c> n() {
            if (this.zzien.b()) {
                this.zzien = (C1541jca) this.zzien.clone();
            }
            return this.zzien;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.ads.rca$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5430a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5431b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5432c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {f5430a, f5431b, f5432c, d, e, f, g};
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

    /* renamed from: com.google.android.gms.internal.ads.rca$f */
    public static class f<ContainingType extends AbstractC0993bda, Type> extends C1266fca<ContainingType, Type> {
    }

    protected static <E> Cca<E> a(Cca<E> cca) {
        int size = cca.size();
        return cca.b(size == 0 ? 10 : size << 1);
    }

    private static <T extends AbstractC2092rca<T, ?>> T a(T t) {
        if (t == null || t.h()) {
            return t;
        }
        Bca bca = new Bca(new Qda(t).getMessage());
        bca.a(t);
        throw bca;
    }

    protected static <T extends AbstractC2092rca<T, ?>> T a(T t, Iba iba) {
        T t2 = (T) b(t, iba, C1197eca.a());
        a(t2);
        a(t2);
        return t2;
    }

    protected static <T extends AbstractC2092rca<T, ?>> T a(T t, Iba iba, C1197eca eca) {
        T t2 = (T) b(t, iba, eca);
        a(t2);
        return t2;
    }

    private static <T extends AbstractC2092rca<T, ?>> T a(T t, Uba uba, C1197eca eca) {
        T t2 = (T) ((AbstractC2092rca) t.a(e.d, null, null));
        try {
            AbstractC2439wda a2 = C1957pda.a().a(t2);
            a2.a(t2, _ba.a(uba), eca);
            a2.c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof Bca) {
                throw ((Bca) e2.getCause());
            }
            Bca bca = new Bca(e2.getMessage());
            bca.a(t2);
            throw bca;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof Bca) {
                throw ((Bca) e3.getCause());
            }
            throw e3;
        }
    }

    protected static <T extends AbstractC2092rca<T, ?>> T a(T t, byte[] bArr) {
        T t2 = (T) a(t, bArr, 0, bArr.length, C1197eca.a());
        a(t2);
        return t2;
    }

    private static <T extends AbstractC2092rca<T, ?>> T a(T t, byte[] bArr, int i, int i2, C1197eca eca) {
        T t2 = (T) ((AbstractC2092rca) t.a(e.d, null, null));
        try {
            AbstractC2439wda a2 = C1957pda.a().a(t2);
            a2.a(t2, bArr, 0, i2, new Dba(eca));
            a2.c(t2);
            if (t2.zzhzi == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof Bca) {
                throw ((Bca) e2.getCause());
            }
            Bca bca = new Bca(e2.getMessage());
            bca.a(t2);
            throw bca;
        } catch (IndexOutOfBoundsException unused) {
            Bca a3 = Bca.a();
            a3.a(t2);
            throw a3;
        }
    }

    protected static <T extends AbstractC2092rca<T, ?>> T a(T t, byte[] bArr, C1197eca eca) {
        T t2 = (T) a(t, bArr, 0, bArr.length, eca);
        a(t2);
        return t2;
    }

    static <T extends AbstractC2092rca<?, ?>> T a(Class<T> cls) {
        AbstractC2092rca<?, ?> rca = zziei.get(cls);
        if (rca == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rca = (T) zziei.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (rca == null) {
            rca = (T) ((AbstractC2092rca) ((AbstractC2092rca) Vda.a(cls)).a(e.f, (Object) null, (Object) null));
            if (rca != null) {
                zziei.put(cls, rca);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) rca;
    }

    protected static AbstractC2506xca a(AbstractC2506xca xca) {
        int size = xca.size();
        return xca.c(size == 0 ? 10 : size << 1);
    }

    protected static Object a(AbstractC0993bda bda, String str, Object[] objArr) {
        return new C2094rda(bda, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends AbstractC2092rca<?, ?>> void a(Class<T> cls, T t) {
        zziei.put(cls, t);
    }

    protected static final <T extends AbstractC2092rca<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(e.f5430a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = C1957pda.a().a(t).e(t);
        if (z) {
            t.a(e.f5431b, e2 ? t : null, null);
        }
        return e2;
    }

    private static <T extends AbstractC2092rca<T, ?>> T b(T t, Iba iba, C1197eca eca) {
        try {
            Uba m = iba.m();
            T t2 = (T) a(t, m, eca);
            try {
                m.a(0);
                return t2;
            } catch (Bca e2) {
                e2.a(t2);
                throw e2;
            }
        } catch (Bca e3) {
            throw e3;
        }
    }

    protected static AbstractC2506xca k() {
        return C2299uca.b();
    }

    protected static AbstractC2644zca l() {
        return Pca.b();
    }

    protected static <E> Cca<E> m() {
        return C1819nda.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1131dda
    public final /* synthetic */ AbstractC0993bda a() {
        return (AbstractC2092rca) a(e.f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2642zba
    public final void a(int i) {
        this.zzieh = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0993bda
    public final void a(AbstractC0991bca bca) {
        C1957pda.a().a(this).a((Object) this, (AbstractC1752mea) C1129dca.a(bca));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0993bda
    public final /* synthetic */ AbstractC1199eda b() {
        b bVar = (b) a(e.e, (Object) null, (Object) null);
        bVar.a((AbstractC2092rca) this);
        return bVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0993bda
    public final /* synthetic */ AbstractC1199eda c() {
        return (b) a(e.e, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0993bda
    public final int e() {
        if (this.zzieh == -1) {
            this.zzieh = C1957pda.a().a(this).d(this);
        }
        return this.zzieh;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1957pda.a().a(this).a(this, (AbstractC2092rca) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2642zba
    public final int g() {
        return this.zzieh;
    }

    public final boolean h() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    public int hashCode() {
        int i = this.zzhzi;
        if (i != 0) {
            return i;
        }
        this.zzhzi = C1957pda.a().a(this).b(this);
        return this.zzhzi;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends AbstractC2092rca<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType i() {
        return (BuilderType) ((b) a(e.e, (Object) null, (Object) null));
    }

    public final BuilderType j() {
        BuilderType buildertype = (BuilderType) ((b) a(e.e, (Object) null, (Object) null));
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return C1337gda.a(this, super.toString());
    }
}
