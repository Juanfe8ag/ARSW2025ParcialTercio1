package edu.eci.arsw.parcial.bolsaValores.model;

public class TimeSeries {

    FunctionType function=null;
    String symbol=null;
    String interval=null;

    public TimeSeries(){
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public void setFunction(FunctionType function) {
        this.function = function;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "TimeSeries{" + "symbol=" + symbol + ", function=" + function + '}';
    }

}
