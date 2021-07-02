package com.train;

public class Tickets {
    int Totaltickets;
    int roundtrip;

    public  Tickets(int Totaltickets,int roundtrip ){
    this.Totaltickets = Totaltickets;
    this.roundtrip = roundtrip;

}
    public void print(){
        int total =(int)((Totaltickets-roundtrip)*1000+(roundtrip*2000)*0.9);
        System.out.println("Total tickets :"+Totaltickets+"\n"
                +"Round-trip:"+roundtrip+"\n"+"Total:"+total);
    }
}