public class WordExtraction {
    public static void main(String[] args)
    {
        String a1 = "shut the fuck up  ujjwalafnafa";
        String[] words = a1.split(" " , 100);
        for(String word : words)
        {
            System.out.println(word);
        }


    }
}
