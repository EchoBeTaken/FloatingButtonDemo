package com.example.floatingbuttondemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton mFabCallPolice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFabCallPolice = findViewById(R.id.fab_call_police);
        mFabCallPolice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_call_police:
                Toast.makeText(this, "点击了按钮", Toast.LENGTH_SHORT).show();

                //https://blog.csdn.net/qq_35698774/article/details/79779238
                final String[] items3 = new String[]{"拨打110", "拨打派出所值班室电话"};//创建item
                AlertDialog alertDialog3 = new AlertDialog.Builder(this)
                        .setTitle("选择您需要拨打的电话")
                        .setIcon(R.mipmap.ivr)
                        .setItems(items3, new DialogInterface.OnClickListener() {//添加列表
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "点的是：" + items3[i], Toast.LENGTH_SHORT).show();
                            }
                        })
                        .create();
                alertDialog3.show();
                break;
            default:

                break;
        }
    }
}
