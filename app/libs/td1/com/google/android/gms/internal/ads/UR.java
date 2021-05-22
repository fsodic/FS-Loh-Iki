package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class UR {
    public static ParcelFileDescriptor a(InputStream inputStream) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        C0875_l.f3755a.execute(new TR(inputStream, createPipe[1]));
        return parcelFileDescriptor;
    }
}
