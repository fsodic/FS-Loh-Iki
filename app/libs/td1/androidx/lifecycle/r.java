package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.f;

public class r extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private a f231a;

    /* access modifiers changed from: package-private */
    public interface a {
        void ia();

        void onCreate();

        void onResume();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new r(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void a(f.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof k) {
            ((k) activity).a().b(aVar);
        } else if (activity instanceof h) {
            f a2 = ((h) activity).a();
            if (a2 instanceof j) {
                ((j) a2).b(aVar);
            }
        }
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.ia();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f231a);
        a(f.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(f.a.ON_DESTROY);
        this.f231a = null;
    }

    public void onPause() {
        super.onPause();
        a(f.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        b(this.f231a);
        a(f.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        c(this.f231a);
        a(f.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(f.a.ON_STOP);
    }
}
