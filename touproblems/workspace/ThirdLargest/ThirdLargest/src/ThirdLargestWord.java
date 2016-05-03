import java.util.*;
public class ThirdLargestWord {
	public String findthirdLargest(String[] words, int k) {
	    Arrays.sort(words);
	    return words[words.length-k];
	}


}
