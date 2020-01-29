import java.util.Arrays;
import java.util.List;

public class StringCalculator2 {
    public static final String JUMPLINEORCOMMA = "\n|,";
    private static final String COMMA = ",";
    private static final String JUMPLINE = "\n";
    private String value;

    public StringCalculator2(
            String value) {
        this.value = value;
    }

    public int calculate(){
        if(value.contains(COMMA) || value.contains(JUMPLINE)) return sum(JUMPLINEORCOMMA);
        return value.isEmpty()? 0:stringToInt(value);
    }



    private int stringToInt(String string) {
        return Integer.parseInt(string);
    }

    private int sum(String regex) {
        return (getNumberList(regex).stream()
                .map(this::stringToInt)
                .filter(this::isSmallerThanThousand)
                .reduce(0,Math::addExact));
    }

    private boolean isSmallerThanThousand(int num) {
        return num < 1000;
    }

    private List<String> getNumberList(String s) {
        return Arrays.asList(getNumberArray(s));
    }

    private String[] getNumberArray(String regex) {
        return value.split(regex);
    }

}
