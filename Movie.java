public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

  public Movie(String title, int priceCode) {
    _title = title;
    _priceCode = priceCode;
  }

  public int getPriceCode() {
    return _priceCode;
  }

  public void setPriceCode(int arg) {
    _priceCode = arg;
  }

  public String getTitle() {
    return _title;
  }

  public double getCharge(int daysRented) {
    double result = 0;
    switch (_priceCode) {
      case REGULAR:
        result += 2;
        if (daysRented > 2) {
          result += (daysRented - 2) * 1.5;
        }
        break;
      case NEW_RELEASE:
        result += daysRented * 3;
        break;
      case CHILDRENS:
        result += 1.5;
        if (daysRented > 3) {
          result += (daysRented - 3) * 1.5;
        }
        break;
    }
    return result;
  }

  // Novo método que calcula os pontos de locação frequente
  public int getFrequentRenterPoints(int daysRented) {
    if (_priceCode == NEW_RELEASE && daysRented > 1) {
      return 2; // Bônus para novos lançamentos alugados por mais de 1 dia
    }
    return 1; // Padrão: 1 ponto por aluguel
  }
}
