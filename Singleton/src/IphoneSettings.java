public class IphoneSettings {
    private static IphoneSettings instance;

    private int brightness;
    private Boolean wifiEnabled;

    private IphoneSettings(){
        // Private constructor to prevent instantiation
    }
    
    public static IphoneSettings getInstance() {
        if (instance == null){
            instance = new IphoneSettings();
        }
        return instance;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public int getBrightness(){
        return brightness;
    }

    public void enableWiFi(){
        wifiEnabled = true;
    }

    public void disableWiFi(){
        wifiEnabled = false;
    }

    public boolean isWiFiEnabled(){
        return wifiEnabled;
    }
    
}
