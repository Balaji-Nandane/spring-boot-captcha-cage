package com.mightyjava.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item;
    private float amount;
    private String expense_date;


    public Expense() {
    }

    public Expense(String item, float amount,String expense_date) {
        this.item = item;
        this.amount = amount;
        this.expense_date=expense_date;
    }

    public String getExpense_date() {
        return expense_date;
    }

    public void setExpense_date(String expense_date) {
        this.expense_date = expense_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    // getters and setters are hidden for brevity

    @Override
    public String toString() {
        return id + ". " + item + " - " + amount + " INR";
    }
}