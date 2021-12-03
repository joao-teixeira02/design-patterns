import java.util.List;

public class StringRecipe {

    private List<StringTransformer> stringTransformerList;

    public StringRecipe(List<StringTransformer> transformers) {
        this.stringTransformerList = transformers;
    }
    public void mix(StringDrink drink) {
        for(StringTransformer s: stringTransformerList) {
            s.execute(drink);
        }
    }
}
