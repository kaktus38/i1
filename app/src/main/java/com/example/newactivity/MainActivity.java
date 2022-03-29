package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;
    private ImageView iv2;
    private ImageView iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.imageView);
        iv2 = (ImageView) findViewById(R.id.imageView2);
        iv3 = (ImageView) findViewById(R.id.imageView3);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,web_activity.class);
                startActivity(intent);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,web_activity2.class);
                startActivity(intent);
            }
        });
        Picasso.with(this).load("https://wikicomics.ru/uploads/posts/2016-04/1459983027_novoe-foto-doktora-strendzha.jpg").fit().centerCrop().into(iv);
        Picasso.with(this).load("https://media.kg-portal.ru/production/ironman/ironman_1.jpg").fit().centerCrop().into(iv2);
    }
}