public class Info { // класс для вывода информации
    public static void main(String[] args) {

        System.out.print("Добавленная строка с изменениями для пункта 3"); // синий

        System.out.println("_______________________________________________________________________________________________________________");

        Yogurt yogurt1 = new Yogurt ("03/07/2021", 12, 10, "strawberry", 7, true);

        System.out.println("Yogurt «" + yogurt1.Producer(12) + "" + "»" + "\n" +
                "Expiry date: " + yogurt1.GetExpiryDate() + "; " + "Protein: " + yogurt1.GetProtein() + "; " + "Fat: " + yogurt1.GetFat() + "; " +
                "Flavoring: " + yogurt1.GetFlavoring() + "; " + "Container volume: " + yogurt1.GetContainerVolume() + "; " + "Termization: " + yogurt1.GetTermization() + "\n");

        Yogurt yogurt2 = new Yogurt ("12/09/2020", 5, 9);

        System.out.println("Yogurt «" + yogurt2.Producer(5) + "" + "»" + "\n" +
                "Expiry date: " + yogurt2.GetExpiryDate() + "; " + "Protein: " + yogurt2.GetProtein() + "; " + "Fat: " + yogurt2.GetFat() + "; " +
                "Flavoring: " + yogurt2.GetFlavoring() + "; " + "Container volume: " + yogurt2.GetContainerVolume() + "; " + "Termization: " + yogurt2.GetTermization() + "\n");

        Yogurt yogurt3 = new Yogurt ();  // объявление переменной типа класс (ссылка) и получение физической копии объекта

        System.out.println("Yogurt «" + yogurt3.Producer(1.6f) + "" + "»" + "\n" +
                "Expiry date: " + yogurt3.GetExpiryDate() + "; " + "Protein: " + yogurt3.GetProtein() + "; " + "Fat: " + yogurt3.GetFat() + "; " +
                "Flavoring: " + yogurt3.GetFlavoring() + "; " + "Container volume: " + yogurt3.GetContainerVolume() + "; " + "Termization: " + yogurt3.GetTermization());


        System.out.println("_______________________________________________________________________________________________________________");

        Curd curd1 = new Curd ("10/05/2022", 17, 12, 200, true);

        System.out.println("Curd «" + curd1.Producer(17) + "" + "»" + "\n" +
                "Expiry date: " + curd1.GetExpiryDate() + "; " + "Protein: " + curd1.GetProtein() + "; " + "Fat: " + curd1.GetFat() + "; " +
                "Mass: " + curd1.GetMass() + "; " + "Grain: " + curd1.GetGrain() + "\n");

        Curd curd2 = new Curd ("01/02/2019", 5.3f, 9, 180);

        System.out.println("Curd «" + curd2.Producer(5.3f) + "" + "»" + "\n" +
                "Expiry date: " + curd2.GetExpiryDate() + "; " + "Protein: " + curd2.GetProtein() + "; " + "Fat: " + curd2.GetFat() + "; " +
                "Mass: " + curd2.GetMass() + "; " + "Grain: " + curd2.GetGrain() + "\n");

        Curd curd3 = new Curd ();

        System.out.println("Curd «" + curd1.Producer(1.6f) + "" + "»" + "\n" +
                "Expiry date: " + curd3.GetExpiryDate() + "; " + "Protein: " + curd3.GetProtein() + "; " + "Fat: " + curd3.GetFat() + "; " +
                "Mass: " + curd3.GetMass() + "; " + "Grain: " + curd3.GetGrain());



        System.out.println("_______________________________________________________________________________________________________________");

        Kefir kefir1 = new Kefir ("04/08/2022", 5.1f, 8, 20, 10000000);

        System.out.println("Kefir «" + kefir1.Producer(5.1f) + "" + "»" + "\n" +
                "Expiry date: " + kefir1.GetExpiryDate() + "; " + "Protein: " + kefir1.GetProtein() + "; " + "Fat: " + kefir1.GetFat() + "; " +
                "ContainerVolume: " + kefir1.GetContainerVolume() + "; " + "Container volume: " + kefir1.GetContainerVolume() + "\n");

        Kefir kefir2 = new Kefir ("21/02/2020", 11.5f, 7.1f);

        System.out.println("Kefir «" + kefir2.Producer(11.5f) + "" + "»" + "\n" +
                "Expiry date: " + kefir2.GetExpiryDate() + "; " + "Protein: " + kefir2.GetProtein() + "; " + "Fat: " + kefir2.GetFat() + "; " +
                "ContainerVolume: " + kefir2.GetContainerVolume() + "; " + "Bifidobacteria: " + kefir2.GetBifidobacteria() + "\n");

        Kefir kefir3 = new Kefir ();

        System.out.println("Kefir «" + kefir3.Producer(1.6f) + "" + "»" + "\n" +
                "Expiry date: " + kefir3.GetExpiryDate() + "; " + "Protein: " + kefir3.GetProtein() + "; " + "Fat: " + kefir3.GetFat() + "; " +
                "ContainerVolume: " + kefir3.GetContainerVolume() + "; " + "Bifidobacteria: " + kefir3.GetBifidobacteria());
    }
}
