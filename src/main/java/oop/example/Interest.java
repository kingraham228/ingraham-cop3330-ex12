package oop.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.NumberFormat;

public class Interest {
    double inputPrincipal;
    double inputIR;
    double inputYears;
    BigDecimal principal;
    BigDecimal ir;
    BigDecimal years;
    BigDecimal accountValue;

    public void setPrincipal(){
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Enter the principal: ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid amount.");
                System.out.println("Enter the principal: ");
            }
            inputPrincipal = input.nextDouble();
            if (inputPrincipal < 0) {
                System.out.println("Principal cannot be a negative value.");
            }
        } while (inputPrincipal < 0);
        principal = BigDecimal.valueOf(inputPrincipal);
    }

    public void setIR(){
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Enter the annual interest rate percentage: ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid rate.");
                System.out.println("Enter the annual interest rate percentage: ");
            }
            inputIR = input.nextDouble();
            if (inputIR < 0) {
                System.out.println("Interest rate cannot be a negative value.");
            }
        } while (inputIR < 0);
        ir = BigDecimal.valueOf((inputIR/100));
    }

    public void setYears(){
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Enter the number of years: ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid amount.");
                System.out.println("Enter the number of years: ");
            }
            inputYears = input.nextDouble();
            if (inputYears < 0) {
                System.out.println("Years cannot be a negative value.");
            }
        } while (inputYears < 0);
        years = BigDecimal.valueOf(inputYears);
    }
    public String calcInterest(){
       BigDecimal rt = ir.multiply(years);
       accountValue = principal.multiply((rt.add(BigDecimal.ONE)));
       accountValue = accountValue.setScale(2, RoundingMode.UP);
        return NumberFormat.getCurrencyInstance().format(accountValue);
    }

    public double getInputIR() {
        return inputIR;
    }

    public BigDecimal getPrincipal() {
       principal= principal.setScale(2, RoundingMode.UP);
        return principal;
    }

    public BigDecimal getYears() {
        years = years.setScale(1, RoundingMode.HALF_UP);
        return years;
    }
}
