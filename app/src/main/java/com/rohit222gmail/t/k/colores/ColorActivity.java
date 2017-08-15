package com.rohit222gmail.t.k.colores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class ColorActivity extends AppCompatActivity {

    public Spinner spinner;
    public RelativeLayout relativeLayout;
    int yellow = R.color.yellow;
    int red = R.color.red;
    int blue = R.color.blue;
    int black = R.color.black;
    int white = R.color.white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        relativeLayout = (RelativeLayout) findViewById(R.id.color_activity);
        spinner_initial();
    }

    public void spinner_initial() {
        List<String> list = new ArrayList<String>();
        list.add("Yellow");
        list.add("Red");
        list.add("Blue");
        list.add("Black");
        list.add("White");
        spinner = (Spinner) findViewById(R.id.color_down);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_prop,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    switch (i) {
                        case 0:
                            relativeLayout.setBackgroundColor(getResources().getColor(yellow));
                            break;
                        case 1:
                            relativeLayout.setBackgroundColor(getResources().getColor(red));
                            break;
                        case 2:
                            relativeLayout.setBackgroundColor(getResources().getColor(blue));
                            break;
                        case 3:
                            relativeLayout.setBackgroundColor(getResources().getColor(black));
                            break;
                        case 4:
                            relativeLayout.setBackgroundColor(getResources().getColor(white));
                            break;
                    }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
