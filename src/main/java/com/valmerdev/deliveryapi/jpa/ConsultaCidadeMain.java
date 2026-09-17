package com.valmerdev.deliveryapi.jpa;

import com.valmerdev.deliveryapi.FoodDeliveryApiApplication;
import com.valmerdev.deliveryapi.domain.model.Cidade;
import com.valmerdev.deliveryapi.domain.repository.CidadeRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCidadeMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new SpringApplicationBuilder
                        (FoodDeliveryApiApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
        List<Cidade> todascidades = cidadeRepository.listar();
        for (Cidade cidade : todascidades){
            System.out.printf("%s - %f - %s\n",
                    cidade.getNome(),
                    cidade.getEstado().getNome());
        }
    }
}
