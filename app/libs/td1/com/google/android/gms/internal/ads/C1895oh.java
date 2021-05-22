package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oh  reason: case insensitive filesystem */
public final class C1895oh extends C1687lga implements AbstractC1688lh {
    C1895oh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1688lh
    public final void a(List<Uri> list) {
        Parcel Jb = Jb();
        Jb.writeTypedList(list);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1688lh
    public final void d(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(2, Jb);
    }
}
