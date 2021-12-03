public class StringReplacer implements StringTransformer{
    private Character s1, s2;
    public StringReplacer(Character s1, Character s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(s1, s2));
    }
}
