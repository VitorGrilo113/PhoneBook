import java.util.Scanner;

public class PhoneBookTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        int option;

        do {
            System.out.println("---Agenda Telefônica---");
            System.out.println("Digite:");
            System.out.println("1.Adicionar Contato.");
            System.out.println("2.Listar Contatos.");
            System.out.println("3.Procurar Contato.");
            System.out.println("4.Remover Contato.");
            System.out.println("0.Encerrar Agenda Telefônica.");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Digite o Nome: ");
                    String name = scanner.nextLine();
                    System.out.println("Digite o Número: ");
                    String phone = scanner.nextLine();
                    book.addContact(name,phone);
                    break;

                case 2:
                    book.listMyContacts();
                    break;

                case 3:
                    System.out.println("Digite o Nome/Número do Contato: ");
                    String infoBusca = scanner.nextLine();
                    book.searchMyContacts(infoBusca);
                    break;

                case 4:
                    System.out.println("Digite o Nome/Número do Contato: ");
                    String infoRemove = scanner.nextLine();
                    book.removeContact(infoRemove);
                    break;

                case 0:
                    System.out.println("Encerrando Agenda Telefônica...");
                    break;

                default:
                    System.out.println("Comando Inválido.");
            }

        } while (option != 0);

        scanner.close();
    }
}
