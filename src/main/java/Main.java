public class Main {
    public static void main(String[] args) {
        ChargeService chargeService = new ChargeService(ChargeConfiguration.getChargeImpl());
        chargeService.chargeUser(new User());
    }
}
