package com.greenfoxacademy.bankofsimba.Model;


import java.util.ArrayList;

public class BankAccount {
  private String name;
  private double balance;
  private String currency;
  private String animalType;

  public BankAccount(String name, double balance, String currency, String animalType) {

    this.name = name;
    this.balance = balance;
    this.currency = currency;
    this.animalType = animalType;

  }

  public void createAccount() {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    accounts.add(new BankAccount("Simba", 2000.00, "Zebra", "lion"));
    accounts.add(new BankAccount("Nala", 2020.00, "Zebra", "lion"));
    accounts.add(new BankAccount("Pumba", 2010.00, "Zebra", "warthog"));
    accounts.add(new BankAccount("Timon", 2000.10, "Zebra", "suricate"));


  }


}

