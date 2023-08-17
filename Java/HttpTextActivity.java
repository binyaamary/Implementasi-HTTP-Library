package com.example.perbanginganapi;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class HttpTextActivity extends AppCompatActivity {
    private static HttpTextActivity instance;
    private String URL;
    ListView listview;
    TextView str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_text);
        str = (TextView)findViewById(R.id.htext);
        instance = this;

        String quantity = getIntent().getStringExtra("quantity");
        int q = Integer.parseInt(quantity);
        if(q==100){
            URL = "https://skripsi-binya.my.id/skripsi/read100.php";
        }else if(q==1000){
            URL = "https://skripsi-binya.my.id/skripsi/read1000.php";
        }else if(q==10000){
            URL = "https://skripsi-binya.my.id/skripsi/read10000.php";
        }else if(q==100000){
            URL = "https://skripsi-binya.my.id/skripsi/read100000.php";
        }else if(q==1000000){
            URL = "https://skripsi-binya.my.id/skripsi/read1000000.php";
        }

        listview = (ListView) findViewById(R.id.listview);

        Downloader d=new Downloader(HttpTextActivity.this,URL,listview);
        d.execute();
    }

    public static HttpTextActivity getInstance(){
        return instance;
    }

    public void setTextHTTP(String waktu, String data){
        str.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + data);
    }

}
