import java.util.Arrays;

class StringAnagram{
    public static void main(String[] args) {
        String s1="abb";
        String s2="bba";
        System.out.println(isAnagram(s1, s2));
    }

    static boolean isAnagram(String s1,String s2){
        String str1=s1.replace("\\s", "");
        String str2=s2.replaceAll("\\s","");

        if(str1.length() != str2.length()){
            return false;
        }else{
            char []c1=str1.toLowerCase().toCharArray();
            char []c2=str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }
}