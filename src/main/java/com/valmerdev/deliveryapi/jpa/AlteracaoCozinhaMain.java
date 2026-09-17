package com.valmerdev.deliveryapi.jpa;

import com.valmerdev.deliveryapi.FoodDeliveryApiApplication;
import com.valmerdev.deliveryapi.domain.model.Cozinha;
import com.valmerdev.deliveryapi.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AlteracaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new SpringApplicationBuilder
                        (FoodDeliveryApiApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

        Cozinha cozinha = new Cozinha();
        cozinha.setId(1L);
        cozinha.setNome("Brasileira");

        cozinhaRepository.adicionar(cozinha);

    }
}
