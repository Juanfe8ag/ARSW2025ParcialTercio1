package edu.eci.arsw.parcial.bolsaValores.controller;


import edu.eci.arsw.parcial.bolsaValores.Impl.TimeSeriesRep;
import edu.eci.arsw.parcial.bolsaValores.model.DataSymbol;
import edu.eci.arsw.parcial.bolsaValores.model.FunctionType;
import edu.eci.arsw.parcial.bolsaValores.model.TimeSeries;
import edu.eci.arsw.parcial.bolsaValores.services.BolsaValoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(value = "/bolsaValores")
public class BolsaValoresAPIController {

    @Autowired
    private BolsaValoresServices bolsaValoresServices;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getInfo(@PathVariable FunctionType function, @PathVariable String symbol) {
        try {
            TimeSeries informacion = bolsaValoresServices.getInformation(function, symbol);
            Set<TimeSeries> request.get(${apikey})
            return new ResponseEntity<>(informacion, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error retrieving blueprints", HttpStatus.NOT_FOUND);
        }
    }
}
