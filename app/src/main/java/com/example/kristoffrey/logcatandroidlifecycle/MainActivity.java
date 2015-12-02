package com.example.kristoffrey.logcatandroidlifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("logme", "Called onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        Log.d("logme", "Called onStart()");
        super.onStart();
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        Log.d("logme", "Called onResume()");
        super.onResume();
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onPause(){
        Log.d("logme", "Called onPause()");
        super.onPause();
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        Log.d("logme", "Called onSaveInstanceState()");
        super.onSaveInstanceState(saveInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStop(){
        Log.d("logme", "Called onStop()");
        super.onStop();
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onRestart(){
        Log.d("logme", "Called onRestart()");
        super.onRestart();
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onDestroy(){
        Log.d("logme", "Called onDestroy()");
        super.onDestroy();
        setContentView(R.layout.activity_main);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
