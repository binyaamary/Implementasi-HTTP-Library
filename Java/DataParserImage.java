package com.example.perbanginganapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DataParserImage extends AsyncTask<Void,Void,Integer> {
    Context c;
    ListView lv;
    String jsonData;
    long mRequestStartTime = System.currentTimeMillis();
    String waktu;
    String jumlah;

    List<DataImageModel> dataImageModel;

    public DataParserImage(Context c, ListView lv, String jsonData, long mRequestStartTime) {
        this.c = c;
        this.lv = lv;
        this.jsonData = jsonData;
        this.mRequestStartTime = mRequestStartTime;
        dataImageModel = new ArrayList<>();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Integer doInBackground(Void... params) {
        return this.parseData();
    }

    @Override
    protected void onPostExecute(Integer result) {
        super.onPostExecute(result);

        AdapterImage adapter = new AdapterImage(dataImageModel, c);
        lv.setAdapter(adapter);
        long totalRequestTime = System.currentTimeMillis() - mRequestStartTime;
        System.out.println("WAKTUNYA = "+totalRequestTime);

        waktu = String.valueOf(totalRequestTime);
        HttpImageActivity.getInstance().setTextHTTP(waktu,jumlah);

    }

    private int parseData() {
        try {
            JSONObject obj = new JSONObject(jsonData);
            JSONArray testArray = obj.getJSONArray("result");
            jumlah = Integer.toString(testArray.length());

            for (int i = 0; i < testArray.length(); i++) {
                JSONObject testObject = testArray.getJSONObject(i);
                DataImageModel textModel = new DataImageModel(testObject.getString("nama_gambar"), testObject.getString("link_gambar"));
                dataImageModel.add(textModel);
            }
            return 1;


        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
