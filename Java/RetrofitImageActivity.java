package com.example.perbanginganapi;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitImageActivity extends AppCompatActivity {
    private ListView listView;
    private AdapterImage retrofitAdapter;
    private List<DataImageModel> data = new ArrayList<>();
    ProgressDialog pd;
    long mRequestStartTime = System.currentTimeMillis();
    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_image);

        count = (TextView)findViewById(R.id.rimage);

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

        if(q==10){
            Call<Result2> call = api.getImage1();
            call.enqueue(new Callback<Result2>() {
                @Override
                public void onResponse(Call<Result2> call, Response<Result2> response) {
                    Log.i("Responsestring", response.body().toString());
                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterImage( data, RetrofitImageActivity.this);
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
                public void onFailure(Call<Result2> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if (q==50){
            Call<Result2> call = api.getImage2();
            call.enqueue(new Callback<Result2>() {
                @Override
                public void onResponse(Call<Result2> call, Response<Result2> response) {
                    Log.i("Responsestring", response.body().toString());
                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterImage( data, RetrofitImageActivity.this);
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
                public void onFailure(Call<Result2> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if(q==100){
            Call<Result2> call = api.getImage3();
            call.enqueue(new Callback<Result2>() {
                @Override
                public void onResponse(Call<Result2> call, Response<Result2> response) {
                    Log.i("Responsestring", response.body().toString());
                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterImage( data, RetrofitImageActivity.this);
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
                public void onFailure(Call<Result2> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if(q==150){
            Call<Result2> call = api.getImage4();
            call.enqueue(new Callback<Result2>() {
                @Override
                public void onResponse(Call<Result2> call, Response<Result2> response) {
                    Log.i("Responsestring", response.body().toString());
                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterImage( data, RetrofitImageActivity.this);
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
                public void onFailure(Call<Result2> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        } else if(q==200){
            Call<Result2> call = api.getImage5();
            call.enqueue(new Callback<Result2>() {
                @Override
                public void onResponse(Call<Result2> call, Response<Result2> response) {
                    Log.i("Responsestring", response.body().toString());
                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        data = response.body().getResult();
                        pd.dismiss();

                        retrofitAdapter = new AdapterImage( data, RetrofitImageActivity.this);
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
                public void onFailure(Call<Result2> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
                    Log.e("failure", t.toString());
                }
            });
        }

//        Call<Result2> call = api.getImage();
//        call.enqueue(new Callback<Result2>() {
//            @Override
//            public void onResponse(Call<Result2> call, Response<Result2> response) {
//                Log.i("Responsestring", response.body().toString());
//                if (response.body() != null) {
//                    Log.i("onSuccess", response.body().toString());
//
//                    data = response.body().getResult();
//                    pd.dismiss();
//
//                    retrofitAdapter = new AdapterImage( data, RetrofitImageActivity.this);
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
//            @Override
//            public void onFailure(Call<Result2> call, Throwable t) {
//                Toast.makeText(getApplicationContext(),"GETDATA-Koneksi bermasalah saat pengambilan data", Toast.LENGTH_LONG).show();
//                Log.e("failure", t.toString());
//            }
//        });
    }

}
