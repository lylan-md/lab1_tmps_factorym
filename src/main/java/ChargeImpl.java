public class ChargeImpl implements ChargeInterface {
    public boolean doCharge(User user) {
        System.out.println("Charge user: " + user);
        return true;
    }
}
