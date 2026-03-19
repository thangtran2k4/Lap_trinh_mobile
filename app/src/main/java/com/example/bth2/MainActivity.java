package com.example.bth2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView txtMsg;
    ListView listView;
    TextView emptyView;

    String[] items = {
            "Cơ sở lập trình",
            "Cơ sở dữ liệu",
            "Cấu trúc dữ liệu",
            "Lập trình hướng đối tượng"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMsg = findViewById(R.id.tvMsg);
        listView = findViewById(R.id.list);
        emptyView = findViewById(R.id.empty);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );

        listView.setAdapter(adapter);
        listView.setEmptyView(emptyView);

        listView.setOnItemClickListener(
                (parent, view, position, id) -> {
                    txtMsg.setText("Position: " + position + " " + items[position]);
                }
        );
    }
}