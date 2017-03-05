package cs331programming3;
//Main class to test the program.
public class CS331Programming3 {
    public static void main(String[] args) {
        //Create a testing table.
        SLinkedList[] sample = new SLinkedList[6];
        SLinkedList op = new SLinkedList();
        sample[0] = new SLinkedList();
        sample[1] = new SLinkedList();
        sample[2] = new SLinkedList();
        sample[3] = new SLinkedList();
        sample[4] = new SLinkedList();
        sample[5] = new SLinkedList();
        //Row 0
        sample[0].addLast(20, .3, 0);
        sample[0].addLast(30, .25, 0);
        sample[0].addLast(40, .05, 0);
        sample[0].addLast(10, .2, 0);
        sample[0].addLast(10, .2, 0);
        //Row 1
        sample[1].addLast(50, .33, 1);
        sample[1].addLast(30, .33, 1);
        sample[1].addLast(60, .34, 1);
        //Row 2
        sample[2].addLast(10, 1, 2);
        sample[2].addLast(96, .7, 2);
        sample[2].addLast(20, .5, 2);
        sample[2].addLast(30, .5, 2);
        sample[2].addLast(50, .2, 2);
        sample[2].addLast(30, .8, 2);
        //Row 3
        sample[3].addLast(30, .1, 3);
        sample[3].addLast(20, .1, 3);
        sample[3].addLast(50, .3, 3);
        sample[3].addLast(40, .2, 3);
        sample[3].addLast(20, .1, 3);
        sample[3].addLast(80, .2, 3);
        //Row 4
        sample[4].addLast(100, .22, 4);
        sample[4].addLast(50, .9, 4);
        sample[4].addLast(60, .33, 4);
        sample[4].addLast(500, .02, 4);
        sample[4].addLast(88, .26, 4);
        sample[4].addLast(77, .13, 4);
        //Row 5
        sample[5].addLast(800, .9, 5);
        sample[5].addLast(450, .8, 5);
        sample[5].addLast(2, .5, 5);
        sample[5].addLast(5, .08, 5);
        sample[5].addLast(20, .5, 5);
        sample[5].addLast(330, .002, 5);
        sample[5].addLast(250, .03, 5);
        sample[5].addLast(30, .05, 5);
        sample[5].addLast(250, .35, 5);
        sample[5].addLast(300, .5, 5);
        //Compute ratio for each test.
        for(int i = 0; i < sample.length; ++i) {
            sample[i].computeRatio();
        }
        //Run the program.
        boolean notEmpty = true;
        double minRatio;
        int checkNumber = 0;
        while(notEmpty) {
            System.out.println("TABLE----------------------------------------"
                    + "---------------------------");
            for(int i = 0; i < sample.length; ++i) {               
                sample[i].print();
                System.out.println();
            }
            //Choose the first avaiable ratio as minRatio to start.
            int j = 0;
            while(j < sample.length - 1 && sample[j].isEmpty()) {
                j++;
            }         
            minRatio = sample[j].getMinRatio();
            //Get real minRatio
            for(int i = 0; i < sample.length; ++i) {
                if (!sample[i].isEmpty()) {
                    if (minRatio > sample[i].getMinRatio())
                        minRatio = sample[i].getMinRatio();   
                }
            }
            System.out.println("Minimum: " + minRatio);
            System.out.println();
            //Go through every linked list and check if it has
            //minRatio. If it does, move its head and up to the
            //node that has minRatio to op and delete them from
            //the linked list. Then, compute the new ratio.
            for (int i = 0; i < sample.length; ++i) {
                if (!sample[i].isEmpty()) {
                    if(sample[i].hasMinRatio(minRatio)) {
                        sample[i].move(minRatio, op);
                        if (!sample[i].isEmpty()) {
                            sample[i].computeRatio();
                        }
                    }        
                }   
            }
            //Check if every linked list is empty.
            checkNumber = 0;
            for (int i = 0; i < sample.length; ++i) {
                if (!sample[i].isEmpty()) {
                    checkNumber++;
                }
            }
            if (checkNumber == 0) {
                notEmpty = false;
            }
            System.out.println("RESULT");
            op.print();
            System.out.println();
        }        
    }    
}