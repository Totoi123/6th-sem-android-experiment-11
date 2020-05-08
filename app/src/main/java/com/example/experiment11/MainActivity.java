package com.example.experiment11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] carname = {"Swift", "Dzire", "Alto", "Ciaz", "Creta", "Venue", "Verna", "i20"};
    String[] launched_date = {"01-03-2005", "20-03-2020", "23-10-2019" , "06-10-2014", "06-02-2020", "21-05-2019", "26-03-2020", "11-08-2014"};
    String[] company = {"Maruti Suzuki", "Hyundai"};

    Integer[] imgid = {R.drawable.swift1, R.drawable.dzire_red1, R.drawable.alto, R.drawable.ciaz_red, R.drawable.creta_red, R.drawable.venue_red, R.drawable.verna_red, R.drawable.i20_red};
    Integer[] imgid_blue = {R.drawable.swift_blue,R.drawable.dzire, R.drawable.alto_blue, R.drawable.ciaz, R.drawable.creta_blue, R.drawable.venue, R.drawable.verna_blue, R.drawable.i20};
    Integer[] imgid_red = {R.drawable.swift1, R.drawable.dzire_red1, R.drawable.alto, R.drawable.ciaz_red, R.drawable.creta_red, R.drawable.venue_red, R.drawable.verna_red, R.drawable.i20_red};
    Integer[] imgid_white = {R.drawable.swift_white, R.drawable.dzire_white, R.drawable.alto_white, R.drawable.ciaz_white, R.drawable.creta_white, R.drawable.venue_white, R.drawable.verna_white, R.drawable.i20_white};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listview);

        CustomListView customListView = new CustomListView(this,carname,imgid);
        list.setAdapter(customListView);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[0]);
                    bundle.putInt("image_red", imgid_red[0]);
                    bundle.putInt("image_blue", imgid_blue[0]);
                    bundle.putInt("image_white", imgid_white[0]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[0]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[0]);
                    intent.putExtra("company", company[0]);

                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[1]);
                    bundle.putInt("image_red",imgid_red[1]);
                    bundle.putInt("image_blue", imgid_blue[1]);
                    bundle.putInt("image_white", imgid_white[1]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[1]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[1]);
                    intent.putExtra("company", company[0]);

                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[2]);
                    bundle.putInt("image_red",imgid_red[2]);
                    bundle.putInt("image_blue", imgid_blue[2]);
                    bundle.putInt("image_white", imgid_white[2]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[2]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[2]);
                    intent.putExtra("company", company[0]);

                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[3]);
                    bundle.putInt("image_red",imgid_red[3]);
                    bundle.putInt("image_blue", imgid_blue[3]);
                    bundle.putInt("image_white", imgid_white[3]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[3]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[3]);
                    intent.putExtra("company", company[0]);

                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[4]);
                    bundle.putInt("image_red", imgid_red[4]);
                    bundle.putInt("image_blue", imgid_blue[4]);
                    bundle.putInt("image_white", imgid_white[4]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[4]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[4]);
                    intent.putExtra("company", company[1]);

                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[5]);
                    bundle.putInt("image_red", imgid_red[5]);
                    bundle.putInt("image_blue", imgid_blue[5]);
                    bundle.putInt("image_white", imgid_white[5]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[5]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[5]);
                    intent.putExtra("company", company[1]);

                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[6]);
                    bundle.putInt("image_red", imgid_red[6]);
                    bundle.putInt("image_blue", imgid_blue[6]);
                    bundle.putInt("image_white", imgid_white[6]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[6]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[6]);
                    intent.putExtra("company", company[1]);

                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(getApplicationContext(),Detail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", imgid[7]);
                    bundle.putInt("image_red", imgid_red[7]);
                    bundle.putInt("image_blue", imgid_blue[7]);
                    bundle.putInt("image_white", imgid_white[7]);
                    intent.putExtras(bundle);

                    intent.putExtra("name", carname[7]);
                    intent.putExtra("position", ""+0);
                    intent.putExtra("date", launched_date[7]);
                    intent.putExtra("company", company[1]);

                    startActivity(intent);
                }



            }
        });




    }
}
