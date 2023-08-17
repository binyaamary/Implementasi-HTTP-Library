package com.example.perbanginganapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HttpAdapter extends BaseAdapter {

    Context context;
    List<DataTextModel> dataTextModels;
    LayoutInflater inflater;

    public HttpAdapter(Context context, List<DataTextModel> dataTextModels) {
        this.context = context;
        this.dataTextModels = dataTextModels;

        //INITIALIE
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataTextModels.size();
    }

    @Override
    public Object getItem(int position) {
        return dataTextModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.listview_text,null);
        }

        TextView id = convertView.findViewById(R.id.textId);
        TextView name = convertView.findViewById(R.id.textName);
        TextView sex = convertView.findViewById(R.id.textSex);
        TextView event = convertView.findViewById(R.id.textEvent);
        TextView equipment = convertView.findViewById(R.id.textEquipment);
        TextView age = convertView.findViewById(R.id.textAge);
        TextView ageclass = convertView.findViewById(R.id.textAgeClass);
        TextView division = convertView.findViewById(R.id.textDivision);
        TextView bodyweight = convertView.findViewById(R.id.textBodyWeightKg);
        TextView weightclass = convertView.findViewById(R.id.textWeightClassKg);
        TextView s1 = convertView.findViewById(R.id.textSquat1Kg);
        TextView s2 = convertView.findViewById(R.id.textSquat2Kg);
        TextView s3 = convertView.findViewById(R.id.textSquat3Kg);
        TextView s4 = convertView.findViewById(R.id.textSquat4Kg);
        TextView best3s = convertView.findViewById(R.id.textBest3SquatKg);
        TextView b1 = convertView.findViewById(R.id.textBench1Kg);
        TextView b2 = convertView.findViewById(R.id.textBench2Kg);
        TextView b3 = convertView.findViewById(R.id.textBench3Kg);
        TextView b4 = convertView.findViewById(R.id.textBench4Kg);
        TextView best3b = convertView.findViewById(R.id.textBest3BenchKg);
        TextView d1 = convertView.findViewById(R.id.textDeadlift1Kg);
        TextView d2 = convertView.findViewById(R.id.textDeadlift2Kg);
        TextView d3 = convertView.findViewById(R.id.textDeadlift3Kg);
        TextView d4 = convertView.findViewById(R.id.textDeadlift4Kg);
        TextView best3d = convertView.findViewById(R.id.textBest3DeadliftKg);
        TextView total = convertView.findViewById(R.id.textTotalKg);
        TextView place = convertView.findViewById(R.id.textPlace);
        TextView wilks = convertView.findViewById(R.id.textWilks);
        TextView mcculloch = convertView.findViewById(R.id.textMcCulloch);
        TextView gloss = convertView.findViewById(R.id.textGlossbrenner);
        TextView points = convertView.findViewById(R.id.textIPFPoints);
        TextView tested = convertView.findViewById(R.id.textTested);
        TextView country = convertView.findViewById(R.id.textCountry);
        TextView federation = convertView.findViewById(R.id.textFederation);
        TextView date = convertView.findViewById(R.id.textDate);
        TextView meetcountry = convertView.findViewById(R.id.textMeetCountry);
        TextView meetstate = convertView.findViewById(R.id.textMeetState);
        TextView meetname = convertView.findViewById(R.id.textMeetName);


        id.setText(dataTextModels.get(position).getId());
        name.setText(dataTextModels.get(position).getName());
        sex.setText(dataTextModels.get(position).getSex());
        event.setText(dataTextModels.get(position).getEvent());
        equipment.setText(dataTextModels.get(position).getEquipment());
        age.setText(dataTextModels.get(position).getAge());
        ageclass.setText(dataTextModels.get(position).getAgeClass());
        division.setText(dataTextModels.get(position).getDivision());
        bodyweight.setText(dataTextModels.get(position).getBodyWeightKg());
        weightclass.setText(dataTextModels.get(position).getWeightClassKg());
        s1.setText(dataTextModels.get(position).getSquat1Kg());
        s2.setText(dataTextModels.get(position).getSquat2Kg());
        s3.setText(dataTextModels.get(position).getSquat3Kg());
        s4.setText(dataTextModels.get(position).getSquat4Kg());
        best3s.setText(dataTextModels.get(position).getBest3SquatKg());
        b1.setText(dataTextModels.get(position).getBench1Kg());
        b2.setText(dataTextModels.get(position).getBench2Kg());
        b3.setText(dataTextModels.get(position).getBench3Kg());
        b4.setText(dataTextModels.get(position).getBest3BenchKg());
        d1.setText(dataTextModels.get(position).getDeadlift1Kg());
        d2.setText(dataTextModels.get(position).getDeadlift2Kg());
        d3.setText(dataTextModels.get(position).getDeadlift3Kg());
        d4.setText(dataTextModels.get(position).getDeadlift4Kg());
        best3d.setText(dataTextModels.get(position).getBest3DeadliftKg());
        total.setText(dataTextModels.get(position).getTotalKg());
        place.setText(dataTextModels.get(position).getPlace());
        wilks.setText(dataTextModels.get(position).getWilks());
        mcculloch.setText(dataTextModels.get(position).getMcCulloch());
        gloss.setText(dataTextModels.get(position).getGlossbrenner());
        points.setText(dataTextModels.get(position).getIPFPoints());
        tested.setText(dataTextModels.get(position).getTested());
        country.setText(dataTextModels.get(position).getCountry());
        federation.setText(dataTextModels.get(position).getFederation());
        date.setText(dataTextModels.get(position).getDate());
        meetcountry.setText(dataTextModels.get(position).getMeetCountry());
        meetstate.setText(dataTextModels.get(position).getMeetState());
        meetname.setText(dataTextModels.get(position).getMeetName());

        //ITEM CLICKS
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,dataTextModels.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
