import java.io.Serializable;

public class Train implements Serializable {
    private static final long serialVersionUID = 3;
    private String name;
    private String company;
    private int speed;
    private int pull;
    private Wagon[] wagons = new Wagon[40];
    public void inputWagon(Person[] passengers, int numberOfWagon){
        wagons[numberOfWagon].setPassengers(passengers);
    }

    public Train(){

    }
    public void setWagons(Wagon[] wagons) {
        this.wagons = wagons;
    }
    public Train(String name, String company, int speed, int pull) {
        setCompany(company);
        setName(name);
        setSpeed(speed);
        setPull(pull);
    }
    public String toString(){
        return name+" company "+company+" speed:"+speed+" amount of passengers "+getPull()+" wagons"+"10~40";
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPull(int pull) {
        this.pull = pull;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPull() {
        return pull;
    }

    public int getSpeed() {
        return speed;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public void getWagons() {
        for (int i = 0; i < pull; i++) {
            System.out.println(wagons[i]);
        }
    }

    public void getPassengers(){
        for(int i=0;i<getPull();i++){
            System.out.println("aboba"+i+" age"+(i+10)+" false "+"ticket"+(i+1));
        }
    }
}

