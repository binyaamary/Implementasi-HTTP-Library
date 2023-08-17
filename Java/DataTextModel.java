package com.example.perbanginganapi;

public class DataTextModel {
    String Id;
    String Name;
    String Sex;
    String Event;
    String Equipment;
    String Age;
    String AgeClass;
    String Division;
    String BodyWeightKg;
    String WeightClassKg;
    String Squat1Kg;
    String Squat2Kg;
    String Squat3Kg;
    String Squat4Kg;
    String Best3SquatKg;
    String Bench1Kg;
    String Bench2Kg;
    String Bench3Kg;
    String Bench4Kg;
    String Best3BenchKg;
    String Deadlift1Kg;
    String Deadlift2Kg;
    String Deadlift3Kg;
    String Deadlift4Kg;
    String Best3DeadliftKg;
    String TotalKg;
    String Place;
    String Wilks;
    String McCulloch;
    String Glossbrenner;
    String IPFPoints;
    String Tested;
    String Country;
    String Federation;
    String Date;
    String MeetCountry;
    String MeetState;
    String MeetName;

    public DataTextModel (String Id, String Sex, String Name, String Event, String Equipment, String Age,
                                 String AgeClass, String Division, String BodyWeightKg, String WeightClassKg,
                                 String Squat1Kg, String Squat2Kg, String Squat3Kg, String Squat4Kg,
                                 String Best3SquatKg, String Bench1Kg, String Bench2Kg, String Bench3Kg,
                                 String Bench4Kg, String Best3BenchKg, String Deadlift1Kg,String Deadlift2Kg,
                                 String Deadlift3Kg, String Deadlift4Kg, String Best3DeadliftKg,String TotalKg,
                                 String Place, String Wilks, String McCulloch, String Glossbrenner,
                                 String IPFPoints, String Tested, String Country, String Federation,
                                 String Date, String MeetCountry, String MeetState, String MeetName){
        this.Id = Id;
        this.Name = Name;
        this.Sex = Sex;
        this.Event = Event;
        this.Equipment = Equipment;
        this.Age = Age;
        this.AgeClass = AgeClass;
        this.Division = Division;
        this.BodyWeightKg = BodyWeightKg;
        this.WeightClassKg = WeightClassKg;
        this.Squat1Kg = Squat1Kg;
        this.Squat2Kg = Squat2Kg;
        this.Squat3Kg = Squat3Kg;
        this.Squat4Kg = Squat4Kg;
        this.Best3SquatKg = Best3SquatKg;
        this.Bench1Kg = Bench1Kg;
        this.Bench2Kg = Bench2Kg;
        this.Bench3Kg = Bench3Kg;
        this.Bench4Kg = Bench4Kg;
        this.Best3BenchKg = Best3BenchKg;
        this.Deadlift1Kg = Deadlift1Kg;
        this.Deadlift2Kg = Deadlift2Kg;
        this.Deadlift3Kg = Deadlift3Kg;
        this.Deadlift4Kg = Deadlift4Kg;
        this.Best3DeadliftKg = Best3DeadliftKg;
        this.TotalKg = TotalKg;
        this.Place = Place;
        this.Wilks = Wilks;
        this.McCulloch = McCulloch;
        this.Glossbrenner = Glossbrenner;
        this.IPFPoints = IPFPoints;
        this.Tested = Tested;
        this.Country = Country;
        this.Federation = Federation;
        this.Date = Date;
        this.MeetCountry = MeetCountry;
        this.MeetState = MeetState;
        this.MeetName = MeetName;
    }

//    public String toString(){
//        String model = getId()+getName()+getSex()+getEvent()+getEquipment()+getAge()+getAgeClass()+
//                getDivision()+getBodyWeightKg()+getWeightClassKg()+getSquat1Kg()+getSquat2Kg()+getSquat3Kg()
//                +getSquat4Kg()+getBest3SquatKg()+getBench1Kg()+getBench2Kg()+getBench3Kg()+getBench4Kg()
//                +getBest3BenchKg()+getDeadlift1Kg()+getDeadlift2Kg()+getDeadlift3Kg()+getDeadlift4Kg()
//                +getBest3DeadliftKg()+getTotalKg()+getPlace()+getWilks()+getMcCulloch()+getGlossbrenner()
//                +getIPFPoints()+getTested()+getCountry()+getFederation()+getDate()+getMeetCountry()+
//                getMeetState()+getMeetName();
//        return model;
//    }

    public String getId() {
        return Id;
    }

