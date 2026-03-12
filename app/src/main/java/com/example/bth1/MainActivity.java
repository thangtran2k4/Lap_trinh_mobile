package com.example.bth1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnHello, btnChao, btnClear;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        btnHello = findViewById(R.id.btnHello);
        btnChao = findViewById(R.id.btnChao);
        btnClear = findViewById(R.id.btnClear);
        txtResult = findViewById(R.id.txtResult);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                txtResult.setText("Hello " + name);
            }
        });

        btnChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                txtResult.setText("CHÀO " + name);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText("");
                txtResult.setText("");
            }
        });
    }
}