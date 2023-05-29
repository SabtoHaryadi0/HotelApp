package com.sabtoharyadi.hotelappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://cdn.pixabay.com/photo/2021/02/18/03/59/beach-6026018_1280.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);






    }
}