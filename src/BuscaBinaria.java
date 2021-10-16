import java.text.Collator;
import java.util.Locale;

public class BuscaBinaria {
  private Client[] clientArray;
  private int count = 0;

  public BuscaBinaria(Client[] clients) {
    this.clientArray = clients;
  }

  public String buscaBinaria(String name, int initial, int end) {
    Collator collator = Collator.getInstance(new Locale("pt", "BR"));
    collator.setStrength(Collator.PRIMARY);

    int meio;

    if (initial > end) {
      return "\nCliente não encontrado\n" + "Número de comparações: " + count + "\n";
    }

    meio = (initial + end) / 2;
    count++;

    int nameEquals = collator.compare(clientArray[meio].getName(), name);

    if (nameEquals == 0) {
      return print(clientArray[meio], count);
    }

    count++;

    if (nameEquals == 1) {
      return (buscaBinaria(name, initial, meio - 1));
    } else {
      return (buscaBinaria(name, meio + 1, end));
    }
  }

  public String print(Client client, int countNumber) {
    return "\nNúmero de comparações: " + countNumber + "\nDados do cliente {\n" + client.getAllDataClient() + "\n}\n";
  }
}
