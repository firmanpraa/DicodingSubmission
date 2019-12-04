package com.example.submission_dicoding;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imgPhoto;
    TextView tvName, tvDetail, tvPrice;

    String productName, productDetail, productPrice;
    int imgproduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgPhoto = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvPrice = findViewById(R.id.tv_Price);
        tvDetail = findViewById(R.id.tv_item_detail);

        imgproduct = getIntent().getIntExtra("img_item_photo", 0);
        productName = getIntent().getStringExtra("tv_item_name");
        productPrice = getIntent().getStringExtra("tv_Price");
        productDetail = getIntent().getStringExtra("tv_item_detail");

        imgPhoto.setImageResource(imgproduct);
        tvName.setText(productName);
        tvPrice.setText(productPrice);
        tvDetail.setText(productDetail);


    }
}
