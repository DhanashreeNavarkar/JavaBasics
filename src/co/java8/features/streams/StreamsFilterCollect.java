package co.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
		
		List<String> series = Arrays.asList("HospitalPlayList","CrashLandingOnYou","MyLoveFromStars","Goblin","DescendantsOfTheSun","Healer");
		System.out.println(series);
		System.out.println("**************************************************************************************************************");
		
		series.forEach(ele -> System.out.println(ele));
		System.out.println("**************************************************************************************************************");
		
		List<String> list = series.stream().filter(ele -> ! ele.equals("Goblin")).collect(Collectors.toList());
		System.out.println(list);
		list.forEach(ele -> System.out.println(ele));
	}

}
