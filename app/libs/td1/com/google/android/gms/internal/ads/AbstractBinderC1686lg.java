package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.lg  reason: case insensitive filesystem */
public abstract class AbstractBinderC1686lg extends BinderC1618kga implements AbstractC1755mg {
    public AbstractBinderC1686lg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static AbstractC1755mg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof AbstractC1755mg ? (AbstractC1755mg) queryLocalInterface : new C1893og(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC1824ng ngVar;
        C0194Ag ag;
        boolean z;
        AbstractC0929ag agVar = null;
        AbstractC1411hg jgVar = null;
        AbstractC1342gg igVar = null;
        AbstractC1411hg jgVar2 = null;
        AbstractC0998bg dgVar = null;
        if (i != 1) {
            if (i == 2) {
                ag = fa();
            } else if (i != 3) {
                if (i == 5) {
                    AbstractC2532xpa videoController = getVideoController();
                    parcel2.writeNoException();
                    C1756mga.a(parcel2, videoController);
                } else if (i == 10) {
                    m(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                } else if (i != 11) {
                    switch (i) {
                        case 13:
                            String readString = parcel.readString();
                            String readString2 = parcel.readString();
                            Zna zna = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                            a a2 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                agVar = queryLocalInterface instanceof AbstractC0929ag ? (AbstractC0929ag) queryLocalInterface : new C1067cg(readStrongBinder);
                            }
                            a(readString, readString2, zna, a2, agVar, AbstractBinderC2235tf.a(parcel.readStrongBinder()), (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR));
                            break;
                        case 14:
                            String readString3 = parcel.readString();
                            String readString4 = parcel.readString();
                            Zna zna2 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                            a a3 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                dgVar = queryLocalInterface2 instanceof AbstractC0998bg ? (AbstractC0998bg) queryLocalInterface2 : new C1136dg(readStrongBinder2);
                            }
                            a(readString3, readString4, zna2, a3, dgVar, AbstractBinderC2235tf.a(parcel.readStrongBinder()));
                            break;
                        case 15:
                            z = o(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            C1756mga.a(parcel2, z);
                            break;
                        case 16:
                            String readString5 = parcel.readString();
                            String readString6 = parcel.readString();
                            Zna zna3 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                            a a4 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder3 = parcel.readStrongBinder();
                            if (readStrongBinder3 != null) {
                                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                jgVar2 = queryLocalInterface3 instanceof AbstractC1411hg ? (AbstractC1411hg) queryLocalInterface3 : new C1548jg(readStrongBinder3);
                            }
                            a(readString5, readString6, zna3, a4, jgVar2, AbstractBinderC2235tf.a(parcel.readStrongBinder()));
                            break;
                        case 17:
                            z = L(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            C1756mga.a(parcel2, z);
                            break;
                        case 18:
                            String readString7 = parcel.readString();
                            String readString8 = parcel.readString();
                            Zna zna4 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                            a a5 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder4 = parcel.readStrongBinder();
                            if (readStrongBinder4 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                igVar = queryLocalInterface4 instanceof AbstractC1342gg ? (AbstractC1342gg) queryLocalInterface4 : new C1479ig(readStrongBinder4);
                            }
                            a(readString7, readString8, zna4, a5, igVar, AbstractBinderC2235tf.a(parcel.readStrongBinder()));
                            break;
                        case 19:
                            n(parcel.readString());
                            break;
                        case 20:
                            String readString9 = parcel.readString();
                            String readString10 = parcel.readString();
                            Zna zna5 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                            a a6 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                            IBinder readStrongBinder5 = parcel.readStrongBinder();
                            if (readStrongBinder5 != null) {
                                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                jgVar = queryLocalInterface5 instanceof AbstractC1411hg ? (AbstractC1411hg) queryLocalInterface5 : new C1548jg(readStrongBinder5);
                            }
                            b(readString9, readString10, zna5, a6, jgVar, AbstractBinderC2235tf.a(parcel.readStrongBinder()));
                            break;
                        default:
                            return false;
                    }
                } else {
                    a(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
                }
                return true;
            } else {
                ag = da();
            }
            parcel2.writeNoException();
            C1756mga.b(parcel2, ag);
            return true;
        }
        a a7 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
        String readString11 = parcel.readString();
        Bundle bundle = (Bundle) C1756mga.a(parcel, Bundle.CREATOR);
        Bundle bundle2 = (Bundle) C1756mga.a(parcel, Bundle.CREATOR);
        C1015boa boa = (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR);
        IBinder readStrongBinder6 = parcel.readStrongBinder();
        if (readStrongBinder6 == null) {
            ngVar = null;
        } else {
            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            ngVar = queryLocalInterface6 instanceof AbstractC1824ng ? (AbstractC1824ng) queryLocalInterface6 : new C2031qg(readStrongBinder6);
        }
        a(a7, readString11, bundle, bundle2, boa, ngVar);
        parcel2.writeNoException();
        return true;
    }
}
