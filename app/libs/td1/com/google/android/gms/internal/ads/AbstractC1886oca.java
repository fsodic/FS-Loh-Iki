package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1197eca;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.oca  reason: case insensitive filesystem */
public abstract class AbstractC1886oca<T extends C1197eca> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f5143a = Logger.getLogger(AbstractC0991bca.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static String f5144b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC1886oca() {
    }

    static <T extends C1197eca> T a(Class<T> cls) {
        String str;
        ClassLoader classLoader = AbstractC1886oca.class.getClassLoader();
        if (cls.equals(C1197eca.class)) {
            str = f5144b;
        } else if (cls.getPackage().equals(AbstractC1886oca.class.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                return cls.cast(((AbstractC1886oca) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException(e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC1886oca.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC1886oca) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f5143a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) ((C1197eca) arrayList.get(0));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) ((C1197eca) cls.getMethod("combine", Collection.class).invoke(null, arrayList));
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();
}
