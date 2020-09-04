package homework5.ComputerTask;

import java.util.Objects;

public class CPU {
    private String type;
    private int cores;
    private int frequency;
    private ManufacturerCountry manufacturerCountry;

    @Override
    public String toString() {
        return "CPU{" +
                "type='" + type + '\'' +
                ", cores=" + cores +
                ", frequency=" + frequency +
                ", manufacturerCountry=" + manufacturerCountry +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return cores == cpu.cores &&
                frequency == cpu.frequency &&
                Objects.equals(type, cpu.type) &&
                manufacturerCountry == cpu.manufacturerCountry;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cores, frequency, manufacturerCountry);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public ManufacturerCountry getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(ManufacturerCountry manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public CPU(String type, int cores, int frequency, ManufacturerCountry manufacturerCountry) {
        this.type = type;
        this.cores = cores;
        this.frequency = frequency;
        this.manufacturerCountry = manufacturerCountry;
    }
}
