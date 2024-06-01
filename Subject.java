public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    float getHumidity();
    float getPressure();
    float getTemperature();
}
