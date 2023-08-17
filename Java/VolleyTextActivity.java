package com.example.perbanginganapi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class VolleyTextActivity extends AppCompatActivity {
    private String URL;
    long mRequestStartTime = System.currentTimeMillis();

    ListView listView;
    List<DataTextModel> dataTextModelList;
    ProgressDialog pd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_text);

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


        listView = (ListView) findViewById(R.id.listview);
        dataTextModelList = new ArrayList<>();

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

                    TextView count = (TextView)findViewById(R.id.vtext);
                    String c = Integer.toString(testArray.length());

                    for (int i = 0; i < testArray.length(); i++) {
                        JSONObject testObject = testArray.getJSONObject(i);
                        DataTextModel textModel = new DataTextModel(testObject.getString("Id"), testObject.getString("Name"),
                                testObject.getString("Sex"), testObject.getString("Event"), testObject.getString("Equipment"),
                                testObject.getString("Age"), testObject.getString("AgeClass"), testObject.getString("Division"),
                                testObject.getString("BodyWeightKg"), testObject.getString("WeightClassKg"), testObject.getString("Squat1Kg"),
                                testObject.getString("Squat2Kg"), testObject.getString("Squat3Kg"), testObject.getString("Squat4Kg"),
                                testObject.getString("Best3SquatKg"), testObject.getString("Bench1Kg"), testObject.getString("Bench2Kg"),
                                testObject.getString("Bench3Kg"), testObject.getString("Bench4Kg"), testObject.getString("Best3BenchKg"),
                                testObject.getString("Deadlift1Kg"), testObject.getString("Deadlift2Kg"), testObject.getString("Deadlift3Kg"),
                                testObject.getString("Deadlift4Kg"), testObject.getString("Best3DeadliftKg"), testObject.getString("TotalKg"),
                                testObject.getString("Place"), testObject.getString("Wilks"),testObject.getString("McCulloch"),
                                testObject.getString("Glossbrenner"), testObject.getString("IPFPoints"), testObject.getString("Tested"),
                                testObject.getString("Country"), testObject.getString("Federation"), testObject.getString("Date"),
                                testObject.getString("MeetCountry"), testObject.getString("MeetState"), testObject.getString("MeetName"));
                        dataTextModelList.add(textModel);
                    }
                    pd.dismiss();

                    AdapterText adapter = new AdapterText(dataTextModelList, getApplicationContext());
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
                if (error.networkResponse == null) {
                    if (error.getClass().equals(TimeoutError.class)) {
                        Toast.makeText(getApplicationContext(),"Oops. Timeout error!", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        //stringRequest.setRetryPolicy(new DefaultRetryPolicy(10, 2, 2));

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        //stringRequest.setTag("powerlifting");
        requestQueue.add(stringRequest);
//        stringRequest.cancel();
//        requestQueue.cancelAll("powerlifting");

    }
}