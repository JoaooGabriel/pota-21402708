import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
  private static Client[] clients = new Client[4];

  public static void main(String[] args) throws Exception {
    readFile();
    Scanner keyboard = new Scanner(System.in);
    BuscaBinaria find = new BuscaBinaria(clients);

    do {
      switch (selectOperation()) {
        case 1:
          System.out.println("Nome do cliente");
          String name = keyboard.nextLine();

          while (name.length() == 0) {
            System.out.println("\nPor favor, insira o nome do cliente.");
            name = keyboard.nextLine();
          }

          System.out.println(find.find(name));
          break;

        case 2:
          System.out.println("Até logo!");
          break;

        default:
          System.out.println("Invalid option!");
          break;
      }
    } while (selectOperation() != 2);

    keyboard.close();
  }

  public static int selectOperation() {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("O que deseja fazer?" + "\n" + "1 - Buscar cliente" + "\n" + "2 - Sair");

    int operations = keyboard.nextInt();

    return operations;
  }

  public static void readFile() {
    try {
      File file = new File("C:/Users/Joao Caetano/Documents/Faculdade/POTA/pota-21402708/assets/arquivoDados.csv");
      Scanner scanner = new Scanner(file);
      int index = 0;

      while (scanner.hasNextLine()) {
        String linha = scanner.nextLine();
        String[] partes = linha.split(",");
        clients[index] = new Client();

        clients[index].setName(partes[0]);
        clients[index].setGender(partes[1]);
        clients[index].setAddress(partes[2]);
        clients[index].setCity(partes[3]);
        clients[index].setEmail(partes[4]);
        clients[index].setPhone(partes[5]);
        clients[index].setAge(partes[6]);

        index++;
      }

      scanner.close();
    } catch (IOException err) {
      System.out.println(err.getMessage());
    }
  }
}
