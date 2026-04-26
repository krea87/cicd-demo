package jensen.johan.cicddemo;

public class Utils {
    public String capitalize(String str){
        if(str==null){
            throw new IllegalArgumentException("String cannot be null");
        }
        if(str.length() == 0){
            return str;
        }
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public String title(String str){
        if(str==null){
            throw new IllegalArgumentException("String cannot be null");
        }

        String [] words = str.split(" ");
        String result = "";
        for(String word : words){
            result += capitalize(word) + " ";
        }

        return result.trim();
    }
}
