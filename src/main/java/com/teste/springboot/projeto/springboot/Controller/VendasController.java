package com.teste.springboot.projeto.springboot.Controller;

import com.teste.springboot.projeto.springboot.Service.VendasService;
import com.teste.springboot.projeto.springboot.Model.VendasModel;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class VendasController {

    @Autowired
    private VendasService vendasService;



    // Criar produto (CREATE)
    @PostMapping("/criar")
    public VendasModel criar(@RequestBody VendasModel vendasModel){
        return vendasService.cadastroProdutos(vendasModel);
    }

    // Ver produtos (READ)
    @GetMapping("/listar")
    public List<VendasModel> listar(){
        return vendasService.listar();
    }

    //Listar por id
    @GetMapping("/listar/{id}")
    public VendasModel listarPorId(@PathVariable Long id) {
        return vendasService.listarPorId(id);

    }

    //deletar por id
    @DeleteMapping("/deletar/{id}")
    public void deletarPorID(@PathVariable Long id){
        vendasService.deletarPorId(id);
    }

}






