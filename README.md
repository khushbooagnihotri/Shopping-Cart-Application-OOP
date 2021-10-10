# Shopping-Cart-Application-OOP

### Assignment:
Create a shopping cart application using object oriented programming.

### This program enables the user to 
1. Display  menu
2. Add an item in list
3. Edit item
4. Search item
5. Remove item
6. Check total no. of items
7. Print cart
8. Exit

### Key points
The code uses:
1. Use of **Collections Framework**
  
    import java.util.*; 
  
    Contains the collections framework, some internationalization support classes, a service loader, properties, random number generation, string parsing and scanning classes, base64 encoding and decoding, a bit array, and several miscellaneous utility classes. This package also contains legacy collection classes and legacy date and time classes.
  
2. **Switch statement**
  The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement.
  
3.  **displayMenu**
   static public void displayMenu(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(i+": "+ items[i]);
        }
    This displays the the whole menu when called upon.   

4. **insert**
    static public void insert() {

        Scanner in = new Scanner(System.in);

        boolean y = true;
        do {
            System.out.println("Enter item to add in list");
            int num = in.nextInt();
            if (num < 0 || num>5)
                System.out.println("not alowed");
            else
                l.add(num);
            System.out.println("want to insert more?y/n");
            String x = in.next();
            char ch = x.charAt(0);
            if (ch == 'n')
                y = false;
        }
        while (y != false);
    }
    
  The input should be an integer within the given range.
  
  
  #### And more functions that can be read in the code.
  

### Images of output

![image](https://user-images.githubusercontent.com/63361851/136696410-b91d370b-22f9-4723-b547-534c0f017717.png)

![image](https://user-images.githubusercontent.com/63361851/136696649-5d294118-b081-4f1b-8478-28665df7ad6b.png)

![image](https://user-images.githubusercontent.com/63361851/136696719-c7d93fbc-6e8f-42d3-bfc7-f41ac4698233.png)

![image](https://user-images.githubusercontent.com/63361851/136696741-4b1a9849-6e78-47fa-9a54-65af0721ab84.png)

![image](https://user-images.githubusercontent.com/63361851/136696808-b5701793-17e6-4503-8dd2-9e8b70d5cc66.png)

![image](https://user-images.githubusercontent.com/63361851/136696828-c2d34127-0ccd-4849-bed4-a06ecd974996.png)

![image](https://user-images.githubusercontent.com/63361851/136696841-61dba7a8-8393-4543-bb09-d771f0a324d0.png)

![image](https://user-images.githubusercontent.com/63361851/136696865-49f88ce6-117f-44d2-b75f-7f85b9ffe959.png)

![image](https://user-images.githubusercontent.com/63361851/136696879-e80cb635-5b13-497a-9339-979ad1d5e63b.png)
