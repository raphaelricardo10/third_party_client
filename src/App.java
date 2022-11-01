import com.learnwebservices.services.tempconverter.TempConverterEndpointServiceStub;
import com.learnwebservices.services.tempconverter.TempConverterEndpointServiceStub.CelsiusToFahrenheitRequest;
import com.learnwebservices.services.tempconverter.TempConverterEndpointServiceStub.CelsiusToFahrenheitRequestE;

public class App {
    public static void main(String[] args) throws Exception {
        TempConverterEndpointServiceStub stub = new TempConverterEndpointServiceStub("https://apps.learnwebservices.com/services/tempconverter?wsdl");
        CelsiusToFahrenheitRequest request = new CelsiusToFahrenheitRequest();
        request.setTemperatureInCelsius(32.0);

        CelsiusToFahrenheitRequestE requestE = new CelsiusToFahrenheitRequestE();
        requestE.setCelsiusToFahrenheitRequest(request);

        stub.celsiusToFahrenheit(requestE).getCelsiusToFahrenheitResponse().getTemperatureInFahrenheit();

        double temperatureInFahrenheit = stub.celsiusToFahrenheit(requestE).getCelsiusToFahrenheitResponse().getTemperatureInFahrenheit();

        System.out.println(temperatureInFahrenheit);
    }
}
