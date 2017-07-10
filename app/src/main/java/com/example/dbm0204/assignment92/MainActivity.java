package com.example.dbm0204.assignment92;

import android.app.PendingIntent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Movie> listmodel= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView_Movie);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.loadmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemid = item.getItemId();
        switch (itemid) {
            case R.id.load_menu:
                new MyAsyncTask().execute("http://api.themoviedb.org/3/tv/top_rated?api_key=8496be0b2149805afa458ab8ec27560c");
                break;
        }

        return super.onOptionsItemSelected(item);
    }
    class MyAsyncTask extends AsyncTask<String,Void,List<Movie>>
    {
        @Override
        protected void onPreExecute(){
            //checking status of connection
            SupplicantState supState;
            WifiManager wifiManager = (WifiManager) getSystemService(MainActivity.this.WIFI_SERVICE);
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            Toast.makeText(MainActivity.this, "Status:"+wifiInfo, Toast.LENGTH_SHORT).show();
            supState = wifiInfo.getSupplicantState();
            Toast.makeText(MainActivity.this, "Status:"+supState, Toast.LENGTH_SHORT).show();
            ConnectivityManager connectivityManager=(ConnectivityManager)getSystemService(MainActivity.this.CONNECTIVITY_SERVICE);
            NetworkInfo activenetwork=connectivityManager.getActiveNetworkInfo();
            if(activenetwork!=null && activenetwork.isConnected()==true )
            {
                Toast.makeText(MainActivity.this, "connected", Toast.LENGTH_SHORT).show();
            }else
            {
                Toast.makeText(MainActivity.this, "Connect to internet", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        protected List<Movie> doInBackground(String ... strings){
            //TODO:Implement logic to parse the JSON Object

        return null;

    }
    }
}
