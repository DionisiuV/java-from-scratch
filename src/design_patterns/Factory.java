package design_patterns;

public class Factory {
    public static void main(String[] args) {
        Connection instagram = AppFactory.getConnection("Instagram");
        instagram.connect();
    }
}

@FunctionalInterface
interface Connection {
    void connect();
}

class WhatsApp implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to WhatsApp...");
    }
}

class Instagram implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Instagram...");
    }
}

class AppFactory {
    public static Connection getConnection(String type) {
        return switch (type) {
            case "WhatsApp" -> new WhatsApp();
            case "Instagram" -> new Instagram();
            default -> null;
        };
    }
    //Connect instagram = new Instagram();
}