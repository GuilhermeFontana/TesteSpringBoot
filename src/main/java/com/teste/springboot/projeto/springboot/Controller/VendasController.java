package com.teste.springboot.projeto.springboot.Controller;

import com.teste.springboot.projeto.springboot.Service.VendasService;
import com.teste.springboot.projeto.springboot.Model.VendasModel;

import com.teste.springboot.projeto.springboot.VendasDTO.VendasDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class VendasController {

    @Autowired
    private VendasService vendasService;



    // Criar produto (CREATE)
    @PostMapping("/criar")
    public ResponseEntity<String> criar(@RequestBody VendasDTO vendasDTO){

        if (vendasDTO.getProduto() == null || vendasDTO.getProduto().trim().isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não possui um NOME!");
        }
        if (vendasDTO.getValor() <= 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não possui um VALOR!");
        }
        vendasService.cadastroProdutos(vendasDTO);
        return ResponseEntity.ok("Produto cadastrado com sucesso!");
    }

    // Ver produtos (READ)
    @GetMapping("/listar")
    public List<VendasDTO> listar(){
        return vendasService.listar();
    }







    //Listar por id
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id) {
        VendasDTO vendasDTO = vendasService.listarPorId(id);

        if (vendasService.listarPorId(id) != null){
       return ResponseEntity.ok(vendasDTO);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não possuimos o id desejado em nosso sistema!");
    }

    //deletar por id
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarProduto (@PathVariable Long id) {

        if (vendasService.listarPorId(id) != null) {
            vendasService.deletar(id);
            return ResponseEntity.ok("Produto do ID: " + id + ". Deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Produto não encontrado!");

        }
    }

}






