public class Luxe_wagon extends Wagon {
    private int seats;
    private boolean isThereAirCon;
    public void setSeats(int seats){
        this.seats=seats;
    }

    public void setThereAirCon(boolean IsThereAirCon){
        this.isThereAirCon=isThereAirCon;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Amount of seats = "+this.seats+" Is there air-conditioner? "+this.isThereAirCon);
    }
}

