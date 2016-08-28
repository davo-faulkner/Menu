package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView menuItem1 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1String = menuItem1.getText().toString();
        Log.i("MainActivity", menuItem1String);

        // Find second menu item TextView and print the text to the logs
        TextView menuItem2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2String = menuItem2.getText().toString();
        Log.i("MainActivity", menuItem2String);

        // Find third menu item TextView and print the text to the logs
        TextView menuItem3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3String = menuItem3.getText().toString();
        Log.i("MainActivity", menuItem3String);

    }
}