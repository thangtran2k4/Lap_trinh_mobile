package com.example.bth2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bth2.R;
import com.example.bth2.model.DocGia;

import java.util.ArrayList;

public class DocGiaAdapter extends BaseAdapter {
    Context context;
    ArrayList<DocGia> list;

    public DocGiaAdapter(Context context, ArrayList<DocGia> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_docgia, viewGroup, false);
        }

        TextView tvTen = view.findViewById(R.id.tvTen);
        TextView tvMa = view.findViewById(R.id.tvMa);
        TextView tvPhi = view.findViewById(R.id.tvPhi);

        DocGia dg = list.get(i);

        tvTen.setText(dg.getTen() + " (" + dg.getLoai() + ")");
        tvMa.setText("Mã: " + dg.getMa());
        tvPhi.setText("Phí: " + dg.tinhPhi());

        return view;
    }
}
