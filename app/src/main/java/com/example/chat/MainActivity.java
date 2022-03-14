package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodsAdapter customGoodsAdapter;
    ArrayList<Goods> listGooods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.list_view);
        listGooods = new ArrayList<>();
        listGooods.add(new Goods(R.drawable.ca_nau_lau,"Ca nấu lẩu, nấu mì mini","MiniShop"));
        listGooods.add(new Goods(R.drawable.ga_bo_toi,"Gà bơ tỏi","MyLoYa"));
        listGooods.add(new Goods(R.drawable.hieu_long_con_tre,"Hiểu lòng con trẻ","Thiên Long book"));
        listGooods.add(new Goods(R.drawable.lanh_dao_gian_don,"Lãnh đạo giản đơn","Thiên Long book"));

        customGoodsAdapter = new CustomGoodsAdapter(this,R.layout.item_list_view,listGooods);
        lvGoods.setAdapter(customGoodsAdapter);
    }
}