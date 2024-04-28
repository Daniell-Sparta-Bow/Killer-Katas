public class Light {
    private static int totalOn = 0;
    private boolean isOn;

    private static int totalBrightness = 0;

    public Light() {
        this.isOn = false;
    }

    public Light(boolean isOn){
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public static int getTotalOn(){
        return Light.totalOn;
    }

    public void toggleOn() {
        handleCount();
        this.isOn = !this.isOn;
    }

    private void handleCount() {
        if (!isOn){
            totalOn++;
        } else{
            totalOn--;
        }
    }

    public void setIsOn(boolean isOn){
        if(this.isOn == isOn){
            return;
        }
        toggleOn();
    }

    public static void clearCount(){
        Light.totalBrightness = 0;
    }

    public void handleBrightnessCount(boolean turnOn, boolean toggle){
        if(turnOn){
            totalBrightness++;
        } else if (toggle) {
            totalBrightness += 2;
        } else{
            totalBrightness = Math.max(0,totalBrightness - 1);
        }
    }

    public static int getTotalBrightness(){
        return totalBrightness;
    }


}
