
public class RomanNumerals {
	public char convertToInteger(String romanNum) {
		//I V X  L  C   D   M
		//1 5 10 50 100 500 1000
		
		Integer out  = 0;
		char[] romanNumberSplitted = romanNum.toCharArray();
		try{
			int I = 0;
			int X = 0;
			int C = 0;
			int M = 0;
			for(char lett: romanNumberSplitted){
				if(lett == 'I') I++;
				if(lett == 'X') X++;
				if(lett == 'C') C++;
				if(lett == 'M') M++;
				
				System.out.println(lett);
				System.out.println(I);
				if(I > 3 )
					throw new Exception("Le lettere I, X, C, M possono essere scritte massimo 3 volte");
			}
		}catch(Exception e){
			System.out.print(e.getMessage());
			}
		return romanNumberSplitted[0];		
	}
}
