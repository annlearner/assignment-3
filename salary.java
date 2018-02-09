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

