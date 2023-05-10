/* (Airline Reservations System) 
A small airline has just purchased a computer for its new automated 
reservations system. You’ve been asked to develop the new system. 

You’re to write an application to assign seats on each flight 
of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: 
Please type 1 for First Class and Please type 2 for Economy. 
If the user types 1, your application should assign a seat in the 
first-class section (seats 1–5). If the user types 2, your application 
should assign a seat in the economy section (seats 6–10). Your application 
should then display a boarding pass indicating the person’s seat number and 
whether it’s in the first-class or economy section of the plane.

Use a one-dimensional array of primitive type boolean to represent the seating 
chart of the plane. Initialize all the elements of the array to false to indicate 
that all the seats are empty. As each seat is assigned, set the corresponding 
element of the array to true to indicate that the seat is no longer available.

Your application should never assign a seat that has already been assigned. 
When the economy section is full, your application should ask the person if 
it’s acceptable to be placed in the first-class section (and vice versa). 
If yes, make the appropriate seat assignment. If no, display the message

"Next flight leaves in 3 hours." */

import java.util.Scanner;

public class AirlineReservations {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Boolean [] airplane = new Boolean [10];
        boolean loop = true;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            airplane[i] = false;
        }

        System.out.println("Type 1: First-Class || Type 2: Economy || Type 3: Cancel");
        int choice = input.nextInt();
        if (choice == 3) {
            count = 10;
        }
        while (count != 10) {
            if (choice == 1) {
                for (int i = 0; i < 5; i++) {
                    if (airplane[i] == false) {
                        airplane[i] = true;
                        count++;
                        break;
                    }
                    if (i == 4 && airplane[4] == true) {
                        System.out.println("All First-Class Seat's Are Full");
                        System.out.println("Economy-Class? Type 1: Yes or Type 2: No");
                        int choice2 = input.nextInt();
                        if (choice2 == 1) {
                            for (int j = 5; j < 10; j++) {
                                if (airplane[i] == false) {
                                    System.out.println("Economy-Class Seated");
                                    airplane[i] = true;
                                    count++;
                                    break;
                                }
                                if (i == 9 && airplane[9] == true) {
                                    System.out.println("All Economy-Class Seat's Are Full");
                                    count = 10;
                                }

                            }
                        }
                        if (choice2 == 2) {
                            System.out.println("Next flight leaves in 3 hours!");
                            count = 10;

                        }
                    }
                }
            }
            if (choice == 2) {
                for (int i = 5; i < 10; i++) {
                    if (airplane[i] == false) {
                        airplane[i] = true;
                        count++;
                        break;
                    }
                    if (i == 9 && airplane[9] == true) {
                        System.out.println("All Economy-Class Seat's Are Full");
                        System.out.println("First-Class? Type 1: Yes or Type 2: No");
                        int choice3 = input.nextInt();
                        if (choice3 == 1) {
                            for (int j = 0; j < 5; j++) {
                                if (airplane[i] == false) {
                                    System.out.println("First-Class Seated");
                                    airplane[i] = true;
                                    count++;
                                    break;
                                }
                                if (i == 4 && airplane[4] == true) {
                                    System.out.println("All First-Class Seat's Are Full");
                                    count = 10;
                                }
                            }
                        }
                        if (choice3 == 2) {
                            System.out.println("Next flight leaves in 3 hours!");
                            count = 10;

                        }
                    }
                }
            }
            System.out.println("Type 1: First-Class || Type 2: Economy || Type 3: Cancel");
            choice = input.nextInt();
            if (choice == 3) {
                count = 10;
            }
        }

        System.out.println("Airplane Seats");

        for (int i = 0; i < 10; i++) {
            if (airplane[i] == true) {
                System.out.println(i+1);
            }
        }

    }
}
