package edu.eci.arsw.parcial.bolsaValores.services;

import edu.eci.arsw.parcial.bolsaValores.Impl.TimeSeriesRep;
import edu.eci.arsw.parcial.bolsaValores.model.FunctionType;
import edu.eci.arsw.parcial.bolsaValores.model.TimeSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;


@Service
public class BolsaValoresServices {

    @Autowired
    TimeSeriesRep timeSeriesRep = null;

    public TimeSeries getInformation(FunctionType function, String symbol){
        TimeSeries timeSeries = new TimeSeries();
        timeSeries.setFunction(function);
        timeSeries.setSymbol(symbol);

        return timeSeries;
    }

}
