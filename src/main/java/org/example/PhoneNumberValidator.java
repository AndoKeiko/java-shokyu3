package org.example;

class PhoneNumberValidator {
  private String phoneNumber;

  PhoneNumberValidator(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void phoneNumbervalidate (String phoneNumber) {
    boolean isValid = phoneNumber.matches("^0[789]0-\\d{4}-\\d{4}$");
    if(isValid) {
      System.out.println(phoneNumber + " は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + " は無効な携帯電話番号です");
    }
  }

}
