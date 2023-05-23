package com.licuevas.providerservice.dto;

import java.util.Date;

public record ProviderDto(Long providerUid, String name, Date date, Long clientUid) {}
