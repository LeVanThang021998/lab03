/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap02;

/**
 *
 * @author ADMIN
 */
public class Account {
    // Khai bao thanh phan du lieu
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void credit (int amount)
    {
        balance += amount;
    }
    public void debit (int amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
        }else
        {
            System.out.println("Giao dich rut tien that bai");
        }
    }
    public void tranferTo(Account other, int amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            other.balance += amount;
        }else
        {
            System.out.println("Giao dich chuyen khoan that bai");
        }
    }
}