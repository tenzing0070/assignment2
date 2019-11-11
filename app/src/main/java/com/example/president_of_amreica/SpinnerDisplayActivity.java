package com.example.president_of_amreica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerDisplayActivity extends AppCompatActivity {

    TextView tvName,tvPhone,tvEmail,tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_display);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        tvName = findViewById(R.id.yName);
        tvPhone= findViewById(R.id.pNumber);
        tvEmail = findViewById(R.id.email);
        tvAddress = findViewById(R.id.address);

        Bundle bundleForm = getIntent().getExtras();
        if(bundleForm != null){
            tvName.setText(bundleForm.getString("forName"));
            tvPhone.setText(bundleForm.getString("forPhone"));
            tvEmail.setText(bundleForm.getString("forEmail"));
            tvAddress.setText(bundleForm.getString("forAddress"));
        }

        else{
            Toast.makeText(this, "Sorry, no data found.", Toast.LENGTH_SHORT).show();
        }

    }
}
