public class ClockApplication {
    public static void main(String [] args) {
        Clock time = new Clock(04, 40, 40);
        
        System.out.printf("The time is %02d : %02d : %02d", time.getHour(), time.getMinute(), time.getSecond());

    }
    
}
