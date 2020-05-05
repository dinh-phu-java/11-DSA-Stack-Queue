import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String myString= "Java is the best programming language in the world!".toLowerCase();
        TreeMap<String, Integer> myTreeMap= new TreeMap<>();

        for (int i =0; i< myString.length();i++){

            String letter= String.valueOf(myString.charAt(i));
            if(!letter.equals(" ")){
                if(myTreeMap.containsKey(letter)){
                    myTreeMap.put(letter,myTreeMap.get(letter)+1);
                }else{
                    myTreeMap.put(letter,1);
                }
            }

        }

        System.out.printf(String.valueOf(myTreeMap));


    }
}
