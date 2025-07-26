package com.teste.springboot.projeto.springboot.Repository;

import com.teste.springboot.projeto.springboot.Model.VendasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository <VendasModel, Long>  {

    }

