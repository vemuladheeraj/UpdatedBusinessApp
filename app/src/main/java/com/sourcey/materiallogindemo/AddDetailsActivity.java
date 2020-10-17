package com.sourcey.materiallogindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AddDetailsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public Spinner spinner1, spinner2;
    public ArrayAdapter<String> adapterForSpinner1, adapterForSpinner2;
    @BindView(R.id.franchaise_area)
    AppCompatSpinner _franchaiseArea;
    @BindView(R.id.product_category)
    AppCompatSpinner _productCategory;
    @BindView(R.id.product_sub_category)
    AppCompatSpinner _productSubCategory;
    @BindView(R.id.competitorname)
    AppCompatSpinner _competitorName;
    String[] items1 = new String[]{"Product List",
            "Beverages List",
            "Cleaning List",
            "Dairy List",
            "Eggs List",
            "Food List",
            "FandV List",
            "PersonalCare List",
            "Snacks List"};
    String[] Beverages = new String[]{"Cool Drinks", "Water"};
    String[] Dairy = new String[]{"Chocolates", "Milk"};

    String[] competitorNames = new String[]{"Udaan            ",
            "Big Basket       ",
            "Eboot            ",
            "FMCG Distributors",
            "Wholesale        ",
            "NinjaCart        ",
            "Jio              "};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddetails);
        ButterKnife.bind(this);
        String[] items = new String[]{"Attapur",
                "Chanda Nagar               ",
                "Chandrayan gutta           ",
                "Chintal                    ",
                "Ghansi Bazar               ",
                "Gosha Mahal                ",
                "Jeedimetla                 ",
                "Jubilee Hills Road No.12   ",
                "Kondapur                   ",
                "Kukatpally                 ",
                "LB Nagar                   ",
                "Malakpet/Akberbagh         ",
                "Malkajgiri                 ",
                "Mehdipatnam                ",
                "Monda Market               ",
                "Moosapet                   ",
                "Nacharam/ECIL              ",
                "Nallakunta                 ",
                "Ramachandrapuram           ",
                "Ramnagar                   ",
                "SantoshNagar               ",
                "Somajiguda                 ",
                "Tarnaka                    ",
                "Tolichowki                 ",
                "Uppal                      ",
                "Vanasthalipuram            ",
                "Venkatapuram               ",};
        Spinner spinner = (Spinner) findViewById(R.id.franchaise_area);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner1 = (Spinner) findViewById(R.id.product_category);
        spinner2 = (Spinner) findViewById(R.id.product_sub_category);
        ArrayAdapter<String> adapterForSpinner1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items1);
        adapterForSpinner1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapterForSpinner1);
        spinner1.setOnItemSelectedListener(this);

        Spinner spinner3 = (Spinner) findViewById(R.id.competitorname);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, competitorNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        Toast.makeText(this, "Result " + spinner1.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        if (parent.getId() == R.id.product_category) {
            if (spinner1.getSelectedItem().toString().contains("Beverages")) {
                adapterForSpinner2 = new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_spinner_item, Beverages);
                adapterForSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(adapterForSpinner2);
                spinner2.setOnItemSelectedListener(this);

            } else if (spinner1.getSelectedItem().toString().contains("Dairy")) {
                adapterForSpinner2 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, Dairy);
                adapterForSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(adapterForSpinner2);
                spinner2.setOnItemSelectedListener(this);
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}