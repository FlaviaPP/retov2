package com.bootcamp.reto2.api;

import com.bootcamp.reto2.core.dto.SolicitudDto;
import com.bootcamp.reto2.core.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/product")
public class ProductController {

    @Autowired
    SolicitudService solicitudService;
    @GetMapping
    public List <SolicitudDto> getStudents() {

        return solicitudService.getSolicitud();
    }
}
