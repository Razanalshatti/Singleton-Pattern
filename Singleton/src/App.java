public class App {
    public static void main(String[] args) throws Exception {
        IphoneSettings iphoneSettings = IphoneSettings.getInstance();

        iphoneSettings.setBrightness(70);
        System.out.println("Brightness: " + iphoneSettings.getBrightness());


        iphoneSettings.enableWiFi();
        System.out.println("Wifi Enabled: " + iphoneSettings.isWiFiEnabled());

    }
}
