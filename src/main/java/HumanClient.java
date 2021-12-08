public class HumanClient implements Client{
    private OrderingStrategy strategy;
    HumanClient (OrderingStrategy strategy) {
        this.strategy = strategy;
    }
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    };
    public void happyHourEnded(Bar bar) {strategy.happyHourEnded((StringBar) bar);};
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    };
}
