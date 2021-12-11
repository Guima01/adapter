public class Escala {

    ITemperatura temperatura;
    TemperaturaAdapter persistencia;

    public Escala() {
        temperatura = new TemperaturaFahrenheit();
        persistencia = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(float Fahrenheit) {
        temperatura.setTemperatura(Fahrenheit);
        persistencia.FahrenheitToCelsius();
    }

    public float getTemperatura() {
        return persistencia.CelsiusToFahrenheit();
    }

    public float getCelsius() {
        return persistencia.getTemperatura();
    }
}
