

public class Cars1 {
    int konyky;
    double obyem;
    int rik;
    int krislo;
    String marka;
    String model;
    String kolir;

    public Cars1(int konyky, double obyem, int rik, int krislo, String marka, String model, String kolir) {
        this.konyky = konyky;
        this.obyem = obyem;
        this.rik = rik;
        this.krislo = krislo;
        this.marka = marka;
        this.model = model;
        this.kolir = kolir;

    }
    public static void main(String[] args) {
        Cars1 car1 = new Cars1(116, 1.6, 1990, 2, "mazda", "miata", "red");
        Cars1 car2 = new Cars1(150, 2, 2011, 2, "volkswagen", "beetle", "green");
        Cars1 car3 = new Cars1(600, 15, 1986, 4, "tank", "cool", "army");
        Cars1 car4 = new Cars1(400, 3, 2000, 5, "toyota", "prius", "white");
        Cars1 car5 = new Cars1(503, 0, 2015, 4, "tesla", "x", "yellow");
        Cars1 car6 = new Cars1(250, 5.2, 2024, 3, "busik", "tck", "black");
        Cars1 car7 = new Cars1(666, 8, 2020, 2, "lamborgini", "urus s", "pink");
        Cars1 car8 = new Cars1(800, 28, 1990, 3, "kamaz", "10000", "yellow");
        Cars1 car9 = new Cars1(400, 0, 1990, 50, "tramvay", "No4", "green");
        Cars1 car10 = new Cars1(10000, 0, 2018, 1, "velosyped", "spelli", "black-orange");

        int sumkon = car1.konyky + car2.konyky + car3.konyky + car4.konyky + car5.konyky + car6.konyky + car7.konyky + car8.konyky + car9.konyky + car10.konyky;
        System.out.println("Сума кiнських сил: " + sumkon);

        double sumob = car1.obyem + car2.obyem + car3.obyem + car4.obyem + car5.obyem + car6.obyem + car7.obyem + car8.obyem + car9.obyem + car10.obyem;
        System.out.println("Сума об'ємiв: " + sumob);
        }

}
