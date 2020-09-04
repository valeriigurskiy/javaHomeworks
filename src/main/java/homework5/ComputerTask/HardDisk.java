package homework5.ComputerTask;

import java.util.Objects;

public class HardDisk {
    private String model;
    private hdType hddType;
    private int diskMemory;
    private ManufacturerCountry hdCountry;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisk hardDisk = (HardDisk) o;
        return diskMemory == hardDisk.diskMemory &&
                Objects.equals(model, hardDisk.model) &&
                hddType == hardDisk.hddType &&
                hdCountry == hardDisk.hdCountry;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, hddType, diskMemory, hdCountry);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public hdType getHddType() {
        return hddType;
    }

    public void setHddType(hdType hddType) {
        this.hddType = hddType;
    }

    public int getDiskMemory() {
        return diskMemory;
    }

    public void setDiskMemory(int diskMemory) {
        this.diskMemory = diskMemory;
    }

    public ManufacturerCountry getHdCountry() {
        return hdCountry;
    }

    public void setHdCountry(ManufacturerCountry hdCountry) {
        this.hdCountry = hdCountry;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "model='" + model + '\'' +
                ", hddType=" + hddType +
                ", diskMemory=" + diskMemory +
                ", hdCountry=" + hdCountry +
                '}';
    }

    public HardDisk(String model, hdType hddType, int diskMemory, ManufacturerCountry hdCountry) {
        this.model = model;
        this.hddType = hddType;
        this.diskMemory = diskMemory;
        this.hdCountry = hdCountry;
    }
}
