package com.bootcamp.reto2.core.service;

import com.bootcamp.reto2.core.dto.SolicitudDto;

import java.util.List;

public interface SolicitudService {

    SolicitudDto saveSolicitud(SolicitudDto dto);
    List<SolicitudDto> getSolicitud();
}
