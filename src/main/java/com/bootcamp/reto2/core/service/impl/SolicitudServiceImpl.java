package com.bootcamp.reto2.core.service.impl;

import com.bootcamp.reto2.core.documents.SolicitudDocument;
import com.bootcamp.reto2.core.dto.SolicitudDto;
import com.bootcamp.reto2.core.repository.SolicitudRepository;
import com.bootcamp.reto2.core.service.SolicitudService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitudServiceImpl implements SolicitudService {
    @Autowired
    SolicitudRepository solicitudRepository;


    @Override
    public List<SolicitudDto> getSolicitud() {
        List <SolicitudDto> solicitudDtos = new ArrayList<>();
        solicitudRepository.findAll().forEach(document -> {
            SolicitudDto solicitudDto = new SolicitudDto();
            BeanUtils.copyProperties(document, solicitudDto);
            solicitudDtos.add(solicitudDto);
        });
        return solicitudDtos;
    }

    @Override
    public SolicitudDto saveSolicitud(SolicitudDto dto) {
        SolicitudDocument solicitudDocument= new SolicitudDocument();
        BeanUtils.copyProperties(dto,solicitudDocument);
        SolicitudDocument save = solicitudRepository.save(solicitudDocument);
        dto.setId(save.getId());
        return dto;
    }
}
