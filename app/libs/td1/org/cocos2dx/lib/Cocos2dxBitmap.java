package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class Cocos2dxBitmap {
    private static final int HORIZONTAL_ALIGN_CENTER = 3;
    private static final int HORIZONTAL_ALIGN_LEFT = 1;
    private static final int HORIZONTAL_ALIGN_RIGHT = 2;
    private static final int VERTICAL_ALIGN_BOTTOM = 2;
    private static final int VERTICAL_ALIGN_CENTER = 3;
    private static final int VERTICAL_ALIGN_TOP = 1;
    private static Context sContext;

    public static Typeface calculateShrinkTypeFace(String str, int i, int i2, Layout.Alignment alignment, float f, TextPaint textPaint, boolean z) {
        if (i == 0 || i2 == 0) {
            return textPaint.getTypeface();
        }
        float f2 = (float) (i + 1);
        float f3 = (float) (i2 + 1);
        float f4 = f + 1.0f;
        if (!z) {
            while (true) {
                if (f2 <= ((float) i) && f3 <= ((float) i2)) {
                    break;
                }
                f4 -= 1.0f;
                f2 = (float) ((int) Math.ceil((double) StaticLayout.getDesiredWidth(str, textPaint)));
                f3 = (float) getTextHeight(str, (int) f2, f4, textPaint.getTypeface());
                textPaint.setTextSize(f4);
                if (f4 <= 0.0f) {
                    break;
                }
            }
            return textPaint.getTypeface();
        }
        while (true) {
            if (f3 <= ((float) i2) && f2 <= ((float) i)) {
                break;
            }
            float f5 = f4 - 1.0f;
            StaticLayout staticLayout = new StaticLayout(str, textPaint, i, alignment, 1.0f, 0.0f, false);
            f2 = (float) staticLayout.getWidth();
            f3 = (float) staticLayout.getLineTop(staticLayout.getLineCount());
            textPaint.setTextSize(f5);
            if (f5 <= 0.0f) {
                break;
            }
            f4 = f5;
        }
        return textPaint.getTypeface();
        textPaint.setTextSize(f);
        return textPaint.getTypeface();
    }

    public static boolean createTextBitmapShadowStroke(byte[] bArr, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, boolean z, float f2, float f3, float f4, float f5, boolean z2, int i9, int i10, int i11, int i12, float f6, boolean z3, int i13) {
        int i14;
        boolean z4;
        TextPaint textPaint;
        int i15;
        StaticLayout staticLayout;
        TextPaint textPaint2;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        String str2 = new String(bArr);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int i16 = i6 & 15;
        int i17 = 2;
        if (i16 != 1) {
            if (i16 == 2) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i16 == 3) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        TextPaint newPaint = newPaint(str, i);
        if (z2) {
            newPaint.setStyle(Paint.Style.STROKE);
            newPaint.setStrokeWidth(f6);
        }
        int ceil = i7 <= 0 ? (int) Math.ceil((double) StaticLayout.getDesiredWidth(str2, newPaint)) : i7;
        if (i13 != 1 || z3) {
            if (i13 == 2) {
                textPaint2 = newPaint;
                z4 = true;
                i14 = i16;
                calculateShrinkTypeFace(str2, i7, i8, alignment, (float) i, textPaint2, z3);
            } else {
                textPaint2 = newPaint;
                i14 = i16;
                z4 = true;
            }
            i15 = 3;
            i17 = 2;
            textPaint = textPaint2;
            staticLayout = new StaticLayout(str2, textPaint2, ceil, alignment, 1.0f, f, false);
        } else {
            staticLayout = new StaticLayout(str2, newPaint, (int) Math.ceil((double) StaticLayout.getDesiredWidth(str2, newPaint)), alignment, 1.0f, f, false);
            textPaint = newPaint;
            i14 = i16;
            i15 = 3;
            z4 = true;
        }
        int width = staticLayout.getWidth();
        int lineTop = staticLayout.getLineTop(staticLayout.getLineCount());
        int max = Math.max(width, i7);
        int i18 = i8 > 0 ? i8 : lineTop;
        if (i13 == z4 && !z3 && i7 > 0) {
            max = i7;
        }
        if (max == 0 || i18 == 0) {
            return false;
        }
        int i19 = i14 == i15 ? (max - width) / i17 : i14 == i17 ? max - width : 0;
        int i20 = (i6 >> 4) & 15;
        int i21 = i20 != i17 ? i20 != i15 ? 0 : (i18 - lineTop) / i17 : i18 - lineTop;
        Bitmap createBitmap = Bitmap.createBitmap(max, i18, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((float) i19, (float) i21);
        if (z2) {
            textPaint.setARGB(i12, i9, i10, i11);
            staticLayout.draw(canvas);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setARGB(i5, i2, i3, i4);
        staticLayout.draw(canvas);
        initNativeObject(createBitmap);
        return z4;
    }

    public static int getFontSizeAccordingHeight(int i) {
        TextPaint textPaint = new TextPaint();
        Rect rect = new Rect();
        textPaint.setTypeface(Typeface.DEFAULT);
        boolean z = false;
        int i2 = 1;
        while (!z) {
            textPaint.setTextSize((float) i2);
            textPaint.getTextBounds("SghMNy", 0, 6, rect);
            i2++;
            if (i - rect.height() <= 2) {
                z = true;
            }
        }
        return i2;
    }

    private static byte[] getPixels(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        byte[] bArr = new byte[(bitmap.getWidth() * bitmap.getHeight() * 4)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.nativeOrder());
        bitmap.copyPixelsToBuffer(wrap);
        return bArr;
    }

    private static String getStringWithEllipsis(String str, float f, float f2) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextSize(f2);
        return TextUtils.ellipsize(str, textPaint, f, TextUtils.TruncateAt.END).toString();
    }

    public static int getTextHeight(String str, int i, float f, Typeface typeface) {
        TextPaint textPaint = new TextPaint(129);
        textPaint.setTextSize(f);
        textPaint.setTypeface(typeface);
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int breakText = textPaint.breakText(str, i2, length, true, (float) i, null);
            if (breakText == 0) {
                i2++;
            } else {
                i2 += breakText;
                i3++;
            }
        }
        return (int) Math.floor((double) (((float) i3) * (Math.abs(textPaint.ascent()) + Math.abs(textPaint.descent()))));
    }

    private static void initNativeObject(Bitmap bitmap) {
        byte[] pixels = getPixels(bitmap);
        if (pixels != null) {
            nativeInitBitmapDC(bitmap.getWidth(), bitmap.getHeight(), pixels);
        }
    }

    private static native void nativeInitBitmapDC(int i, int i2, byte[] bArr);

    private static TextPaint newPaint(String str, int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) i);
        textPaint.setAntiAlias(true);
        if (str.endsWith(".ttf")) {
            try {
                textPaint.setTypeface(Cocos2dxTypefaces.get(sContext, str));
            } catch (Exception unused) {
                Log.e("Cocos2dxBitmap", "error to create ttf type face: " + str);
            }
            return textPaint;
        }
        textPaint.setTypeface(Typeface.create(str, 0));
        return textPaint;
    }

    public static void setContext(Context context) {
        sContext = context;
    }
}
