package c.a.a.a.e.f;

import java.util.regex.Pattern;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f697a = Pattern.compile("^(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f698b = Pattern.compile("^::[fF]{4}:(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f699c = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
    private static final Pattern d = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");

    public static boolean a(String str) {
        return f697a.matcher(str).matches();
    }

    public static boolean b(String str) {
        return d(str) || c(str);
    }

    public static boolean c(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ':') {
                i++;
            }
        }
        return i <= 7 && d.matcher(str).matches();
    }

    public static boolean d(String str) {
        return f699c.matcher(str).matches();
    }
}
