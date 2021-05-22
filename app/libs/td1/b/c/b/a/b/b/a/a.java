package b.c.b.a.b.b.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import b.c.b.a.b.b.b.a;
import com.google.android.gms.common.internal.a.c;
import java.util.ArrayList;
import java.util.HashMap;

public final class a extends com.google.android.gms.common.internal.a.a implements a.b<String, Integer> {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    private final int f263a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Integer> f264b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<String> f265c;
    private final ArrayList<C0011a> d;

    /* renamed from: b.c.b.a.b.b.a.a$a  reason: collision with other inner class name */
    public static final class C0011a extends com.google.android.gms.common.internal.a.a {
        public static final Parcelable.Creator<C0011a> CREATOR = new e();

        /* renamed from: a  reason: collision with root package name */
        private final int f266a;

        /* renamed from: b  reason: collision with root package name */
        final String f267b;

        /* renamed from: c  reason: collision with root package name */
        final int f268c;

        C0011a(int i, String str, int i2) {
            this.f266a = i;
            this.f267b = str;
            this.f268c = i2;
        }

        C0011a(String str, int i) {
            this.f266a = 1;
            this.f267b = str;
            this.f268c = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = c.a(parcel);
            c.a(parcel, 1, this.f266a);
            c.a(parcel, 2, this.f267b, false);
            c.a(parcel, 3, this.f268c);
            c.a(parcel, a2);
        }
    }

    public a() {
        this.f263a = 1;
        this.f264b = new HashMap<>();
        this.f265c = new SparseArray<>();
        this.d = null;
    }

    a(int i, ArrayList<C0011a> arrayList) {
        this.f263a = i;
        this.f264b = new HashMap<>();
        this.f265c = new SparseArray<>();
        this.d = null;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C0011a aVar = arrayList.get(i2);
            i2++;
            C0011a aVar2 = aVar;
            a(aVar2.f267b, aVar2.f268c);
        }
    }

    @Override // b.c.b.a.b.b.b.a.b
    public final int J() {
        return 7;
    }

    @Override // b.c.b.a.b.b.b.a.b
    public final int K() {
        return 0;
    }

    public final a a(String str, int i) {
        this.f264b.put(str, Integer.valueOf(i));
        this.f265c.put(i, str);
        return this;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // b.c.b.a.b.b.b.a.b
    public final /* synthetic */ String a(Integer num) {
        String str = this.f265c.get(num.intValue());
        return (str != null || !this.f264b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f263a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f264b.keySet()) {
            arrayList.add(new C0011a(str, this.f264b.get(str).intValue()));
        }
        c.c(parcel, 2, arrayList, false);
        c.a(parcel, a2);
    }
}
