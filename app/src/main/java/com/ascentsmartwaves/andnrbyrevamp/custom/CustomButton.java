package com.ascentsmartwaves.andnrbyrevamp.custom;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by ADMIN on 09-02-2015.
 */
public class CustomButton extends Button {


        public CustomButton(Context context) {
            super(context);
            changeButton();
        }

        public CustomButton(Context context, AttributeSet attrs) {
            super(context, attrs);
            changeButton();
        }

        public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            changeButton();
        }

        @TargetApi(Build.VERSION_CODES.LOLLIPOP)
        public CustomButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
            changeButton();
        }

        private void changeButton() {

            Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"ropa.ttf");
            setTypeface(tf);

        }

}
