import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FirstProblem {
    public void san(){
        List<String> places = Arrays.asList("Doszhan Anuar", "Musin Adil", "Magayenov Arsen", "Shendibai Az-meir", "Tagaibek Sayat","Hamitov Tamerlan", "Tileyali Ramazan", "Erezhepov Nurbolat","Tanatar Binazar","Ashirhan Daulet","Bortanov Shakirim", "Palatov Bagdaulet", "Kyrbanaliev Adilkhan","Savetov Almas", "Seit Akku", "Sadenova Tabigat", "Daulethanova Janel", "Toleybekkizi Aina", "Yesirkep Uldana", "Kusain Alibek");
        Random r = new Random();


        int t = r.nextInt(10,90) + 1;
        int b = r.nextInt(10,90) + 1;
        System.out.println(places.get(0) +" "+ t + "*" + b);

        for (int i = 1; i < places.size(); i++){

            try{
                int x = r.nextInt(10,90) + 1;
                int y = r.nextInt(10,90) + 1;
                System.out.println();
                System.out.println(places.get(i) +" "+ x + "*" + y);
                if(((t==x) && (b==y) || (t==x)&&(b==y))){
                    throw new Exception("Is not correct " +t+"*"+b+"is repeted");
                }
                t = x;
                b = y;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
