public class WCargo extends Wagon{
    double capacity;
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Capacity = "+this.capacity);

    }
}
