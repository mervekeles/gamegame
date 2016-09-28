package com.example.mervekeles.gamegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //GridView Object
    private GridView gridView;
    private TextView textView;
    private final String[] numbers = {"1", "2","3", "4", "5", "6", "7", "8", "9"};
    private final int[] imageid = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        gridView = (GridView) findViewById(R.id.gridView);
        textView.setText("Numbers selected");


        //Creating GridViewAdapter Object
        GridAdapter gridViewAdapter = new GridAdapter(this,numbers,imageid);

        //Adding adapter to gridview
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();

                // Display the selected/clicked item text and position on TextView
                String text = textView.getText().toString();

                textView.setText(text + " "+ selectedItem);

                //gridView.
            }
        });
    }
}
