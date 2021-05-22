package c.a.a.a.b.f;

import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f634a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: b  reason: collision with root package name */
    private static final Date f635b;

    /* renamed from: c  reason: collision with root package name */
    public static final TimeZone f636c = TimeZone.getTimeZone("GMT");

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f637a = new b();

        public static SimpleDateFormat a(String str) {
            Map<String, SimpleDateFormat> map = f637a.get().get();
            if (map == null) {
                map = new HashMap<>();
                f637a.set(new SoftReference<>(map));
            }
            SimpleDateFormat simpleDateFormat = map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    static {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(f636c);
        instance.set(2000, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        f635b = instance.getTime();
    }

    public static Date a(String str, String[] strArr) {
        return a(str, strArr, null);
    }

    public static Date a(String str, String[] strArr, Date date) {
        c.a.a.a.p.a.a((Object) str, "Date value");
        if (strArr == null) {
            strArr = f634a;
        }
        if (date == null) {
            date = f635b;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String str2 : strArr) {
            SimpleDateFormat a2 = a.a(str2);
            a2.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = a2.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }
}
