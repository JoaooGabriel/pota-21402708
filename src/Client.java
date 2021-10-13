public class Client {
  private String name, gender, address, city, email, phone, age;

  public void setAddress(String address) {
    this.address = address;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAllDataClient() {
    return "Nome: " + this.name + "\nGênero: " + this.gender + "\nEndereço: " + this.address
        + "\nCidade: " + this.city + "\nE-mail: " + this.email + "\nTelefone: " + this.phone + "\nIdade: " + this.age;
  }
}
