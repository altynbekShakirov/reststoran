import java.awt.image.RasterFormatException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu implements Restaran {

    public Menu(String name, int price, int volume, int time) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.time = time;
    }

    public Menu() {
    }


    private String name;
    private int price;
    private int volume;
    private int time;

    @Override
    public String toString() {
        return "\n" + name + '\n' +
                "price: " + price + " ||" +
                "kolom: " + volume + " ||" +
                "ubakyt: " + time + " ||\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Comparator<Menu> getMenuComparator() {
        return menuComparator;
    }

    public void setMenuComparator(Comparator<Menu> menuComparator) {
        this.menuComparator = menuComparator;
    }

    public Comparator<Menu> getMenuComparatorReverse() {
        return menuComparatorReverse;
    }

    public void setMenuComparatorReverse(Comparator<Menu> menuComparatorReverse) {
        this.menuComparatorReverse = menuComparatorReverse;
    }

    @Override
    public void create(List<Menu> menu) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("POISK PO IMENI BLUDY:");
            String name = scanner.nextLine();
            int i = 0;
            for (Menu m : menu) {
                i++;
                if (name.equalsIgnoreCase(m.getName())) {
                    i--;
                    System.out.println(menu.get(i));
                    System.out.println("s vas: " + menu.get(i).getPrice());
                    double summa = scanner.nextDouble();
                    if (summa > m.getPrice()) {
                        double result = summa - menu.get(i).getPrice();
                        System.out.println("sdacha : " + result);
                        throw new RuntimeException();
                    }

                }


            }


    }

    @Override
    public void remove(List<Menu> menu) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Syr sozdu jazynyz");
        try {


            int kode = scanner.nextInt();
            if (kode == 8822) {
                System.out.println("""
                                              
                                              
                                              
                                              /////
                                           /////
                        ///            /////
                         ///       /////
                          ///   ////
                           ////
                           
                           
                          
                           """);
                System.out.println("tamaktyn atyn jazynyz oshol tamakty menudam alabyz!! ");
                String object = scanner.next();

                for (Menu menu1 : menu) {
                    if (menu1.getName().equalsIgnoreCase(object)) {
                        boolean isRemoved = menu.remove(menu1);
                        System.out.println(isRemoved ? "Food is removed" : "Remove failed");
                        throw new Exception();
                    }
                }
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.err.println("San Jazynyz (ERROR)");

        } catch (Exception e) {
            System.out.println("Food is removed");
        }

    }


    @Override
    public void getAll(List<Menu> menu) {
        menu.forEach(System.out::println);

    }

    @Override
    public void sortByPrice(List<Menu> menu) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 : Arzan tamktar \n" +
                    "2 : Kymbat tamaktar");
            switch (scanner.nextInt()) {
                case 1:
                    menu.sort(menuComparator);
                    System.out.println(menu);
                    break;
                case 2:
                    menu.sort(menuComparatorReverse);
                    System.out.println(menu);
                    throw new RuntimeException();
            }
        }catch (RuntimeException e){
            System.err.println(" 1 je 2 ni jazynyz ! ! !");
        }


    }

    @Override
    public void getByName(List<Menu> menu) {

        try {


            Scanner scanner = new Scanner(System.in);
            System.out.println("SYR SOZDU JAZYNYZ");
            int kode = scanner.nextInt();
            if (kode == 8822) {

                System.out.println("""
                                              
                                              
                                              
                                              /////
                                           /////
                        ///            /////
                         ///       /////
                          ///   ////
                           ////
                           
                           
                          
                           """);

                System.out.print("Tamak aty: ");
                String foodName = scanner.next();
                System.out.print("salmagy: ");
                int weight = scanner.nextInt();
                System.out.print("akchsy: ");
                int price = scanner.nextInt();
                System.out.print("jasalyp bolushu(ubaktysy): ");
                int timeForPreparing = scanner.nextInt();
                List<Menu> food = new ArrayList<>();
                food.add(new Menu(foodName, weight, price, timeForPreparing));
                menu.addAll(food);

            } else {
                throw new Exception("San jazynyz!");
            }


        } catch (Exception e) {
            System.err.println("""
                       
                       
                       
                       ///            ///
                         ///        ///
                           ///    ///
                             //////
                             /////
                          ///    ///
                        ///        ///
                      ///           ///
                     ///              ///
                    """);
        }


    }

    public Comparator<Menu> menuComparator = new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    public Comparator<Menu> menuComparatorReverse = new Comparator<Menu>() {
        @Override
        public int compare(Menu o1, Menu o2) {
            return o2.getPrice() - o1.getPrice();
        }
    };
}
