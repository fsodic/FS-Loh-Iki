package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C1955pca;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.cocos2dx.lib.BuildConfig;

final class p extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f1122a;

    private p(l lVar) {
        this.f1122a = lVar;
    }

    /* synthetic */ p(l lVar, k kVar) {
        this(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f1122a.h = (C1955pca) this.f1122a.f1090c.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C0745Vl.c(BuildConfig.FLAVOR, e);
        }
        return this.f1122a.Wb();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.f1122a.f != null && str2 != null) {
            this.f1122a.f.loadUrl(str2);
        }
    }
}
