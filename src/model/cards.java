package src.model;

public class cards {

  suits cardSuit;
  values cardValues;
  public String identifier;

  public cards (values, suits) {
    this.cardValues = values;
    this.cardSuits = suits;

    identifier = "values" + "of" + "suits";
  }

}
