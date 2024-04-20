package com.example.easycreen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ImageAdapter adapter;
    private int[] images = {R.drawable.netflix_1, R.drawable.disney_1, R.drawable.max_1, R.drawable.win_1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        adapter = new ImageAdapter(this, images);
        viewPager.setAdapter(adapter);

    }
}