package org.harsh.expensebook.controller;


import org.harsh.expensebook.model.Expense;
import org.harsh.expensebook.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Server is up and running";
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @PostMapping(consumes = "application/json")
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseService.createExpense(expense);
    }



}
