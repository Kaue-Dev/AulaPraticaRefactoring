import java.util.Vector;
import java.util.Enumeration;

public class Customer {

  private String _name;
  private Vector<Rental> _rentals = new Vector<>();

  public String getName() {
    return _name;
  }

  public Enumeration<Rental> getRentals() {
    return _rentals.elements();
  }

  public double getTotalCharge() {
    double totalCharge = 0;
    Enumeration<Rental> rentals = getRentals();
    while (rentals.hasMoreElements()) {
      Rental rental = rentals.nextElement();
      totalCharge += rental.getCharge();
    }
    return totalCharge;
  }

  public int getTotalFrequentRenterPoints() {
    int totalPoints = 0;
    Enumeration<Rental> rentals = getRentals();
    while (rentals.hasMoreElements()) {
      Rental rental = rentals.nextElement();
      totalPoints += rental.getFrequentRenterPoints();
    }
    return totalPoints;
  }

  // Chama o método value() da classe Statement
  public String statement() {
    return new TextStatement().value(this);
  }

  // Chama o método value() da classe Statement
  public String htmlStatement() {
    return new HtmlStatement().value(this);
  }
}
