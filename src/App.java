import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String text = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< a;i++){
            sb.append(text.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
