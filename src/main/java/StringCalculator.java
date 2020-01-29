public class StringCalculator {

    private final String string;

    public StringCalculator(String s) {
        this.string = s;
    }

    public int calculate() {
        if(string.isEmpty()) return 0;
        if ((string.contains(",") || string.contains("\n")) && containsAnotherCharacter()) return sum(2);
        if(string.contains(",") || string.contains("\n")) return sum(1);
        return stringToInt(string);
    }

    private boolean containsAnotherCharacter() {
        if(containsConcreteCharacter(",") ||(containsConcreteCharacter("\n"))) return true;
        return false;
    }

    private boolean containsConcreteCharacter(String s) {
        return string.indexOf(s, string.indexOf(s) + 1) != -1;
    }

    private int sum(int i) {
        if(i == 2)return (string.contains(","))?
                stringToInt(splitByComma(",",0)) + stringToInt(splitByComma(",",1)) + stringToInt(splitByComma(",",2)):
                stringToInt(splitByComma("\n",0))+ stringToInt(splitByComma("\n",1)) +stringToInt(splitByComma("\n",2));
        return (string.contains(","))?
                stringToInt(splitByComma(",",0)) + stringToInt(splitByComma(",",1)):
                stringToInt(splitByComma("\n",0))+stringToInt(splitByComma("\n",1));
    }

    private String splitByComma(String character,int i) {
        return string.split(character)[i];
    }

    private int stringToInt(String string) {
        return Integer.parseInt(string);
    }
}
