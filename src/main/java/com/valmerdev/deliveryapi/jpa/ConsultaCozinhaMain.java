package com.valmerdev.deliveryapi.jpa;

import com.valmerdev.deliveryapi.FoodDeliveryApiApplication;
import com.valmerdev.deliveryapi.domain.model.Cozinha;
import com.valmerdev.deliveryapi.domain.repository.CozinhaRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.List;

public class ConsultaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new SpringApplicationBuilder
                        (FoodDeliveryApiApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
        List<Cozinha> todasCozinhas = cozinhas.todas();
        for (Cozinha cozinha : todasCozinhas){
            System.out.println(cozinha.getNome());
        }
    }
}
