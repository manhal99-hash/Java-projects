public class ProzessorTesting {
    public static void main(String[]args){
        Intel_i3 i3 = new Intel_i3(4,3,"01.01.2024",3);
        Intel_i5 i5 = new Intel_i5(6,5,"01.01.2023",5);

        Prozessor i33 = new Intel_i3(4,3,"01.01.2022",3); //Upcasting
        Prozessor i55 = new Intel_i5(6,5,"01.01.2023",5); //Upcasting

        //Downcasting
        if(i33 instanceof Intel_i3){
            Intel_i3 p1 = (Intel_i3)i33;
            p1.getThreadsi3();
            try {
                p1.reboust();
            } catch (TemperaturException e){
                System.out.println("TemperaturException für I3"+e.getMessage());
            }
            try {
                p1.sleeping();
            } catch (SleepingException e){
                System.out.println("SleepingException für I3"+e.getMessage());
            }
            p1.toString();
        }
        if(i55 instanceof Intel_i5){
            Intel_i5 p2 = (Intel_i5)i55;
            try {
                p2.reboust();
            } catch (TemperaturException e) {
                System.out.println("TemperaturException für I5"+e.getMessage());
            }
            try {
                p2.sleeping();
            } catch (SleepingException e){
                System.out.println("SleepingException für I5"+e.getMessage());
            }
        }
    }
}
