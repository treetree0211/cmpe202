Get ideas from these websites: https://www.developer.com/java/understanding-lambda-enabled-design-patterns.html && https://dzone.com/articles/strategy-pattern-using-lambda

I am using Strategy Design Pattern in this lab. SortingStrategy is the interface that should be implemented. I am using two implementations such as BubbleSort strategy and MergeSort strategy in traditional java code to change the behavior of sortingstrategy.

For traditional java code, when we implement the strategy pattern, we need to create a  object and implement its specific strategy, like 
	
	List<SortingStrategy> list = Arrays.asList(
			new BubbleSort(),
			new MergeSort()
	);

	for(SortingStrategy s : list) s.printDescription();

	output: 
	We are now using BubbleSort!
	We are now using MergeSort!

However, in Lambda expression, we dont need to create concrete strategy implementations(and we dont need to create class and avoid using class declaration) because we can directly input method in Lambda expression, like

	List<SortingStrategy> list = Arrays.asList(
		() -> {System.out.println("We are now using BubbleSort!");},
		() -> {System.out.println("We are now using MergeSort!");}
	);

	for(SortingStrategy s : list) s.printDescription();

	output: 
	We are now using BubbleSort!
	We are now using MergeSort!
