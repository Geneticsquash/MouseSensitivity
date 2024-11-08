public class MouseSettings {
    static {
        System.loadLibrary("MouseSettingsNative");
    }
    public native void setMouseSpeed(int speed);
    public native void setMouseSensitivity(int sensitivity);

    public static void main(String[] args) {
        MouseSettings settings = new MouseSettings();
        settings.setMouseSpeed(10);
        settings.setMouseSensitivity(15);

    }
}