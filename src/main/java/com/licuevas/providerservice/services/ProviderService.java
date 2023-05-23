package com.licuevas.providerservice.services;

import com.licuevas.providerservice.database.repository.ProviderRepository;
import com.licuevas.providerservice.dto.ProviderDto;
import com.licuevas.providerservice.dto.ProviderWithoutClientIdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProviderService {
    private final ProviderRepository providerRepository;

    public Collection<ProviderDto> getAllProviders() {
        return providerRepository.findAllAndMapToDto();
    }
    public Collection<ProviderWithoutClientIdDto> getAllProvidersForClientId(long clientId) {
        return this.providerRepository.findAllByClientId(clientId);
    }
}
