package weather;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import weather.ipma_client.IpmaCityForecast;
import weather.ipma_client.IpmaService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PipedWriter;
//import java.util.logging.Logger;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    private static int CITY_ID_AVEIRO = 1010500;
    /*
    aveiro= 101 0 500
    loggers provide a better alternative to System.out.println
    https://rules.sonarsource.com/java/tag/bad-practice/RSPEC-106
     */
    private static final Logger logger = LogManager.getLogger(WeatherStarter.class.getName());

    public static void  main(String[] args ) {

        /*
        get a retrofit instance, loaded with the GSon lib to convert JSON into objects
         */

        CITY_ID_AVEIRO = Integer.parseInt(args[0]);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                logger.debug("city code found info displayed");
                logger.info("\nlocation: " +  forecast.getGlobalIdLocal() + 
                        "\nmax temp for today: " + forecast.getData().
                        listIterator().next().getTMax() + 
                        "\nmin temp for today: " + forecast.getData().listIterator().next().getTMin() +
                        "\ncountry: " + forecast.getCountry() + "\nowner: " + forecast.getOwner() +
                        "\nrain: " + forecast.getData().listIterator().next().getPrecipitaProb() + 
                        "\ncity: "+ forecast.getData().listIterator().next().getLatitude() + " " + forecast.getData().listIterator().next().getLongitude());
            } else {
                logger.debug("city code not found");
                logger.info( "No results!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}