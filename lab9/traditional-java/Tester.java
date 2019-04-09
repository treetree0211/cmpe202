public class Tester {

	public static void main(String[] args) {
		List<SortingStrategy> list = Arrays.asList(
				new BubbleSort(),
				new MergeSort()
		);

		for(SortingStrategy s : list) s.printDescription();
	}
}