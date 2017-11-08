package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")                                              // profile mudando para espanhol
@Primary                                                    // não causa conflito com a primary do serviço pois os profiles são diferentes, está setado em app.properties
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        return greetingRepository.getSpanishGreeting();
    }
}
