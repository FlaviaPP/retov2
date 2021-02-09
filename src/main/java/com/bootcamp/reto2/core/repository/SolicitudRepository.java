package com.bootcamp.reto2.core.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.bootcamp.reto2.core.documents.SolicitudDocument;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends CosmosRepository<SolicitudDocument, String> {
    //public List findByLastName(String lastName);

}
