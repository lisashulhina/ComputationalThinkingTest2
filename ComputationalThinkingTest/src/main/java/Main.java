public class Main {
    public static void main(String[] args) {

        System.out.println("if-then-else and if-then Statements:");
        /*
        equivalent to

        If x>5
        then y := x+2
        else do x := x+5
        y :=y+10 end do

        for x y
            1 0
            3 2
            5 4
            7 6
            9 8
         */
        for (int i = 0; i < 5; i++) {

            // the x and y is increased by 2 for each other case
            int x = 1, y = 0;
            x = x + i * 2;
            y = y + i * 2;

            System.out.println("INPUT: x = " + x + ", y = " + y);

            // if algorithm segments
            if (x > 5) {
                x = x + 1;
                y = y + 2;
            } else {
                x = x + 5;
                y = y + 10;
            }

            System.out.println("OUTPUT: x = " + x + ", y = " + y + "\n");
        }


        System.out.println("\nwhile Loop:");
        /*
        i := 1, s := 10
        while (s>=0)
            s := s-i
            i := i+1
        end while

        for i s
            1 10
            2 9
            3 7
            4 4
            5 0
        */
        // variable for iteration
        int iteration = 0;

        int i = 1, s = 10;
        System.out.println("INPUT: iteration number-" + iteration + ", i = " + i + ", s = " + s);
        while (s > 0) {
            s = s - i;
            i = i + 1;
            System.out.println("INSIDE LOOP: iteration number-" + ++iteration + ", i = " + i + ", s = " + s);
        }
        System.out.println("OUTPUT: iteration number-" + iteration + ", i = " + i + ", s = " + s);


        System.out.println("\nfor-next Loop:");
        /*
        i := 1, s := 10
        while (s>=0)
            s := s-i
            i := i+1
        end while

        for i x
            0 0
            1 2
            2 4
            3 8
            4 16
        */

        int x = 0;
        System.out.println("INPUT: j = undefined, x = " + x);
        for (int j = 0; j <= 4; j++) {
            x = 2 * j;
            System.out.println("INSIDE LOOP: j = " + j + ", x = " + x);
        }
        System.out.println("OUTPUT: j = undefined, x = " + x);
    }
}
