package com.example.perbanginganapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class AdapterText extends ArrayAdapter<DataTextModel> {
    private List<DataTextModel> data;
    private Context context;

    public AdapterText(List<DataTextModel> data, Context context){
        super(context,R.layout.listview_text, data);
        this.data = data;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        View list = inflater.inflate(R.layout.listview_text, null, true);

        TextView id = list.findViewById(R.id.textId);
        TextView name = list.findViewById(R.id.textName);
        TextView sex = list.findViewById(R.id.textSex);
        TextView event = list.findViewById(R.id.textEvent);
        TextView equipment = list.findViewById(R.id.textEquipment);
        TextView age = list.findViewById(R.id.textAge);
        TextView ageclass = list.findViewById(R.id.textAgeClass);
        TextView division = list.findViewById(R.id.textDivision);
        TextView bodyweight = list.findViewById(R.id.textBodyWeightKg);
        TextView weightclass = list.findViewById(R.id.textWeightClassKg);
        TextView s1 = list.findViewById(R.id.textSquat1Kg);
        TextView s2 = list.findViewById(R.id.textSquat2Kg);
        TextView s3 = list.findViewById(R.id.textSquat3Kg);
        TextView s4 = list.findViewById(R.id.textSquat4Kg);
        TextView best3s = list.findViewById(R.id.textBest3SquatKg);
        TextView b1 = list.findViewById(R.id.textBench1Kg);
        TextView b2 = list.findViewById(R.id.textBench2Kg);
        TextView b3 = list.findViewById(R.id.textBench3Kg);
        TextView b4 = list.findViewById(R.id.textBench4Kg);
        TextView best3b = list.findViewById(R.id.textBest3BenchKg);
        TextView d1 = list.findViewById(R.id.textDeadlift1Kg);
        TextView d2 = list.findViewById(R.id.textDeadlift2Kg);
        TextView d3 = list.findViewById(R.id.textDeadlift3Kg);
        TextView d4 = list.findViewById(R.id.textDeadlift4Kg);
        TextView best3d = list.findViewById(R.id.textBest3DeadliftKg);
        TextView total = list.findViewById(R.id.textTotalKg);
        TextView place = list.findViewById(R.id.textPlace);
        TextView wilks = list.findViewById(R.id.textWilks);
        TextView mcculloch = list.findViewById(R.id.textMcCulloch);
        TextView gloss = list.findViewById(R.id.textGlossbrenner);
        TextView points = list.findViewById(R.id.textIPFPoints);
        TextView tested = list.findViewById(R.id.textTested);
        TextView country = list.findViewById(R.id.textCountry);
        TextView federation = list.findViewById(R.id.textFederation);
        TextView date = list.findViewById(R.id.textDate);
        TextView meetcountry = list.findViewById(R.id.textMeetCountry);
        TextView meetstate = list.findViewById(R.id.textMeetState);
        TextView meetname = list.findViewById(R.id.textMeetName);



        DataTextModel dataTextModel = data.get(position);

        id.setText(dataTextModel.getId());
        name.setText(dataTextModel.getName());
        sex.setText(dataTextModel.getSex());
        event.setText(dataTextModel.getEvent());
        equipment.setText(dataTextModel.getEquipment());
        age.setText(dataTextModel.getAge());
        ageclass.setText(dataTextModel.getAgeClass());
        division.setText(dataTextModel.getDivision());
        bodyweight.setText(dataTextModel.getBodyWeightKg());
        weightclass.setText(dataTextModel.getWeightClassKg());
        s1.setText(dataTextModel.getSquat1Kg());
        s2.setText(dataTextModel.getSquat2Kg());
        s3.setText(dataTextModel.getSquat3Kg());
        s4.setText(dataTextModel.getSquat4Kg());
        best3s.setText(dataTextModel.getBest3SquatKg());
        b1.setText(dataTextModel.getBench1Kg());
        b2.setText(dataTextModel.getBench2Kg());
        b3.setText(dataTextModel.getBench3Kg());
        b4.setText(dataTextModel.getBench4Kg());
        best3b.setText(dataTextModel.getBest3BenchKg());
        d1.setText(dataTextModel.getDeadlift1Kg());
        d2.setText(dataTextModel.getDeadlift2Kg());
        d3.setText(dataTextModel.getDeadlift3Kg());
        d4.setText(dataTextModel.getDeadlift4Kg());
        best3d.setText(dataTextModel.getBest3DeadliftKg());
        total.setText(dataTextModel.getTotalKg());
        place.setText(dataTextModel.getPlace());
        wilks.setText(dataTextModel.getWilks());
        mcculloch.setText(dataTextModel.getMcCulloch());
        gloss.setText(dataTextModel.getGlossbrenner());
        points.setText(dataTextModel.getIPFPoints());
        tested.setText(dataTextModel.getTested());
        country.setText(dataTextModel.getCountry());
        federation.setText(dataTextModel.getFederation());
        date.setText(dataTextModel.getDate());
        meetcountry.setText(dataTextModel.getMeetCountry());
        meetstate.setText(dataTextModel.getMeetState());
        meetname.setText(dataTextModel.getMeetName());

        return list;

    }
}
