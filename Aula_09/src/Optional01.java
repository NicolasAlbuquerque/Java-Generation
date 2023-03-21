import java.util.Optional;

public class Optional01 {



		public static void main(String[] args) {
	        
			String[] palavras = new String[10];
			
			palavras[2]="Genertation Brasil, turma 61";
			//for(var plavra:palavras)
				//System.out.println(palavras);
			
			Optional <String> checaNulo= Optional.ofNullable(palavras[2]);
		
			
			
			Optional <String> checaNulo1= Optional.ofNullable(palavras[5]);
			
			
			if (checaNulo1.isPresent()) {
				String palavra = palavras[5].toLowerCase();
				System.out.println(palavra);
			}else System.out.println("não existe palavra nesta posição");
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavras);
	        System.out.println(checaNulo);
			System.out.println(checaNulo1.isEmpty());
		}
	}



