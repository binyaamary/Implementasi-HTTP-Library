package com.example.perbanginganapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DataParser extends AsyncTask<Void,Void,Integer> {
    Context c;
    ListView lv;
    String jsonData;
    long m;
    String waktu;
    String jumlah;

    List<DataTextModel> dataTextModel;


    public DataParser(Context c, ListView lv, String jsonData, long m) {
        this.c = c;
        this.lv = lv;
        this.jsonData = jsonData;
        this.m = m;
        dataTextModel = new ArrayList<>();
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

        AdapterText adapter=new AdapterText(dataTextModel, c);
        lv.setAdapter(adapter);

        long totalRequestTime = System.currentTimeMillis() - m;
        System.out.println("WAKTUNYA = "+totalRequestTime);

        waktu = String.valueOf(totalRequestTime);
        HttpTextActivity.getInstance().setTextHTTP(waktu,jumlah);

    }

    private int parseData() {
        try {
            JSONObject obj = new JSONObject(jsonData);
            JSONArray testArray = obj.getJSONArray("result");
            jumlah = Integer.toString(testArray.length());

            dataTextModel.clear();
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
                dataTextModel.add(textModel);
            }
            return 1;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
