public class Anagram {
    public static void main(String[] args) {
        char arr1[]={'a','r','u','n'};
        char arr2[]={'a','a','u'};
        if(arr1.length!=arr2.length)
        {
            System.out.println("Its not anagram");
            System.exit(0);
        }
        int wordCount[]=new int[26];
        for(int i=0;i<arr1.length;i++)
        {
            wordCount[arr1[i]-'a']++;
            wordCount[arr2[i]-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(wordCount[i]!=0)
            {
            System.out.println("Its not a angram");
            System.exit(0);
            }
        }
        System.out.println("Its angram");
    }
}
