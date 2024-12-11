package com.raizefolha.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.raizefolha.api.model.meal.*;

@Controller
@RequestMapping("/meal")
public class MealController {
    
    @Autowired
    private MealRepository repository;

    // Método para exibição da Página de Refeição
    @GetMapping
    public String carregarPaginaProduto(Model model) {
        model.addAttribute("produto", new MealModel());
        return "meal";
    }

    // Método que grava as informações do cadastro
    @PostMapping
    public String productRegister(MealModel meal) {
        repository.save(meal);
        return "redirect:/meal";
    }







    // @GetMapping("/listar")
    // public List <MealModel> mealList() {
    //     return repository.findAll();
    // }

    // @PostMapping("/cadastrar")
    // public void mealRegister(@RequestBody @Valid RegisterMealData data) {
    //     repository.save(new MealModel(data));
    // }

    // @PutMapping
    // @Transactional
    // public void mealUpdate(@RequestBody UpdateMealData data) {
    //     MealModel meal = repository.getReferenceById(data.id());
    //     meal.updateMeal(data);
    // }

    // @DeleteMapping("/{id}")
    // @Transactional
    // public void mealDelete (@PathVariable Long id) {
    //     repository.deleteById(id);
    // }
}
