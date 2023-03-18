package ca.bcit.comp1510.lab06;

/**
 * name of first name, middle name and last name.
 * @author Sohee Hwang
 * @version 2023
 *
 */
public class Name {
    /**
     * name of first name, middle name and last name.
     *
     */
    private String firstName;
    
    /**
     * name of first name, middle name and last name.
     *
     */
    private String middleName;
    
    /**
     * name of first name, middle name and last name.
     */
    private String lastName;
    
    /**
     * Constructs an name object by defining its first, middle, and last name.
     * 
     * @param firstName
     *            first name
     * @param middleName
     *            middleName
     * @param lastName
     *            last Name
     */
    public Name(String firstName, String middleName, String lastName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            this.firstName = "Jane";
        } else {
            this.firstName = formatName(firstName);
        }
        
        if (middleName == null || middleName.trim().isEmpty()) {
            this.middleName = "Smith";
        } else {
            this.middleName = formatName(middleName);
        }
        
        if (lastName == null || lastName.trim().isEmpty()) {
            this.lastName = "Doe";
        } else {
            this.lastName = formatName(lastName);
        }
    }
    

    private String formatName(String firstName2) {
        // TODO Auto-generated method stub
        return null;
    }


    /**
     * Return first name.
     * 
     * @return the first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Return middle name.
     * 
     * @return the middle name.
     */
    public String getMiddleName() {
        return middleName;
    } 
    
    /**
     * Return last name.
     * 
     * @return the last name.
     */
    public String getLastName() {
        return lastName;
    }  
    
    //mutators
    /**
     * Set first name.
     * 
     * @param name
     *            a string to name
     */
    public void setFirstName(String name) {
        firstName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length()).toLowerCase();
    }
    
    /**
     * Set middle name.
     * 
     * @param name
     *            a string to name
     */
    public void setMiddleName(String name) {
        middleName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length()).toLowerCase();
    }
    
    /**
     * Set last name.
     * 
     * @param name
     *            a string to name
     */
    public void setLastName(String name) {
        lastName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length()).toLowerCase();
    }

    /**
     * Return the full name.
     * 
     * @return the full name.
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

    /**
     * Returns if the string parameter you enter equals to the first name.
     * 
     * @param str as a String
     * @return isEqual as a boolean
     */
    public boolean isEqual(String str) {
        return firstName.equals(str);
    }
    
    //3.f
    /**
     * Returns if the Name object you enter equals to the Name object.
     * 
     * @param name as a Name object
     * @return isEqualtoNameObj as a boolean
     */
    public boolean isEqualtoNameObj(Name name) {
        return this.firstName.equals(name.getFirstName())
                && this.middleName.equals(name.getMiddleName()) 
                && this.lastName.equals(name.getLastName());
    }
    
    /**
     * Returns the total length of this full name.
     * 
     * @return sumLengths as a int
     */
    public int nameLengths() {
        return firstName.length() + middleName.length() 
            + lastName.length();
    }
    
    /**
     * Returns the upper case of this full name.
     * 
     * @return nameUppercase as a String
     */
    public String nameUppercase() {
        return firstName.substring(0, 1).toUpperCase()      
            + middleName.substring(0, 1).toUpperCase()
            + lastName.substring(0, 1).toUpperCase();
    }
    

    /**
     * Returns the nth character of this full name.
     * 
     * @param n as a int
     * @return getNCharacter as a char
     */
    public char getCharacter(int n) {
        return toString().charAt(n - 1);
    }
    
    /**
     * Returns the full name as "last name, first name middle name".
     * 
     * @return fullName as a String
     */
    public String fullName() {
        return lastName + ", " + firstName + " " + middleName;
    }
}
