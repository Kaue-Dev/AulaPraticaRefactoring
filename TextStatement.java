import java.util.Enumeration;

public class TextStatement extends Statement {

  @Override
  public String value(Customer aCustomer) {
    Enumeration<Rental> rentals = aCustomer.getRentals(); // Parametrização do tipo
    String result = "Rental Record for " + aCustomer.getName() + "\n";
    while (rentals.hasMoreElements()) {
      Rental each = rentals.nextElement();
      // Exibe os detalhes para cada aluguel
      result += "\t" + each.getMovie().getTitle() + "\t" +
          String.valueOf(each.getCharge()) + "\n";
    }
    // Adiciona as linhas finais
    result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    return result;
  }
}