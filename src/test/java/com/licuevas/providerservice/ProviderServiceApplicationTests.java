package com.licuevas.providerservice;

import com.licuevas.providerservice.dto.ProviderDto;
import com.licuevas.providerservice.dto.ProviderWithoutClientIdDto;
import com.licuevas.providerservice.services.ProviderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest(classes = ProviderServiceApplication.class)
@ActiveProfiles("test")
class ProviderServiceApplicationTests {
    @Autowired
    private ProviderService providerService;

    @Sql(scripts = "classpath:db/import.sql")
    @ParameterizedTest
    @CsvSource(value = {"1:0", "2:0", "3:0", "4:0", "5:2", "6:2", "7:1", "8:1"}, delimiter = ':')
    void checkAllProvidersForSpecificClientId(String clientId, String amount){
        Collection<ProviderWithoutClientIdDto> allProviders = providerService.getAllProvidersForClientId(Integer.parseInt(clientId));
        assertThat("Expected to be an non-empty array(with one value) but got empty", allProviders.size() == Integer.parseInt(amount));
    }
    @Test
    void checkAllProvidersOnEmptyDatabaseAndExpectEmptyResult(){
        Collection<ProviderDto> allProviders = providerService.getAllProviders();
        assertThat("Expected to be an empty array but got a value", allProviders.size() == 0);
    }
}
