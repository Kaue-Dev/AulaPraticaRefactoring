public abstract class Price {
  // Método abstrato para retornar o código de preço
  public abstract int getPriceCode();

  // Método abstrato para calcular o valor da cobrança
  public abstract double getCharge(int daysRented);
}
