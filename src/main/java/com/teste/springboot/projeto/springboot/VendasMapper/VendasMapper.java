package com.teste.springboot.projeto.springboot.VendasMapper;

import com.teste.springboot.projeto.springboot.Model.VendasModel;
import com.teste.springboot.projeto.springboot.VendasDTO.VendasDTO;
import org.springframework.stereotype.Component;

@Component

public class VendasMapper {


    public VendasModel map(VendasDTO vendasDTO){
        VendasModel vendasModel = new VendasModel();
        vendasModel.setId(vendasDTO.getId());
        vendasModel.setProduto(vendasDTO.getProduto());
        vendasModel.setValor(vendasDTO.getValor());

        return vendasModel;
    }

    public VendasDTO map(VendasModel vendasModel){
        VendasDTO vendasDTO = new VendasDTO();
        vendasDTO.setId(vendasModel.getId());
        vendasDTO.setProduto(vendasModel.getProduto());
        vendasDTO.setValor(vendasModel.getValor());

        return vendasDTO;
    }


}

