package LevelOne;

public class ValueOfPi {
    public static void main(String[] args) {
        CalculateTheValueOfPi();
    }
    public static void CalculateTheValueOfPi(){
        double pi = 0;
        int count = 1;
        double denominator = 1;

        for(int term = 1; term <= 136121; term += 1){
            if(count % 2 == 0){
                pi -= 4/denominator;
                count++;
                denominator += 2;
            }
            else if(count % 2 == 1){
                pi += 4/denominator;
                count++;
                denominator += 2;
            }
            System.out.println(term + " " + pi);
        }
    }
}