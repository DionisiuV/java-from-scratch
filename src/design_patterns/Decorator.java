package design_patterns;

public class Decorator {
    public static void main(String[] args) {
        Ticket economyTicket = new EconomyClassTicket();
        //economyTicket.buy();

        Ticket firstClassTicket = new FirstClassTicket(new EconomyClassTicket());
        firstClassTicket.buy();

        Ticket businessClassTicket = new BusinessClassTicket(new FirstClassTicket(new EconomyClassTicket()));
        //businessClassTicket.buy();
    }
}

@FunctionalInterface
interface Ticket {
    void buy();
}

class EconomyClassTicket implements Ticket {
    @Override
    public void buy() {
        System.out.println("Buying economy class ticket...");
    }
}

class TicketDecorator implements Ticket {
    Ticket ticket;

    public TicketDecorator(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void buy() {
        ticket.buy();
    }
}

class FirstClassTicket extends TicketDecorator {
    public FirstClassTicket(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void buy() {
        super.buy();
        System.out.println("Upgrading to first class ticket...");
    }
}

class BusinessClassTicket extends TicketDecorator {
    public BusinessClassTicket(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void buy() {
        super.buy();
        System.out.println("Upgrading to business class ticket...");
    }
}