package com.licuevas.providerservice.dto;

import java.util.Date;

public record ProviderWithoutClientIdDto(Long providerUid, String name, Date date) {}
