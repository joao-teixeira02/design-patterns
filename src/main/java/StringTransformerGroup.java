import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> stringTransformer;
    public StringTransformerGroup (List<StringTransformer> transformers) {
        this.stringTransformer = transformers;
    }
    @Override
    public void execute (StringDrink drink) {
        for (StringTransformer s : stringTransformer) {
            s.execute(drink);
        }
    }
}
