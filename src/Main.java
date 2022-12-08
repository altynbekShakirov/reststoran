import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Menu> list = new ArrayList<>();
    public static ArrayList<Menu> bludaArrayList = new ArrayList<>();
    public static ArrayList<Menu> nopitkiList= new ArrayList<>();
    public static ArrayList<Menu> desert=new ArrayList<>();
    public static ArrayList<Menu> salat= new ArrayList<>();

    public static void main(String[] args) {
//        bludaArrayList = new ArrayList<>(Arrays.asList(new Bluda("GrilledVegetables", 500, 800, 17),
//                new Bluda("Rice", 350, 200, 15),
//                new Bluda("Soups", 400, 250, 20),
//                new Bluda("Steak", 1000, 500, 15),
//                new Bluda("Pizza", 750, 400, 20)));
//
//
//        nopitkiList = new ArrayList<>(Arrays.asList(new Nopitki("Water", 80, 1000, 1),
//                new Nopitki("Lemonade", 250, 500, 1),
//                new Nopitki("Tea", 150, 700, 1),
//                new Nopitki("Juice", 400, 1000, 1),
//                new Nopitki("Cola", 200, 1000, 1)));
//        desert = new ArrayList<>(Arrays.asList(new Desert("Cake", 400, 200, 2),
//                new Desert("Cupcake", 370, 400, 2),
//                new Desert("Pie", 200, 500, 2),
//                new Desert("Pancake", 240, 600, 2),
//                new Desert("Cookie", 500, 400, 3)));
//
//        salat = new ArrayList<>(Arrays.asList(new Salat("GreekSalad", 500, 500, 5),
//                new Salat("Caprese", 300, 200, 5),
//                new Salat("Ceasar", 420, 300, 6),
//                new Salat("Shakarap", 650, 350, 5),
//                new Salat("Olive", 540, 350, 7)));
        list= new ArrayList<>(Arrays.asList(new Bluda("GrilledVegetables", 500, 800, 17),
                new Bluda("Rice", 350, 200, 15),
                new Bluda("Soups", 400, 250, 20),
                new Bluda("Steak", 1000, 500, 15),
                new Bluda("Pizza", 750, 400, 20),
                new Nopitki("Water", 80, 1000, 1),
                new Nopitki("Lemonade", 250, 500, 1),
                new Nopitki("Tea", 150, 700, 1),
                new Nopitki("Juice", 400, 1000, 1),
                new Nopitki("Cola", 200, 1000, 1),
                new Desert("Cake", 400, 200, 2),
                new Desert("Cupcake", 370, 400, 2),
                new Desert("Pie", 200, 500, 2),
                new Desert("Pancake", 240, 600, 2),
                new Desert("Cookie", 500, 400, 3),
                new Salat("GreekSalad", 500, 500, 5),
                new Salat("Caprese", 300, 200, 5),
                new Salat("Ceasar", 420, 300, 6),
                new Salat("Shakarap", 650, 350, 5),
                new Salat("Olive", 540, 350, 7)


                ));


//        list.addAll(nopitkiList);
//        list.addAll(bludaArrayList);
//        list.addAll(desert);
//        list.addAll(salat);
        System.out.println("KUSH KELINIZ");
        commands(list);

    }



    public static void commands(List<Menu> menu) {
        System.out.println("                        ^^^");
        System.out.println("                   ^^^^^^^^^^^^^");
        System.out.println("    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("<<<<<<<<<<<<<<<<<<<   ALTYN SARAY   >>>>>>>>>>>>>>>>>>");
        Menu menu1 = new Menu();
        while (true) {
            menuCatalog();

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("                        ^^^");
                    System.out.println("                    ^^^^^^^^^^^^^");
                    System.out.println("    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println("<<<<<<<<<<<<<<<<<<<   ALTYN SARAY   >>>>>>>>>>>>>>>>>>");
                    System.out.println("=====================VSE MENU====================");
                    menu1.getAll(list);
                    System.out.println("====================================================");
                    System.out.println("====================================================");
                    System.out.println("====================================================");
                    break;
                case 2:
                    menu1.create(menu);
                    break;
                case 3:
                    System.out.println("TAMAKTAR");
                    for (Menu m : menu) {
                        if (m instanceof Bluda) {
                            bludaArrayList.forEach(System.out::println);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("SUUSUNDUKTAR");
                    for (Menu m : menu) {
                        if (m instanceof Nopitki) {
                            nopitkiList.forEach(System.out::println);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("DESERTTER");
                    for (Menu m : menu) {
                        if (m instanceof Desert){
                            desert.forEach(System.out::println);
                            break;
                        }

                    }
                    break;
                case 6:
                    System.out.println("SALATTAR");
                    for (Menu m : menu) {
                        if (m instanceof Salat) {

                            salat.forEach(System.out::println);
                            break;
                        }
                    }
                    break;
                case 7:
                    menu1.sortByPrice(list);
                    break;
                case 8:
                        menu1.getByName(list);
                    break;
                case 9:
                    menu1.remove(list);
                    break;
                default:
                    System.out.println("Error");
            }


        }

    }

    public static void menuCatalog() {
        System.out.println("""
                1: Vse menu
                2: Poisk po imeni
                3: Tamaktar
                4: Suusunduktar
                5: Desertter
                6: Salattar
                7: Sorttoo
                8: Menuga tamak koshuu("tolka dlya administratorov")
                9: Tamakty ochuruu("tolka dlya admiristratorrov)
                 NOPISHITE SLEDUIUSEY STROCHKE : 
                 """);
    }
}