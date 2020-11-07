import java.util.ArrayList;

public class MyMain {

    	public static int countOdd(ArrayList<Integer> list){
		int c = 0;
		for (int i = 0; i < list.size(); i ++){
			if(list.get(i) % 2 != 0){
				c++;
			}
		}
		return c;
	}
	
	public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i = 0; i < list1.size();i++){
			for(int j = 0; j < list2.size(); j++){
				if(list1.get(i) == list2.get(j)){
					return true;
				}
			}
		}
		return false;
	}
	
	public static ArrayList<Integer> convertToArrayList(int[] arr){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i ++){
			list.add(arr[i]);
		}
		
		return list;		
	}
	

    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7};
		ArrayList<Integer> list = convertToArrayList(arr1);
		
		int[] arr2 = {9,8,7,6,5};
		ArrayList<Integer> list1 = convertToArrayList(arr2);
		
		System.out.println(list);
		System.out.println(checkDuplicates(list,list1));
		System.out.println(countOdd(list));
    }
}
