/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.xdty.preference.colorpicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Creates a circular swatch of a specified color.  Adds a checkmark if marked as checked.
 */
public class ColorPickerSwatch extends FrameLayout implements View.OnClickListener {
    private int mColor;
    private ImageView mSwatchImage;
    private ImageView mCheckMarkImage;
    private OnColorSelectedListener mOnColorSelectedListener;

    public ColorPickerSwatch(Context context, int color, boolean checked, int width,
            int strokeColor, OnColorSelectedListener listener) {
        super(context);
        mColor = color;
        mOnColorSelectedListener = listener;

        LayoutInflater.from(context).inflate(R.layout.color_picker_swatch, this);
        mSwatchImage = (ImageView) findViewById(R.id.color_picker_swatch);
        mCheckMarkImage = (ImageView) findViewById(R.id.color_picker_checkmark);
        if (width > 0) {
            setColor(color, width, strokeColor);
        } else {
            setColor(color);
        }
        setChecked(checked);
        setOnClickListener(this);
    }

    protected void setColor(int color) {
        Drawable[] colorDrawable = new Drawable[]
                { getContext().getResources().getDrawable(R.drawable.color_picker_swatch) };
        mSwatchImage.setImageDrawable(new ColorStateDrawable(colorDrawable, color));
    }

    protected void setColor(int color, int width, int strokeColor) {
        GradientDrawable colorDrawable;

        colorDrawable = new GradientDrawable();
        colorDrawable.setShape(GradientDrawable.OVAL);
        colorDrawable.setColor(color);
        colorDrawable.setStroke(width, strokeColor);

        mSwatchImage.setImageDrawable(colorDrawable);
    }

    private void setChecked(boolean checked) {
        if (checked) {
            mCheckMarkImage.setVisibility(View.VISIBLE);
        } else {
            mCheckMarkImage.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        if (mOnColorSelectedListener != null) {
            mOnColorSelectedListener.onColorSelected(mColor);
        }
    }

    /**
     * Interface for a callback when a color square is selected.
     */
    public interface OnColorSelectedListener {

        /**
         * Called when a specific color square has been selected.
         */
        void onColorSelected(int color);
    }
}
