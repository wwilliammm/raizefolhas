package com.raizefolha.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SiteController {
    
    // Método para exibição da primeira tela
    @GetMapping
    public String carregarPaginaIndex() {
        return "index";
    }

    // Método para exibição da Página de Login
    @GetMapping("/login")
    public String carregarPaginaLogin() {
        return "login";
    }

    // Método para exibição da Página de Cadastro de Usuário

}
