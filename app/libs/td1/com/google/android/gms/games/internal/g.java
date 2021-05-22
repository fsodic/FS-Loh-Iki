package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.Parcel;
import b.c.b.a.d.e.e;
import b.c.b.a.d.e.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.j.a;

public abstract class g extends e implements f {
    public g() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.e.e
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 6001) {
            y(parcel.readString());
        } else if (i == 6002) {
            o(parcel.readString());
        } else if (i == 12011) {
            P((DataHolder) l.a(parcel, DataHolder.CREATOR));
        } else if (i == 12012) {
            e(parcel.readInt(), parcel.readString());
        } else if (i == 13001) {
            u((DataHolder) l.a(parcel, DataHolder.CREATOR));
        } else if (i == 13002) {
            j(parcel.readInt());
        } else if (i == 19001) {
            a(parcel.readInt(), (a) l.a(parcel, a.CREATOR));
        } else if (i != 19002) {
            switch (i) {
                case 5001:
                    a(parcel.readInt(), parcel.readString());
                    break;
                case 5002:
                    g((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5003:
                    d(parcel.readInt(), parcel.readString());
                    break;
                case 5004:
                    W((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5005:
                    a((DataHolder) l.a(parcel, DataHolder.CREATOR), (DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5006:
                    D((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5007:
                    J((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5008:
                    p((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5009:
                    v((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5010:
                    d((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                case 5011:
                    j((DataHolder) l.a(parcel, DataHolder.CREATOR));
                    break;
                default:
                    switch (i) {
                        case 5016:
                            V();
                            break;
                        case 5017:
                            M((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5018:
                            Q((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5019:
                            X((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5020:
                            c(parcel.readInt(), parcel.readString());
                            break;
                        case 5021:
                            E((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5022:
                            K((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5023:
                            q((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5024:
                            w((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5025:
                            e((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5026:
                            c((DataHolder) l.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5027:
                            b((DataHolder) l.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5028:
                            a((DataHolder) l.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5029:
                            f((DataHolder) l.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5030:
                            e((DataHolder) l.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5031:
                            d((DataHolder) l.a(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5032:
                            a((com.google.android.gms.games.e.a.a) l.a(parcel, com.google.android.gms.games.e.a.a.CREATOR));
                            break;
                        case 5033:
                            a(parcel.readInt(), parcel.readInt(), parcel.readString());
                            break;
                        case 5034:
                            a(parcel.readInt(), parcel.readString(), l.a(parcel));
                            break;
                        case 5035:
                            S((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5036:
                            o(parcel.readInt());
                            break;
                        case 5037:
                            T((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5038:
                            k((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5039:
                            U((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 5040:
                            i(parcel.readInt());
                            break;
                        case 9001:
                            h((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 11001:
                            c(parcel.readInt(), (Bundle) l.a(parcel, Bundle.CREATOR));
                            break;
                        case 12001:
                            r((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 14001:
                            a((DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                            break;
                        case 15001:
                            o((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 17002:
                            l(parcel.readInt());
                            break;
                        case 19008:
                            u(parcel.readInt());
                            break;
                        case 19009:
                            w(parcel.readInt());
                            break;
                        case 19010:
                            b(parcel.readInt());
                            break;
                        case 20001:
                            i((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20002:
                            b((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20003:
                            c((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20004:
                            V((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20005:
                            O((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20006:
                            I((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20007:
                            C((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20008:
                            y((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20009:
                            s((DataHolder) l.a(parcel, DataHolder.CREATOR));
                            break;
                        case 20012:
                            c((Status) l.a(parcel, Status.CREATOR));
                            break;
                        case 20019:
                            n(parcel.readInt());
                            break;
                        case 20020:
                            b(parcel.readInt(), (Bundle) l.a(parcel, Bundle.CREATOR));
                            break;
                        case 23001:
                            s(parcel.readInt());
                            break;
                        default:
                            switch (i) {
                                case 8001:
                                    N((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8002:
                                    a(parcel.readInt(), (Bundle) l.a(parcel, Bundle.CREATOR));
                                    break;
                                case 8003:
                                    F((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8004:
                                    n((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8005:
                                    t((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8006:
                                    a((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8007:
                                    b(parcel.readInt(), parcel.readString());
                                    break;
                                case 8008:
                                    l((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                    break;
                                case 8009:
                                    g(parcel.readString());
                                    break;
                                case 8010:
                                    w(parcel.readString());
                                    break;
                                default:
                                    switch (i) {
                                        case 10001:
                                            A((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10002:
                                            z(parcel.readString());
                                            break;
                                        case 10003:
                                            H((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10004:
                                            B((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10005:
                                            e(parcel.readInt(), (Bundle) l.a(parcel, Bundle.CREATOR));
                                            break;
                                        case 10006:
                                            x((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                            break;
                                        default:
                                            switch (i) {
                                                case 12004:
                                                    a((DataHolder) l.a(parcel, DataHolder.CREATOR), (com.google.android.gms.drive.a) l.a(parcel, com.google.android.gms.drive.a.CREATOR));
                                                    break;
                                                case 12005:
                                                    m((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12006:
                                                    f((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12007:
                                                    R((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12008:
                                                    z((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 12014:
                                                            L((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                                            break;
                                                        case 12015:
                                                            d(parcel.readInt(), (Bundle) l.a(parcel, Bundle.CREATOR));
                                                            break;
                                                        case 12016:
                                                            G((DataHolder) l.a(parcel, DataHolder.CREATOR));
                                                            break;
                                                        case 12017:
                                                            a((DataHolder) l.a(parcel, DataHolder.CREATOR), parcel.readString(), (com.google.android.gms.drive.a) l.a(parcel, com.google.android.gms.drive.a.CREATOR), (com.google.android.gms.drive.a) l.a(parcel, com.google.android.gms.drive.a.CREATOR), (com.google.android.gms.drive.a) l.a(parcel, com.google.android.gms.drive.a.CREATOR));
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            a(parcel.readInt(), l.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
