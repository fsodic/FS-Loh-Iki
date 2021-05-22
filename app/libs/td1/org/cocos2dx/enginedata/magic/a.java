package org.cocos2dx.enginedata.magic;

import android.util.Log;
import com.huawei.android.hwgamesdk.HwGameSDK;
import com.huawei.android.hwgamesdk.NoExtAPIException;
import org.cocos2dx.enginedata.IEngineDataManager;

public class a implements IEngineDataManager {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6243a = "EngineDataManagerHuawei";
    private static /* synthetic */ int[] f;

    /* renamed from: b  reason: collision with root package name */
    private IEngineDataManager.OnSystemCommandListener f6244b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6245c = false;
    private HwGameSDK d = new HwGameSDK();
    private HwGameSDK.GameEngineCallBack e = new b(this);

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|8|9|10|11|12|13|(2:14|15)|16|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] a() {
        /*
            int[] r0 = org.cocos2dx.enginedata.magic.a.f
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            org.cocos2dx.enginedata.IEngineDataManager$GameStatus[] r0 = org.cocos2dx.enginedata.IEngineDataManager.GameStatus.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            org.cocos2dx.enginedata.IEngineDataManager$GameStatus r1 = org.cocos2dx.enginedata.IEngineDataManager.GameStatus.INVALID     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            org.cocos2dx.enginedata.IEngineDataManager$GameStatus r1 = org.cocos2dx.enginedata.IEngineDataManager.GameStatus.IN_SCENE     // Catch:{ NoSuchFieldError -> 0x001e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            org.cocos2dx.enginedata.IEngineDataManager$GameStatus r1 = org.cocos2dx.enginedata.IEngineDataManager.GameStatus.LAUNCH_BEGIN     // Catch:{ NoSuchFieldError -> 0x0027 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            org.cocos2dx.enginedata.IEngineDataManager$GameStatus r1 = org.cocos2dx.enginedata.IEngineDataManager.GameStatus.LAUNCH_END     // Catch:{ NoSuchFieldError -> 0x0030 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0030 }
        L_0x0030:
            org.cocos2dx.enginedata.IEngineDataManager$GameStatus r1 = org.cocos2dx.enginedata.IEngineDataManager.GameStatus.SCENE_CHANGE_BEGIN     // Catch:{ NoSuchFieldError -> 0x0039 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            org.cocos2dx.enginedata.IEngineDataManager$GameStatus r1 = org.cocos2dx.enginedata.IEngineDataManager.GameStatus.SCENE_CHANGE_END     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            org.cocos2dx.enginedata.magic.a.f = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.cocos2dx.enginedata.magic.a.a():int[]");
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void destroy() {
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public String getVendorInfo() {
        return "HuaWei:" + this.d.getApiLevel();
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public boolean init(IEngineDataManager.OnSystemCommandListener onSystemCommandListener) {
        if (onSystemCommandListener == null) {
            return false;
        }
        this.f6244b = onSystemCommandListener;
        try {
            int apiLevel = this.d.getApiLevel();
            if (apiLevel < 1) {
                Log.d(f6243a, "Unsupported function: HwGameSDK.getApiLevel: " + apiLevel + ", min: " + 1);
                return false;
            }
            if (apiLevel >= 2) {
                this.f6245c = true;
            }
            return this.d.registerGame(this.e);
        } catch (NoExtAPIException | NoSuchMethodError unused) {
            return false;
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyContinuousFrameLost(int i, int i2, int i3) {
        try {
            this.d.notifyContinuousFpsMissed(i, i2, i3);
        } catch (NoExtAPIException unused) {
            Log.d(f6243a, "Unsupported function: notifyGameStatus");
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyFpsChanged(float f2, float f3) {
        try {
            this.d.notifyFpsChanged(f2, f3);
        } catch (NoExtAPIException unused) {
            Log.d(f6243a, "Unsupported function: notifyFpsChanged");
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyGameStatus(IEngineDataManager.GameStatus gameStatus, int i, int i2) {
        HwGameSDK.GameScene gameScene;
        try {
            int i3 = a()[gameStatus.ordinal()];
            if (i3 == 1) {
                gameScene = HwGameSDK.GameScene.GAME_LAUNCH_BEGIN;
            } else if (i3 == 2) {
                gameScene = HwGameSDK.GameScene.GAME_LAUNCH_END;
            } else if (i3 == 3) {
                gameScene = HwGameSDK.GameScene.GAME_SCENECHANGE_BEGIN;
            } else if (i3 == 4) {
                gameScene = HwGameSDK.GameScene.GAME_SCENECHANGE_END;
            } else if (i3 != 5) {
                Log.e(f6243a, "error type: " + gameStatus);
                return;
            } else {
                gameScene = HwGameSDK.GameScene.GAME_INSCENE;
            }
            this.d.notifyGameScene(gameScene, i, i2);
        } catch (NoExtAPIException unused) {
            Log.d(f6243a, "Unsupported function: notifyGameStatus");
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void notifyLowFps(int i, float f2, int i2) {
        try {
            this.d.notifyFpsDx(i, f2, i2);
        } catch (NoExtAPIException unused) {
            Log.d(f6243a, "Unsupported function: notifyGameStatus");
        }
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void pause() {
    }

    @Override // org.cocos2dx.enginedata.IEngineDataManager
    public void resume() {
    }
}
