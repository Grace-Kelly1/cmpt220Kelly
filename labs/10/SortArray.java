import java.util.ArrayList;

public class SortArray {

	public static void main(String[] args) {
		// 13.3
		ArrayList<Number> list = new ArrayList<Number>();
        list.add(13);
        list.add(34);
        list.add(7);
        list.add(29);
        list.add(5);
    
        System.out.println("Unsorted: " + list.toString());
        sort(list);
        System.out.println("Sorted: " + list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) { 
            Number currentMin = list.get(i); 
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }   

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}