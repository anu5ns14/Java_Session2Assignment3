
public class PrintPattern {
	public static void main(String[] args) {
		int counter = 2;
			for (int i=1; i<=9; i++){
				
				if (i < 6){
					for (int j=0; j<i;j++){
						System.out.print(j+1);
					
					}
						System.out.println();
				}
				
				else{
					
					
					for (int j=0; j<(i-counter);j++){
						System.out.print(j+1);
					
					}
						System.out.println();
						counter = counter +2 ;
				}
			}
				
	}
}
