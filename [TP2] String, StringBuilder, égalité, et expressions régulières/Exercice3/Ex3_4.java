//LY-IENG Steven

import java.util.regex.Pattern;
import java.util.Arrays;

public class Ex3_4{
	public static int unsignedbyte( byte b){ //convertiseur en unsigned byte
		return b & 0xFF;
	}
	public static void main(String[] args) {
		var pattern = Pattern.compile("([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})");
		var i = 0;
		byte[] tab  = new byte[4] ;

		for( var array : args){ //comparaison avec les arguments
			var matcher = pattern.matcher(array);
			if(matcher.matches()){
				for(i=1; i <= matcher.groupCount() ; i++ ){//separation des differentes valeurs de l'adresse
					var val= Integer.parseInt(matcher.group(i));//Transformation en integer
					if(val > 255 ){ //verification que ip se situe entre 0 et 255
						throw new IllegalArgumentException();
					}
					tab[i-1] = (byte)val;
				}
			}
		}
		System.out.print("[");
		for (var j = 0;j < tab.length ;j++) {
			if( j == tab.length -1){
				System.out.print(unsignedbyte(tab[j]));//conversion en unsigned byte pour la derniere valeur
			}
			else{
				System.out.print(unsignedbyte(tab[j]) + ", ");//conversion en unsigned byte
			}
		}
		System.out.println("]");
	}
}
