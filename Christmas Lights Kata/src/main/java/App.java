public class App {
    public static void main(String[] args) {
        ChristmasLights.setUp();

        ChristmasLights.toggleLights(887,9,959,629, true);
        ChristmasLights.toggleLights(454,398, 844, 448, true);
        ChristmasLights.toggleLights(539, 243, 559, 965, false);
        ChristmasLights.toggleLights(370,819,676,868, false);
        ChristmasLights.toggleLights(145,40,370,997, false);
        ChristmasLights.toggleLights(301,3, 808,453, false);
        ChristmasLights.toggleLights(351,678, 951,908, true);
        ChristmasLights.toggleLights(720,196,897,994);
        ChristmasLights.toggleLights(720,196,897,994);
        ChristmasLights.toggleLights(831,394,904,860);
        System.out.println(ChristmasLights.howManyAreOn());

    }
}
