package consumer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {

  @JsonProperty("Account Number")
  private String accountNumber;
  @JsonProperty("Transaction Amount")
  private String transactionAmount;
  @JsonProperty("Name")
  private String name;
  @JsonProperty("Product")
  private String product;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(String transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

}
