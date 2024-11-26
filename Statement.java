import java.util.Enumeration;

public abstract class Statement {

  // Método Template
  public String value(Customer aCustomer) {
    String result = getHeader(aCustomer);

    Enumeration<Rental> rentals = aCustomer.getRentals();
    while (rentals.hasMoreElements()) {
      Rental each = rentals.nextElement();
      result += getRentalLine(each);
    }

    result += getFooter(aCustomer);
    return result;
  }

  // Métodos abstratos que serão implementados nas subclasses
  protected abstract String getHeader(Customer aCustomer);

  protected abstract String getRentalLine(Rental rental);

  protected abstract String getFooter(Customer aCustomer);
}
