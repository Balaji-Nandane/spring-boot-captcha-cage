package com.mightyjava.controller;

import com.mightyjava.modal.Employee;
import com.mightyjava.modal.Expense;
import com.mightyjava.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ExpenseController {

    @Autowired
    ExpenseRepository repository;

    private Expense expObject;

    private String message;

    @GetMapping("/addExpense")
    public String addExpense(Model model) {
        //System.out.print("\n /addExpense");
        if(expObject == null) {
            expObject = new Expense();
        }
        model.addAttribute("message", message);
        model.addAttribute("expense", expObject);
        return "addExpense";
    }



    @PostMapping("/saveExpense")
    public String saveExpense(@ModelAttribute("expense") Expense expense, HttpServletRequest request) {
        expObject = expense;
       // System.out.print("\n inside /saveExpense");

        Expense e=repository.save(expObject);
        //System.out.println("NEw>>>>>>"+e);

        return "redirect:/listExpense";
        }


    /*@GetMapping("/addExpense2")
    public String addExpense2(Model model) {
        if(expObject == null) {
            expObject = new Expense();
        }
        model.addAttribute("message", message);
        model.addAttribute("expense", expObject);
        model.addAttribute("message", message);
        model.addAttribute("expenses", repository.listItemsWithPriceOver(10));
        return "listExpense";
        //return "addExpense";
    }*/

    @GetMapping("/listExpense")
    public String listExpenses(Model model) {
        //System.out.println("\nlistExpense");

        message = null;
        expObject = null;
        List list=repository.listItemsWithPriceOver(10);
        System.out.print("list..."+list);
        model.addAttribute("expenseList",list);
        return "listExpense";
    }

}
