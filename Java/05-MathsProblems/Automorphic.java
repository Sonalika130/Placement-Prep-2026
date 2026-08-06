// //5->25,6->36,25->625,76->5776
// // a number whose last digits match witj last digits of its square 

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
        
//         long square = (long) num * num;
//         int originalNum = num;
//         boolean isAutomorphic = true;
        
//         while (num > 0) {
//             // Check for a MATCH
//             if (num % 10 == square % 10) {
//                 num = num / 10;      // Chop digit
//                 square = square / 10;  // Chop digit
//                 // DO NOT BREAK HERE! Let the loop repeat to check the next digits.
//             } 
//             // If they do NOT match
//             else {
//                 isAutomorphic = false; // Set flag to false
//                 break;                 // NOW break here because we found a mismatch!
//             }
//         } // The while loop ends here
        
//         // Print the final result
//         if (isAutomorphic) {
//             System.out.println(originalNum + " is an Automorphic Number.");
//         } else {
//             System.out.println(originalNum + " is NOT an Automorphic Number.");
//         }
        
//         sc.close();
//     }
// }
import java.util.Scanner; // 1. Imports must always be at the very top

class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        long square = (long) num * num;
        int originalNum = num;
        boolean isAutomorphic = true;
        
        while (num > 0) {
            // Check for a MATCH
            if (num % 10 == square % 10) {
                num = num / 10;      // Chop digit
                square = square / 10;  // Chop digit
                // DO NOT BREAK HERE! Let the loop repeat to check the next digits.
            } 
            // If they do NOT match
            else {
                isAutomorphic = false; // Set flag to false
                break;                 // NOW break here because we found a mismatch!
            }
        } // The while loop ends here
        
        // Print the final result
        if (isAutomorphic) {
            System.out.println(originalNum + " is an Automorphic Number.");
        } else {
            System.out.println(originalNum + " is NOT an Automorphic Number.");
        }
        
        sc.close();
    }
}

