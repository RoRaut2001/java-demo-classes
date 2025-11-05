public class ConditionalLogic {
    public static void main(String[] args) {
        int age = 10;
        boolean hasVoterID = false;
        if (age>=18){
            System.out.println("You can vote");
        } else{
            System.out.println("You can not vote");
        }
        //ternary operator - short form if-else condition
        String result = (age>=18) ? "You can vote": "You can not vote";
        System.out.println("Ternary operator:\t" + result);
        if(age>=18){
            if(hasVoterID){
                System.out.println("You can vote");
            }else {
                System.out.println("First apply for voter id card");
            }
        } else {
            System.out.println("you can not vote");
        }

        //if-else-if Ladder --A,B,C, Fail
        int marks = 70;
        if(marks>=90){
            System.out.println("Grade A");
        } else if (marks>=80) {
            System.out.println("Grade B");
        } else if (marks>=50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        //switch statement

        int day = 4;
        switch (day){
            case 1:
                System.out.println("Its Sunday today");
                break;
            case 2:
                System.out.println("Its Monday today");
                break;
            case 3:
                System.out.println("Its Tuesday today");
                break;
            case 4:
                System.out.println("Its Wednesday today");
                break;
            case 5:
                System.out.println("Its Thursday today");
                break;
            case 6:
                System.out.println("Its Friday today");
                break;
            case 7:
                System.out.println("Its Saturday today");
                break;
            default:
                System.out.println("Invalid Input");
        }





    }
}
