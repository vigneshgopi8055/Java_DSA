package src;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'A'; // Source peg
        char auxiliary = 'B'; // Auxiliary peg
        char target = 'C'; // Target peg

        System.out.println("Tower of Hanoi with " + n + " disks:");
        towerOfHanoi(n, source, auxiliary, target);
    }

    // Recursive function to solve Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char auxiliary, char target) {
        if (n > 0) {
            // Move n-1 disks from source to auxiliary peg
            towerOfHanoi(n - 1, source, target, auxiliary);

            // Move the nth disk from source to target peg
            System.out.println("Move disk " + n + " from " + source + " to " + target);

            // Move the n-1 disks from auxiliary to target peg
            towerOfHanoi(n - 1, auxiliary, source, target);
        }
    }
}

