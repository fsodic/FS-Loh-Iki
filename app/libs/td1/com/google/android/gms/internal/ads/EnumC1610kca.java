package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.ads.kca  reason: case insensitive filesystem */
public enum EnumC1610kca {
    DOUBLE(0, EnumC1748mca.SCALAR, Dca.DOUBLE),
    FLOAT(1, EnumC1748mca.SCALAR, Dca.FLOAT),
    INT64(2, EnumC1748mca.SCALAR, Dca.LONG),
    UINT64(3, EnumC1748mca.SCALAR, Dca.LONG),
    INT32(4, EnumC1748mca.SCALAR, Dca.INT),
    FIXED64(5, EnumC1748mca.SCALAR, Dca.LONG),
    FIXED32(6, EnumC1748mca.SCALAR, Dca.INT),
    BOOL(7, EnumC1748mca.SCALAR, Dca.BOOLEAN),
    STRING(8, EnumC1748mca.SCALAR, Dca.STRING),
    MESSAGE(9, EnumC1748mca.SCALAR, Dca.MESSAGE),
    BYTES(10, EnumC1748mca.SCALAR, Dca.BYTE_STRING),
    UINT32(11, EnumC1748mca.SCALAR, Dca.INT),
    ENUM(12, EnumC1748mca.SCALAR, Dca.ENUM),
    SFIXED32(13, EnumC1748mca.SCALAR, Dca.INT),
    SFIXED64(14, EnumC1748mca.SCALAR, Dca.LONG),
    SINT32(15, EnumC1748mca.SCALAR, Dca.INT),
    SINT64(16, EnumC1748mca.SCALAR, Dca.LONG),
    GROUP(17, EnumC1748mca.SCALAR, Dca.MESSAGE),
    DOUBLE_LIST(18, EnumC1748mca.VECTOR, Dca.DOUBLE),
    FLOAT_LIST(19, EnumC1748mca.VECTOR, Dca.FLOAT),
    INT64_LIST(20, EnumC1748mca.VECTOR, Dca.LONG),
    UINT64_LIST(21, EnumC1748mca.VECTOR, Dca.LONG),
    INT32_LIST(22, EnumC1748mca.VECTOR, Dca.INT),
    FIXED64_LIST(23, EnumC1748mca.VECTOR, Dca.LONG),
    FIXED32_LIST(24, EnumC1748mca.VECTOR, Dca.INT),
    BOOL_LIST(25, EnumC1748mca.VECTOR, Dca.BOOLEAN),
    STRING_LIST(26, EnumC1748mca.VECTOR, Dca.STRING),
    MESSAGE_LIST(27, EnumC1748mca.VECTOR, Dca.MESSAGE),
    BYTES_LIST(28, EnumC1748mca.VECTOR, Dca.BYTE_STRING),
    UINT32_LIST(29, EnumC1748mca.VECTOR, Dca.INT),
    ENUM_LIST(30, EnumC1748mca.VECTOR, Dca.ENUM),
    SFIXED32_LIST(31, EnumC1748mca.VECTOR, Dca.INT),
    SFIXED64_LIST(32, EnumC1748mca.VECTOR, Dca.LONG),
    SINT32_LIST(33, EnumC1748mca.VECTOR, Dca.INT),
    SINT64_LIST(34, EnumC1748mca.VECTOR, Dca.LONG),
    DOUBLE_LIST_PACKED(35, EnumC1748mca.PACKED_VECTOR, Dca.DOUBLE),
    FLOAT_LIST_PACKED(36, EnumC1748mca.PACKED_VECTOR, Dca.FLOAT),
    INT64_LIST_PACKED(37, EnumC1748mca.PACKED_VECTOR, Dca.LONG),
    UINT64_LIST_PACKED(38, EnumC1748mca.PACKED_VECTOR, Dca.LONG),
    INT32_LIST_PACKED(39, EnumC1748mca.PACKED_VECTOR, Dca.INT),
    FIXED64_LIST_PACKED(40, EnumC1748mca.PACKED_VECTOR, Dca.LONG),
    FIXED32_LIST_PACKED(41, EnumC1748mca.PACKED_VECTOR, Dca.INT),
    BOOL_LIST_PACKED(42, EnumC1748mca.PACKED_VECTOR, Dca.BOOLEAN),
    UINT32_LIST_PACKED(43, EnumC1748mca.PACKED_VECTOR, Dca.INT),
    ENUM_LIST_PACKED(44, EnumC1748mca.PACKED_VECTOR, Dca.ENUM),
    SFIXED32_LIST_PACKED(45, EnumC1748mca.PACKED_VECTOR, Dca.INT),
    SFIXED64_LIST_PACKED(46, EnumC1748mca.PACKED_VECTOR, Dca.LONG),
    SINT32_LIST_PACKED(47, EnumC1748mca.PACKED_VECTOR, Dca.INT),
    SINT64_LIST_PACKED(48, EnumC1748mca.PACKED_VECTOR, Dca.LONG),
    GROUP_LIST(49, EnumC1748mca.VECTOR, Dca.MESSAGE),
    MAP(50, EnumC1748mca.MAP, Dca.VOID);
    
    private static final EnumC1610kca[] Z;
    private static final Type[] aa = new Type[0];
    private final Dca ca;
    private final int da;
    private final EnumC1748mca ea;
    private final Class<?> fa;
    private final boolean ga;

    static {
        EnumC1610kca[] values = values();
        Z = new EnumC1610kca[values.length];
        for (EnumC1610kca kca : values) {
            Z[kca.da] = kca;
        }
    }

    private EnumC1610kca(int i, EnumC1748mca mca, Dca dca) {
        int i2;
        this.da = i;
        this.ea = mca;
        this.ca = dca;
        int i3 = C1817nca.f5055a[mca.ordinal()];
        this.fa = (i3 == 1 || i3 == 2) ? dca.a() : null;
        boolean z = false;
        if (!(mca != EnumC1748mca.SCALAR || (i2 = C1817nca.f5056b[dca.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
            z = true;
        }
        this.ga = z;
    }

    public final int a() {
        return this.da;
    }
}
