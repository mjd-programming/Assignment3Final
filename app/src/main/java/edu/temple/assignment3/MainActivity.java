package edu.temple.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] colors = {"red", "blue", "green", "grey", "cyan", "magenta", "yellow", "olive", "lime", "maroon", "navy", "purple"};
    Spinner colorSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> colorList = new ArrayList<>();
        Collections.addAll(colorList, colors);
        colorSpinner = (Spinner) findViewById(R.id.color_spinner);
        colorSpinner.setAdapter(new ColorAdapter(this, colorList));
        colorSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        view.getRootView().setBackgroundColor(Color.parseColor(colors[i]));
        view.setBackgroundColor(Color.WHITE);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}