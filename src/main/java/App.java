import java.io.IOException;

import model.Pokemon;
import service.PokedexService;

public class App {
    static MessagesPokedex messages = MessagesPokedex.getInstance();


    public static void main(String[] args) throws IOException {
        init();
    }

    private static void init() throws IOException {
        messages.showWelcome();
        Pokemon pokemon;
        for (int i = 1; i <6; i++) {
            pokemon = PokedexService.getPokemon(i);
            messages.showPokemon(pokemon);
        }
    }


}
