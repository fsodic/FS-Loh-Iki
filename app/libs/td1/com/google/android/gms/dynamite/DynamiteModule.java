package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f1418a = null;

    /* renamed from: b  reason: collision with root package name */
    private static i f1419b = null;

    /* renamed from: c  reason: collision with root package name */
    private static k f1420c = null;
    private static String d = null;
    private static int e = -1;
    private static final ThreadLocal<c> f = new ThreadLocal<>();
    private static final b.a g = new a();
    public static final b h = new b();
    public static final b i = new c();
    public static final b j = new d();
    public static final b k = new e();
    public static final b l = new f();
    private static final b m = new g();
    private final Context n;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, a aVar) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, a aVar) {
            this(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0030b {

            /* renamed from: a  reason: collision with root package name */
            public int f1421a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f1422b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f1423c = 0;
        }

        C0030b a(Context context, String str, a aVar);
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Cursor f1424a;

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private static class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f1425a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1426b = 0;

        public d(int i, int i2) {
            this.f1425a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str) {
            return this.f1425a;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        r.a(context);
        this.n = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        r1 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.b r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        b.c.b.a.c.a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f1418a;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", (a) null);
            } else if (bool.booleanValue()) {
                return b(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                i a2 = a(context);
                if (a2 != null) {
                    if (a2.Bb() >= 2) {
                        aVar = a2.b(b.c.b.a.c.b.a(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = a2.a(b.c.b.a.c.b.a(context), str, i2);
                    }
                    if (b.c.b.a.c.b.Q(aVar) != null) {
                        return new DynamiteModule((Context) b.c.b.a.c.b.Q(aVar));
                    }
                    throw new a("Failed to load remote module.", (a) null);
                }
                throw new a("Failed to create IDynamiteLoader.", (a) null);
            }
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            f.a(context, th);
            throw new a("Failed to load remote module.", th, null);
        }
    }

    private static i a(Context context) {
        i iVar;
        synchronized (DynamiteModule.class) {
            if (f1419b != null) {
                return f1419b;
            } else if (b.c.b.a.b.f.a().c(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new j(iBinder);
                    }
                    if (iVar != null) {
                        f1419b = iVar;
                        return iVar;
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
                return null;
            }
        }
    }

    private static void a(ClassLoader classLoader) {
        k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new l(iBinder);
            }
            f1420c = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, null);
        }
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static int b(Context context, String str, boolean z) {
        i a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            if (a2.Bb() >= 2) {
                return a2.a(b.c.b.a.c.b.a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a2.b(b.c.b.a.c.b.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        k kVar;
        b.c.b.a.c.a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = f1420c;
        }
        if (kVar != null) {
            c cVar = f.get();
            if (cVar == null || cVar.f1424a == null) {
                throw new a("No result cursor", (a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f1424a;
            b.c.b.a.c.b.a((Object) null);
            if (b().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = kVar.b(b.c.b.a.c.b.a(applicationContext), str, i2, b.c.b.a.c.b.a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = kVar.a(b.c.b.a.c.b.a(applicationContext), str, i2, b.c.b.a.c.b.a(cursor));
            }
            Context context2 = (Context) b.c.b.a.c.b.Q(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a("Failed to get module context", (a) null);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (a) null);
    }

    private static Boolean b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(e >= 2);
        }
        return valueOf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public final Context a() {
        return this.n;
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.n.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}
