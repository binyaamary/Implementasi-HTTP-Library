package com.example.perbanginganapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ResponseCache;
import java.net.URL;
import java.util.concurrent.TimeoutException;

public class Downloader extends AsyncTask<Void,Void,String> {
    long mRequestStartTime = System.currentTimeMillis();
    Context c;
    String urlAddress;
    ListView lv;

    ProgressDialog pd;

    public Downloader(Context c, String urlAddress, ListView lv) {
        this.c = c;
        this.urlAddress = urlAddress;
        this.lv = lv;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        pd=new ProgressDialog(c);
        pd.setTitle("Fetch");
        pd.setMessage("Fetching....Please wait");
        pd.show();
    }

    @Override
    protected String doInBackground(Void... params) {
        String data = downloadData();
        return data;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        pd.dismiss();

        if(s==null){
            Toast.makeText(c,"Unsuccessfull,Null returned",Toast.LENGTH_SHORT).show();
        }else if(s=="timeout"){
            Toast.makeText(c,"Oops. Timeout error!",Toast.LENGTH_SHORT).show();
        }else{
            //CALL DATA PARSER TO PARSE
            DataParser parser=new DataParser(c,lv,s,mRequestStartTime);
            parser.execute();
        }

    }

    private String downloadData() {
        InputStream is=null;
        String line =null;
        try {
            URL url=new URL(urlAddress); // ciptakan objek URL
            // buka koneksi dengan url.openConnection(),
            // hasil berupa HttpURLConnection
            HttpURLConnection con= (HttpURLConnection) url.openConnection();
            // ciptakan input stream
            con.setRequestMethod("GET");
            con.setUseCaches(true);
            //.setDefault(ResponseCache);
            con.setConnectTimeout(5000);
            con.setReadTimeout(20000);

            is = new BufferedInputStream(con.getInputStream());
            // ciptakan objek buffer reader berdasar input stream
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            if(br != null) {
                // menghasilkan (membaca) baris teks yg ada pada BufferReader
                while ((line = br.readLine()) != null) {
                    sb.append(line+"\n");
                    System.out.println("linenya = "+line); // hanya sbg test
                }
            }else {
                return null;
            }

//            con.getResponseCode();
//            switch (con.getResponseCode()) {
//                case HttpURLConnection.HTTP_CLIENT_TIMEOUT:
//                    String code = "timeout";
//                    return code;
//                default:
//                    Toast.makeText(c,"Uknknown Error!",Toast.LENGTH_SHORT).show();
//                    break; // abort
//            }
            return sb.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
