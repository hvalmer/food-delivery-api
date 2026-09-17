package com.valmerdev.deliveryapi.jpa;

import com.valmerdev.deliveryapi.FoodDeliveryApiApplication;
import com.valmerdev.deliveryapi.domain.model.FormaPagamento;
import com.valmerdev.deliveryapi.domain.repository.FormaPagamentoRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaFormaPagamentoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new SpringApplicationBuilder
                        (FoodDeliveryApiApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
        List<FormaPagamento> todasFomasPagamento = formaPagamentoRepository.listar();
        for (FormaPagamento formaPagamento : todasFomasPagamento){
            System.out.printf("%s - %f - %s\n",
                    formaPagamento.getDescricao());
        }
    }
}
