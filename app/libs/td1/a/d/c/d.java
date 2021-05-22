package a.d.c;

import a.d.a;
import android.os.Build;
import android.view.ViewGroup;

public final class d {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(a.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && c.a(viewGroup) == null) ? false : true;
    }
}
