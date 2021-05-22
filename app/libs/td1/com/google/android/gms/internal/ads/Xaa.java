package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads._aa;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class Xaa<T_WRAPPER extends _aa<T_ENGINE>, T_ENGINE> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f3506a = Logger.getLogger(Xaa.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final List<Provider> f3507b;

    /* renamed from: c  reason: collision with root package name */
    public static final Xaa<Zaa, Cipher> f3508c = new Xaa<>(new Zaa());
    public static final Xaa<C1058cba, Mac> d = new Xaa<>(new C1058cba());
    private static final Xaa<C1195eba, Signature> e = new Xaa<>(new C1195eba());
    private static final Xaa<C1264fba, MessageDigest> f = new Xaa<>(new C1264fba());
    public static final Xaa<C0989bba, KeyAgreement> g = new Xaa<>(new C0989bba());
    public static final Xaa<C1127dba, KeyPairGenerator> h = new Xaa<>(new C1127dba());
    public static final Xaa<C0920aba, KeyFactory> i = new Xaa<>(new C0920aba());
    private T_WRAPPER j;
    private List<Provider> k = f3507b;
    private boolean l = true;

    static {
        if (C1815nba.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f3506a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f3507b = arrayList;
        } else {
            f3507b = new ArrayList();
        }
    }

    private Xaa(T_WRAPPER t_wrapper) {
        this.j = t_wrapper;
    }

    public final T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider provider : this.k) {
            try {
                return (T_ENGINE) this.j.a(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.l) {
            return (T_ENGINE) this.j.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
