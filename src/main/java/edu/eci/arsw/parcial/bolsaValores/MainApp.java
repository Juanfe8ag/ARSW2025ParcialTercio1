package edu.eci.arsw.parcial.bolsaValores;

import edu.eci.arsw.parcial.bolsaValores.services.BolsaValoresServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    BolsaValoresServices svc = ctx.getBean(BolsaValoresServices.class);
}
