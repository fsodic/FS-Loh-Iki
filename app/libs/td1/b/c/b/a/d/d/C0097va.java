package b.c.b.a.d.d;

import b.c.b.a.d.d.M;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: b.c.b.a.d.d.va  reason: case insensitive filesystem */
final class C0097va<T> implements Fa<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f452a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f453b = cb.c();

    /* renamed from: c  reason: collision with root package name */
    private final int[] f454c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final AbstractC0089ra g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final AbstractC0103ya o;
    private final AbstractC0060ca p;
    private final Xa<?, ?> q;
    private final C<?> r;
    private final AbstractC0080ma s;

    private C0097va(int[] iArr, Object[] objArr, int i2, int i3, AbstractC0089ra raVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, AbstractC0103ya yaVar, AbstractC0060ca caVar, Xa<?, ?> xa, C<?> c2, AbstractC0080ma maVar) {
        this.f454c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = raVar instanceof M;
        this.j = z;
        this.h = c2 != null && c2.a(raVar);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = yaVar;
        this.p = caVar;
        this.q = xa;
        this.r = c2;
        this.g = raVar;
        this.s = maVar;
    }

    private static <UT, UB> int a(Xa<UT, UB> xa, T t) {
        return xa.b(xa.c(t));
    }

    private final Fa a(int i2) {
        int i3 = (i2 / 3) << 1;
        Fa fa = (Fa) this.d[i3];
        if (fa != null) {
            return fa;
        }
        Fa<T> a2 = Da.a().a((Class) ((Class) this.d[i3 + 1]));
        this.d[i3] = a2;
        return a2;
    }

    static <T> C0097va<T> a(Class<T> cls, AbstractC0086pa paVar, AbstractC0103ya yaVar, AbstractC0060ca caVar, Xa<?, ?> xa, C<?> c2, AbstractC0080ma maVar) {
        int i2;
        int i3;
        char c3;
        int[] iArr;
        char c4;
        char c5;
        int i4;
        char c6;
        int i5;
        int i6;
        int i7;
        String str;
        char c7;
        int i8;
        char c8;
        int i9;
        int i10;
        int i11;
        int i12;
        Class<?> cls2;
        int i13;
        Field field;
        int i14;
        char charAt;
        int i15;
        int i16;
        Field field2;
        Field field3;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        char charAt5;
        int i26;
        char charAt6;
        int i27;
        char charAt7;
        int i28;
        char charAt8;
        char charAt9;
        char charAt10;
        char charAt11;
        char charAt12;
        char charAt13;
        char charAt14;
        if (paVar instanceof Ea) {
            Ea ea = (Ea) paVar;
            int i29 = 0;
            boolean z = ea.r() == M.d.j;
            String a2 = ea.a();
            int length = a2.length();
            int charAt15 = a2.charAt(0);
            if (charAt15 >= 55296) {
                int i30 = charAt15 & 8191;
                int i31 = 1;
                int i32 = 13;
                while (true) {
                    i2 = i31 + 1;
                    charAt14 = a2.charAt(i31);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i30 |= (charAt14 & 8191) << i32;
                    i32 += 13;
                    i31 = i2;
                }
                charAt15 = (charAt14 << i32) | i30;
            } else {
                i2 = 1;
            }
            int i33 = i2 + 1;
            int charAt16 = a2.charAt(i2);
            if (charAt16 >= 55296) {
                int i34 = charAt16 & 8191;
                int i35 = 13;
                while (true) {
                    i3 = i33 + 1;
                    charAt13 = a2.charAt(i33);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i34 |= (charAt13 & 8191) << i35;
                    i35 += 13;
                    i33 = i3;
                }
                charAt16 = i34 | (charAt13 << i35);
            } else {
                i3 = i33;
            }
            if (charAt16 == 0) {
                iArr = f452a;
                i5 = 0;
                c6 = 0;
                i4 = 0;
                c5 = 0;
                c4 = 0;
                c3 = 0;
            } else {
                int i36 = i3 + 1;
                char charAt17 = a2.charAt(i3);
                if (charAt17 >= 55296) {
                    int i37 = charAt17 & 8191;
                    int i38 = 13;
                    while (true) {
                        i20 = i36 + 1;
                        charAt12 = a2.charAt(i36);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i37 |= (charAt12 & 8191) << i38;
                        i38 += 13;
                        i36 = i20;
                    }
                    charAt17 = (charAt12 << i38) | i37;
                } else {
                    i20 = i36;
                }
                int i39 = i20 + 1;
                int charAt18 = a2.charAt(i20);
                if (charAt18 >= 55296) {
                    int i40 = charAt18 & 8191;
                    int i41 = 13;
                    while (true) {
                        i21 = i39 + 1;
                        charAt11 = a2.charAt(i39);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i40 |= (charAt11 & 8191) << i41;
                        i41 += 13;
                        i39 = i21;
                    }
                    charAt18 = i40 | (charAt11 << i41);
                } else {
                    i21 = i39;
                }
                int i42 = i21 + 1;
                char charAt19 = a2.charAt(i21);
                if (charAt19 >= 55296) {
                    int i43 = charAt19 & 8191;
                    int i44 = 13;
                    while (true) {
                        i22 = i42 + 1;
                        charAt10 = a2.charAt(i42);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i43 |= (charAt10 & 8191) << i44;
                        i44 += 13;
                        i42 = i22;
                    }
                    charAt19 = (charAt10 << i44) | i43;
                } else {
                    i22 = i42;
                }
                int i45 = i22 + 1;
                c5 = a2.charAt(i22);
                if (c5 >= 55296) {
                    int i46 = c5 & 8191;
                    int i47 = 13;
                    while (true) {
                        i23 = i45 + 1;
                        charAt9 = a2.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i23;
                    }
                    c5 = (charAt9 << i47) | i46;
                } else {
                    i23 = i45;
                }
                int i48 = i23 + 1;
                c4 = a2.charAt(i23);
                if (c4 >= 55296) {
                    int i49 = c4 & 8191;
                    int i50 = 13;
                    while (true) {
                        i28 = i48 + 1;
                        charAt8 = a2.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i28;
                    }
                    c4 = (charAt8 << i50) | i49;
                    i48 = i28;
                }
                int i51 = i48 + 1;
                i5 = a2.charAt(i48);
                if (i5 >= 55296) {
                    int i52 = i5 & 8191;
                    int i53 = 13;
                    while (true) {
                        i27 = i51 + 1;
                        charAt7 = a2.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i52 |= (charAt7 & 8191) << i53;
                        i53 += 13;
                        i51 = i27;
                    }
                    i5 = i52 | (charAt7 << i53);
                    i51 = i27;
                }
                int i54 = i51 + 1;
                int charAt20 = a2.charAt(i51);
                if (charAt20 >= 55296) {
                    int i55 = 13;
                    int i56 = charAt20 & 8191;
                    int i57 = i54;
                    while (true) {
                        i26 = i57 + 1;
                        charAt6 = a2.charAt(i57);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i56 |= (charAt6 & 8191) << i55;
                        i55 += 13;
                        i57 = i26;
                    }
                    charAt20 = i56 | (charAt6 << i55);
                    i24 = i26;
                } else {
                    i24 = i54;
                }
                int i58 = i24 + 1;
                i29 = a2.charAt(i24);
                if (i29 >= 55296) {
                    int i59 = 13;
                    int i60 = i29 & 8191;
                    int i61 = i58;
                    while (true) {
                        i25 = i61 + 1;
                        charAt5 = a2.charAt(i61);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i60 |= (charAt5 & 8191) << i59;
                        i59 += 13;
                        i61 = i25;
                    }
                    i29 = i60 | (charAt5 << i59);
                    i58 = i25;
                }
                iArr = new int[(i29 + i5 + charAt20)];
                i4 = (charAt17 << 1) + charAt18;
                c3 = charAt17;
                c6 = charAt19;
                i3 = i58;
            }
            Unsafe unsafe = f453b;
            Object[] b2 = ea.b();
            Class<?> cls3 = ea.t().getClass();
            int i62 = i4;
            int[] iArr2 = new int[(c4 * 3)];
            Object[] objArr = new Object[(c4 << 1)];
            int i63 = i29 + i5;
            int i64 = i29;
            int i65 = i63;
            int i66 = 0;
            int i67 = 0;
            while (i3 < length) {
                int i68 = i3 + 1;
                int charAt21 = a2.charAt(i3);
                char c9 = 55296;
                if (charAt21 >= 55296) {
                    int i69 = 13;
                    int i70 = charAt21 & 8191;
                    int i71 = i68;
                    while (true) {
                        i19 = i71 + 1;
                        charAt4 = a2.charAt(i71);
                        if (charAt4 < c9) {
                            break;
                        }
                        i70 |= (charAt4 & 8191) << i69;
                        i69 += 13;
                        i71 = i19;
                        c9 = 55296;
                    }
                    charAt21 = i70 | (charAt4 << i69);
                    i6 = i19;
                } else {
                    i6 = i68;
                }
                int i72 = i6 + 1;
                int charAt22 = a2.charAt(i6);
                char c10 = 55296;
                if (charAt22 >= 55296) {
                    int i73 = 13;
                    int i74 = charAt22 & 8191;
                    int i75 = i72;
                    while (true) {
                        i18 = i75 + 1;
                        charAt3 = a2.charAt(i75);
                        if (charAt3 < c10) {
                            break;
                        }
                        i74 |= (charAt3 & 8191) << i73;
                        i73 += 13;
                        i75 = i18;
                        c10 = 55296;
                    }
                    charAt22 = i74 | (charAt3 << i73);
                    i7 = i18;
                } else {
                    i7 = i72;
                }
                int i76 = charAt22 & 255;
                if ((charAt22 & 1024) != 0) {
                    iArr[i66] = i67;
                    i66++;
                }
                if (i76 >= 51) {
                    int i77 = i7 + 1;
                    int charAt23 = a2.charAt(i7);
                    char c11 = 55296;
                    if (charAt23 >= 55296) {
                        int i78 = charAt23 & 8191;
                        int i79 = 13;
                        while (true) {
                            i17 = i77 + 1;
                            charAt2 = a2.charAt(i77);
                            if (charAt2 < c11) {
                                break;
                            }
                            i78 |= (charAt2 & 8191) << i79;
                            i79 += 13;
                            i77 = i17;
                            c11 = 55296;
                        }
                        charAt23 = i78 | (charAt2 << i79);
                        i77 = i17;
                    }
                    int i80 = i76 - 51;
                    if (i80 == 9 || i80 == 17) {
                        i16 = 1;
                        objArr[((i67 / 3) << 1) + 1] = b2[i62];
                        i62++;
                    } else {
                        if (i80 == 12 && (charAt15 & 1) == 1) {
                            objArr[((i67 / 3) << 1) + 1] = b2[i62];
                            i62++;
                        }
                        i16 = 1;
                    }
                    int i81 = charAt23 << i16;
                    Object obj = b2[i81];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = a(cls3, (String) obj);
                        b2[i81] = field2;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(field2);
                    int i82 = i81 + 1;
                    Object obj2 = b2[i82];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = a(cls3, (String) obj2);
                        b2[i82] = field3;
                    }
                    str = a2;
                    i11 = (int) unsafe.objectFieldOffset(field3);
                    cls2 = cls3;
                    i8 = i62;
                    i10 = objectFieldOffset;
                    i12 = 0;
                    c7 = c6;
                    c8 = c5;
                    i9 = charAt21;
                    i3 = i77;
                } else {
                    int i83 = i62 + 1;
                    Field a3 = a(cls3, (String) b2[i62]);
                    c8 = c5;
                    if (i76 == 9 || i76 == 17) {
                        c7 = c6;
                        objArr[((i67 / 3) << 1) + 1] = a3.getType();
                    } else {
                        if (i76 == 27 || i76 == 49) {
                            c7 = c6;
                            i15 = i83 + 1;
                            objArr[((i67 / 3) << 1) + 1] = b2[i83];
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            c7 = c6;
                            if ((charAt15 & 1) == 1) {
                                i15 = i83 + 1;
                                objArr[((i67 / 3) << 1) + 1] = b2[i83];
                            }
                        } else if (i76 == 50) {
                            int i84 = i64 + 1;
                            iArr[i64] = i67;
                            int i85 = (i67 / 3) << 1;
                            int i86 = i83 + 1;
                            objArr[i85] = b2[i83];
                            if ((charAt22 & 2048) != 0) {
                                i83 = i86 + 1;
                                objArr[i85 + 1] = b2[i86];
                                c7 = c6;
                                i64 = i84;
                            } else {
                                i64 = i84;
                                i83 = i86;
                                c7 = c6;
                            }
                        } else {
                            c7 = c6;
                        }
                        i9 = charAt21;
                        i83 = i15;
                        i10 = (int) unsafe.objectFieldOffset(a3);
                        if ((charAt15 & 1) == 1 || i76 > 17) {
                            str = a2;
                            cls2 = cls3;
                            i8 = i83;
                            i13 = i7;
                            i12 = 0;
                            i11 = 0;
                        } else {
                            i13 = i7 + 1;
                            int charAt24 = a2.charAt(i7);
                            if (charAt24 >= 55296) {
                                int i87 = charAt24 & 8191;
                                int i88 = 13;
                                while (true) {
                                    i14 = i13 + 1;
                                    charAt = a2.charAt(i13);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    i87 |= (charAt & 8191) << i88;
                                    i88 += 13;
                                    i13 = i14;
                                }
                                charAt24 = i87 | (charAt << i88);
                                i13 = i14;
                            }
                            int i89 = (c3 << 1) + (charAt24 / 32);
                            Object obj3 = b2[i89];
                            str = a2;
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = a(cls3, (String) obj3);
                                b2[i89] = field;
                            }
                            cls2 = cls3;
                            i8 = i83;
                            i11 = (int) unsafe.objectFieldOffset(field);
                            i12 = charAt24 % 32;
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i65] = i10;
                            i65++;
                        }
                        i3 = i13;
                    }
                    i9 = charAt21;
                    i10 = (int) unsafe.objectFieldOffset(a3);
                    if ((charAt15 & 1) == 1) {
                    }
                    str = a2;
                    cls2 = cls3;
                    i8 = i83;
                    i13 = i7;
                    i12 = 0;
                    i11 = 0;
                    iArr[i65] = i10;
                    i65++;
                    i3 = i13;
                }
                int i90 = i67 + 1;
                iArr2[i67] = i9;
                int i91 = i90 + 1;
                iArr2[i90] = (i76 << 20) | ((charAt22 & 256) != 0 ? 268435456 : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | i10;
                i67 = i91 + 1;
                iArr2[i91] = (i12 << 20) | i11;
                cls3 = cls2;
                c5 = c8;
                i29 = i29;
                i62 = i8;
                length = length;
                z = z;
                c6 = c7;
                i66 = i66;
                a2 = str;
            }
            return new C0097va<>(iArr2, objArr, c6, c5, ea.t(), z, false, iArr, i29, i63, yaVar, caVar, xa, c2, maVar);
        }
        ((Sa) paVar).r();
        throw null;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static <E> List<E> a(Object obj, long j2) {
        return (List) cb.f(obj, j2);
    }

    private static void a(int i2, Object obj, qb qbVar) {
        if (obj instanceof String) {
            qbVar.a(i2, (String) obj);
        } else {
            qbVar.a(i2, (AbstractC0071i) obj);
        }
    }

    private static <UT, UB> void a(Xa<UT, UB> xa, T t, qb qbVar) {
        xa.a(xa.c(t), qbVar);
    }

    private final <K, V> void a(qb qbVar, int i2, Object obj, int i3) {
        if (obj != null) {
            this.s.b(b(i3));
            throw null;
        }
    }

    private final void a(T t, T t2, int i2) {
        long c2 = (long) (c(i2) & 1048575);
        if (a((Object) t2, i2)) {
            Object f2 = cb.f(t, c2);
            Object f3 = cb.f(t2, c2);
            if (f2 != null && f3 != null) {
                cb.a(t, c2, O.a(f2, f3));
                b((Object) t, i2);
            } else if (f3 != null) {
                cb.a(t, c2, f3);
                b((Object) t, i2);
            }
        }
    }

    private final boolean a(T t, int i2) {
        if (this.j) {
            int c2 = c(i2);
            long j2 = (long) (c2 & 1048575);
            switch ((c2 & 267386880) >>> 20) {
                case 0:
                    return cb.e(t, j2) != 0.0d;
                case 1:
                    return cb.d(t, j2) != 0.0f;
                case 2:
                    return cb.b(t, j2) != 0;
                case 3:
                    return cb.b(t, j2) != 0;
                case 4:
                    return cb.a(t, j2) != 0;
                case 5:
                    return cb.b(t, j2) != 0;
                case 6:
                    return cb.a(t, j2) != 0;
                case 7:
                    return cb.c(t, j2);
                case 8:
                    Object f2 = cb.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof AbstractC0071i) {
                        return !AbstractC0071i.f429a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return cb.f(t, j2) != null;
                case 10:
                    return !AbstractC0071i.f429a.equals(cb.f(t, j2));
                case 11:
                    return cb.a(t, j2) != 0;
                case 12:
                    return cb.a(t, j2) != 0;
                case 13:
                    return cb.a(t, j2) != 0;
                case 14:
                    return cb.b(t, j2) != 0;
                case 15:
                    return cb.a(t, j2) != 0;
                case 16:
                    return cb.b(t, j2) != 0;
                case 17:
                    return cb.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int d2 = d(i2);
            return (cb.a(t, (long) (d2 & 1048575)) & (1 << (d2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return cb.a(t, (long) (d(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        return this.j ? a((Object) t, i2) : (i3 & i4) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: b.c.b.a.d.d.Fa */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i2, Fa fa) {
        return fa.a(cb.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) cb.f(t, j2)).doubleValue();
    }

    private final Object b(int i2) {
        return this.d[(i2 / 3) << 1];
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            cb.a((Object) t, j2, cb.a(t, j2) | (1 << (d2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        cb.a((Object) t, (long) (d(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r18, b.c.b.a.d.d.qb r19) {
        /*
        // Method dump skipped, instructions count: 1206
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.C0097va.b(java.lang.Object, b.c.b.a.d.d.qb):void");
    }

    private final void b(T t, T t2, int i2) {
        int c2 = c(i2);
        int i3 = this.f454c[i2];
        long j2 = (long) (c2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = cb.f(t, j2);
            Object f3 = cb.f(t2, j2);
            if (f2 != null && f3 != null) {
                cb.a(t, j2, O.a(f2, f3));
                b(t, i3, i2);
            } else if (f3 != null) {
                cb.a(t, j2, f3);
                b(t, i3, i2);
            }
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) cb.f(t, j2)).floatValue();
    }

    private final int c(int i2) {
        return this.f454c[i2 + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.f454c[i2 + 2];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) cb.f(t, j2)).intValue();
    }

    private static <T> long e(T t, long j2) {
        return ((Long) cb.f(t, j2)).longValue();
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) cb.f(t, j2)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    @Override // b.c.b.a.d.d.Fa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, b.c.b.a.d.d.qb r14) {
        /*
        // Method dump skipped, instructions count: 2538
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.C0097va.a(java.lang.Object, b.c.b.a.d.d.qb):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: b.c.b.a.d.d.Fa */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.c.b.a.d.d.Fa
    public final boolean a(T t) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.m) {
                return !this.h || this.r.a(t).c();
            }
            int i6 = this.l[i3];
            int i7 = this.f454c[i6];
            int c2 = c(i6);
            if (!this.j) {
                int i8 = this.f454c[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i4) {
                    i5 = f453b.getInt(t, (long) i9);
                    i4 = i9;
                }
            } else {
                i2 = 0;
            }
            if (((268435456 & c2) != 0) && !a(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & c2) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (a(t, i7, i6) && !a(t, c2, a(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.s.a(cb.f(t, (long) (c2 & 1048575))).isEmpty()) {
                            this.s.b(b(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) cb.f(t, (long) (c2 & 1048575));
                if (!list.isEmpty()) {
                    Fa a2 = a(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!a2.a(list.get(i11))) {
                            z = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a(t, i6, i5, i2) && !a(t, c2, a(i6))) {
                return false;
            }
            i3++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (b.c.b.a.d.d.Ha.a(b.c.b.a.d.d.cb.f(r10, r6), b.c.b.a.d.d.cb.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (b.c.b.a.d.d.cb.b(r10, r6) == b.c.b.a.d.d.cb.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (b.c.b.a.d.d.cb.a(r10, r6) == b.c.b.a.d.d.cb.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (b.c.b.a.d.d.cb.b(r10, r6) == b.c.b.a.d.d.cb.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (b.c.b.a.d.d.cb.a(r10, r6) == b.c.b.a.d.d.cb.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (b.c.b.a.d.d.cb.a(r10, r6) == b.c.b.a.d.d.cb.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (b.c.b.a.d.d.cb.a(r10, r6) == b.c.b.a.d.d.cb.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (b.c.b.a.d.d.Ha.a(b.c.b.a.d.d.cb.f(r10, r6), b.c.b.a.d.d.cb.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (b.c.b.a.d.d.Ha.a(b.c.b.a.d.d.cb.f(r10, r6), b.c.b.a.d.d.cb.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (b.c.b.a.d.d.Ha.a(b.c.b.a.d.d.cb.f(r10, r6), b.c.b.a.d.d.cb.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (b.c.b.a.d.d.cb.c(r10, r6) == b.c.b.a.d.d.cb.c(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (b.c.b.a.d.d.cb.a(r10, r6) == b.c.b.a.d.d.cb.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (b.c.b.a.d.d.cb.b(r10, r6) == b.c.b.a.d.d.cb.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (b.c.b.a.d.d.cb.a(r10, r6) == b.c.b.a.d.d.cb.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (b.c.b.a.d.d.cb.b(r10, r6) == b.c.b.a.d.d.cb.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (b.c.b.a.d.d.cb.b(r10, r6) == b.c.b.a.d.d.cb.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(b.c.b.a.d.d.cb.d(r10, r6)) == java.lang.Float.floatToIntBits(b.c.b.a.d.d.cb.d(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(b.c.b.a.d.d.cb.e(r10, r6)) == java.lang.Double.doubleToLongBits(b.c.b.a.d.d.cb.e(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (b.c.b.a.d.d.Ha.a(b.c.b.a.d.d.cb.f(r10, r6), b.c.b.a.d.d.cb.f(r11, r6)) != false) goto L_0x01b3;
     */
    @Override // b.c.b.a.d.d.Fa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.C0097va.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // b.c.b.a.d.d.Fa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(T r9) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.C0097va.b(java.lang.Object):int");
    }

    @Override // b.c.b.a.d.d.Fa
    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.f454c.length; i2 += 3) {
                int c2 = c(i2);
                long j2 = (long) (1048575 & c2);
                int i3 = this.f454c[i2];
                switch ((c2 & 267386880) >>> 20) {
                    case 0:
                        if (a((Object) t2, i2)) {
                            cb.a(t, j2, cb.e(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (a((Object) t2, i2)) {
                            cb.a((Object) t, j2, cb.d(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 3:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 4:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 5:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 6:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 7:
                        if (a((Object) t2, i2)) {
                            cb.a(t, j2, cb.c(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a(t, j2, cb.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 9:
                    case 17:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a(t, j2, cb.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 11:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 12:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 13:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 14:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 15:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 16:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        cb.a((Object) t, j2, cb.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.p.a(t, t2, j2);
                        break;
                    case 50:
                        Ha.a(this.s, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        cb.a(t, j2, cb.f(t2, j2));
                        b(t, i3, i2);
                        break;
                    case 60:
                    case 68:
                        b(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        cb.a(t, j2, cb.f(t2, j2));
                        b(t, i3, i2);
                        break;
                }
            }
            if (!this.j) {
                Ha.a(this.q, t, t2);
                if (this.h) {
                    Ha.a(this.r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r20, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (b.c.b.a.d.d.AbstractC0100x.b(r3) + b.c.b.a.d.d.AbstractC0100x.d(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof b.c.b.a.d.d.AbstractC0071i) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = b.c.b.a.d.d.AbstractC0100x.b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0417, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0437, code lost:
        if (a(r20, r15, r3) != false) goto L_0x06fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x043f, code lost:
        if (a(r20, r15, r3) != false) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x045f, code lost:
        if (a(r20, r15, r3) != false) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0467, code lost:
        if (a(r20, r15, r3) != false) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0477, code lost:
        if ((r4 instanceof b.c.b.a.d.d.AbstractC0071i) != false) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x051c, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x052e, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0540, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0552, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0564, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0576, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0588, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x059a, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05ab, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05bc, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05cd, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05de, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05ef, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0600, code lost:
        if (r19.k != false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0602, code lost:
        r2.putInt(r20, (long) r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0606, code lost:
        r8 = (b.c.b.a.d.d.AbstractC0100x.b(r15) + b.c.b.a.d.d.AbstractC0100x.d(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06ce, code lost:
        if ((r12 & r18) != 0) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06d0, code lost:
        r4 = b.c.b.a.d.d.AbstractC0100x.c(r15, (b.c.b.a.d.d.AbstractC0089ra) r2.getObject(r20, r8), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06fb, code lost:
        if ((r12 & r18) != 0) goto L_0x06fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06fd, code lost:
        r4 = b.c.b.a.d.d.AbstractC0100x.h(r15, 0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0706, code lost:
        if ((r12 & r18) != 0) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0708, code lost:
        r8 = b.c.b.a.d.d.AbstractC0100x.j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x072b, code lost:
        if ((r12 & r18) != 0) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x072d, code lost:
        r4 = r2.getObject(r20, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0731, code lost:
        r4 = b.c.b.a.d.d.AbstractC0100x.c(r15, (b.c.b.a.d.d.AbstractC0071i) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof b.c.b.a.d.d.AbstractC0071i) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x073a, code lost:
        if ((r12 & r18) != 0) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x073c, code lost:
        r4 = b.c.b.a.d.d.Ha.a(r15, r2.getObject(r20, r8), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0754, code lost:
        if ((r4 instanceof b.c.b.a.d.d.AbstractC0071i) != false) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0757, code lost:
        r4 = b.c.b.a.d.d.AbstractC0100x.b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r19.k != false) goto L_0x020d;
     */
    @Override // b.c.b.a.d.d.Fa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(T r20) {
        /*
        // Method dump skipped, instructions count: 2402
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.b.a.d.d.C0097va.c(java.lang.Object):int");
    }

    @Override // b.c.b.a.d.d.Fa
    public final void d(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long c2 = (long) (c(this.l[i3]) & 1048575);
            Object f2 = cb.f(t, c2);
            if (f2 != null) {
                this.s.c(f2);
                cb.a(t, c2, f2);
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.a(t, (long) this.l[i2]);
            i2++;
        }
        this.q.a(t);
        if (this.h) {
            this.r.c(t);
        }
    }
}
