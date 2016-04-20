package com.example.jhlee.assignment01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText txtAmount;
    EditText txtTipPercent;
    TextView lblTipResult;
    TextView lblTotal;
    TextView lblPerPerson;
    Button btnCalculate;
    Button btnClear;
    Spinner spnTip;
    Spinner spnPeople;
    String tips;
    String peoples;
//    LinearLayout layout1 = (LinearLayout)findViewById(R.id.layoutAmount);
//    LinearLayout layout2 = (LinearLayout)findViewById(R.id.layoutTip);
//    LinearLayout layout3;
//    LinearLayout layout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(layout2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //get references

        txtAmount = (EditText)findViewById(R.id.txtAmount);
        txtTipPercent = (EditText)findViewById(R.id.txtTip);
        lblTipResult = (TextView)findViewById(R.id.lblTipResult);
        lblTotal = (TextView)findViewById(R.id.lblTotal);
        lblPerPerson = (TextView)findViewById(R.id.lblPerperson);
        btnCalculate = (Button)findViewById(R.id.btnCalculate);
        btnClear = (Button)findViewById(R.id.btnClear);
        spnTip = (Spinner)findViewById(R.id.spnTip);
        spnPeople = (Spinner)findViewById(R.id.spnPeople);

        //ArrayAdapters for spinners
        ArrayAdapter tipAdapter = ArrayAdapter.createFromResource(this, R.array.tip, android.R.layout.simple_spinner_item);
//        ArrayAdapter<CharSequence> peopleAdapter = ArrayAdapter.createFromResource(this, R.array.peoples, android.R.layout.simple_spinner_item);

        //set adapter to spinners
//        spnTip.setAdapter(tipAdapter);
//        spnPeople.setAdapter(peopleAdaptor);

        //create spinner listeners
//        spnTip.setOnItemSelectedListener(this);
//        spnPeople.setOnItemSelectedListener(this);

    }

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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tips = (String)parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
