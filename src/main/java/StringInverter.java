public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());
        stringBuilder.reverse();
        drink.setText(stringBuilder.toString());
    }
}
