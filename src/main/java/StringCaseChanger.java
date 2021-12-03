public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder("");
        for (Character c: drink.getText().toCharArray()) {
            if (Character.isLowerCase(c)) {
                s.append(Character.toUpperCase(c));
            }
            else{
            s.append(Character.toLowerCase(c));
            }
        }
        drink.setText(s.toString());
    }
}