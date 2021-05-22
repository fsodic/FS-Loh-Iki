package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b.c.b.a.b.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f1053a;

    public c(Context context) {
        try {
            Context c2 = j.c(context);
            this.f1053a = c2 == null ? null : c2.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f1053a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final float a(String str, float f) {
        try {
            if (this.f1053a == null) {
                return 0.0f;
            }
            return this.f1053a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        try {
            return this.f1053a == null ? str2 : this.f1053a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.f1053a == null) {
                return false;
            }
            return this.f1053a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
