package netology.boothw_1.internal;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}