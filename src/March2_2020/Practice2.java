package March2_2020;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println(generateRandomWord());
    }

        public static String generateRandomWord(){
            String word="";
            int wordLength= (int)(Math.random()*6+1);
            for(int i=0 ; i<wordLength;i++) {
                word+=(char)((int)(Math.random()*26+97));
            }
            return word;
        }
    }

