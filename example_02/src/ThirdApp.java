// public class ThirdApp {
//     public String theThirdApp(){
//         int a = 5;
//         for(int i = 0; i < 8; i++){
//             return "Value will be printed " + i.toString() + "time!";
//         }
//     }
// }


// 1. SZINT!
public class ThirdApp {
    public String theThirdApp(){

        // 2. SZINT!
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < 9; i++){
            // .append() "intergált" funkció a java-ban, mint pl a .length()
            result.append("Value will be printed ").append(i).append(" time! ");
        }

        return result.toString();
        // return result;
    }
}