    public void setiId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setiName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String Event) {
        this.Event = Event;
    }

    public String getEquipment() {
        return Equipment;
    }

    public void setEquipment(String Equipment) {
        this.Equipment = Equipment;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getAgeClass() {
        return AgeClass;
    }

    public void setAgeClass(String AgeClass) {
        this.AgeClass = AgeClass;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String Division) {
        this.Division = Division;
    }

    public String getBodyWeightKg() {
        return BodyWeightKg;
    }

    public void setBodyWeightKg(String BodyWeightKg) {
        this.BodyWeightKg = BodyWeightKg;
    }

    public String getWeightClassKg() {
        return WeightClassKg;
    }

    public void setWeightClassKg(String WeightClassKg) {
        this.WeightClassKg = WeightClassKg;
    }

    public String getSquat1Kg() {
        return Squat1Kg;
    }

    public void setSquat1Kg(String Squat1Kg) {
        this.Squat1Kg = Squat1Kg;
    }

    public String getSquat2Kg() {
        return Squat2Kg;
    }

    public void setSquat2Kg(String Squat2Kg) {
        this.Squat2Kg = Squat2Kg;
    }

    public String getSquat3Kg() {
        return Squat3Kg;
    }

    public void setSquat3Kg(String Squat3Kg) {
        this.Squat3Kg = Squat3Kg;
    }

    public String getSquat4Kg() {
        return Squat4Kg;
    }

    public void setSquat4Kg(String Squat4Kg) {
        this.Squat4Kg = Squat4Kg;
    }

    public String getBest3SquatKg() {
        return Best3SquatKg;
    }

    public void setBest3SquatKg(String Best3SquatKg) {
        this.Best3SquatKg = Best3SquatKg;
    }

    public String getBench1Kg() {
        return Bench1Kg;
    }

    public void setBench1Kg(String Bench1Kg) {
        this.Bench1Kg = Bench1Kg;
    }

    public String getBench2Kg() {
        return Bench2Kg;
    }

    public void setBench2Kg(String Bench2Kg) {
        this.Bench2Kg = Bench2Kg;
    }

    public String getBench3Kg() {
        return Bench3Kg;
    }

    public void setBench3Kg(String Bench3Kg) {
        this.Bench3Kg = Bench3Kg;
    }

    public String getBench4Kg() {
        return Bench4Kg;
    }

    public void setBench4Kg(String Bench4Kg) {
        this.Bench4Kg = Bench4Kg;
    }

    public String getBest3BenchKg() {
        return Best3BenchKg;
    }

    public void setBest3BenchKg(String Best3BenchKg) {
        this.Best3BenchKg = Best3BenchKg;
    }

    public String getDeadlift1Kg() {
        return Deadlift1Kg;
    }

    public void setDeadlift1Kg(String Deadlift1Kg) {
        this.Deadlift1Kg = Deadlift1Kg;
    }

    public String getDeadlift2Kg() {
        return Deadlift2Kg;
    }

    public void setDeadlift2Kg(String Deadlift2Kg) {
        this.Deadlift2Kg = Deadlift2Kg;
    }

    public String getDeadlift3Kg() {
        return Deadlift3Kg;
    }

    public void setDeadlift3Kg(String Deadlift3Kg) {
        this.Deadlift3Kg = Deadlift3Kg;
    }

    public String getDeadlift4Kg() {
        return Deadlift4Kg;
    }

    public void setDeadlift4Kg(String Deadlift4Kg) {
        this.Deadlift4Kg = Deadlift4Kg;
    }

    public String getBest3DeadliftKg() {
        return Best3DeadliftKg;
    }

    public void setBest3DeadliftKg(String Best3DeadliftKg) {
        this.Best3DeadliftKg = Best3DeadliftKg;
    }

    public String getTotalKg() {
        return TotalKg;
    }

    public void setTotalKg(String TotalKg) {
        this.TotalKg = TotalKg;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public String getWilks() {
        return Wilks;
    }

    public void setWilks(String Wilks) {
        this.Wilks = Wilks;
    }

    public String getMcCulloch() {
        return McCulloch;
    }

    public void setMcCulloch(String McCulloch) {
        this.McCulloch = McCulloch;
    }

    public String getGlossbrenner() {
        return Glossbrenner;
    }

    public void setGlossbrenner(String Glossbrenner) {
        this.Glossbrenner = Glossbrenner;
    }

    public String getIPFPoints() {
        return IPFPoints;
    }

    public void setIPFPoints(String IPFPoints) {
        this.IPFPoints = IPFPoints;
    }

    public String getTested() {
        return Tested;
    }

    public void setTested(String Tested) {
        this.Tested = Tested;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getFederation() {
        return Federation;
    }

    public void setFederation(String Federation) {
        this.Federation = Federation;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getMeetCountry() {
        return MeetCountry;
    }

    public void setMeetCountry(String MeetCountry) {
        this.MeetCountry = MeetCountry;
    }

    public String getMeetState() {
        return MeetState;
    }

    public void setMeetState(String MeetState) {
        this.MeetState = MeetState;
    }

    public String getMeetName() {
        return MeetName;
    }

    public void setMeetName(String MeetName) {
        this.MeetName = MeetName;
    }
}
