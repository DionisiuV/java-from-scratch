package advanced_features.composition;

public class Composition {
    public static void main(String[] args) {
        Processor i9 = new Processor("i9", "3.6 GHz");
        Ram ddr4 = new Ram("DDR4", "32 GB");
        Computer dell = new Computer(i9, ddr4);

        String processorModel = dell.getProcessor().getModel();
        System.out.println(processorModel);

        Ram dellRam = dell.getRam();
        String ramCapacity = dellRam.getCapacity();
        System.out.println(ramCapacity);

        System.out.println(ddr4 == dellRam);
    }
}

class Computer {
    private Processor processor;
    private Ram ram;

    public Computer(Processor processor, Ram ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }
}

class Processor {
    private String model;
    private String speed;

    public Processor(String model, String speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getSpeed() {
        return speed;
    }
}

class Ram {
    private String model;
    private String capacity;

    public Ram(String model, String capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public String getCapacity() {
        return capacity;
    }
}