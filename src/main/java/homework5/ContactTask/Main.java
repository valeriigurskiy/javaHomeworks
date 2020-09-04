package homework5.ContactTask;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
//        Створити 10 контаків (2 з яких будуть однаковими) та занести їх в базу.
        crud.create(new Contact(1,"Ivan", Company.Microsoft, "Ivanov", "Ivan1@gmail.com", 999999, Department.Factory));
        crud.create(new Contact(2,"Petro", Company.Intel, "Ivanov", "Petro1@gmail.com", 999999, Department.Tech));
        crud.create(new Contact(6,"Stas", Company.Apple, "Ivanov", "Stas1@gmail.com", 999999, Department.Factory));
        crud.create(new Contact(4,"Vadim", Company.Microsoft, "Ivanov", "Vadim1@gmail.com", 999999, Department.Tech));
        crud.create(new Contact(7,"Ivan", Company.Intel, "Ivanov", "Ivan2@gmail.com", 999999, Department.Support));
        crud.create(new Contact(3,"Petro", Company.Apple, "Ivanov", "Petro2@gmail.com", 999999, Department.Tech));
        crud.create(new Contact(3,"Stas", Company.Apple, "Ivanov", "Stas2@gmail.com", 999999, Department.Factory));
        crud.create(new Contact(5,"Vadim", Company.Intel, "Ivanov", "Vadim2@gmail.com", 999999, Department.Tech));
        crud.create(new Contact(9,"Petro", Company.Apple, "Ivanov", "Petro3@gmail.com", 999999, Department.Support));
        crud.create(new Contact(8,"Stas", Company.Intel, "Ivanov", "Stas3@gmail.com", 999999, Department.Factory));
        crud.create(new Contact(8,"Ivan", Company.Microsoft, "Ivanov", "Ivan3@gmail.com", 999999, Department.Support));
        crud.create(new Contact(10,"Vadim", Company.Apple, "Ivanov", "Vadim3@gmail.com", 999999, Department.Tech));

//        знайти всі унікальні контакти
//        crud.contacts.stream().distinct().forEach(System.out::println);

//        знайти всі унікальні контакти з певного департаменту.
//        List<Contact> collect = crud.contacts.stream().distinct().filter(contact -> contact.getDepartment() == Department.Factory).collect(Collectors.toList());
//        System.out.println(collect);

//        знайти всі унікальні контакти з певного департаменту посортувавши їх по імейлу
//        List<Contact> collect = crud.contacts.stream().distinct().filter(contact -> contact.getDepartment() == Department.Factory).collect(Collectors.toList());
//        collect.sort((contact1, contact2) -> contact1.getEmail().compareTo(contact2.getEmail()));
//        collect.stream().forEach(System.out::println);

//        знайти всі унікальні контакти згрупувавши їх по компанії
//        List<Contact> contactsFromFactoryDepartment = crud.contacts.stream().distinct().filter(contact -> contact.getDepartment() == Department.Factory).collect(Collectors.toList());
//        List<Contact> contactsFromSupportDepartment = crud.contacts.stream().distinct().filter(contact -> contact.getDepartment() == Department.Support).collect(Collectors.toList());
//        List<Contact> contactsFromTechDepartment = crud.contacts.stream().distinct().filter(contact -> contact.getDepartment() == Department.Tech).collect(Collectors.toList());
//
//        contactsFromFactoryDepartment.stream().forEach(System.out::println);
//        contactsFromSupportDepartment.stream().forEach(System.out::println);
//        contactsFromTechDepartment.stream().forEach(System.out::println);


//        crud.readAll();

//        crud.readOneObject(1);

//        crud.delete(1);
//        crud.readAll();

//        Contact updateContact = new Contact(11,"Vadim", Company.Apple, "Ivanov", "Vadim4@gmail.com", 999999, Department.Tech);
//        crud.update(1,updateContact);






    }
}
