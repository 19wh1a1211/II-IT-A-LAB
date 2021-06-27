public class StringBS {
	static int MAX = 100;
	public static void sortStrings (String[] arr, int n) {
	String temp;
	for (int j = 0; j < n; j++) 
	{
		for (int i = j + 1; i < n; i++) 
		{
			if (arr[j].compareTo(arr[i]) > 0) 
			{
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
	
public static void main(String[] args) {
		
	String[] arr = { "right","sub","trick","crayon","punish","silk","describe","royal","prevent","slope" };
		
		int n = arr.length;
		sortStrings(arr, n);
		System.out.println("Strings in sorted are: ");
		for (int i = 0; i < n; i++)
			System.out.println("String " + (i + 1) + " is " + arr[i]);
	}


}