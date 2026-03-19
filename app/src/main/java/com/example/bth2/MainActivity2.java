package com.example.bth2;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bth2.model.DocGia;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    EditText edtTen, edtMa, edtSach, edtNgay;
    RadioButton rbGV, rbSV;
    Button btnThem;
    ListView listView;

    ArrayList<DocGia> list = new ArrayList<>();
    ArrayAdapter<DocGia> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtTen = findViewById(R.id.edtTen);
        edtMa = findViewById(R.id.edtMa);
        edtSach = findViewById(R.id.edtSach);
        edtNgay = findViewById(R.id.edtNgay);

        rbGV = findViewById(R.id.rbGV);
        rbSV = findViewById(R.id.rbSV);

        btnThem = findViewById(R.id.btnThem);
        listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                list
        );

        listView.setAdapter(adapter);

        btnThem.setOnClickListener(v -> {

            String ten = edtTen.getText().toString();
            String ma = edtMa.getText().toString();
            int sach = Integer.parseInt(
                    edtSach.getText().toString()
            );
            String ngay = edtNgay.getText().toString();

            String loai;

            if (rbGV.isChecked())
                loai = "GV";
            else
                loai = "SV";

            DocGia dg =
                    new DocGia(
                            ten,
                            ma,
                            sach,
                            ngay,
                            loai
                    );

            list.add(dg);
            adapter.notifyDataSetChanged();

        });

    }
}