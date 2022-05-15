public class ChargeConfiguration {
    public static ChargeInterface getChargeImpl() {
        return new ChargeImpl();
    }
}
