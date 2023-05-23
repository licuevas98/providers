package com.licuevas.providerservice.database.repository;

import com.licuevas.providerservice.dto.ProviderDto;
import com.licuevas.providerservice.database.models.ProviderEntity;
import com.licuevas.providerservice.dto.ProviderWithoutClientIdDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProviderRepository extends JpaRepository<ProviderEntity, Long> {
    @Query("select new com.licuevas.providerservice.dto.ProviderWithoutClientIdDto(providerEntity.providerUid, providerEntity.name, providerEntity.date) " +
            "from ProviderEntity providerEntity " +
            "where providerEntity.clientUid = :clientId")
    Collection<ProviderWithoutClientIdDto> findAllByClientId(@Param("clientId") long clientId);


    @Query("select new com.licuevas.providerservice.dto.ProviderDto(providerEntity.providerUid, providerEntity.name, providerEntity.date, providerEntity.clientUid) " +
            "from ProviderEntity providerEntity")
    Collection<ProviderDto> findAllAndMapToDto();
}
