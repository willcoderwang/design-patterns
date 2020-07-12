public class StatisticsDisplay implements Observer, DisplayElement {

    private int count = 0;
    private float max = 0;
    private float min = 0;
    private float sum = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + sum/count + "/" + max + "/" + min);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        count += 1;
        sum += temp;
        if (count == 1) {
            max = temp;
            min = temp;
        }
        else if (temp > max) {
            max = temp;
        }
        else if (temp < min) {
            min = temp;
        }

        display();
    }
}
