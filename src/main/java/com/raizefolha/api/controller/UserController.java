package com.raizefolha.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.raizefolha.api.model.user.*;


@Controller
@RequestMapping("/usuario")
public class UserController {
    
    @Autowired
    private UserRepository repository;

     // Método de acesso a página de cadastro do Usuário
    @GetMapping
    public String carregarPaginaUser(Model model) {
        model.addAttribute("usuario", new UserModel());
        return "user";
    }

    // Método que grava as informações do cadastro
    @PostMapping
    public String userRegister(UserModel user) {
        repository.save(user);
        return "redirect:/usuario";
    }





    
      // @GetMapping("/listar")
    // public List <UserModel> userList () {
    //     return repository.findAll();
    // }


    // @PutMapping
    // @Transactional
    // public void userUpdate(@RequestBody UpdateUserData data) {
    //     UserModel user = repository.getReferenceById(data.id());
    //     user.updateUser(data);
    // }

    // @DeleteMapping("/{id}")
    // @Transactional
    // public void userDelete (@PathVariable Long id) {
    //     repository.deleteById(id);
    // }

}
