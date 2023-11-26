package solution.Text;

import java.io.Serializable;

public class TextSolution implements Serializable {
    private static final char[] vowels = {
            'E','e', 'U', 'u', 'O', 'o', 'A', 'a', 'I', 'i', 'Y', 'y'
    };
    private String input;
    private String result;
    public TextSolution(){
        input = "Hello world";
    }
    public TextSolution(String text){
        input = text;
    }

    public String getResult() {
        return result;
    }

    public void solutionText(){
        char[] operatedText = this.input.toCharArray();
        for (int n = 0; n < operatedText.length; n++) {
            for (int i = 0; i < operatedText.length; i++) {
                for (int j = 0; j < 12; j++) {
                    if (operatedText[i] == vowels[j]) {
                        operatedText[i] = '-';
                    }
                }
            }
        }
        result = new String (operatedText);
    }
}
