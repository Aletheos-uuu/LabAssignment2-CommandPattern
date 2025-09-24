public class AdjustBrightnessCommand implements Command {
    private Light light;
    private int level;

    public AdjustBrightnessCommand(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        light.adjustBrightness(level);
    }
}