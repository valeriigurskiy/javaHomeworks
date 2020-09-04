package homework5.ContactTask;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CRUD {
    List<Contact> contacts = new LinkedList<>();
//    create object in list
    void create(Contact contact){
        contacts.add(contact);
    }

//    read all objects from list
    void readAll(){
        contacts.stream().forEach(System.out::println);
    }

//    read one object by printed id
    void readOneObject(int contactId) {
        System.out.println(contacts.stream().distinct().filter(contact -> contact.getId() == contactId).collect(Collectors.toList()));
    }

//    delete one object by printed id
    void delete(int contactId){
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact next = iterator.next();
            if(next.getId() == contactId){
                iterator.remove();
                System.out.println("Contact successfuly removed");
            }
        }
    }

//    update accepts id & contant. delete existing contact by printed id and create new contact by printed contact
    void update(int contactId, Contact contact){
        contacts.removeIf(next -> next.getId() == contactId);
        contacts.add(contact);
        System.out.println("Contact successfuly updated");
    }
}
