package api.tests;

import api.helpers.DTOs.GeneralInfoDTO;
import api.helpers.GeneralCarsInfoSteps;
import api.helpers.enums.StatusCode;
import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GeneralCarsInfoTests extends BaseTest{
    @Test
    public void transportTypesTest(){
        Response response = GeneralCarsInfoSteps.getTransportTypes();
        assertThat(response.getStatusCode()).isEqualTo(StatusCode.SUCCESS.getStatus());
        List<String> actualTypes = Arrays.stream(response.as(GeneralInfoDTO[].class)).map(GeneralInfoDTO::getName).collect(Collectors.toList());
        assertThat(actualTypes).contains("Легковые");
    }

    @Test
    public void transportBodyTypesTest(){
        Response response = GeneralCarsInfoSteps.getCarBodyType();
        assertThat(response.getStatusCode()).isEqualTo(StatusCode.SUCCESS.getStatus());
        List<String> actualTypes = Arrays.stream(response.as(GeneralInfoDTO[].class)).map(GeneralInfoDTO::getName).collect(Collectors.toList());
        assertThat(actualTypes).contains("Седан");
    }
}
