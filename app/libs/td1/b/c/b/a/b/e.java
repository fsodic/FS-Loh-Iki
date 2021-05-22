package b.c.b.a.b;

import a.e.a.ActivityC0047j;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.e;
import b.c.b.a.a.b;
import b.c.b.a.d.b.h;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC0145ea;
import com.google.android.gms.common.api.internal.C0143da;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC0179e;
import com.google.android.gms.common.internal.C0178d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.o;

public class e extends f {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f299c = new Object();
    private static final e d = new e();
    public static final int e = f.f302a;
    private String f;

    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    public class a extends h {

        /* renamed from: a  reason: collision with root package name */
        private final Context f300a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f300a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int c2 = e.this.c(this.f300a);
            if (e.this.c(c2)) {
                e.this.c(this.f300a, c2);
            }
        }
    }

    static Dialog a(Context context, int i, AbstractDialogInterface$OnClickListenerC0179e eVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C0178d.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a2 = C0178d.a(context, i);
        if (a2 != null) {
            builder.setPositiveButton(a2, eVar);
        }
        String e2 = C0178d.e(context, i);
        if (e2 != null) {
            builder.setTitle(e2);
        }
        return builder.create();
    }

    public static e a() {
        return d;
    }

    static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC0047j) {
            m.a(dialog, onCancelListener).a(((ActivityC0047j) activity).c(), str);
            return;
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            d(context);
        } else if (pendingIntent != null) {
            String d2 = C0178d.d(context, i);
            String c2 = C0178d.c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            e.c cVar = new e.c(context);
            cVar.b(true);
            cVar.a(true);
            cVar.c(d2);
            e.b bVar = new e.b();
            bVar.a(c2);
            cVar.a(bVar);
            if (com.google.android.gms.common.util.h.c(context)) {
                r.b(o.g());
                cVar.b(context.getApplicationInfo().icon);
                cVar.a(2);
                if (com.google.android.gms.common.util.h.d(context)) {
                    cVar.a(b.c.b.a.a.a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    cVar.a(pendingIntent);
                }
            } else {
                cVar.b(17301642);
                cVar.d(resources.getString(b.common_google_play_services_notification_ticker));
                cVar.a(System.currentTimeMillis());
                cVar.a(pendingIntent);
                cVar.b(c2);
            }
            if (o.k()) {
                r.b(o.k());
                String b2 = b();
                if (b2 == null) {
                    b2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b2);
                    String b3 = C0178d.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(b2, b3, 4);
                    } else if (!b3.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b3);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                cVar.a(b2);
            }
            Notification a2 = cVar.a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                j.f306b.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    private final String b() {
        String str;
        synchronized (f299c) {
            str = this.f;
        }
        return str;
    }

    @Override // b.c.b.a.b.f
    public int a(Context context, int i) {
        return super.a(context, i);
    }

    public Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i, AbstractDialogInterface$OnClickListenerC0179e.a(activity, a(activity, i, "d"), i2), onCancelListener);
    }

    @Override // b.c.b.a.b.f
    public PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public PendingIntent a(Context context, b bVar) {
        return bVar.O() ? bVar.N() : a(context, bVar.L(), 0);
    }

    @Override // b.c.b.a.b.f
    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public final C0143da a(Context context, AbstractC0145ea eaVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C0143da daVar = new C0143da(eaVar);
        context.registerReceiver(daVar, intentFilter);
        daVar.a(context);
        if (a(context, "com.google.android.gms")) {
            return daVar;
        }
        eaVar.a();
        daVar.a();
        return null;
    }

    public final boolean a(Context context, b bVar, int i) {
        PendingIntent a2 = a(context, bVar);
        if (a2 == null) {
            return false;
        }
        a(context, bVar.L(), (String) null, GoogleApiActivity.a(context, a2, i));
        return true;
    }

    @Override // b.c.b.a.b.f
    public final String b(int i) {
        return super.b(i);
    }

    public boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Override // b.c.b.a.b.f
    public int c(Context context) {
        return super.c(context);
    }

    public void c(Context context, int i) {
        a(context, i, (String) null, a(context, i, 0, "n"));
    }

    @Override // b.c.b.a.b.f
    public final boolean c(int i) {
        return super.c(i);
    }

    /* access modifiers changed from: package-private */
    public final void d(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
