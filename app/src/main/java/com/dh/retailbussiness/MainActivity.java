package com.dh.retailbussiness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.add)
    Button _addButton;
    @BindView(R.id.retailername)
    RadioButton _retailerName;
    @BindView(R.id.retailerlocation)
    RadioButton _retailerLocation;
    /* @BindView(R.id.searchcontent)
     TextInputEditText _searchArea;*/
    @BindView(R.id.search)
    Button _searchButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ButterKnife.bind(this);
            _addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, AddDetailsActivity.class);
                    startActivity(intent);
                }
            });

           /* _searchButton.setOnClickListener(new View.OnClickListener() {
                List<String> searchValues = CheckData();

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, IntentHandler.class);
                    intent.putExtra("Search context", (Parcelable) searchValues);
                    startActivity(intent);
                    //String sessionId = getIntent().getStringExtra("EXTRA_SESSION_ID");

                }
            });*/

        } catch (Exception e) {
            return;
        }

    }

   /* public List<String> CheckData() {
        List<String> data = new ArrayList<String>();
        String SearchData = _searchArea.getEditableText().toString();
        data.add(SearchData);
        if (_retailerName.isSelected()) {
            data.add("Retailer name");
        } else {
            data.add("Retailer Location");
        }
        return data;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
