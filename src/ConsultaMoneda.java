import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Double buscaMoneda(String symbolMoney){
        String id = "f5aa9b60515f40329cb019cc7ec7c278";
        URI direccion = URI.create("https://openexchangerates.org/api/latest.json?app_id="+id+"&symbols="+symbolMoney);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);
            //Obtener el valor de la tasa de cambio
            Double tasaCambio = moneda.rates().get(symbolMoney.toUpperCase());
            if (tasaCambio == null){
                throw new RuntimeException("No se encontró la tasa de cambio para " + symbolMoney);
            }
            return tasaCambio; //Devuelve la tasa de Cambio
        } catch (Exception e){
            throw new RuntimeException("Error al obtener la tasa de cambio.");
        }
    }

}
