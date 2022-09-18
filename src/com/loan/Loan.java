package com.loan;

import java.util.Scanner;

public class Loan {
//    Сумма кредита
    int loanAmount;
//    Количество лет на которое берётся ипотека
    int years;
//    Ежегодный процент
    int interestRate;
//    Дополнительный платеж
    int extraPayment;
//    номер платежного месяца (в случае если кредит оформлен на 10 лет то номера идут от 1 до 120)
    int month;
//    баланс на начало месяца
    double starting_balance;
//    размер платежа за период (месяц)
    double payment;
//    какую сумму от платежа составляет процент который клиент платит банку в текущем месяце
    double interest;
//    сумма которая уходит на погашение тела кредита
    double principal;
//    сумма задолженности, которая остается на конец месяца, после того как был внесен очередной платеж
//    (эту же сумму нужно вывести в качестве STARING_BALANCE в следующем цикле)
    double ending_balance;
//    сколько суммарно денег заплатил банку заемщик в качестве процентов за пользование кредитом на конец текущего периода
    double total_interest;
//    Месячный процент по кредиту
    double R;

    public Loan() {
    }

    public Loan(int loanAmount, int years, int interestRate) {
        this.loanAmount = loanAmount;
        this.years = years;
        this.interestRate = interestRate;
        month = years * 12;
    }

    public Loan(int loanAmount, int years, int interestRate, int extraPayment) {
        this.loanAmount = loanAmount;
        this.years = years;
        this.interestRate = interestRate;
        this.extraPayment = extraPayment;
        month = years * 12;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getExtraPayment() {
        return extraPayment;
    }

    public void setExtraPayment(int extraPayment) {
        this.extraPayment = extraPayment;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getStarting_balance() {
        return starting_balance;
    }

    public void setStarting_balance(double starting_balance) {
        this.starting_balance = starting_balance;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getEnding_balance() {
        return ending_balance;
    }

    public void setEnding_balance(double ending_balance) {
        this.ending_balance = ending_balance;
    }

    public double getTotal_interest() {
        return total_interest;
    }

    public void setTotal_interest(double total_interest) {
        this.total_interest = total_interest;
    }

    void payment(){
        System.out.println("Введите сумму кредита");
        Scanner scanLoanAmount = new Scanner(System.in);
        this.loanAmount = scanLoanAmount.nextInt();
        System.out.println("На сколько лет выдан кредит?");
        Scanner scanYears = new Scanner(System.in);
        this.years = scanYears.nextInt();
        System.out.println("Под какой процент в год?");
        Scanner scanInterestRate = new Scanner(System.in);
        this.interestRate = scanInterestRate.nextInt();
        month = years * 12;
        for (int i = 1; i<=month;i++) {
            System.out.println(i);
        }
        System.out.println("Процент = " + interestRate);
        System.out.println("12 = " + 12);
        double monthInterestRate = 12/interestRate;
        System.out.println("Процент в месяц = " + monthInterestRate);
    }
}
