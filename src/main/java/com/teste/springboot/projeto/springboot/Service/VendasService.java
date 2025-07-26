package com.teste.springboot.projeto.springboot.Service;

import com.teste.springboot.projeto.springboot.Model.VendasModel;
import com.teste.springboot.projeto.springboot.Repository.VendasRepository;

import com.teste.springboot.projeto.springboot.Model.VendasModel;
import com.teste.springboot.projeto.springboot.Repository.VendasRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VendasService {


    private VendasRepository vendasRepository;


    // Cadastro De produtos (CREATE)
    public VendasModel cadastroProdutos(VendasModel vendasModel){

        if (vendasModel.getProduto() == null || vendasModel.getProduto().trim().isEmpty()){
            System.out.println("Produto nao pode ser cadastrado!");
            return null;
        }
        if (vendasModel.getValor() <= 0){
            System.out.println("Valor nao pode ser cadastrado!");
        return null;
        }

        VendasModel vendasModel1 = vendasRepository.save(vendasModel);
        return vendasModel1;
    }

    // Listar produtos (READ)
    public List<VendasModel> listar(){
      List <VendasModel> v =  vendasRepository.findAll();
      return v;
    }

    // Listar por id
    public  VendasModel listarPorId(Long id){
       Optional <VendasModel> listarId1 = vendasRepository.findById(id);
       return listarId1.orElse(null);
    }

    // deletar por id

    public void deletarPorId(Long id){
        vendasRepository.deleteById(id);
    }


}
