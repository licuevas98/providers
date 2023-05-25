package com.licuevas.providerservice.controllers;

import com.licuevas.providerservice.dto.ProviderDto;
import com.licuevas.providerservice.dto.ProviderWithoutClientIdDto;
import com.licuevas.providerservice.services.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/providers")
@RequiredArgsConstructor
public class ProviderController {
    private final ProviderService providerService;

    @GetMapping("/all")
    public Collection<ProviderDto> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping("/{clientId}")
    public Collection<ProviderWithoutClientIdDto> getProvidersForClient(@PathVariable("clientId")long clientId) {
        return providerService.getAllProvidersForClientId(clientId);
    }
}
