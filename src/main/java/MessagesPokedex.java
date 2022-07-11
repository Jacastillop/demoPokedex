import model.Pokemon;
import org.jboss.logging.Logger;

public class MessagesPokedex {
    private static final Logger logger = Logger.getLogger(MessagesPokedex.class);
    private static MessagesPokedex instance = null;

    public static MessagesPokedex getInstance() {
        if (instance instanceof MessagesPokedex) {
            return instance;
        } else {
            instance = new MessagesPokedex();
        }
        return instance;
    }

    public void showWelcome() {
        logger.info("Este es un pokedex");
    }

    public void showPokemon(Pokemon pokemon) {
        logger.info(pokemon.toString());
    }

    public void showMessage(String message) {
        logger.info(message);
    }

}
