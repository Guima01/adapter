public class TemperaturaAdapter extends TemperaturaCelsius{

    private ITemperatura temperaturaFahrenheit;

    public TemperaturaAdapter(ITemperatura TemperaturaFahrenheit) {
        this.temperaturaFahrenheit = TemperaturaFahrenheit;
    }

    public float CelsiusToFahrenheit(){
        temperaturaFahrenheit.setTemperatura((this.getTemperatura() * 9/5) + 32);
        return temperaturaFahrenheit.getTemperatura();
    }

    public void FahrenheitToCelsius(){
        this.setTemperatura((temperaturaFahrenheit.getTemperatura() - 32) * 5/9);
    }
}
