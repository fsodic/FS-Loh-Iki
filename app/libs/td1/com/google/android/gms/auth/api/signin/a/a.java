package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Lock f1169a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private static a f1170b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f1171c = new ReentrantLock();
    private final SharedPreferences d;

    private a(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    private final GoogleSignInAccount a(String str) {
        String b2;
        if (!TextUtils.isEmpty(str) && (b2 = b(a("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.a(b2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static a a(Context context) {
        r.a(context);
        f1169a.lock();
        try {
            if (f1170b == null) {
                f1170b = new a(context.getApplicationContext());
            }
            return f1170b;
        } finally {
            f1169a.unlock();
        }
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final String b(String str) {
        this.f1171c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.f1171c.unlock();
        }
    }

    public GoogleSignInAccount a() {
        return a(b("defaultGoogleSignInAccount"));
    }
}
