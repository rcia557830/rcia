import javax.swing.JOptionPane;

public class WaterTankSystem {
    public static void main(String[] args) {
        WaterTank tank = null;

        String[] options = {"Home Tank", "Building Tank"};
        int choice = JOptionPane.showOptionDialog(null,
                        "Choose a tank:",
                        "Water Tank Program",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null, options, options[0]);

        if (choice == 0) {
            tank = new HomeTank();
        } else if (choice == 1) {
            tank = new BuildingTank();
        } else {
            System.exit(0);
        }

        while (true) {
            String[] actions = {"Fill Tank", "Use Water", "Check Status", "Exit"};
            int action = JOptionPane.showOptionDialog(null,
                            "What do you want to do?",
                            "Water Tank Menu",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, actions, actions[0]);

            if (action == 0) {
                String input = JOptionPane.showInputDialog("Enter liters to add:");
                if (input != null) {
                    int liters = Integer.parseInt(input);
                    tank.fillTank(liters);
                    JOptionPane.showMessageDialog(null,
                        "Water added!\nCurrent Level: " + tank.currentLevel + " / " + tank.capacity +
                        "\nStatus: " + tank.checkStatus());
                }
            } else if (action == 1) {
                String input = JOptionPane.showInputDialog("Enter liters to use:");
                if (input != null) {
                    int liters = Integer.parseInt(input);
                    tank.useWater(liters);
                    JOptionPane.showMessageDialog(null,
                        "Water used!\nCurrent Level: " + tank.currentLevel + " / " + tank.capacity +
                        "\nStatus: " + tank.checkStatus());
                }
            } else if (action == 2) {
                JOptionPane.showMessageDialog(null,
                    "Current Level: " + tank.currentLevel + " / " + tank.capacity +
                    "\nStatus: " + tank.checkStatus());
            } else {
                JOptionPane.showMessageDialog(null, "Exiting program...");
                System.exit(0);
            }
        }
    }
}
