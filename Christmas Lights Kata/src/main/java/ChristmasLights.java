public class ChristmasLights {
    private static Light[][] lightGrid = new Light[1000][1000];
    public static int howManyAreOn(){
        return Light.getTotalOn();
    }

    public static int getTotalBrightness(){
        return Light.getTotalBrightness();
    }

    public static void setUp(){
        for(int i = 0; i < lightGrid.length; i++){
            for (int j = 0; j < lightGrid.length; j++){
                lightGrid[i][j] = new Light();
            }
        }
    }

    public static void clearAll(){
        for(int i = 0; i < lightGrid.length; i++){
            for(int j = 0; j < lightGrid.length; j++){
                lightGrid[i][j].setIsOn(false);

            }
        }
        Light.clearCount();
    }


    public static void toggleLightsBrightness(int x1Index, int y1Index, int x2Index, int y2Index){
        int initialYIndex = y1Index;
        while(x1Index<=x2Index){
            while(y1Index<=y2Index){
                lightGrid[x1Index][y1Index].handleBrightnessCount(false, true);
                y1Index++;
            }
            y1Index = initialYIndex;
            x1Index++;
        }
    }

    public static void toggleLightsBrightness(int x1Index, int y1Index, int x2Index, int y2Index, boolean increaseBrightness){
        int initialYIndex = y1Index;
        while(x1Index<=x2Index){
            while(y1Index<=y2Index){
                lightGrid[x1Index][y1Index].handleBrightnessCount(increaseBrightness, false);
                y1Index++;
            }
            y1Index = initialYIndex;
            x1Index++;
        }
    }


    public static void toggleLights(int x1Index, int y1Index, int x2Index, int y2Index){

        int initialYIndex = y1Index;
        while(x1Index<=x2Index){
            while(y1Index<=y2Index){
                lightGrid[x1Index][y1Index].toggleOn();
                y1Index++;
            }
            y1Index = initialYIndex;
            x1Index++;
        }
    }

    public static void toggleLights(int x1Index, int y1Index, int x2Index, int y2Index, boolean desiredOutput){

        int initialYIndex = y1Index;
        while(x1Index<=x2Index){
            while(y1Index<=y2Index){
                lightGrid[x1Index][y1Index].setIsOn(desiredOutput);

                y1Index++;
            }
            y1Index = initialYIndex;
            x1Index++;
        }
    }
}
