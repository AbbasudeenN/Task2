package guvitask5;

import java.util.Arrays;
import java.util.List;

public class Ques_2 {

	public static void main(String[] args) {
		
		List <String> listWithEmpty = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		
		List <String> listWithoutEmpty =listWithEmpty.stream()
				.filter(strList->!strList.isEmpty())//to filter non empty string
				.toList();
		
		System.out.println(listWithoutEmpty);

	}

}

