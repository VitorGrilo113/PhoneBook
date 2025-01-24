import java.util.ArrayList;

public class Book {
    ArrayList <Contact> contacts = new ArrayList<>();


    public void addContact(String name, String phone){
        Contact contact = new Contact(name,phone);
        contacts.add(contact);
        System.out.println("Contato Adicionado");
    }


    public void listMyContacts(){
        for (Contact contact : contacts){
            System.out.println(contact.toString());
        }
    }

    public void searchMyContacts(String info){
        boolean encontrado = false;
        for (Contact contact : contacts){
            if (contact.getName().equalsIgnoreCase(info) || contact.getPhone().equalsIgnoreCase(info)){
                System.out.println(contact.toString());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Contato Não Encontrado;");
        }
    }

    public void removeContact(String info){
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(info) || contact.getPhone().equalsIgnoreCase(info));
        System.out.println("Contato Removido.");

    }
}
