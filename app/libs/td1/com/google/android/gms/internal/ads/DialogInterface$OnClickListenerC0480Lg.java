package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Lg  reason: case insensitive filesystem */
public final class DialogInterface$OnClickListenerC0480Lg implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f2516a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2517b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0402Ig f2518c;

    DialogInterface$OnClickListenerC0480Lg(C0402Ig ig, String str, String str2) {
        this.f2518c = ig;
        this.f2516a = str;
        this.f2517b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f2518c.d.getSystemService("download");
        try {
            String str = this.f2516a;
            String str2 = this.f2517b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            q.e();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f2518c.a("Could not store picture.");
        }
    }
}
