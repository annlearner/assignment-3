// please pay attention to that write the main function and the method function in the same class, and print the result in the main function,
// use "return" to get the value. you should pay attention to this, otherwise scores will be deducted next time.
//scores : 10 /10
public class salary {
    double NoofHours;
    double empsalary;


        void calculate(){
        if (NoofHours<37){
            System.out.println((NoofHours*15)+" is the salary of the employee");
        }
        else{
            System.out.println((36*15)+((NoofHours-36)*15*1.5)+" is the salary of the employee");

        }
    }

    }

