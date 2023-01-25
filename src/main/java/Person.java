import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 2;
    private String fullName;
    private int age;
    private boolean disability;
    private int ticketWagon;
    //Разбираем строку на инфу о нашем пассажире


    public void setAge(int age) {
        this.age = age;

    }

    public Person(String fullName, int age, boolean disability, int ticketWagon) {
        this.fullName = fullName;
        this.age = age;
        this.disability = disability;

        this.ticketWagon = ticketWagon;
    }



    public void setTicketWagon(int ticketWagon) {
        this.ticketWagon = ticketWagon;
    }

    public int getTicketWagon() {
        return ticketWagon;
    }


    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }



    public boolean getDisability(boolean disability) {
        return disability;
    }

    public String toString() {
        return "Name:" +fullName
                + " Age:" + age +
                " Disability?:" + disability +
                " " +
                "What wagon" + ticketWagon;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person that = (Person) o;
        return!(fullName !=null?!fullName.equals(that.fullName):that.fullName !=null);
    }




    public int hashCode(){
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result;
        return result;
    }
}


