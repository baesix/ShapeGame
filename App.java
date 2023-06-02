import javax.swing.JOptionPane;

public class App {
  public static void main (String args[]) {
    // // Test whether the application is running
    // JOptionPane.showMessageDialog(null, "Hello World!");

    // Welcome the user
    JOptionPane.showMessageDialog(null, "Welcome to Shape Game!");

    // Show available shape options to the user
    String selectedShapeOption = JOptionPane.showInputDialog(null, "Which shape do you want?\n1. Circle\n2. Rectangle\n3. Square\n4. Triangle");

    // Calculate the perimeter and the area of the shape
    /**
     * Step 1:
     * Select the shape based on the user's input
     * 1. Circle
     * 2. Rectangle
     * 3. Square
     * 4. Triangle
     */
    switch (selectedShapeOption) {
      case "1":
        // Circle
        JOptionPane.showMessageDialog(null, "You have selected Circle!");
        break;
      case "2":
        // Rectangle
        JOptionPane.showMessageDialog(null, "You have selected Rectangle!");
        break;
      case "3":
        // Square
        JOptionPane.showMessageDialog(null, "You have selected Square!");
        break;
      case "4":
        // Triangle
        JOptionPane.showMessageDialog(null, "You have selected Triangle!");
        break;
      default:
        // Invalid input
        JOptionPane.showMessageDialog(null, "Invalid input!");
        break;
    }
  }
}
