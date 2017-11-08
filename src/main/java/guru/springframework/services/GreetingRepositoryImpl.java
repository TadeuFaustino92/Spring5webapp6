package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component                                                          //  @Component/@Controller/@Service/@Repository, o spring context trará como um Bean.
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo - Begrüßungsdienst";
    }
}
