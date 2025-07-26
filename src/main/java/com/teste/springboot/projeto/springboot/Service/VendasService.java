package com.teste.springboot.projeto.springboot.Service;

import com.teste.springboot.projeto.springboot.Model.VendasModel;
import com.teste.springboot.projeto.springboot.Repository.VendasRepository;

import com.teste.springboot.projeto.springboot.Model.VendasModel;
import com.teste.springboot.projeto.springboot.Repository.VendasRepository;
import com.teste.springboot.projeto.springboot.VendasDTO.VendasDTO;
import com.teste.springboot.projeto.springboot.VendasMapper.VendasMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class VendasService {


    private VendasRepository vendasRepository;
    private VendasMapper vendasMapper;

    public VendasService(VendasRepository vendasRepository, VendasMapper vendasMapper) {
        this.vendasRepository = vendasRepository;
        this.vendasMapper = vendasMapper;
    }

    // Cadastro De produtos (CREATE)
    public VendasDTO cadastroProdutos(VendasDTO vendasDTO){

        if (vendasDTO.getProduto() == null || vendasDTO.getProduto().trim().isEmpty()){
            System.out.println("Produto nao pode ser cadastrado!");
            return null;
        }
        if (vendasDTO.getValor() <= 0){
            System.out.println("Valor nao pode ser cadastrado!");
        return null;
        }

        VendasModel vendasModel = vendasMapper.map(vendasDTO);
       vendasModel = vendasRepository.save(vendasModel);

       return vendasMapper.map(vendasModel);
    }



    // Listar produtos (READ)
    public List<VendasDTO> listar(){
      List <VendasModel> v =  vendasRepository.findAll();
      return v.stream().
              map(vendasMapper :: map).
              collect(Collectors.toList());
    }


    // Listar por id
    public  VendasDTO listarPorId(Long id){
       Optional <VendasModel> listarId1 = vendasRepository.findById(id);
       return listarId1.map(vendasMapper ::map)
               .orElse(null);
    }

    // deletar por id

    public void deletarPorId(Long id){
        vendasRepository.deleteById(id);
    }


}
