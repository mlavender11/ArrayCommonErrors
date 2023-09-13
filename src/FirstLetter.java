public class FirstLetter {
    public static String firstLetters(String[] words){
        String result = "";
        for (String str :words){
            result = result + str.substring(0,1);
        }
        return result;
    }
}
