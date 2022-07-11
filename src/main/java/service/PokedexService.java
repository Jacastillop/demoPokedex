package service;

import com.google.gson.Gson;
import model.Pokemon;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class PokedexService {
    static final OkHttpClient client = new OkHttpClient();

    public static String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    public static Pokemon getPokemon(Integer id) throws IOException {
        String url = String.format("https://pokeapi.co/api/v2/pokemon/%d/", id);
        String response = run(url);
        final Gson gson = new Gson();
        return gson.fromJson(response, Pokemon.class);
    }
}
