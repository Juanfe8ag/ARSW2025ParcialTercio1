package edu.eci.arsw.parcial.bolsaValores.Impl;

import edu.eci.arsw.parcial.bolsaValores.model.DataSymbol;
import edu.eci.arsw.parcial.bolsaValores.model.TimeSeries;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class TimeSeriesRep {

    private final Map<TimeSeries, DataSymbol> blueprints = new ConcurrentHashMap<>();
}
