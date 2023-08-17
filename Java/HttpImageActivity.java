package com.example.perbanginganapi;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class HttpImageActivity extends AppCompatActivity {
    private static HttpImageActivity instance;
    private String URL;
    ListView listview;
    TextView str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_image);
        str = (TextView)findViewById(R.id.himage);
        instance = this;

        String quantity = getIntent().getStringExtra("quantity");
        int q = Integer.parseInt(quantity);
        if(q==10){
            URL = "https://skripsi-binya.my.id/skripsi/loadimage10.php";
        }else if(q==50){
            URL = "https://skripsi-binya.my.id/skripsi/loadimage50.php";
        }else if(q==100){
            URL = "https://skripsi-binya.my.id/skripsi/loadimage100.php";
        }else if(q==150){
            URL = "https://skripsi-binya.my.id/skripsi/loadimage150.php";
        }else if(q==200){
            URL = "https://skripsi-binya.my.id/skripsi/loadimage200.php";
        }

        listview = (ListView) findViewById(R.id.listview);

        DownloaderImage d=new DownloaderImage(HttpImageActivity.this,URL,listview);
        d.execute();
    }

    public static HttpImageActivity getInstance(){
        return instance;
    }

    public void setTextHTTP(String waktu, String data){
        str.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + data);
    }

}
