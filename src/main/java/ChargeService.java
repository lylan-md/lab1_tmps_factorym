public class ChargeService {
    private final ChargeInterface chargeImpl;

    public ChargeService(ChargeInterface chargeImpl) {
        this.chargeImpl = chargeImpl;
    }

    public boolean chargeUser(User user) {
        return this.chargeImpl.doCharge(user);
    }
}
