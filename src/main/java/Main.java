import javax.swing.plaf.nimbus.State;import java.io.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static Wagon[] setConsequence(int pull) {
        Random rand = new Random(System.currentTimeMillis());
        Wagon[] wagons = new Wagon[pull];
        for (int i = 0; i < pull; i++) {
            int lucky = rand.nextInt(0, 4);
            switch (lucky) {
                case 0:
                    wagons[i] = new Luxe_wagon();
                    Person[] person = new Person[40];
                    for(int j=0;i<20;i++){
                        person[i]=new Person("aboba"+i,i+10,false,i+1);
                    }

                    for(int j=0;i<20;i++){
                        wagons[i].setPassengers(person);

                    }

                    break;
                case 1:
                    wagons[i] = new Coupe();
                    Person[] person1 = new Person[40];
                    for(int j=0;i<20;i++){
                        person1[i]=new Person("aboba"+i,i+10,false,i+1);
                    }

                    for(int j=0;i<20;i++){
                        wagons[i].setPassengers(person1);

                    }

                    break;
                case 2:
                    wagons[i] = new ResSeat();
                    Person[] person2 = new Person[40];
                    for(int j=0;i<20;i++){
                        person2[i]=new Person("aboba"+i,i+10,false,i+1);
                    }

                    for(int j=0;i<20;i++){
                        wagons[i].setPassengers(person2);

                    }
                    break;
                case 3:
                    wagons[i] = new WRestaraunt();
                    break;
                case 4:
                    wagons[i] = new WCargo();
                    break;
                default:
                    continue;

            }
        }
        return wagons;
    }

    public void doSeatPass(Person[] pass, Wagon wagon) {
        for (int i = 0; i < pass.length; i++) {
            wagon.setPassengers(pass);
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        //Создание поезда
        Train ak043 = new Train("Talgo", "KZtrain", 70, 25);
        Train ka044t = new Train("Zimmer", "CIA", 100, 15);
        Train ks010a = new Train("Kazakh", "kaspi", 90, 20);
        //Попытка в чтение с .txt
        setConsequence(ak043.getPull());
        setConsequence(ka044t.getPull());
        setConsequence(ks010a.getPull());
        for(int i=3;i>=1;i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠖⠛⠉⠉⠳⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⣠⠴⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡞⠉⠀⠀⠀⠀⠀⠀⠀⠹⡷⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣴⠋⠀⠀⠀⣠⡽⠓⠦⣄⡀⠀⠀⠀⠀⠀⠀⣠⠖⠉⠈⠉⠛⢻⠀⠀⡀⠀⠀⡗⢄⣻⡀⠉⠲⣄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠙⠒⠶⢆⣰⠃⠀⠀⠀⠀⠉⠓⠦⢄⣀⡴⠋⠁⠀⠀⠀⠀⠀⠸⡶⠛⠙⣆⣸⠁⠀⠙⠳⠄⠀⠀⠙⠲⣄⡀⠀⠀\n" +
                "⠀⠀⠀⠀⠘⠃⠀⠀⠀⠀⣟⣹⣦⣴⣾⣅⣀⣴⢲⣆⠀⠀⠀⠀⠀⠀⠀⠀⠈⠋⠀⠀⠀⠀⠀⠀⠀⢀⣄⠀⠉⠲⢤\n" +
                "⠀⠀⠀⠀⢀⣤⣤⣶⣾⡿⠿⠟⠛⣷⡆⡾⠚⠿⢿⣿⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡶⣦⡟⠉⣧⣄⠀⠀\n" +
                "⠀⣴⣶⣾⢫⡞⠋⠉⠀⠀⠀⢀⣠⣇⣃⣇⠀⠀⠀⠀⠉⠙⠻⢿⣶⣴⣶⣲⡆⠀⠀⠀⣀⣴⠏⠁⠈⠁⠀⢹⠋⣷⡀\n" +
                "⠀⣻⣿⡇⢸⡀⣀⣠⠴⠖⡻⡿⠿⠿⡻⡍⠛⠓⠶⠤⣄⣀⠀⢸⠿⣿⢿⡾⠃⠀⠀⣰⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳\n" +
                "⠀⠉⣹⡧⠞⠋⠁⠀⠀⢰⡿⡇⢰⢗⣽⢹⠀⠀⠀⠀⠀⠈⠉⠛⠶⡏⣷⢷⣄⣰⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠠⠦⣿⠀⠀⠀⠀⠀⠀⠘⡟⢽⣓⣺⢵⡿⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⣿⠀⠙⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⣿⠀⠀⠀⠀⠀⠀⢀⣈⣲⣶⣶⣊⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⣿⠀⠀⠀⣟⡷⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣰⣧⣤⡀⠀⠀⠀⢸⠉⠀⠀⠉⠉⠉⢹⡆⠀⠀⠀⢠⣤⣤⣀⢽⡇⠈⠳⢤⡼⢱⣧⡀⠉⠳⣤⣀⠀⠀⠀⠀⠀⠀\n" +
                "⢸⣿⣽⡿⠁⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⢿⣸⣯⣙⣻⡇⠀⠀⠀⠀⢸⣯⣭⡛⢲⢼⡍⠳⣦⣄⠀⠀⠀\n" +
                "⠈⢻⠷⠶⠶⠤⢄⡀⣿⠀⠀⠀⠀⠀⠀⢸⠇⢀⣠⣄⣀⣉⣛⠛⢻⠁⠀⠀⠀⠀⢸⠻⢿⣿⣿⣿⣿⣲⣷⠌⡟⢶⣄\n" +
                "⠀⣾⠀⠀⠀⠀⠀⠱⡿⡀⠀⠀⠀⠀⢀⣾⠔⠁⠀⠀⠀⠀⠉⠉⢻⠛⠒⠦⢤⣄⣸⠒⣾⣿⡭⣽⠼⢽⡟⣳⣇⠀⡟\n" +
                "⠀⣿⠀⠀⠀⠀⠀⠀⠹⣷⡄⠀⠀⣴⡽⠃⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⣹⠀⠈⢙⡻⣻⠀⠀⣇⣀⣿⣴⣿\n" +
                "⠀⡿⠶⠶⠶⠶⠶⢤⣤⣽⣳⣤⣴⣿⣥⡤⠤⠤⠤⠤⢤⣤⣀⣀⣷⣀⣀⣀⣀⣀⣿⣀⣤⠤⢶⣻⣿⡿⠟⣋⡽⠟⠛\n" +
                "⢠⡇⢰⣷⣶⣶⣶⣿⠀⠉⠉⠉⠉⠉⠉⢹⣶⣶⣶⣶⣶⡖⠀⠀⣿⣭⣿⣻⣟⡿⠉⣠⣴⠾⠛⠉⣠⠔⠋⠁⠀⠀⠀\n" +
                "⢸⣇⠈⠉⠉⠉⠉⣿⠙⢛⡟⡿⣿⠛⠛⢻⠘⠛⠛⠋⠉⠁⠀⢰⣿⣼⡟⣷⣻⡿⠟⠉⣁⡤⠖⠋⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠘⣟⠲⠦⠤⢤⣤⣿⣤⣼⣷⣷⣿⣀⣀⣾⣀⣀⣀⣀⣀⣀⣠⡞⣿⢻⡿⠛⠁⣀⡴⠊⠁⡴⠺⢉⣷⣤⡀⠀⠳⠆⠀\n" +
                "⠀⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⣠⠟⠉⠀⣠⠎⠁⠀⠀⠘⢷⣼⣽⠀⢸⡟⣆⠀⠀⠀\n" +
                "⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠟⠁⠀⢀⠔⠁⠀⠀⠀⠀⠀⠈⢿⢛⣷⡼⠷⢼⡆⠀⠀\n" +
                "⠀⠀⡸⣇⣀⣀⣀⠀⠀⣶⣖⣶⡄⠀⠀⠀⠀⠀⠀⠀⣼⠋⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⢠⡞⠻⠿⣧⡀⠀⠁⠀⠀\n" +
                "⢀⣼⣻⣿⠿⣿⣛⣿⣿⣿⠿⣿⣷⢶⢶⣶⣶⣶⣶⡾⠃⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⣿⢠⡄⠀⠈⢣⡀⠀⠀⠀\n" +
                "⢙⣿⡿⣡⠞⠓⠒⠒⠶⠶⠾⠿⠯⠭⢭⣽⣿⣽⣿⡖⠀⠀⢠⡾⠀⠀⠀⠀⠀⠠⣤⣷⠀⣿⠈⣧⣄⠀⠈⠙⣆⠀⠀\n" +
                "⢾⠎⣰⣯⣭⣍⣉⣉⣉⣉⣁⣀⣀⣐⣺⢿⣟⠒⢲⠇⠀⠀⣼⠇⠀⠀⠀⠀⠀⠀⠀⠀⣶⣣⣿⣅⣀⣀⣀⣰⣃⣴⡇\n" +
                "⠈⣼⢓⠒⠒⠒⠂⠀⠀⠀⠈⠍⠉⠉⣿⣸⡯⠭⣿⡅⠀⠀⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠙⠛⠛⠚⠛⠒⠒⠋⠀\n" +
                "⢸⣛⣛⡛⠛⢛⣛⣛⣛⣛⣛⣒⣒⣒⡇⣼⡗⣲⣾⣇⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡆⠀⠀⠀⠀⠀\n" +
                "⢰⠤⠤⢤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⡇⢸⣧⣤⣤⣽⠆⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("-----------------------------------------------------------------");
        for(int i=0;i<10;i++){
            if(i==5){
                System.out.println("|       (◐ω◑ )        Добро пожаловать!                      |");
                System.out.println("|       ໒(⊙ᴗ⊙)७✎▤        Функции:                            |");
                System.out.println("|    (ᵒ̤̑ ₀̑ ᵒ̤̑)wow!*✰   1)Состояние поезда                    |");
                System.out.println("|     ( ͡° ͜ʖ ͡° )  2)Узнать информацию о пассажирах          |");
                System.out.println("|    ʘ‿ʘ   3)Взорвать поезд                                   |");
            }
            System.out.println("|                                                             |");
        }
        System.out.println("|    ʘ‿ʘ   решайте быстрее                                   |");
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println(i+" секунд...(•‿•)");
        }
        DataBaseHandler dbs=new DataBaseHandler();
        System.out.println("Введите число выбранной функции");
        int a= scanner.nextInt();

        switch (a){
            case 1:
                System.out.println("Есть три поезда -Тальго,Цимма Казах. О каком узнаем? (Введите название)");
                String name;
                name=scanner.next();

                if(name.equals("Тальго")){
                    System.out.println(ak043.toString());
                    break;
                } else if (name.equals("Цимма")) {
                    System.out.println(ka044t.toString());
                    break;
                }
                else if(name.equals("Казах")){
                    System.out.println( ks010a.toString());
                    break;
                }
                else {
                    System.out.println("(●´⌓`●)  чел z");
                    break;
                }

            case 2:
                System.out.println("Полный список пассажиров");
                dbs.databaseIdName();
                break;
            case 3:
                System.out.println("\uD83C\uDF32\uD83C\uDF34\uD83C\uDF3F\uD83E\uDEB4");
                System.out.println("\uD83D\uDE85"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83"+"\uD83D\uDE83");
                System.out.println("\uD83C\uDF32\uD83C\uDF34\uD83C\uDF3F\uD83E\uDEB4");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣠⡴⠶⠒⠦⣄⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⡶⢶⡿⡯⣿⣿⣷⣤⣄⠒⠶⣾⣧⡀⠈⠙⣦⠤⠤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⣀⡴⠞⠻⠁⡴⣶⠿⠉⣡⠬⠋⠀⠙⢸⣿⢷⠞⠉⠉⡶⢤⡼⣽⣶⡌⢻⣤⠤⢤⣀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⣠⢾⣿⣿⡷⡖⠒⡤⠾⣡⠶⣻⠿⢀⡤⠶⠏⠉⠿⢄⠀⠀⠀⠛⣳⣤⠀⢹⠟⠖⠃⠐⢦⠙⣦⡀⠀⠀⠀\n" +
                        "⠀⠀⣴⣿⠏⢋⡘⠀⣀⡰⠧⠄⠈⠀⠻⡲⢟⣧⠀⠀⠀⠀⠘⢷⠀⠀⠀⠀⠉⠀⠋⠑⡦⢤⣐⡻⠗⢣⠙⣇⠀⠀\n" +
                        "⠀⣸⡇⢠⠆⢻⡤⠟⠉⢰⠆⠀⠀⢠⠔⠀⠘⢧⣀⠄⠀⢀⡀⠈⠀⠘⠉⣷⣄⠀⠀⠘⢱⣟⡉⠋⡦⣬⠿⠛⢷⠀\n" +
                        "⣴⣿⣿⣿⢷⡇⠀⠀⠀⠙⠦⠄⣠⠌⠓⠒⣲⣿⡁⠠⣞⠙⠉⡋⢹⢶⡤⠀⠛⠲⣭⢷⣦⠈⠛⢦⣀⡸⣋⣦⣼⠇\n" +
                        "⢻⣿⡦⢴⠋⣳⡤⠀⠀⣼⡇⢠⣿⠄⢠⡾⣁⠈⠳⢂⡈⠉⢙⡉⠉⠲⡤⣀⣀⡠⠏⠉⠛⣦⡶⠚⢤⡤⣿⡟⣷⠀\n" +
                        "⠘⢷⣶⣿⣾⠛⠛⠋⠀⠉⠉⢀⡄⢀⡁⢀⣽⣿⡿⢻⢷⣶⣾⣧⣤⣴⣇⣀⡝⠀⠀⡀⠀⣻⠀⣀⠒⠃⢿⣿⠏⠀\n" +
                        "⠀⠀⠙⠧⡼⠗⢏⠀⣀⠀⠀⠀⢙⡛⠉⠉⣿⣿⣷⠀⣼⡌⡇⠙⣿⣷⠞⠉⠀⠀⠀⠈⠋⣁⣰⠟⠀⢹⠉⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠙⠦⣈⣉⣉⠉⠀⠀⠀⠓⠦⠈⠙⢹⣿⣿⣿⡇⡇⢸⣿⠇⠀⠐⠤⠶⠴⠃⠀⢠⣄⣀⣴⠟⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠙⠒⠤⠴⠺⣄⡀⢀⣠⣸⣿⣿⠀⡇⣇⣾⢸⣄⡀⠀⠀⣠⣄⣀⣴⠟⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⢸⣿⣿⡀⡇⣿⣯⢸⠁⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡇⠈⠁⠃⢿⣿⣼⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣞⣟⢸⣼⣆⠀⣾⣿⣿⡷⣓⣦⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣏⣼⣿⣿⡿⠾⣿⠿⣶⠿⢿⡿⡷⠀⠛⣦⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣈⣿⡹⠿⡟⠀⠀⠀⠈⣱⡄⠀⣼⠆⠸⠟⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢍⣿⣦⣝⢶⣌⣳⣞⣁⡙⢒⣿⣶⣾⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡿⣿⣿⠟⢻⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣿⣿⣷⣿⣷⡶⣶⣤⣈⣴⣿⣻⣿⣿⣿⠷⢦⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣾⣿⣿⢿⣿⣾⣿⣷⡾⢿⣿⣿⣏⣻⣿⣿⣿⡿⠿⣷⡞⠷⣧⣤⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⢀⡾⣿⣿⣿⣿⠿⣿⠿⣿⣿⠏⠐⠻⢹⣟⣭⣍⡿⡿⠿⣷⣤⠞⠓⢶⠟⣿⣷⡀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠈⠀⠀⠛⠛⠂⠀⠘⠀⠘⠁⠁⠀⠀⠀⠁⠀⠀⠸⠓⠋⠀⠻⠂⠀⠀⠀⠀⠀");
                break;
            default:a=3;
        }




    }
}


