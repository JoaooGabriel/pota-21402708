public class BuscaBinaria {
  private Client[] clientArray;
  private int count = 0;

  public BuscaBinaria(Client[] clients) {
    this.clientArray = clients;
  }

  public String find(String name) {
    for (Client client : clientArray) {
      if (client.getName().equals(name)) {
        return print(client, count);
      }
    }

    return "\nCliente não encontrado\n" + "Número de comparações: " + count + "\n";
  }

  public String print(Client client, int countNumber) {
    return "\nNúmero de comparações: " + countNumber + "\nDados do cliente {\n" + client.getAllDataClient()
        + "\n}\n";
  }
}
