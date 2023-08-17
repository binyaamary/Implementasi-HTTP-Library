package com.example.perbanginganapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class VolleyImageActivity extends AppCompatActivity {

    private String URL;
    ListView listView;
    List<DataImageModel> dataImageModels;
    ProgressDialog pd;
    long mRequestStartTime = System.currentTimeMillis();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_image);

        RequestQueue requestQueue;
        // Instantiate the cache
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap
        // Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());
        // Instantiate the RequestQueue with the cache and network.
        requestQueue = new RequestQueue(cache, network);
        // Start the queue
        requestQueue.start();

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

        listView = (ListView) findViewById(R.id.listview);
        dataImageModels = new ArrayList<>();

        pd=new ProgressDialog(this);
        pd.setTitle("Fetch");
        pd.setMessage("Fetching....Please wait");
        pd.show();

        readData();
    }

    private void readData(){

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj = new JSONObject(response);
                    JSONArray testArray = obj.getJSONArray("result");

                    TextView count = (TextView)findViewById(R.id.vimage);
                    String c = Integer.toString(testArray.length());

                    for (int i = 0; i < testArray.length(); i++) {
                        JSONObject testObject = testArray.getJSONObject(i);
                        DataImageModel textModel = new DataImageModel(testObject.getString("nama_gambar"), testObject.getString("link_gambar"));
                        dataImageModels.add(textModel);
                    }
                    pd.dismiss();

                    AdapterImage adapter = new AdapterImage(dataImageModels, getApplicationContext());
                    listView.setAdapter(adapter);

                    long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
                    System.out.println("WAKTUNYA = "+totalRequestTime);
                    String waktu = String.valueOf(totalRequestTime);
                    count.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + c);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }



}
