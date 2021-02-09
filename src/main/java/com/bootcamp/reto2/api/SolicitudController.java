package com.bootcamp.reto2.api;


import com.bootcamp.reto2.core.dto.SolicitudDto;
import com.bootcamp.reto2.core.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/solicitud")
public class SolicitudController  {

    @Autowired
    SolicitudService solicitudService;

    @GetMapping
    public List<SolicitudDto> getStudents(){

        return solicitudService.getSolicitud();
    }
    @PostMapping
    public SolicitudDto saveSolicitud(@RequestBody SolicitudDto dto){
        return solicitudService.saveSolicitud(dto);
        //return buildSuccessResponse(solicitudService.saveSolicitud(dto));

    }
}
