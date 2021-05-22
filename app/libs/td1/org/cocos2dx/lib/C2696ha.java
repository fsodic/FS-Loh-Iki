package org.cocos2dx.lib;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: org.cocos2dx.lib.ha  reason: case insensitive filesystem */
class C2696ha implements FilenameFilter {
    C2696ha() {
    }

    public boolean accept(File file, String str) {
        return str.startsWith("main.") && str.endsWith(".obb");
    }
}
