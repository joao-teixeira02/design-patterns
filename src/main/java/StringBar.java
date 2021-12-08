public class StringBar extends Bar {

    private boolean inHappy = false;

    @Override
    public boolean isHappyHour() {
        return inHappy;
    }
    public void startHappyHour() {
        inHappy = true;
        notifyObservers();
    }
    public void endHappyHour() {
        inHappy = false;
        notifyObservers();
    }
}
