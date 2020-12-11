package parte3_1_API_DE_JAVA;

import java.util.*;

public class TokenizadorDeStrings {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Esribe algo :");
			String input = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(input, ",.");
			while (st.hasMoreTokens() ) {
				String token = st.nextToken();
				System.out.println(token);
			}
		} catch (Exception e) {
			System.out.println("algo ha salido mal");
		}
	}
}
