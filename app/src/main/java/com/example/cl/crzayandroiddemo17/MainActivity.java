package com.example.cl.crzayandroiddemo17;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = (ListView) findViewById(R.id.myist);

        BaseAdapter adapter = new BaseAdapter() {
            //返回控制该Adapter将会包含多个列表项
            @Override
            public int getCount() {
                //指定一共包含40个选项
                return 40; }

            //返回决定第position处的列表内容
            @Override
            public Object getItem(int position) {
                return null;
            }

            //重写该方法，该方法的返回值将作为列表项的ID
            //返回决定第position出的列表项的ID
            @Override
            public long getItemId(int position) {
                return position;
            }

            //重写该方法，该方法返回的View将作为列表框
//返回决定第position出的列表组件
            @Override
            public View getView(int position, View convertView,
                                ViewGroup parent) {
                //创建一个LinearLayout，并向其中添加两个组件
                LinearLayout line = new LinearLayout(MainActivity.this);
                line.setOrientation(LinearLayout.HORIZONTAL);
                ImageView image = new ImageView(MainActivity.this);
                image.setImageResource(R.drawable.ic_launcher);
                TextView text = new TextView(MainActivity.this);
                text.setText("第" + (position + 1) + "个列表");
                text.setTextSize(20);
                text.setTextColor(Color.RED);
                line.addView(image);
                line.addView(text);
                //返回LinearLayout实例
                return line;
            }
        };
        mylist.setAdapter(adapter);
    }
}
