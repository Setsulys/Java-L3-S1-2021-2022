//LY-IENG Steven

//1 et 2
/*
public class Tri{
	public static void swap(int[] array,int index1, int index2){
		var temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	public static int indexOfMin(int[] array){
		var minimum = Integer.MAX_VALUE;
		var valmin=0;
		for(int i = 0; i < array.length; i++){
			if(array[i] < minimum){
				minimum = array[i];
				valmin = i;
			}
		}
		return valmin;
	}
	public static void main(String[] args) {
		int array[] = {15,18 ,24, 10, 15,23};
		swap(array,2,5);
		var builder = new StringBuilder();
		var separator ="";
		for(int elt :array){
			builder.append(separator).append(elt);
			separator=",";
		}
		System.out.println(builder);
		System.out.println(indexOfMin(array));
	}
}
*/


//3 et 4

public class Tri{
	public static void swap(int[] array,int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;

	}
	public static int indexOfMin(int[] array,int min,int max){
		var minimum = Integer.MAX_VALUE;
		int i;
		var valmin=0;
		for(i=min; i < max && i < array.length ; i++){
			if(array[i] < minimum){
				minimum = array[i];
				valmin=i;
			}
		}
		return valmin;
	}

	public static void sort(int[] array){
		int i;
		for(i = 0; i < array.length; i++){
			swap(array,indexOfMin(array,i,array.length),i);
		}
	}

	public static void main(String[] args) {
		int array[] = {10,9,8,7,6,5,4,3,2,1};
		sort(array);
		var builder = new StringBuilder();
		var separator="";
		for(int elt :array){
			builder.append(separator).append(elt);
			separator=",";
		}
		System.out.println(builder);
	}
}
