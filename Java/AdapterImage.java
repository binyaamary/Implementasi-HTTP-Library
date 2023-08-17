package com.example.perbanginganapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterImage extends ArrayAdapter<DataImageModel> {
    private List<DataImageModel> data;
    private Context context;

    public AdapterImage(List<DataImageModel> data, Context context){
        super(context,R.layout.listview_image, data);
        this.data = data;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        View list = inflater.inflate(R.layout.listview_image, null, true);

        //TextView nama = list.findViewById(R.id.nama_gambar);
        ImageView link = list.findViewById(R.id.link_gambar);

        DataImageModel dataImageModel = data.get(position);

        //nama.setText(dataImageModel.getNama());
        //nama.setText(dataImageModel.getLink());
        String imgurl = data.get(position).link_gambar;
        if (!imgurl.equals("")){
            Picasso.get().load(imgurl).into(link);
        }else{
            System.out.println("Linknya ga kebaca");
        }

        return list;

    }
}
