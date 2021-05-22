package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1125daa;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class LX {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f2499a = Logger.getLogger(LX.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f2500b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, a> f2501c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap();
    private static final ConcurrentMap<String, AbstractC1878oX<?>> e = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, GX<?>> f = new ConcurrentHashMap();

    interface a {
    }

    /* access modifiers changed from: package-private */
    public interface b {
        <P> AbstractC2360vX<P> a(Class<P> cls);

        Set<Class<?>> a();

        AbstractC2360vX<?> b();

        Class<?> c();

        Class<?> d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: com.google.android.gms.internal.ads.EX<P> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <P> EX<P> a(BX bx, AbstractC2360vX<P> vXVar, Class<P> cls) {
        a(cls);
        Class<P> cls2 = cls;
        QX.b(bx.a());
        EX<P> ex = (EX<P>) EX.a(cls2);
        for (C1125daa.b bVar : bx.a().o()) {
            if (bVar.n() == XZ.ENABLED) {
                HX a2 = ex.a(a(bVar.q().n(), bVar.q().o(), cls2), bVar);
                if (bVar.r() == bx.a().n()) {
                    ex.a(a2);
                }
            }
        }
        return ex;
    }

    private static <KeyProtoT extends AbstractC0993bda> b a(AbstractC2429wX<KeyProtoT> wXVar) {
        return new OX(wXVar);
    }

    public static synchronized WZ a(ZZ zz) {
        WZ b2;
        synchronized (LX.class) {
            AbstractC2360vX<?> c2 = c(zz.n());
            if (d.get(zz.n()).booleanValue()) {
                b2 = c2.b(zz.o());
            } else {
                String valueOf = String.valueOf(zz.n());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b2;
    }

    @Deprecated
    public static AbstractC1878oX<?> a(String str) {
        String str2;
        String str3;
        if (str != null) {
            AbstractC1878oX<?> oXVar = e.get(str.toLowerCase());
            if (oXVar != null) {
                return oXVar;
            }
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.register().";
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.register().";
            } else {
                if (str.toLowerCase().startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static <P> AbstractC2360vX<P> a(String str, Class<P> cls) {
        b b2 = b(str);
        if (cls == null) {
            return (AbstractC2360vX<P>) b2.b();
        }
        if (b2.a().contains(cls)) {
            return b2.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(b2.c());
        Set<Class<?>> a2 = b2.a();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : a2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static <P> P a(EX<P> ex) {
        GX<?> gx = f.get(ex.a());
        if (gx != null) {
            return (P) gx.a(ex);
        }
        String valueOf = String.valueOf(ex.a().getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    private static <P> P a(String str, Iba iba, Class<P> cls) {
        return (P) a(str, cls).c(iba);
    }

    public static <P> P a(String str, AbstractC0993bda bda, Class<P> cls) {
        a(cls);
        return (P) a(str, cls).a(bda);
    }

    public static <P> P a(String str, byte[] bArr, Class<P> cls) {
        Iba a2 = Iba.a(bArr);
        a(cls);
        return (P) a(str, a2, cls);
    }

    public static synchronized <P> void a(GX<P> gx) {
        synchronized (LX.class) {
            if (gx != null) {
                Class<P> a2 = gx.a();
                if (f.containsKey(a2)) {
                    GX<?> gx2 = f.get(a2);
                    if (!gx.getClass().equals(gx2.getClass())) {
                        Logger logger = f2499a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a2.toString());
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", a2.getName(), gx2.getClass().getName(), gx.getClass().getName()));
                    }
                }
                f.put(a2, gx);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized <KeyProtoT extends AbstractC0993bda, PublicKeyProtoT extends AbstractC0993bda> void a(IX<KeyProtoT, PublicKeyProtoT> ix, AbstractC2429wX<PublicKeyProtoT> wXVar, boolean z) {
        Class<?> d2;
        synchronized (LX.class) {
            String a2 = ix.a();
            String a3 = wXVar.a();
            a(a2, ix.getClass(), true);
            a(a3, wXVar.getClass(), false);
            if (!a2.equals(a3)) {
                if (f2500b.containsKey(a2) && (d2 = f2500b.get(a2).d()) != null) {
                    if (!d2.equals(wXVar.getClass())) {
                        Logger logger = f2499a;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 96 + String.valueOf(a3).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(a2);
                        sb.append(" with inconsistent public key type ");
                        sb.append(a3);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", ix.getClass().getName(), d2.getName(), wXVar.getClass().getName()));
                    }
                }
                if (!f2500b.containsKey(a2) || f2500b.get(a2).d() == null) {
                    f2500b.put(a2, new MX(ix, wXVar));
                    f2501c.put(a2, b(ix));
                }
                d.put(a2, true);
                if (!f2500b.containsKey(a3)) {
                    f2500b.put(a3, a((AbstractC2429wX) wXVar));
                }
                d.put(a3, false);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized <P> void a(AbstractC2360vX<P> vXVar, boolean z) {
        synchronized (LX.class) {
            if (vXVar != null) {
                String b2 = vXVar.b();
                a(b2, vXVar.getClass(), z);
                if (!f2500b.containsKey(b2)) {
                    f2500b.put(b2, new KX(vXVar));
                }
                d.put(b2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends AbstractC0993bda> void a(AbstractC2429wX<KeyProtoT> wXVar, boolean z) {
        synchronized (LX.class) {
            String a2 = wXVar.a();
            a(a2, wXVar.getClass(), true);
            if (!f2500b.containsKey(a2)) {
                f2500b.put(a2, a((AbstractC2429wX) wXVar));
                f2501c.put(a2, b(wXVar));
            }
            d.put(a2, true);
        }
    }

    private static synchronized void a(String str, Class<?> cls, boolean z) {
        synchronized (LX.class) {
            if (f2500b.containsKey(str)) {
                b bVar = f2500b.get(str);
                if (!bVar.c().equals(cls)) {
                    Logger logger = f2499a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, bVar.c().getName(), cls.getName()));
                } else if (z && !d.get(str).booleanValue()) {
                    String valueOf2 = String.valueOf(str);
                    throw new GeneralSecurityException(valueOf2.length() != 0 ? "New keys are already disallowed for key type ".concat(valueOf2) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    private static <KeyProtoT extends AbstractC0993bda> a b(AbstractC2429wX<KeyProtoT> wXVar) {
        return new PX(wXVar);
    }

    private static synchronized b b(String str) {
        b bVar;
        synchronized (LX.class) {
            if (!f2500b.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            bVar = f2500b.get(str);
        }
        return bVar;
    }

    public static synchronized AbstractC0993bda b(ZZ zz) {
        AbstractC0993bda a2;
        synchronized (LX.class) {
            AbstractC2360vX<?> c2 = c(zz.n());
            if (d.get(zz.n()).booleanValue()) {
                a2 = c2.a(zz.o());
            } else {
                String valueOf = String.valueOf(zz.n());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a2;
    }

    private static AbstractC2360vX<?> c(String str) {
        return b(str).b();
    }
}
