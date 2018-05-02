package edu.illinois.cs.cs125.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class IdentityPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity_page);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(IdentityPage.this,
        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.AgeRange));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }
}
