package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.common.internal.AbstractC0186l;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0025a<?, O> f1178a;

    /* renamed from: b  reason: collision with root package name */
    private final i<?, O> f1179b = null;

    /* renamed from: c  reason: collision with root package name */
    private final g<?> f1180c;
    private final j<?> d;
    private final String e;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0025a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, C0177c cVar, O o, f.b bVar, f.c cVar2);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface AbstractC0026a extends c, e {
            Account r();
        }

        public interface b extends c {
            GoogleSignInAccount a();
        }

        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d  reason: collision with other inner class name */
        public static final class C0027d implements e {
        }

        public interface e extends d {
        }

        public interface f extends c, e {
        }
    }

    public static abstract class e<T extends b, O> {
        public int a() {
            return Integer.MAX_VALUE;
        }

        public List<Scope> a(O o) {
            return Collections.emptyList();
        }
    }

    public interface f extends b {
        void a();

        void a(AbstractC0176b.c cVar);

        void a(AbstractC0176b.e eVar);

        void a(AbstractC0186l lVar, Set<Scope> set);

        void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean b();

        boolean c();

        String d();

        boolean f();

        int g();

        b.c.b.a.b.d[] h();

        Intent i();

        boolean isConnected();

        boolean j();

        IBinder k();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        T a(IBinder iBinder);

        void a(int i, T t);

        String l();

        String m();
    }

    public static abstract class i<T extends h, O> extends e<T, O> {
    }

    public static final class j<C extends h> extends c<C> {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0025a<C, O> aVar, g<C> gVar) {
        r.a(aVar, "Cannot construct an Api with a null ClientBuilder");
        r.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.e = str;
        this.f1178a = aVar;
        this.f1180c = gVar;
        this.d = null;
    }

    public final c<?> a() {
        g<?> gVar = this.f1180c;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final String b() {
        return this.e;
    }

    public final e<?, O> c() {
        return this.f1178a;
    }

    public final AbstractC0025a<?, O> d() {
        r.b(this.f1178a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f1178a;
    }
}
