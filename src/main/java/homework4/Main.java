package homework4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new LinkedList<>();
        Computer computer1 = new Computer("Personal1", 2001, 1, 500, new HardDisk("One of the best", hdType.SSD, 100, ManufacturerCountry.China), new CPU("amx x4", 1, 100, ManufacturerCountry.China));
        Computer computer2 = new Computer("Personal2", 2003, 1, 1500, new HardDisk("One of the best", hdType.HDD, 200, ManufacturerCountry.India), new CPU("amx x4", 1, 100, ManufacturerCountry.China));
        Computer computer3 = new Computer("Personal3", 2007, 1, 1450, new HardDisk("One of the best", hdType.HDD, 300, ManufacturerCountry.Korea), new CPU("amd", 1, 100, ManufacturerCountry.China));
        Computer computer4 = new Computer("Personal3", 2003, 1, 3500, new HardDisk("One of the best", hdType.SSD, 200, ManufacturerCountry.Usa), new CPU("amx x4", 1, 100, ManufacturerCountry.China));
        Computer computer5 = new Computer("Personal3", 2011, 1, 1000, new HardDisk("One of the best", hdType.HDD, 700, ManufacturerCountry.China), new CPU("amd", 1, 100, ManufacturerCountry.China));
        Computer computer6 = new Computer("Personal3", 2017, 1, 500, new HardDisk("One of the best", hdType.SSD, 1000, ManufacturerCountry.Korea), new CPU("amx x4", 1, 100, ManufacturerCountry.China));
        Computer computer7 = new Computer("Personal3", 1999, 1, 3500, new HardDisk("One of the best", hdType.HDD, 500, ManufacturerCountry.India), new CPU("amx 3", 1, 100, ManufacturerCountry.China));
        Computer computer8 = new Computer("Personal3", 2001, 1, 500, new HardDisk("One of the best", hdType.SSD, 900, ManufacturerCountry.Korea), new CPU("i7", 1, 100, ManufacturerCountry.China));
        Computer computer9 = new Computer("Personal3", 1998, 1, 1000, new HardDisk("One of the best", hdType.SSD, 600, ManufacturerCountry.China), new CPU("i7", 1, 100, ManufacturerCountry.China));
        Computer computer10 = new Computer("Personal3", 2005, 1, 500, new HardDisk("One of the best", hdType.SSD, 420, ManufacturerCountry.Korea), new CPU("amx x4", 1, 100, ManufacturerCountry.China));
        Computer computer11 = new Computer("Personal3", 2012, 1, 1000, new HardDisk("One of the best", hdType.HDD, 600, ManufacturerCountry.China), new CPU("i7", 1, 100, ManufacturerCountry.China));
        Computer computer12 = new Computer("Personal3", 2013, 1, 500, new HardDisk("One of the best", hdType.SSD, 900, ManufacturerCountry.Usa), new CPU("amx 3", 1, 100, ManufacturerCountry.China));
        Computer computer13 = new Computer("Personal3", 2011, 1, 1200, new HardDisk("One of the best", hdType.HDD, 400, ManufacturerCountry.China), new CPU("amx x4", 1, 100, ManufacturerCountry.China));
        Computer computer14 = new Computer("Personal3", 2017, 1, 1000, new HardDisk("One of the best", hdType.SSD, 1500, ManufacturerCountry.Usa), new CPU("i7", 1, 100, ManufacturerCountry.China));
        Computer computer15 = new Computer("Personal3", 2019, 1, 500, new HardDisk("One of the best", hdType.HDD, 1000, ManufacturerCountry.China), new CPU("amx 3", 1, 100, ManufacturerCountry.China));
        Computer computer16 = new Computer("Personal3", 2007, 1, 3500, new HardDisk("One of the best", hdType.HDD, 650, ManufacturerCountry.China), new CPU("i7", 1, 100, ManufacturerCountry.China));
        Computer computer17 = new Computer("Personal3", 2000, 1, 500, new HardDisk("One of the best", hdType.HDD, 100, ManufacturerCountry.Usa), new CPU("amx x4", 1, 100, ManufacturerCountry.China));
        Computer computer18 = new Computer("Personal3", 2003, 1, 1000, new HardDisk("One of the best", hdType.SSD, 250, ManufacturerCountry.India), new CPU("amx 3", 1, 100, ManufacturerCountry.China));
        Computer computer19 = new Computer("Personal3", 2012, 1, 500, new HardDisk("One of the best", hdType.HDD, 900, ManufacturerCountry.China), new CPU("i7", 1, 100, ManufacturerCountry.China));
        Computer computer20 = new Computer("Personal3", 2011, 1, 3500, new HardDisk("One of the best", hdType.SSD, 750, ManufacturerCountry.Usa), new CPU("amx 3", 1, 100, ManufacturerCountry.China));
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);
        computers.add(computer8);
        computers.add(computer9);
        computers.add(computer10);
        computers.add(computer11);
        computers.add(computer12);
        computers.add(computer13);
        computers.add(computer14);
        computers.add(computer15);
        computers.add(computer16);
        computers.add(computer17);
        computers.add(computer18);
        computers.add(computer19);
        computers.add(computer20);

//        year > 2010
//        for(Computer computer: computers){
//            if(computer.getYear() > 2010){
//                System.out.println(computer);
//            }
//        }

//        year > 2010 & country = china
//        for(Computer computer: computers){
//            if(computer.getYear() > 2010 && computer.getHardDisk().getHdCountry() == ManufacturerCountry.China){
//                System.out.println(computer);
//            }
//        }

//        year > 2010 & country != china
//        for(Computer computer: computers){
//            if(computer.getYear() > 2010 && computer.getHardDisk().getHdCountry() != ManufacturerCountry.China){
//                System.out.println(computer);
//            }
//        }

//        disk memory > 500
//        for(Computer computer: computers){
//            if(computer.getHardDisk().getDiskMemory() > 500){
//                System.out.println(computer);
//            }
//        }

//        disk type ssd & disk memory > 500 & cpu type i7
//        for(Computer computer: computers){
//            if(computer.getHardDisk().getHddType().equals(hdType.SSD) && computer.getHardDisk().getDiskMemory() > 500 && computer.getCpu().getType().equals("i7")){
//                System.out.println(computer);
//            }
//        }

//        disk type ssd & disk memory > 500 & cpu type i7 & sort by price
//        for(Computer computer: computers){
//            if(computer.getHardDisk().getHddType().equals(hdType.SSD) && computer.getHardDisk().getDiskMemory() > 500 && computer.getCpu().getType().equals("i7")){
//                System.out.println(computer);
//            }
//        }
    }
}
