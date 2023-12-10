public class FourthApp {
    public String theFourthApp(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                result.append("Value will be printed the J - ").append(j).append(" time! ");
            }
        }
        return result.toString();
    }
}
