import java.io.Serializable;

public class Wagon implements Serializable {
    private static final long serialVersionUID = 4;
    private int id;
    private String type;

    public void setId(int id){
        this.id=id;
    }
    private Person[] passengers = new Person[100];

    public void setPassengers(Person[] passengers) {
        for(int i=0;i<passengers.length;i++){
            this.passengers[i]=passengers[i];
        }
    }
    public void getPassengers() {
        for(int i=0;i<passengers.length;i++){
            System.out.println(this.passengers[i]);
        }
    }

    public void setType(String type) {
        this.type = type;
    }
    public void getInfo(){
        System.out.println("Id of wagon: "+this.id+" Type: "+this.type);
    }
}
