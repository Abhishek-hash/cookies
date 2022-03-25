package com.example.cookies;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    boolean state = true;


    //Declare a btn variable to store button id.
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {

        if (state == true) {
            // TODO: Find a reference to the ImageView in the layout. Change the image.
            ImageView img = (ImageView) findViewById(R.id.android_cookie_image_view);
            img.setImageResource(R.drawable.after_cookie);

            // TODO: Find a reference to the TextView in the layout. Change the text.
            TextView textView = (TextView) findViewById(R.id.status_text_view);
            textView.setText("I'm so full");


            // To change the button text.
            btn = (Button) findViewById(R.id.eat_cookie);
            btn.setText("GET COOKIE");

            //Set state to false.
            state = false;

        } else {
            setContentView(R.layout.activity_main);

            //Set state to false.
            state = true;
        }
    }
}