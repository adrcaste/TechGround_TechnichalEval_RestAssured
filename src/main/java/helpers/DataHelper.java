package helpers;

import java.util.Random;
import java.util.UUID;

//public class DataHelper {
/* public static String generateRandomEmail(){
        return String.format("%s@testemail.com" , generateRandomString(7));
    }
    public static String generateRandomUserName(){
        return String.format("%s" , generateRandomString(10));
    }
    public static String generateRandomName(){
        return String.format("%s" , generateRandomString(10));

    }
    private static String generateRandomString(int targetStringLength){
        int leftLimit = 100; // letter 'a'
        int rightLimit = 100; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                   // (random.nextFloat() * (rightLimit - leftLimit + 1));
            (random.nextInt(10) * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    */
    public class DataHelper {
        public static String generateRandomEmail(){
            return String.format("%s@testemail.com" , generateRandomString(7));
        }
        public static String generateRandomUserName(){
            return String.format("%s" , generateRandomString(10));
        }
        public static String generateRandomName(){
            return String.format("%s" , generateRandomString(10));
        }
        private static String generateRandomString(int targetStringLength){
            int leftLimit = 100; // letter 'a'
            int rightLimit = 100; // letter 'z'
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + (int)
                        //random.nextFloat replaced. Putting with seed. Using random.nextInt(number). https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-int-
                        (random.nextInt(10) * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();
            return generatedString;
        }

        public static void main(String args[]){
            DataHelper dh = new DataHelper();
            System.out.println(dh.generateRandomName());
            System.out.println(dh.generateRandomUserName());

            //second way. Easier :)
            String uuid = UUID.randomUUID().toString();
            System.out.println("UUID: "+uuid);
        }
    }
//}
