public class WRestaraunt extends Wagon{
    private String menu;

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void showMenu(){
        System.out.println("Today we are having "+ this.menu);
    }
}
