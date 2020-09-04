package homework4;

import java.util.Objects;

public class Computer implements Comparable<Computer>{
    String model;
    int year;
    int RAM;
    int price;
    HardDisk hardDisk;
    CPU cpu;

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", RAM=" + RAM +
                ", price=" + price +
                ", hardDisk=" + hardDisk +
                ", cpu=" + cpu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year &&
                RAM == computer.RAM &&
                price == computer.price &&
                Objects.equals(model, computer.model) &&
                Objects.equals(hardDisk, computer.hardDisk) &&
                Objects.equals(cpu, computer.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, RAM, price, hardDisk, cpu);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Computer(String model, int year, int RAM, int price, HardDisk hardDisk, CPU cpu) {
        this.model = model;
        this.year = year;
        this.RAM = RAM;
        this.price = price;
        this.hardDisk = hardDisk;
        this.cpu = cpu;
    }

    @Override
    public int compareTo(Computer pc) {
        int newPrice = ((Computer)pc).getPrice();

        return this.price - newPrice;
    }
}
