package com.example.talkiezz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class dashboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ArrayList<String> genre= new ArrayList<String>();
        genre.add("Action");
        genre.add("Adventure");
        genre.add("Animation");
        genre.add("Comedy");
        genre.add("Crime");
        genre.add("Documentary");
        genre.add("Drama");
        genre.add("Family");
        genre.add("Fantasy");
        genre.add("History");
        genre.add("Horror");
        genre.add("Music");
        genre.add("Mystery");
        genre.add("Romance");
        genre.add("Science Fiction");
        genre.add("TV Movie");
        genre.add("Thriller");
        genre.add("War");
        genre.add("Western");

        ArrayAdapter<String> genreadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,genre);
        GridView gridView=(GridView) findViewById(R.id.list_view);
        gridView.setAdapter(genreadapter);
    }

}
