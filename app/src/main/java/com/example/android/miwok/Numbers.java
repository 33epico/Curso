package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //String [] words = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        ArrayList<String> words = new ArrayList<String>();
        words.add("One");words.add("Two");words.add("Three");words.add("Four");words.add("Five");
        words.add("Six");words.add("Seven");words.add("Eight");words.add("Nine");words.add("Ten");
        words.add("One");words.add("Two");words.add("Three");words.add("Four");words.add("Five");
        words.add("Six");words.add("Seven");words.add("Eight");words.add("Nine");words.add("Ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);





    }

}
