package dev.andreina.ex_amstrong_number;

public class armstrongNumber {

  public static boolean isArmstrongNumber (int number) {

  int originalNumber = number;
  int sum = 0;
  int numberOfDigits= String.valueOf(number).length();

  

  while (number>0) {

    int digits= number % 10;
    sum += (Math.pow(digits,numberOfDigits));
    number= number/ 10;
    
  }

  return sum == originalNumber;

}
    
  public static void main(String[] args) {
    int [] casesOfNumbers= {371, 1634, 351, 2015};

    for (int caseOfNumber:casesOfNumbers) {

        System.out.println("El número " + caseOfNumber + " es un número armstrong? " + isArmstrongNumber(caseOfNumber));
    }


}
}
