package com.example.trialormprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trialormprogram.model.Product;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText prodName;
    Button insertBtn;
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prodName = findViewById(R.id.productNameTxt);
        insertBtn = findViewById(R.id.insertButton);
        insertBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        product = new Product();
        String prod_name = prodName.getText().toString();
        product.setProduct(prod_name);
        product.save();
        Toast.makeText(getApplicationContext(), "Insert Data Successfully", Toast.LENGTH_SHORT).show();
        prodName.setText("");
        prodName.requestFocus();
    }
}
