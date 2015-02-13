package com.qci.ndksample2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2 extends ActionBarActivity {

    static {
        System.loadLibrary("mylib2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        TextView tv = (TextView)findViewById(R.id.my_textview2);
        tv.setText(getStringFromJNI2());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_main:
                Intent mainActivity = new Intent(this,MainActivity.class);
                startActivity(mainActivity);
                break;
            case R.id.action_main2:
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }


    public native String getStringFromJNI2();
}
