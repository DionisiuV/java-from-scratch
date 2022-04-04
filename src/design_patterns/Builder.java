package design_patterns;

import java.util.Arrays;
import java.util.List;

public class Builder {
    public static void main(String[] args) {
        Computer dell = new Computer.ComputerBuilder()
                .setCpu("2.4 Ghz")
                .setRam("16 GB")
                .setHdd("2 Tb")
                .build();

        Computer ibm = new Computer.ComputerBuilder().setCpu("2.6 Ghz")
                .setRam("32 GB")
                .setHdd("4 TB")
                .build();

        Computer toshiba = new Computer.ComputerBuilder()
                .setCpu("3.6 Ghz")
                .build();

        List<Computer> computers = Arrays.asList(dell, ibm, toshiba);
        computers.forEach(System.out::println);
    }
}

class Computer {
    private String cpu;
    private String ram;
    private String hdd;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
    }

    @Override
    public String toString() {
        return cpu;
    }

    public static class ComputerBuilder {
        private String cpu;
        private String ram;
        private String hdd;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}