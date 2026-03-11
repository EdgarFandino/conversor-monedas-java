package service;

import com.google.gson.Gson;
import model.JsonResponseAPI;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectServiceAPI {

    private static final String API_KEY = "03fb2e10b8abf699ab895051";

    public double convertir(String base, String destino, double cantidad) {

        try {

            String direccion = "https://v6.exchangerate-api.com/v6/"
                    + API_KEY + "/pair/" + base + "/" + destino + "/" + cantidad;

            URL url = new URL(direccion);

            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();

            InputStreamReader reader = new InputStreamReader(conexion.getInputStream());

            Gson gson = new Gson();
            JsonResponseAPI respuesta = gson.fromJson(reader, JsonResponseAPI.class);

            return respuesta.conversion_result;

        } catch (Exception e) {
            System.out.println("Error al consultar la API");
            e.printStackTrace();
        }

        return 0;
    }
}