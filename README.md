# Currency Breakdown Java Application

This Java application takes a user-inputted dollar amount and returns the least amount of US currency units required to represent that amount (bills and coins).

## Features
Application will respond with the amount in units of US currency with the least
amount of change given.
  
### Example Output
For an input of `$19.99`, the output will be:

Least amount of change given: 
1 - $10 bill
1 - $5 bill
4 - $1 bill
3 - quarter
2 - dime
4 - penny

## Setup and Run Instructions

### Option 1: Using IntelliJ IDEA
Download and Open the Script:

Download Showcase_Exact_Change.java and save it to a folder on your computer.
Open IntelliJ IDEA, go to File > Open, and select the folder containing the downloaded file.
Run the Program:

Right-click on Showcase_Exact_Change.java in the Project pane and select Run 'Showcase_Exact_Change.main()'.
Enter an Amount:

When prompted in the console, enter a dollar amount (Example :  19.99), and press Enter.
The output qill show the least number of chnage.

### Option 2: Using Visual Studio Code
Download and Open the Script:

Download Showcase_Exact_Change.java and save it to a folder.
Open Visual Studio Code and use File > Open Folder to open the folder where the downloaded file is saved.
Install Extensions (if needed):

If you haven’t already, install the Java Extension Pack from the Extensions view to enable Java support.
Run the Program:

Press F5 or go to Run > Start Debugging to run the script.
Enter an Amount:

In the terminal, type a dollar amount (Example : 19.99) when prompted.
The application will display the currency breakdown in the terminal.
### Additional Notes
- **Error Handling**: Non-numeric inputs will cause errors.
- **Assumptions**: This program assumes that inputs will be in valid US dollar formats without negative values.
