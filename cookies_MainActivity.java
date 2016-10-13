package com.example.android.cookies;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        /**
         * TO DO: Find a reference to the ImageView in the layout.
         * Then change the image.
         */
        Drawable afterCookie = ContextCompat.getDrawable(this, R.drawable.after_cookie);
        ImageView beforeCookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        beforeCookie.setImageDrawable(afterCookie);
        /**
         * TO DO: Find a reference to the TextView in the layout.
         * Then change the text.
         */
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("I'm so full");
    }
}
