import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
  public static void main (String args[]) {
    // // Test whether the application is running
    // JOptionPane.showMessageDialog(null, "Hello World!");

    // Welcome the user
    JOptionPane.showMessageDialog(null, "Welcome to Shape Game!");

    // Show available shape options to the user
    String selectedShapeOption = JOptionPane.showInputDialog(null, "Which shape do you want?\n1. Circle\n2. Rectangle\n3. Square\n4. Triangle");

    // Create a decimal formatter to show output to the user with only two decimal places
    DecimalFormat formatter = new DecimalFormat("##.00");

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

        String radius = JOptionPane.showInputDialog(null, "Please enter the radius of the circle:");
        double radiusDouble = Double.parseDouble(radius);
        
        // Calculate the perimeter and the area of the circle
        double circlePerimeter = 2 * Math.PI * radiusDouble;
        
        double circleArea = Math.PI * Math.pow(radiusDouble, 2);
                
        // Show the result to the user
        JOptionPane.showMessageDialog(null,
            "The perimeter of the circle is " + formatter.format(circlePerimeter) + " and the area of the circle is " + formatter.format(circleArea));
        
        break;
      case "2":
        // Rectangle
        JOptionPane.showMessageDialog(null, "You have selected Rectangle!");

        String length = JOptionPane.showInputDialog(null, "Please enter the length of the rectangle:");
        double lengthDouble = Double.parseDouble(length);

        String width = JOptionPane.showInputDialog(null, "Please enter the width of the rectangle:");
        double widthDouble = Double.parseDouble(width);

        // Calculate the perimeter and the area of the rectangle
        double rectanglePerimeter = 2 * (lengthDouble + widthDouble);
        double rectangleArea = lengthDouble * widthDouble;

        // Show the result to the user
        JOptionPane.showMessageDialog(null,
            "The perimeter of the rectangle is " + formatter.format(rectanglePerimeter) + " and the area of the rectangle is " + formatter.format(rectangleArea));

        break;
      case "3":
        // Square
        JOptionPane.showMessageDialog(null, "You have selected Square!");

        String side = JOptionPane.showInputDialog(null, "Please enter the side of the square:");
        double sideDouble = Double.parseDouble(side);

        // Calculate the perimeter and the area of the square
        double squarePerimeter = 4 * sideDouble;
        double squareArea = Math.pow(sideDouble, 2);

        // Show the result to the user
        JOptionPane.showMessageDialog(null,
            "The perimeter of the square is " + formatter.format(squarePerimeter) + " and the area of the square is "
                + formatter.format(squareArea));
            
        break;
      case "4":
        // Triangle
        JOptionPane.showMessageDialog(null, "You have selected Triangle!");

        String side1 = JOptionPane.showInputDialog(null, "Please enter the first side of the triangle:");
        double side1Double = Double.parseDouble(side1);

        String side2 = JOptionPane.showInputDialog(null, "Please enter the second side of the triangle:");
        double side2Double = Double.parseDouble(side2);

        String side3 = JOptionPane.showInputDialog(null, "Please enter the third side of the triangle:");
        double side3Double = Double.parseDouble(side3);
        
        String base = JOptionPane.showInputDialog(null, "Please enter the base of the triangle:");
        double baseDouble = Double.parseDouble(base);

        String height = JOptionPane.showInputDialog(null, "Please enter the height of the triangle:");
        double heightDouble = Double.parseDouble(height);

        // Calculate the perimeter and the area of the triangle
        /**
         * TODO: This method is not the best because, the user can enter data
         * belonging to two different triangles. A better way would be to ask the
         * user to select the whether they need to calculate the perimeter or the
         * area of the triangle and then ask for the required data.
         */
        double trianglePerimeter = side1Double + side2Double + side3Double;
        double triangleArea = (baseDouble * heightDouble) / 2;

        // Show the result to the user
        JOptionPane.showMessageDialog(null,
            "The perimeter of the triangle is " + formatter.format(trianglePerimeter) + " and the area of the triangle is "
                + formatter.format(triangleArea));

        break;
      default:
        // Invalid input
        JOptionPane.showMessageDialog(null, "Invalid input!");
        break;
    }
  }
}
