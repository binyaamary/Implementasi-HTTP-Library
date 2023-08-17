package com.example.perbanginganapi;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitTextActivity extends AppCompatActivity {

    private ListView listView;
    private AdapterText retrofitAdapter;
    private List<DataTextModel> data = new ArrayList<>();
    ProgressDialog pd;
    long mRequestStartTime = System.currentTimeMillis();
    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_text);
        count = (TextView)findViewById(R.id.rtext);

        String quantity = getIntent().getStringExtra("quantity");
        int q = Integer.parseInt(quantity);

        listView = (ListView) findViewById(R.id.listview);

        pd=new ProgressDialog(this);
        pd.setTitle("Fetch");
        pd.setMessage("Fetching....Please wait");
        pd.show();
        readData(q);
    }

    private void readData(int q){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RetrofitInterface.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitInterface api = retrofit.create(RetrofitInterface.class);

        if(q==100){
            Call<Result> call = api.getString1();
            call.enqueue(new Callback<Result>() {
                @Override
                public void onResponse(Call<Result> call, Response<Result> response) {
                    Log.i("Responsestring", response.body().toString());

                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterText(data, RetrofitTextActivity.this);
                        listView.setAdapter(retrofitAdapter);

                    } else {
                        Log.i("onEmptyResponse", "Returned empty response");
                        Toast.makeText(getApplicationContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                    }
                    long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
                    System.out.println("WAKTUNYA = "+totalRequestTime);

                    String waktu = String.valueOf(totalRequestTime);
                    String c = Integer.toString(data.size());
                    count.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + c);
                }


                @Override
                public void onFailure(Call<Result> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if (q==1000){
            Call<Result> call = api.getString2();
            call.enqueue(new Callback<Result>() {
                @Override
                public void onResponse(Call<Result> call, Response<Result> response) {
                    Log.i("Responsestring", response.body().toString());

                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterText(data, RetrofitTextActivity.this);
                        listView.setAdapter(retrofitAdapter);

                    } else {
                        Log.i("onEmptyResponse", "Returned empty response");
                        Toast.makeText(getApplicationContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                    }
                    long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
                    System.out.println("WAKTUNYA = "+totalRequestTime);

                    String waktu = String.valueOf(totalRequestTime);
                    String c = Integer.toString(data.size());
                    count.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + c);
                }


                @Override
                public void onFailure(Call<Result> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if(q==10000){
            Call<Result> call = api.getString3();
            call.enqueue(new Callback<Result>() {
                @Override
                public void onResponse(Call<Result> call, Response<Result> response) {
                    Log.i("Responsestring", response.body().toString());

                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterText(data, RetrofitTextActivity.this);
                        listView.setAdapter(retrofitAdapter);

                    } else {
                        Log.i("onEmptyResponse", "Returned empty response");
                        Toast.makeText(getApplicationContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                    }
                    long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
                    System.out.println("WAKTUNYA = "+totalRequestTime);

                    String waktu = String.valueOf(totalRequestTime);
                    String c = Integer.toString(data.size());
                    count.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + c);
                }


                @Override
                public void onFailure(Call<Result> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if(q==100000){
            Call<Result> call = api.getString4();
            call.enqueue(new Callback<Result>() {
                @Override
                public void onResponse(Call<Result> call, Response<Result> response) {
                    Log.i("Responsestring", response.body().toString());

                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterText(data, RetrofitTextActivity.this);
                        listView.setAdapter(retrofitAdapter);

                    } else {
                        Log.i("onEmptyResponse", "Returned empty response");
                        Toast.makeText(getApplicationContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                    }
                    long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
                    System.out.println("WAKTUNYA = "+totalRequestTime);

                    String waktu = String.valueOf(totalRequestTime);
                    String c = Integer.toString(data.size());
                    count.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + c);
                }


                @Override
                public void onFailure(Call<Result> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if(q==1000000){
            Call<Result> call = api.getString5();
            call.enqueue(new Callback<Result>() {
                @Override
                public void onResponse(Call<Result> call, Response<Result> response) {
                    Log.i("Responsestring", response.body().toString());

                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterText(data, RetrofitTextActivity.this);
                        listView.setAdapter(retrofitAdapter);

                    } else {
                        Log.i("onEmptyResponse", "Returned empty response");
                        Toast.makeText(getApplicationContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                    }
                    long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
                    System.out.println("WAKTUNYA = "+totalRequestTime);

                    String waktu = String.valueOf(totalRequestTime);
                    String c = Integer.toString(data.size());
                    count.setText("WAKTU EKSEKUSI : "  + waktu + ", JUMLAH DATA : " + c);
                }


                @Override
                public void onFailure(Call<Result> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        }

//        Call<Result> call = api.getString();
//        call.enqueue(new Callback<Result>() {
//            @Override
//            public void onResponse(Call<Result> call, Response<Result> response) {
//                Log.i("Responsestring", response.body().toString());
//
//                if (response.body() != null) {
//                    Log.i("onSuccess", response.body().toString());
//
//                    data = response.body().getResult();
//                    pd.dismiss();
//
//                    retrofitAdapter = new AdapterText(data, RetrofitTextActivity.this);
//                    listView.setAdapter(retrofitAdapter);
//
//                } else {
//                    Log.i("onEmptyResponse", "Returned empty response");
//                    Toast.makeText(getApplicationContext(),"Nothing returned",Toast.LENGTH_LONG).show();
//                }
//                long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
//                System.out.println("WAKTUNYA = "+totalRequestTime);
//            }
//
//
//            @Override
//            public void onFailure(Call<Result> call, Throwable t) {
//                Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
//                Log.e("failure", t.toString());
//            }
//        });
    }

}
