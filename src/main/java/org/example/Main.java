package org.example;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      try {
        System.out.print("携帯電話番号を入力してください: ");
        String phoneNumber = scanner.next();
        scanner.nextLine();
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator(phoneNumber);
        phoneNumberValidator.phoneNumbervalidate(phoneNumber);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

  }
}