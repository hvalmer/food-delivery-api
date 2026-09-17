package com.valmerdev.deliveryapi.jpa;

import com.valmerdev.deliveryapi.FoodDeliveryApiApplication;
import com.valmerdev.deliveryapi.domain.model.Cozinha;
import com.valmerdev.deliveryapi.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new SpringApplicationBuilder
                        (FoodDeliveryApiApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

        Cozinha cozinha = cozinhaRepository.porId(1L);

        System.out.println(cozinha.getNome());
    }
}
