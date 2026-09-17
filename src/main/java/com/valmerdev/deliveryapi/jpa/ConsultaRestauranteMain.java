package com.valmerdev.deliveryapi.jpa;

import com.valmerdev.deliveryapi.FoodDeliveryApiApplication;
import com.valmerdev.deliveryapi.domain.model.Restaurante;
import com.valmerdev.deliveryapi.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaRestauranteMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new SpringApplicationBuilder
                        (FoodDeliveryApiApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
        List<Restaurante> todosRestaurantes = restauranteRepository.todos();
        for (Restaurante restaurante : todosRestaurantes){
            System.out.printf("%s - %f - %s\n",
                    restaurante.getNome(),
                    restaurante.getTaxaFrete(),
                    restaurante.getCozinha().getNome());
        }
    }
}
