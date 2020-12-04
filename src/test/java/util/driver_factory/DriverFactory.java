package util.driver_factory;

public class DriverFactory {

    public static DriverManager getManager(int type) {

        DriverManager driverManager;

        switch (type) {
            case 1:
                driverManager = new Chrome();
                break;
            case 2:
                driverManager = new Explorer();
                break;
            default:
                driverManager = null;
                break;
        }
        return driverManager;

    }
}
