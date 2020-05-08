package com.example.experiment11;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    ImageView imageView;
    TextView textView, date, company;
    Button blue, red, white;
    int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        imageView = (ImageView) findViewById(R.id.detail_imageView);
        textView = (TextView) findViewById(R.id.detail_title);
        date = (TextView) findViewById(R.id.detail_date);
        company = (TextView) findViewById(R.id.detail_company);
        blue = (Button) findViewById(R.id.blue);
        red = (Button) findViewById(R.id.red);
        white = (Button) findViewById(R.id.white);

        if (position ==0){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            final int pic = bundle.getInt("image");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });
        }
        if (position ==1){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            final int pic = bundle.getInt("image");
            final int red_pic = bundle.getInt("image_red");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);
            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(red_pic);
                }
            });
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });

            }


        if (position ==2){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            final int red_pic = bundle.getInt("image_red");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);
            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(red_pic);
                }
            });
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });
        }
        if (position ==3){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            final int red_pic = bundle.getInt("image_red");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(red_pic);
                }
            });
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });
        }

        if (position ==4){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            final int red_pic = bundle.getInt("image_red");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(red_pic);
                }
            });
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });
        }
        if (position ==5){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            final int red_pic = bundle.getInt("image_red");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(red_pic);
                }
            });
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });
        }
        if (position ==6){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            final int red_pic = bundle.getInt("image_red");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(red_pic);
                }
            });
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });
        }
        if (position ==7){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            final int red_pic = bundle.getInt("image_red");
            final int blue_pic = bundle.getInt("image_blue");
            final int white_pic = bundle.getInt("image_white");
            String atitle = intent.getStringExtra("name");
            String adate = intent.getStringExtra("date");
            String acompny = intent.getStringExtra("company");
            date.setText(adate);
            company.setText(acompny);
            imageView.setImageResource(pic);
            textView.setText(atitle);
            actionBar.setTitle(atitle);

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(red_pic);
                }
            });
            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(blue_pic);
                }
            });
            white.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(white_pic);
                }
            });
        }



    }
}
