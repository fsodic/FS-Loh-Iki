package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends com.google.android.gms.common.internal.a.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private static final a f1320a = new b(new String[0], null);

    /* renamed from: b  reason: collision with root package name */
    private final int f1321b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f1322c;
    private Bundle d;
    private final CursorWindow[] e;
    private final int f;
    private final Bundle g;
    private int[] h;
    private int i;
    private boolean j = false;
    private boolean k = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f1323a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f1324b;

        /* renamed from: c  reason: collision with root package name */
        private final String f1325c;
        private final HashMap<Object, Integer> d;
        private boolean e;
        private String f;

        private a(String[] strArr, String str) {
            r.a(strArr);
            this.f1323a = strArr;
            this.f1324b = new ArrayList<>();
            this.f1325c = str;
            this.d = new HashMap<>();
            this.e = false;
            this.f = null;
        }

        /* synthetic */ a(String[] strArr, String str, b bVar) {
            this(strArr, null);
        }
    }

    DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.f1321b = i2;
        this.f1322c = strArr;
        this.e = cursorWindowArr;
        this.f = i3;
        this.g = bundle;
    }

    private final void a(String str, int i2) {
        Bundle bundle = this.d;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.i) {
            throw new CursorIndexOutOfBoundsException(i2, this.i);
        }
    }

    public final Bundle L() {
        return this.g;
    }

    public final int M() {
        return this.f;
    }

    public final void N() {
        this.d = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.f1322c;
            if (i3 >= strArr.length) {
                break;
            }
            this.d.putInt(strArr[i3], i3);
            i3++;
        }
        this.h = new int[this.e.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.e;
            if (i2 < cursorWindowArr.length) {
                this.h[i2] = i4;
                i4 += this.e[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
                i2++;
            } else {
                this.i = i4;
                return;
            }
        }
    }

    public final int a(int i2) {
        int i3 = 0;
        r.b(i2 >= 0 && i2 < this.i);
        while (true) {
            int[] iArr = this.h;
            if (i3 >= iArr.length) {
                break;
            } else if (i2 < iArr[i3]) {
                i3--;
                break;
            } else {
                i3++;
            }
        }
        return i3 == this.h.length ? i3 - 1 : i3;
    }

    public final boolean a(String str, int i2, int i3) {
        a(str, i2);
        return Long.valueOf(this.e[i3].getLong(i2, this.d.getInt(str))).longValue() == 1;
    }

    public final int b(String str, int i2, int i3) {
        a(str, i2);
        return this.e[i3].getInt(i2, this.d.getInt(str));
    }

    public final long c(String str, int i2, int i3) {
        a(str, i2);
        return this.e[i3].getLong(i2, this.d.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.j) {
                this.j = true;
                for (int i2 = 0; i2 < this.e.length; i2++) {
                    this.e[i2].close();
                }
            }
        }
    }

    public final String d(String str, int i2, int i3) {
        a(str, i2);
        return this.e[i3].getString(i2, this.d.getInt(str));
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            if (this.k && this.e.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final int getCount() {
        return this.i;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.j;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1322c, false);
        c.a(parcel, 2, (Parcelable[]) this.e, i2, false);
        c.a(parcel, 3, M());
        c.a(parcel, 4, L(), false);
        c.a(parcel, 1000, this.f1321b);
        c.a(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }
}
