/*Problem 10: Grocery List Manager
Develop a program that helps users manage their grocery list. The program should have the
following features:
 Allow the user to add items to the grocery list.
 Provide the ability to mark items as purchased or remove them from the list.
 Display the current grocery list, including the purchased and remaining items.
 Implement a search functionality to find specific items on the list.
 Optionally, allow the user to save and load the grocery list to/from a file.*/

import java.util.Scanner;
/*
class Case10{


public class GroceryListManager {

    // Inner class to represent an item in the grocery list
    private static class GroceryItem {
        String name;
        boolean purchased;

        GroceryItem(String name) {
            this.name = name;
            this.purchased = false;
        }

        @Override
        public String toString() {
            return name + (purchased ? " (Purchased)" : " (Not Purchased)");
        }
    }

    private List<GroceryItem> list;

    // Constructor to initialize the grocery list
    public GroceryListManager() {
        list = new ArrayList<>();
    }

    // Method to add an item to the grocery list
    public void addItem(String name) {
        list.add(new GroceryItem(name));
    }

    // Method to mark an item as purchased
    public void markAsPurchased(String name) {
        for (GroceryItem item : list) {
            if (item.name.equalsIgnoreCase(name)) {
                item.purchased = true;
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Method to remove an item from the grocery list
    public void removeItem(String name) {
        Iterator<GroceryItem> iterator = list.iterator();
        while (iterator.hasNext()) {
            GroceryItem item = iterator.next();
            if (item.name.equalsIgnoreCase(name)) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Method to display the current grocery list
    public void displayList() {
        System.out.println("Grocery List:");
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (GroceryItem item : list) {
                System.out.println(item);
            }
        }
    }

    // Method to search for an item in the list
    public void searchItem(String name) {
        for (GroceryItem item : list) {
            if (item.name.equalsIgnoreCase(name)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Method to save the grocery list to a file
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (GroceryItem item : list) {
                writer.write(item.name + "," + item.purchased);
                writer.newLine();
            }
            System.out.println("List saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    // Method to load the grocery list from a file
    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            list.clear(); // Clear the existing list
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    boolean purchased = Boolean.parseBoolean(parts[1]);
                    GroceryItem item = new GroceryItem(name);
                    item.purchased = purchased;
                    list.add(item);
                }
            }
            System.out.println("List loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nGrocery List Manager:");
            System.out.println("1. Add item");
            System.out.println("2. Mark item as purchased");
            System.out.println("3. Remove item");
            System.out.println("4. Display list");
            System.out.println("5. Search item");
            System.out.println("6. Save to file");
            System.out.println("7. Load from file");
            System.out.println("8. Exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter item name: ");
                    String addName = scanner.nextLine();
                    manager.addItem(addName);
                    break;
                case "2":
                    System.out.print("Enter item name to mark as purchased: ");
                    String purchaseName = scanner.nextLine();
                    manager.markAsPurchased(purchaseName);
                    break;
                case "3":
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeItem(removeName);
                    break;
                case "4":
                    manager.displayList();
                    break;
                case "5":
                    System.out.print("Enter item name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchItem(searchName);
                    break;
                case "6":
                    System.out.print("Enter filename to save: ");
                    String saveFilename = scanner.nextLine();
                    manager.saveToFile(saveFilename);
                    break;
                case "7":
                    System.out.print("Enter filename to load: ");
                    String loadFilename = scanner.nextLine();
                    manager.loadFromFile(loadFilename);
                    break;
                case "8":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}




}*/

class Grocerymanager{

    int grocaryid;
    String gname;
    boolean gpurchased;
    int gprice;

    void Setdata(int t_grosaryid,String t_gname,int t_gprice,boolean t_purchase){
        grocaryid=t_grosaryid;
        gname=t_gname;
        gpurchased=t_purchase;
        gprice=t_gprice;
    }


     	void printdata(){
	      System.out.println("gid="+grocaryid);
		  System.out.println("gname="+gname);
          System.out.println("price="+gprice);
		  System.out.println("purchased="+gpurchased);
          System.out.println("--------------------------");
		  
		
		 
		  
	}

        public static void main (String [] args){

            	
		Scanner s = new Scanner(System.in);
        int n;
		System.out.print("Enter no of grocery items to store : ");
            n= s.nextInt();
			s.nextLine();
			Grocerymanager[] g=new Grocerymanager[n];

            int choice;
            do{
                 
            System.out.println("\nGrocery List Manager:");
            System.out.println("1. Add item");
            System.out.println("2. Mark item as purchased");
            System.out.println("3.show list");
            //System.out.println("3. Remove item");
            // System.out.println("4. Display list");
             System.out.println("5. delete item");
            // System.out.println("6. Save to file");
            // System.out.println("7. Load from file");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice){
                case 1:
                           System.out.println("enter grocery items");

                                    for (int i=0;i<n;i++){
                                        g[i]=new Grocerymanager();


                                        				System.out.println("enter gid:");
                                                            g[i].grocaryid = s.nextInt();
                                                            s.nextLine();

                                                            System.out.println("enter gname:");
                                                            g[i].gname = s.nextLine(); // Problematic line

                                                            System.out.println("enter price:");
                                                            g[i].gprice = s.nextInt();
                                                            s.nextLine();

                                                        


                                        
                                    }

                                    break;
                case 2:     
                        System.out.println("enter list puchased or not");

                        for(int i=0;i<n;i++){
                            System.out.print("id:"+g[i].grocaryid +" name:"+g[i].gname +" price:"+g[i].gprice + " purchase:");
                             
                                                            g[i].gpurchased = s.nextBoolean();
                                                            s.nextLine();

                        }


                        break;
                case 3:
                        for(int i=0;i<n;i++){
                            System.out.println("print grocery list ");
                            g[i].printdata();
                        }
                        break;
                case 8: 

                        System.out.println("exit the program");
                        break;

                case 5: 

                        System.out.println("delete in list:");

                        System.out.println("enter element to be deleted:");
                        int delete=s.nextInt();
                        s.nextLine();
                        int indextodelete=-1;
                        for(int k=0;k<g.length;k++){
                            if(g[k].grocaryid==delete){

                                indextodelete=k;
                                break;

                            }
                        }

                         if ( indextodelete== -1) {
            System.out.println("Person not found.");
            
        }


                        /*
                        
                        
                          int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].name.equalsIgnoreCase(nameToDelete)) {
                indexToDelete = i;
                break;
            }
        }

        // If the person is not found, return the original array
        if (indexToDelete == -1) {
            System.out.println("Person not found.");
            return array;
        }

        // Create a new array with one less element
        Person[] newArray = new Person[array.length - 1];

        // Copy elements except the one to delete
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = array[i];
            }
        }

                        
                         */
                        


                        break;

                default:
                    System.out.println("invalid choice");

            }

            

            }while(choice!=8);

            

        }





}