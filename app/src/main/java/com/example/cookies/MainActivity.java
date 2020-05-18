package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View v)
    {
        ImageView img =(ImageView)findViewById(R.id.android_cookie_image_view);
        img.setImageResource(R.drawable.after_cookie);

        TextView tx =(TextView)findViewById(R.id.status_text_view);
        tx.setText("I am So full");
    }
}
