package com.example.perbanginganapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface RetrofitInterface {

    String URL = "https://skripsi-binya.my.id/skripsi/";

    @Headers("Cache-Control: max-age=640000")

    @GET("read.php")
    Call<Result> getString();

    @GET("read100.php")
    Call<Result> getString1();

    @GET("read1000.php")
    Call<Result> getString2();

    @GET("read10000.php")
    Call<Result> getString3();

    @GET("read100000.php")
    Call<Result> getString4();

    @GET("read1000000.php")
    Call<Result> getString5();

    @GET("loadimage.php")
    Call<Result2> getImage();

    @GET("loadimage10.php")
    Call<Result2> getImage1();

    @GET("loadimage50.php")
    Call<Result2> getImage2();

    @GET("loadimage100.php")
    Call<Result2> getImage3();

    @GET("loadimage150.php")
    Call<Result2> getImage4();

    @GET("loadimage200.php")
    Call<Result2> getImage5();

}