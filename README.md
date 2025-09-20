## ARSW Parcial Tercio 1
### Autor: Juan Felipe Ochoa

## Funcionamiento
Lo que se quiere crear para este proyecto es una arquitectura que conecte una API externa llamada
Alpha Vantage. Esta provee informacion de las fluctuaciones de una acción a lo largo de un periodo de tiempo. Tiene varias opciones para verlas: Diaria, semanal, mensual
y por periodos especificos diarios. Aparte conectar dos clientes, uno que pueda hacer peticiones de forma concurrente y uno por interfaz web. 

## Estructura
Se plantea una estructura con una variable TimeSeries con la que se guardan las variables obligatorias para las peticiones,
se plantea un servicio que guarda esas variables y las relaciona con los datos que se pidieron y un controlador, quien envia la peticion HTTP hacia el API mencionado anteriormente. 