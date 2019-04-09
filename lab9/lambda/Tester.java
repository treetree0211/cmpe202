public class Tester {

	public static void main(String[] args) {
		List<SortingStrategy> list = Arrays.asList(
			() -> {System.out.println("We are now using BubbleSort!");},
			() -> {System.out.println("We are now using MergeSort!");}
		);

		for(SortingStrategy s : list) s.printDescription();
	}
}