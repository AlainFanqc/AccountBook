package com.example.accountbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.accountbook.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取下拉框控件
        Spinner spinner =findViewById(R.id.monthspinner);
        spinner.toString();

        TextView totlacost = findViewById(R.id.totalcost);//本月总支出
        //今天
        TextView latest = findViewById(R.id.latest);//最新一笔
        TextView tdcost = findViewById(R.id.tdcost);//今日支出
        TextView tdincome = findViewById(R.id.tdincome);//今日收入
        //本周
        TextView week = findViewById(R.id.week);//本周日期
        TextView weekcost = findViewById(R.id.weekcost);
        TextView weekincome = findViewById(R.id.weekincome);
        //本月
        TextView month = findViewById(R.id.month);
        TextView monthcost = findViewById(R.id.monthcost);
        TextView monthincome = findViewById(R.id.monthincome);
        //本年
        TextView year = findViewById(R.id.year);
        TextView yearcost = findViewById(R.id.yearcost);
        TextView yearincome = findViewById(R.id.year);


    }
}