package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fea  reason: case insensitive filesystem */
public enum EnumC1270fea {
    DOUBLE(EnumC1477iea.DOUBLE, 1),
    FLOAT(EnumC1477iea.FLOAT, 5),
    INT64(EnumC1477iea.LONG, 0),
    UINT64(EnumC1477iea.LONG, 0),
    INT32(EnumC1477iea.INT, 0),
    FIXED64(EnumC1477iea.LONG, 1),
    FIXED32(EnumC1477iea.INT, 5),
    BOOL(EnumC1477iea.BOOLEAN, 0),
    STRING(EnumC1477iea.STRING, 2) {
    },
    GROUP(EnumC1477iea.MESSAGE, 3) {
    },
    MESSAGE(EnumC1477iea.MESSAGE, 2) {
    },
    BYTES(EnumC1477iea.BYTE_STRING, 2) {
    },
    UINT32(EnumC1477iea.INT, 0),
    ENUM(EnumC1477iea.ENUM, 0),
    SFIXED32(EnumC1477iea.INT, 5),
    SFIXED64(EnumC1477iea.LONG, 1),
    SINT32(EnumC1477iea.INT, 0),
    SINT64(EnumC1477iea.LONG, 0);
    
    private final EnumC1477iea t;
    private final int u;

    private EnumC1270fea(EnumC1477iea iea, int i) {
        this.t = iea;
        this.u = i;
    }

    /* synthetic */ EnumC1270fea(EnumC1477iea iea, int i, C1064cea cea) {
        this(iea, i);
    }
}
