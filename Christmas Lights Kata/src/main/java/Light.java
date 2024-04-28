public class Light {
    private static int totalOn = 0;
    private boolean isOn;

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

    public void clearCount(){
        Light.totalOn = 0;
    }
}
