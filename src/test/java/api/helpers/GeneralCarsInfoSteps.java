package api.helpers;

import io.restassured.response.Response;

public class GeneralCarsInfoSteps extends BaseApi {
    public static Response getTransportTypes(){
        return get("https://developers.ria.com/auto/categories/?api_key=1vjBQGtIpYDYD2wo39lHbatWh2U7i2XEtgmhbotj");
    }

    public static Response getCarBodyType(){
        return get("https://developers.ria.com/auto/categories/1/bodystyles?api_key=1vjBQGtIpYDYD2wo39lHbatWh2U7i2XEtgmhbotj");
    }


}
