public class garden {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Ogórek";
        plant1.description = "Roślina potrzebująca dużo wody";
        plant1.waterUsage = 3.2f;

        Plant plant2 = new Plant();
        plant2.name = "Papryka";
        plant2.description = "Roślina potrzebująca mało wody";
        plant2.waterUsage = 1.4f;

        Plant plant3 = new Plant();
        plant3.name = "Cukinia";
        plant3.description = "Roślina potrzebująca dużo wody";
        plant3.waterUsage = 4.9f;


        float dailyWterUsage = plant1.waterUsage + plant2.waterUsage + plant3.waterUsage;
        System.out.println("dzienne zużycie wody : " + dailyWterUsage + "l");
        System.out.println("tygodniowe zużycie wody : " + (dailyWterUsage*7) + "l");
        System.out.println("roczne zużycie wody : " + (dailyWterUsage*365) + "l");

    }
}
