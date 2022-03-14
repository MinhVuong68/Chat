package com.example.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Goods> listProduct;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> listProduct) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Ánh xạ giao diện qua code
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvProductName = view.findViewById(R.id.tvProductName);
        TextView tvNameStore = view.findViewById(R.id.tvNameStore);
        ImageView imgGoods = view.findViewById(R.id.imgGoods);

        // Gán giá trị
        tvProductName.setText(listProduct.get(i).getProductName());
        tvNameStore.setText(listProduct.get(i).getNameStore());
        imgGoods.setImageResource(listProduct.get(i).getImgGoods());

        return view;

    }
}
