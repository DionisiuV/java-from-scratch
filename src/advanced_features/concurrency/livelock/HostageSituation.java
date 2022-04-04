package advanced_features.concurrency.livelock;

public class HostageSituation {
    public static void main(String[] args) {
        Terrorist terrorist = new Terrorist();
        SpecialForce specialForce = new SpecialForce();

        new Thread(() -> specialForce.payRansomTo(terrorist)).start();
        new Thread(() -> terrorist.releaseHostageTo(specialForce)).start();
    }
}

class Terrorist {
    boolean isHostageReleased = false;

    public void releaseHostageTo(SpecialForce specialForce) {
        while (!specialForce.isMoneyPaid) {
            System.out.println("The terrorist is waiting for the special force to pay the ransom.");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The terrorist released the hostage.");
        this.isHostageReleased = true;
    }
}

class SpecialForce {
    boolean isMoneyPaid = false;

    public void payRansomTo(Terrorist terrorist) {
        while (!terrorist.isHostageReleased) {
            System.out.println("The special force is waiting for the terrorist to release the hostage");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Special force sent the money.");
        this.isMoneyPaid = true;

    }
}