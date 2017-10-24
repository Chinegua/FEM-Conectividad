package com.example.chinegua.fem_conexion;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        if(hayConexion() == true){


            Toast toast = Toast.makeText(context, "Hay conexión", duration);
            toast.show();
        }
        else{
            Toast toast = Toast.makeText(context, "No Hay conexion", duration);
            toast.show();
        }
        setContentView(R.layout.activity_main);
    }

    public boolean hayConexion() {
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = conMgr.getActiveNetworkInfo();

        return (networkInfo != null && networkInfo.isConnected());
    }
}
