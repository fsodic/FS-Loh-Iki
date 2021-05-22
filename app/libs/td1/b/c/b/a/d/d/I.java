package b.c.b.a.d.d;

import java.lang.reflect.Type;

public enum I {
    DOUBLE(0, K.SCALAR, U.DOUBLE),
    FLOAT(1, K.SCALAR, U.FLOAT),
    INT64(2, K.SCALAR, U.LONG),
    UINT64(3, K.SCALAR, U.LONG),
    INT32(4, K.SCALAR, U.INT),
    FIXED64(5, K.SCALAR, U.LONG),
    FIXED32(6, K.SCALAR, U.INT),
    BOOL(7, K.SCALAR, U.BOOLEAN),
    STRING(8, K.SCALAR, U.STRING),
    MESSAGE(9, K.SCALAR, U.MESSAGE),
    BYTES(10, K.SCALAR, U.BYTE_STRING),
    UINT32(11, K.SCALAR, U.INT),
    ENUM(12, K.SCALAR, U.ENUM),
    SFIXED32(13, K.SCALAR, U.INT),
    SFIXED64(14, K.SCALAR, U.LONG),
    SINT32(15, K.SCALAR, U.INT),
    SINT64(16, K.SCALAR, U.LONG),
    GROUP(17, K.SCALAR, U.MESSAGE),
    DOUBLE_LIST(18, K.VECTOR, U.DOUBLE),
    FLOAT_LIST(19, K.VECTOR, U.FLOAT),
    INT64_LIST(20, K.VECTOR, U.LONG),
    UINT64_LIST(21, K.VECTOR, U.LONG),
    INT32_LIST(22, K.VECTOR, U.INT),
    FIXED64_LIST(23, K.VECTOR, U.LONG),
    FIXED32_LIST(24, K.VECTOR, U.INT),
    BOOL_LIST(25, K.VECTOR, U.BOOLEAN),
    STRING_LIST(26, K.VECTOR, U.STRING),
    MESSAGE_LIST(27, K.VECTOR, U.MESSAGE),
    BYTES_LIST(28, K.VECTOR, U.BYTE_STRING),
    UINT32_LIST(29, K.VECTOR, U.INT),
    ENUM_LIST(30, K.VECTOR, U.ENUM),
    SFIXED32_LIST(31, K.VECTOR, U.INT),
    SFIXED64_LIST(32, K.VECTOR, U.LONG),
    SINT32_LIST(33, K.VECTOR, U.INT),
    SINT64_LIST(34, K.VECTOR, U.LONG),
    DOUBLE_LIST_PACKED(35, K.PACKED_VECTOR, U.DOUBLE),
    FLOAT_LIST_PACKED(36, K.PACKED_VECTOR, U.FLOAT),
    INT64_LIST_PACKED(37, K.PACKED_VECTOR, U.LONG),
    UINT64_LIST_PACKED(38, K.PACKED_VECTOR, U.LONG),
    INT32_LIST_PACKED(39, K.PACKED_VECTOR, U.INT),
    FIXED64_LIST_PACKED(40, K.PACKED_VECTOR, U.LONG),
    FIXED32_LIST_PACKED(41, K.PACKED_VECTOR, U.INT),
    BOOL_LIST_PACKED(42, K.PACKED_VECTOR, U.BOOLEAN),
    UINT32_LIST_PACKED(43, K.PACKED_VECTOR, U.INT),
    ENUM_LIST_PACKED(44, K.PACKED_VECTOR, U.ENUM),
    SFIXED32_LIST_PACKED(45, K.PACKED_VECTOR, U.INT),
    SFIXED64_LIST_PACKED(46, K.PACKED_VECTOR, U.LONG),
    SINT32_LIST_PACKED(47, K.PACKED_VECTOR, U.INT),
    SINT64_LIST_PACKED(48, K.PACKED_VECTOR, U.LONG),
    GROUP_LIST(49, K.VECTOR, U.MESSAGE),
    MAP(50, K.MAP, U.VOID);
    
    private static final I[] Z;
    private static final Type[] aa = new Type[0];
    private final U ca;
    private final int da;
    private final K ea;
    private final Class<?> fa;
    private final boolean ga;

    static {
        I[] values = values();
        Z = new I[values.length];
        for (I i : values) {
            Z[i.da] = i;
        }
    }

    private I(int i, K k, U u) {
        int i2;
        this.da = i;
        this.ea = k;
        this.ca = u;
        int i3 = J.f359a[k.ordinal()];
        this.fa = (i3 == 1 || i3 == 2) ? u.a() : null;
        boolean z = false;
        if (!(k != K.SCALAR || (i2 = J.f360b[u.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
            z = true;
        }
        this.ga = z;
    }

    public final int a() {
        return this.da;
    }
}
