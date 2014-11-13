package com.example.ccd;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;


public class Home extends Activity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_home);
        setContentView(R.layout.fragment_home);
        setContentView(R.layout.fragment_home);
        setContentView(R.layout.fragment_home);
        setContentView(R.layout.fragment_home);

        spinner = (Spinner) findViewById(R.id.Spinner1);
        spinner1 = (Spinner) findViewById(R.id.Spinner2);
        spinner2 = (Spinner) findViewById(R.id.Spinner3);
        spinner3 = (Spinner) findViewById(R.id.Spinner4);
        spinner4 = (Spinner) findViewById(R.id.Spinner5);

        ArrayAdapter  adapter = ArrayAdapter.createFromResource(this, R.array.SAD, android.R.layout.simple_dropdown_item_1line);
        ArrayAdapter  adapter1 = ArrayAdapter.createFromResource(this, R.array.CFST, android.R.layout.simple_dropdown_item_1line);
        ArrayAdapter  adapter2 = ArrayAdapter.createFromResource(this, R.array.CI, android.R.layout.simple_dropdown_item_1line);
        ArrayAdapter  adapter3 = ArrayAdapter.createFromResource(this, R.array.AI, android.R.layout.simple_dropdown_item_1line);
        ArrayAdapter  adapter4 = ArrayAdapter.createFromResource(this, R.array.SH, android.R.layout.simple_dropdown_item_1line);

        spinner.setAdapter(adapter);
        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
        spinner4.setAdapter(adapter4);

        spinner.setOnItemSelectedListener(this);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);



/*        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }
    public void Add(View view1){
        Intent intent = new Intent(this, AddDisease.class);
        startActivity(intent);
    }

    public void Settings(View view2){
        Intent intent = new Intent(this, SettingsTab.class);
        startActivity(intent);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
   }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView myText = (TextView) view;
        Toast.makeText(this, "You Selected "+myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

       @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                     View rootView = inflater.inflate(R.layout.fragment_home, container, false);
                       return rootView;
        }
    }
}
