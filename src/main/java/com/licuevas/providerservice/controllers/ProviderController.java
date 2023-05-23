package com.licuevas.providerservice.controllers;

import com.licuevas.providerservice.dto.ProviderDto;
import com.licuevas.providerservice.dto.ProviderWithoutClientIdDto;
import com.licuevas.providerservice.services.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping(path = "/providers")
@ResponseBody
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
